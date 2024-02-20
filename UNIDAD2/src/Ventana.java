import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Ventana extends JFrame
{
	public Ventana()
	{
		this.setVisible(true);
		
		this.setSize(1000, 750);
		this.setLocation(100, 100);
		
		this.setLocationRelativeTo(null); 
		
		this.setLayout(null);		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
		
		System.out.println("hi"); //name
		
		this.setMinimumSize(new Dimension(250,250));
		this.setMaximumSize(new Dimension(1000,750));
		this.setResizable(true);
			
		this.IniciarComponentes();
	}
	
	public void IniciarComponentes()
	{
		JPanel login = new JPanel();
		login.setSize(this.getWidth()/2, this.getHeight());
		login.setBackground(Color.red);
		login.setLayout(null);
		
		JLabel loginTag = new JLabel("ACCEDER", 0); //0 para centrar, 2 izq, 4 der
		loginTag.setSize(300, 90); //tamaño al elemento
		loginTag.setFont(new Font("Arial", Font.BOLD, 34));
		loginTag.setForeground(Color.white); //color de fuente
		loginTag.setLocation(100, 20); //ubicacion, alternativa es setBounds 
		loginTag.setOpaque(true); //permite ponerle fondo
		loginTag.setBackground(Color.pink);
		login.add(loginTag); //que sea visible la etiqueta en la ventana
		
		JLabel userTag = new JLabel("User name: ");
		userTag.setBounds(10, 120, 200, 40);
		loginTag.setFont(new Font("Arial", Font.BOLD, 20));
		login.add(userTag);
		
		
		
		 		
		//size, location, bg - opaque(opaque oblogatoria), texto string en el cosntructor
		
		JPanel registro = new JPanel();
		registro.setSize(this.getWidth()/2, this.getHeight());
		registro.setLocation(500, 0);
		registro.setBackground(Color.blue);
		
		this.add(login);
		this.add(registro);
	}
	

}
