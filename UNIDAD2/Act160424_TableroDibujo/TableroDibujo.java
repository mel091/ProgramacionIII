package Act160424_TableroDibujo;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.image.BufferedImage;

import javax.imageio.ImageIO;
import javax.sound.sampled.AudioSystem; //
import javax.sound.sampled.Clip;//
import java.io.File;// para audios
import java.io.IOException;

import javax.swing.Timer;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class TableroDibujo extends JFrame implements KeyListener, MouseListener
{	
	int x = 18, y = 36;
	int horas = 0, min = 0, seg = 0;
	 String temp;
	 BufferedImage img = null;
	 BufferedImage img1 = null;
	 ImageIcon icono ;
	Player player;
	Player meta;
	
	Player obstaculos[] = {new Player(8, 7, 3, 405, "#42583C"), new Player(7, 410, 420, 3, "#42583C"), new Player(35, 31, 420, 3, "#42583C"),
			new Player(450, 30, 3, 360, "#42583C"), new Player(33, 31, 3, 45, "#42583C"), new Player(33, 75, 25, 3, "#42583C"),
			new Player(55, 75, 3, 40, "#42583C"), new Player(7, 95, 25, 3, "#42583C"), new Player(35, 115, 43, 3, "#42583C"),
			new Player(78, 95, 3, 23, "#42583C"), new Player(58, 53, 145, 3, "#42583C"), new Player(78, 95, 45, 3, "#42583C"),
			new Player(120, 75, 3, 20, "#42583C"), new Player(120, 75, 50, 3, "#42583C"), new Player(170, 55, 3, 45, "#42583C"),
			new Player(95, 75, 3, 20, "#42583C"), new Player(75, 55, 3, 20, "#42583C"), new Player(170, 100, 80, 3, "#42583C"),
			new Player(225, 30, 3, 50, "#42583C"), new Player(205, 80, 23, 3, "#42583C"), new Player(250, 55, 3, 48, "#42583C"),
			new Player(250, 80, 70, 3, "#42583C"), new Player(320, 56, 3, 27, "#42583C"), new Player(300, 55, 23, 3, "#42583C"),
			new Player(275, 33, 3, 22, "#42583C"), new Player(340, 55, 3, 47, "#42583C"), new Player(340, 55, 23, 3, "#42583C"),
			new Player(380, 30, 3, 45, "#42583C"), new Player(360, 75, 23, 3, "#42583C"), new Player(400, 50, 3, 50, "#42583C"),
			new Player(400, 50, 30, 3, "#42583C"), new Player(430, 50, 3, 50, "#42583C"), new Player(400, 70, 15, 3, "#42583C"),
			new Player(420, 100, 13, 3, "#42583C"), new Player(275, 100, 128, 3, "#42583C"), new Player(275, 100, 3, 20, "#42583C"),
			new Player(100, 117, 175, 3, "#42583C"), new Player(100, 117, 3, 20, "#42583C"), new Player(10, 135, 93, 3, "#42583C"),
			new Player(145, 100, 3, 20, "#42583C"), new Player(400, 120, 80, 3, "#42583C"), new Player(410, 120, 3, 210, "#42583C"),
			new Player(410, 145, 20, 3, "#42583C"), new Player(430, 170, 3, 20, "#42583C"), new Player(430, 190, 20, 3, "#42583C"),
			new Player(410, 215, 20, 3, "#42583C"), new Player(435, 235, 20, 3, "#42583C"), new Player(430, 258, 3, 110, "#42583C"),
			new Player(30, 155, 73, 3, "#42583C"), new Player(30, 155, 3, 23, "#42583C"), new Player(100, 155, 3, 23, "#42583C"),
			new Player(55, 175, 45, 3, "#42583C"), new Player(53, 175, 3, 23, "#42583C"), new Player(30, 195, 25, 3, "#42583C"),
			new Player(30, 195, 3, 23, "#42583C"), new Player(10, 215, 23, 3, "#42583C"), new Player(120, 137, 3, 60, "#42583C"),
			new Player(120, 137, 45, 3, "#42583C"), new Player(165, 137, 3, 40, "#42583C"), new Player(140, 177, 28, 3, "#42583C"),
			new Player(120, 158, 25, 3, "#42583C"), new Player(75, 195, 48, 3, "#42583C"), new Player(75, 195, 3, 23, "#42583C"),
			new Player(55, 215, 23, 3, "#42583C"), new Player(53, 215, 3, 23, "#42583C"), new Player(35, 235, 20, 3, "#42583C"),
			new Player(33, 235, 3, 45, "#42583C"), new Player(33, 277, 23, 3, "#42583C"), new Player(55, 260, 3, 20, "#42583C"),
			new Player(55, 260, 45, 3, "#42583C"), new Player(187, 117, 3, 82, "#42583C"), new Player(165, 197, 25, 3, "#42583C"),
			new Player(140, 180, 3, 20, "#42583C"), new Player(163, 197, 3, 23, "#42583C"), new Player(100, 197, 3, 23, "#42583C"),
			new Player(123, 218, 120, 3, "#42583C"), new Player(190, 140, 55, 3, "#42583C"), new Player(245, 140, 3, 20, "#42583C"),
			new Player(245, 160, 45, 3, "#42583C"), new Player(275, 140, 45, 3, "#42583C"), new Player(320, 140, 3, 65, "#42583C"),
			new Player(298, 120, 3, 20, "#42583C"), new Player(298, 120, 23, 3, "#42583C"), new Player(340, 90, 3, 50, "#42583C"),
			new Player(320, 160, 60, 3, "#42583C"), new Player(362, 120, 3, 40, "#42583C"), new Player(382, 100, 3, 40, "#42583C"),
			new Player(382, 140, 12, 3, "#42583C"), new Player(393, 140, 3, 95, "#42583C"), new Player(375, 180, 18, 3, "#42583C"),
			new Player(355, 200, 40, 3, "#42583C"), new Player(355, 180, 3, 23, "#42583C"), new Player(320, 180, 37, 3, "#42583C"),
			new Player(213, 180, 78, 3, "#42583C"), new Player(210, 160, 3, 23, "#42583C"), new Player(290, 180, 3, 41, "#42583C"),
			new Player(290, 203, 33, 3, "#42583C"), new Player(217, 200, 50, 3, "#42583C"), new Player(240, 200, 3, 38, "#42583C"),
			new Player(260, 218, 30, 3, "#42583C"), new Player(320, 220, 55, 3, "#42583C"), new Player(373, 220, 3, 35, "#42583C"),
			new Player(373, 253, 40, 3, "#42583C"), new Player(320, 220, 3, 35, "#42583C"), new Player(320, 253, 35, 3, "#42583C"),
			new Player(340, 235, 35, 3, "#42583C"), new Player(310, 235, 13, 3, "#42583C"), new Player(85, 240, 135, 3, "#42583C"),
			new Player(100, 240, 3, 75, "#42583C"), new Player(7, 295, 73, 3, "#42583C"), new Player(78, 278, 3, 20, "#42583C"),
			new Player(32, 315, 93, 3, "#42583C"), new Player(30, 315, 3, 80, "#42583C"), new Player(123, 315, 3, 20, "#42583C"),
			new Player(100, 334, 26, 3, "#42583C"), new Player(120, 260, 3, 38, "#42583C"), new Player(120, 295, 26, 3, "#42583C"),
			new Player(145, 295, 3, 60, "#42583C"), new Player(75, 355, 73, 3, "#42583C"), new Player(75, 335, 3, 40, "#42583C"),
			new Player(55, 335, 23, 3, "#42583C"), new Player(30, 355, 23, 3, "#42583C"), new Player(55, 375, 40, 3, "#42583C"),
			new Player(30, 395, 85, 3, "#42583C"), new Player(115, 375, 3, 23, "#42583C"), new Player(140, 240, 3, 40, "#42583C"),
			new Player(140, 277, 40, 3, "#42583C"), new Player(160, 258, 135, 3, "#42583C"), new Player(293, 258, 3, 23, "#42583C"),
			new Player(293, 280, 95, 3, "#42583C"), new Player(165, 280, 3, 20, "#42583C"), new Player(165, 300, 42, 3, "#42583C"),
			new Player(206, 277, 3, 26, "#42583C"), new Player(206, 276, 22, 3, "#42583C"), new Player(260, 218, 3, 43, "#42583C"),
			new Player(225, 260, 3, 19, "#42583C"), new Player(360, 282, 3, 20, "#42583C"), new Player(145, 320, 20, 3, "#42583C"),
			new Player(165, 320, 3, 20, "#42583C"), new Player(165, 340, 146, 3, "#42583C"), new Player(310, 300, 3, 43, "#42583C"),
			new Player(233, 300, 80, 3, "#42583C"), new Player(230, 300, 3, 20, "#42583C"), new Player(210, 320, 60, 3, "#42583C"),
			new Player(185, 300, 3, 20, "#42583C"), new Player(260, 280, 3, 20, "#42583C"), new Player(335, 300, 28, 3, "#42583C"),
			new Player(332, 300, 3, 40, "#42583C"), new Player(388, 300, 23, 3, "#42583C"), new Player(385, 300, 3, 50, "#42583C"),
			new Player(353, 320, 33, 3, "#42583C"), new Player(367, 320, 3, 50, "#42583C"), new Player(115, 373, 50, 3, "#42583C"),
			new Player(165, 360, 3, 38, "#42583C"), new Player(180, 360, 3, 38, "#42583C"), new Player(180, 360, 20, 3, "#42583C"),
			new Player(200, 340, 3, 23, "#42583C"), new Player(180, 380, 20, 3, "#42583C"), new Player(200, 380, 3, 18, "#42583C"),
			new Player(332, 340, 18, 3, "#42583C"), new Player(410, 347, 20, 3, "#42583C"), new Player(390, 365, 43, 3, "#42583C"),
			new Player(390, 365, 3, 30, "#42583C"), new Player(367, 370, 23, 3, "#42583C"), new Player(410, 385, 3, 25, "#42583C"),
			new Player(410, 394, 15, 3, "#42583C"), new Player(430, 360, 3, 20, "#42583C"), new Player(220, 370, 90, 3, "#42583C"),
			new Player(230, 358, 3, 40, "#42583C"), new Player(230, 358, 20, 3, "#42583C"), new Player(346, 340, 3, 50, "#42583C"),
			new Player(310, 357, 3, 16, "#42583C"), new Player(310, 357, 20, 3, "#42583C"), new Player(330, 357, 3, 16, "#42583C"),
			new Player(280, 340, 3, 15, "#42583C"), new Player(280, 370, 3, 20, "#42583C"), new Player(280, 390, 69, 3, "#42583C"),
			new Player(200, 395, 65, 3, "#42583C"), new Player(263, 395, 3, 18, "#42583C"), new Player(140, 390, 3, 20, "#42583C"),
			new Player(348, 390, 20, 3, "#42583C")
			};
 	
	public TableroDibujo()
	{
		this.setTitle("Laberinto");
		
		this.setVisible(true);
		this.setSize(460,460);
		this.setLocation(100,  100);
		this.setLayout(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
		this.setResizable(false);
		
		this.inicializar();
		
		addKeyListener(this);
		
		player = new Player(this.x, this.y, 9, 8, null);
		meta = new Player(430, 390, 25, 20, null);
		music("C:\\Users\\lachi\\Downloads\\Cute Circus.wav"); //colocar ruta + nombre del archivo:]
		
		try 
		{
		    img = ImageIO.read(new File("C:\\Users\\lachi\\OneDrive\\Documentos\\Documentos\\P2023JAVA\\130224Ventana\\src\\kitty.png"));
		} 
		catch (IOException e) 
		{
		    e.printStackTrace();
		}
		
		try 
		{
		    img1 = ImageIO.read(new File("C:\\Users\\lachi\\OneDrive\\Documentos\\Documentos\\P2023JAVA\\130224Ventana\\src\\fish1.png"));
		} 
		catch (IOException e) 
		{
		    e.printStackTrace();
		}

		
		time.start();
		
	}
	
	public void inicializar()
	{	
		JButton btn = new JButton("Reiniciar");
		btn.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				player.setX(x);
				player.setY(y);
				repaint();
			}
			
		});
		btn.setBounds(170, 390, 120, 25);
		this.add(btn);
	
		JPanel panel1 = new JPanel();
		panel1.setBounds(0, 380, getWidth(), 45);
		panel1.setBackground(Color.decode("#1C2919"));
		this.add(panel1);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, getWidth(), getHeight());
		panel.setBackground(Color.decode("#78E15B"));
		panel.setFocusable(true);
		panel.addMouseListener(this);
		this.add(panel);
	}
	
	public void paint(Graphics g)
	{		
		super.paint(g);
		
		Graphics2D g2 = (Graphics2D)g;
		
		g2.drawImage(img, player.getX(), player.getY(), player.getWidth(), player.getHeight(), null);

		
		g2.drawImage(img1, meta.getX(), meta.getY(), meta.getWidth(), meta.getHeight(), null);
		
		for(Player obstaculo : obstaculos)
		{
			g2.setColor(Color.decode(obstaculo.getColor()));
			g2.fillRect(obstaculo.getX(), obstaculo.getY(), obstaculo.getWidth(), obstaculo.getHeight());
		}
		
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
		
		    // verificar colisión con cada obstáculo
	    boolean colision = false;
	    for (Player obstaculo : obstaculos) 
	    {
	        if (player.colision(obstaculo, newX, newY)) 
	        {
	        	colision = true;
	            break; // salir del bucle en caso de colisión con un obstáculo
	        }
	        else if(player.colision(meta, newX, newY))
	        {
	        	colision = true;
	        	 JOptionPane.showMessageDialog(null, "¡Felicidades!\nTiempo transcurrido: " + temp);
	        	 time.stop();
	            break;
	        }
	    }
	    
	    // mover el jugador solo si no hay colisión 
	    if (!colision) 
	    {
	        player.setX(newX);
	        player.setY(newY);
	    }
		

	   this.repaint();
	   this.revalidate();
	}
	
	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
	
	public void music(String archivo) //insertar audio :p
	{
		try 
		{
			File sound = new File(archivo);
			if(!sound.exists())
			{
				System.out.println("error, no existe");
				return;
			}
			
			Clip clip = AudioSystem.getClip();
			clip.open(AudioSystem.getAudioInputStream(sound));
			
			clip.loop(Clip.LOOP_CONTINUOUSLY);
		} 
		catch (Exception e) 
		{
			System.out.println("Error al reproducir");
		}
	}
	
	Timer time = new Timer(1000, new ActionListener() 
	{
	    @Override
	    public void actionPerformed(ActionEvent e) 
	    {
	        seg++; // Incrementa los segundos transcurridos en cada iteración
	       if(seg == 60)
	       {
	    	   seg = 0;
	    	   min++;
	       }
	       else if(min == 60)
	       {
	    	   min = 0;
	    	   horas++;
	       }
	       
	      temp = String.format("%02d:%02d:%02d", horas, min, seg);
	    }
	});

	@Override
	public void mouseClicked(MouseEvent e) 
	{
		double x = e.getX();
		double y = e.getY();
		System.out.println("Coordenada X: " + x + " Coordenada Y: " + y);
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
}

