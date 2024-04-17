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
		
		g2.setColor(Color.decode("#504D9F"));
		g2.fillRect(x, y, 20, 20);	
		
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyPressed(KeyEvent e) 
	{
		System.out.println("Tecla presionada: " + e.getKeyCode());
		
		switch(e.getKeyCode())
		{
		case 65: //a
			x -= 10;
			break;
			
		case 87: //w
			y -= 10;
			break;
			 
		case 68: //d
			x += 10;
			break;
			
		case 83: //s
			y += 10;
			break;
			
		default:
			break;
		}
		//this.update(getGraphics()); evitar flash
		this.repaint();
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

}
