import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class Ventana extends JFrame
{
	public Ventana()
	{
		this.setVisible(true);
		
		this.setSize(1000, 580);
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
		//ventana 1
		JPanel login = new JPanel();
		login.setSize(this.getWidth()/2, this.getHeight());
		login.setBackground(Color.lightGray);
		login.setLayout(null);
		
//		JPanel fondo = new JPanel();
//		fondo.setSize(400,500);
//		fondo.setBackground(Color.lightGray);
//		fondo.setLocation(50, 30);
//		login.add(fondo);
		
		//etiqueta 
		JLabel loginTag = new JLabel("INICIO", 0); //0 para centrar, 2 izq, 4 der
		loginTag.setSize(200, 60); //tamaño al elemento
		loginTag.setFont(new Font("Arial", Font.BOLD, 25));
		loginTag.setForeground(Color.white); //color de fuente
		loginTag.setLocation(150, 35); //ubicacion, alternativa es setBounds 
		loginTag.setOpaque(true); //permite ponerle fondo
		loginTag.setBackground(Color.gray);
		login.add(loginTag); //que sea visible la etiqueta en la ventana
		
		JLabel userTag = new JLabel("USUARIO:");
		userTag.setBounds(90, 97, 200, 50); //x, y, campo para el escrito(x, y)
		userTag.setFont(new Font("Consolas", Font.BOLD, 18));
		login.add(userTag);
		
		JTextField userField = new JTextField();
		userField.setBounds(88, 135, 300, 30);
		login.add(userField);
		
		JLabel pswTag = new JLabel("CONTRASEÑA:");
		pswTag.setBounds(90, 177, 200, 40);  
		pswTag.setFont(new Font("Consolas", Font.BOLD, 18));
		login.add(pswTag);
		
		JPasswordField pswField = new JPasswordField();
		pswField.setBounds(88, 210, 300, 30);
		login.add(pswField);
		
		JCheckBox remember = new JCheckBox("Recordarme");
		remember.setOpaque(false); 
		remember.setBounds(90, 250, 100, 20);
		login.add(remember);
		
		JLabel forgotTag = new JLabel("¿Olvidaste tu contraseña?");
		forgotTag.setBounds(240, 240, 260, 40);
		login.add(forgotTag);
		
		JButton loginBtn = new JButton("Acceder");
		loginBtn.setBounds(175, 300, 150, 50);
		login.add(loginBtn);
		
				
		//size, location, bg - opaque(opaque oblogatoria), texto string en el cosntructor
		
		JPanel registro = new JPanel();
		registro.setSize(this.getWidth()/2, this.getHeight());
		registro.setLocation(500, 0);
		registro.setBackground(Color.pink);
		
		this.add(login);
		this.add(registro);
		
	}
	

}
