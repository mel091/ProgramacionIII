package Act160424_TableroDibujo;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class TableroDibujo extends JFrame implements KeyListener
{	
	int x = 260, y = 180;
	Player player;
	Player pared;
	
	public TableroDibujo()
	{
		this.setTitle("Dibujito");
		
		this.setVisible(true);
		this.setSize(530,390);
		this.setLocation(100,  100);
		this.setLayout(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
		this.setResizable(false);
		
		this.inicializar();
		
		addKeyListener(this);
		
		player = new Player(this.x, this.y, 30, 30, "#504D9F");
		pared = new Player(400, 100, 30, 180, "#9144B4");
	}
	
	public void inicializar()
	{	
		JButton btn = new JButton("Reiniciar");
		btn.setBounds(200, 320, 120, 25);
		this.add(btn);
		
		JPanel panel1 = new JPanel();
		panel1.setBounds(0, 312, getWidth(), 40);
		panel1.setBackground(Color.decode("#8683DC"));
		this.add(panel1);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, getWidth(), getHeight());
		panel.setBackground(Color.white);
		panel.setFocusable(true);
		this.add(panel);
	}
	
	public void paint(Graphics g)
	{		
		super.paint(g);
		
		Graphics2D g2 = (Graphics2D)g;
		
		g2.setColor(Color.decode(player.getColor()));
		g2.fillRect(player.getX(), player.getY(), player.getWidth(), player.getHeight());	
		
		g2.setColor(Color.decode(pared.getColor()));
		g2.fillRect(pared.getX(), pared.getY(), pared.getWidth(), pared.getHeight());	
		
		player.colision(player, pared);
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyPressed(KeyEvent e) 
	{	
		int newX = player.getX();
		int newY = player.getY();
		
		switch(e.getKeyCode())
		{
		case 65: //a
			newX -= 10;
			break;
			
		case 87: //w
			newY -= 10;
			break;
			 
		case 68: //d
			newX += 10;
			break;
			
		case 83: //s
			newY += 10;
			break;
			
		default:
			break;
		}
		
		//this.update(getGraphics()); evitar flash
		if (!checkColision(newX, newY, player.getWidth(), player.getHeight(), pared.getX(), pared.getY(), pared.getWidth(), pared.getHeight())) 
		{
	        player.setX(newX);
	        player.setY(newY);
	    } //mover siempre y cuando no toque el obj2
	    
	    this.repaint();
	}

	//  colisión entre dos rectangulos
	private boolean checkColision(int coordX, int coordY, int w1, int h1, int coordX2, int coordY2, int w2, int h2) 
	{
		return coordX + w1 > coordX2 && coordX < coordX2 + w2 && coordY + h1 > coordY2 && coordY < coordY2 + h2; //sin <= >= para q quede justo
	    		//izq der            ||   der izq             ||        abajo sup      ||     sup abajo
	}
	
	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

}
