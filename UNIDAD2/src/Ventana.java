import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Ventana extends JFrame
{
	public Ventana()
	{
		this.setVisible(true);
		
		this.setSize(1000, 640);
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
		//size, location, bg - opaque(opaque oblogatoria), texto string en el cosntructor
		this.login();
		
		JPanel registro = new JPanel();
		registro.setSize(this.getWidth()/2, this.getHeight());
		registro.setLocation(500, 0);
		registro.setBackground(Color.pink);
		registro.setLayout(null); //quitar el molde de la etiqueta
		
		JLabel regisTag = new JLabel("REGISTRO", 0); //0 para centrar, 2 izq, 4 der
		regisTag.setSize(400, 50); //tamaño al elemento
		regisTag.setFont(new Font("Arial", Font.BOLD, 25));
		regisTag.setForeground(Color.white); //color de fuente
		regisTag.setLocation(50, 35); //ubicacion, alternativa es setBounds 
		regisTag.setOpaque(true);//permite ponerle fondo
		regisTag.setBackground(Color.darkGray);
		registro.add(regisTag); //que sea visible la etiqueta en la ventana
		
		JLabel userTag = new JLabel("USUARIO:", 0);
		userTag.setBounds(100, 105, 300, 40); //x, y, campo para el escrito(x, y)
		userTag.setFont(new Font("Consolas", Font.BOLD, 18));
		userTag.setForeground(Color.white);
		userTag.setOpaque(true);
		userTag.setBackground(Color.darkGray);
		registro.add(userTag);
		
		JTextField userField = new JTextField();
		userField.setBounds(100, 155, 300, 30);
		userField.setHorizontalAlignment(0);
		userField.setFont((new Font("Consolas", Font.BOLD, 15)));
		registro.add(userField);
		
		JLabel bioTag = new JLabel("BIOGRAFÍA", 0);
		bioTag.setBounds(100, 200, 300, 30);
		bioTag.setFont(new Font("Consolas", Font.BOLD, 20));
		registro.add(bioTag);
		
		JTextArea bioText = new JTextArea();
		bioText.setBounds(100, 235, 300, 130);
		bioText.setFont(new Font("Consolas", Font.BOLD, 16));
		registro.add(bioText);
		
		JLabel preferTag = new JLabel("PREFERENCIAS", 0);
		preferTag.setBounds(100, 380, 300, 30);
		preferTag.setFont(new Font("Consolas", Font.BOLD, 20));
		registro.add(preferTag);
		
		JCheckBox itemBox1 = new JCheckBox("Dulce");
		itemBox1.setBounds(120, 405, 80, 30);
		itemBox1.setFont(new Font("Consolas", Font.BOLD, 15));
		itemBox1.setOpaque(false); 
		registro.add(itemBox1);
		
		JCheckBox itemBox2 = new JCheckBox("Salado");
		itemBox2.setBounds(200, 405, 80, 30);
		itemBox2.setFont(new Font("Consolas", Font.BOLD, 15));
//		itemBox2.setBorderPainted(true); //hacer bordes bonitos
//		itemBox2.setBorder(BorderFactory.createLineBorder(Color.white, 2));
		itemBox2.setOpaque(false); 
		registro.add(itemBox2);
		
		JCheckBox itemBox3 = new JCheckBox("Saludable");
		itemBox3.setBounds(280, 405, 100, 30);
		itemBox3.setFont(new Font("Consolas", Font.BOLD, 15));
		itemBox3.setOpaque(false); 
		registro.add(itemBox3);
		
		JLabel termsTag = new JLabel("TÉRMINOS", 0);
		termsTag.setBounds(100, 440, 300, 30);
		termsTag.setFont(new Font("Consolas", Font.BOLD, 20));
		termsTag.setOpaque(false);
		registro.add(termsTag);
		
		JRadioButton acceptRadio = new JRadioButton("Acepto los términos");
		acceptRadio.setBounds(50, 460, 180, 30);
		acceptRadio.setFont(new Font("Consolas", Font.BOLD, 12));
		acceptRadio.setOpaque(false); 
		registro.add(acceptRadio);
		
		JRadioButton rejectRadio = new JRadioButton("Rechazo los términos");
		rejectRadio.setBounds(280, 460, 180, 30);
		rejectRadio.setFont(new Font("Consolas", Font.BOLD, 12));
		rejectRadio.setOpaque(false); 
		registro.add(rejectRadio);
		
		ButtonGroup terms = new ButtonGroup();
		terms.add(acceptRadio);
		terms.add(rejectRadio);
		
		String colonias[] = {"Centro", "Camino Real", "Pedregal", "Conchalito", "La ocho"};
		JComboBox locations = new JComboBox(colonias);
		locations.setBounds(50, 490, 400, 30);
		locations.setFont(new Font("Consolas", Font.BOLD, 12));
		registro.add(locations);
		
		JButton rgsBtn = new JButton("Crear cuenta");
		rgsBtn.setBounds(175, 530, 150, 35);
		rgsBtn.setFont(new Font("Consolas", Font.BOLD, 12));
		registro.add(rgsBtn);
		
		this.add(registro);
		this.repaint(); //con esto ya no tenemos que redimensionar, lo mismo con el de abajo
		//this.validate();
		
	}
	
	public void login()
	{
				//ventana 1
				JPanel login = new JPanel();
				login.setSize(this.getWidth()/2, this.getHeight());
				login.setBackground(Color.lightGray);
				login.setLayout(null);				
				
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
				
				this.add(login);
				
	}
	

}
