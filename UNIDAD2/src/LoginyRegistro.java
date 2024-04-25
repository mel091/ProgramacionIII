import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridLayout;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Frame;

import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JCheckBox;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import org.json.JSONArray;
import org.json.JSONObject;
import org.json.JSONException;

import java.io.FileReader;
import java.io.IOException;

public class LoginyRegistro extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_2;
	private JPasswordField passwordField;
	private JPasswordField passwordField_1;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LoginyRegistro frame = new LoginyRegistro();
					frame.setVisible(true);
					//frame.registro(frame);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public LoginyRegistro() 
	{
		//this.registro(this);
		
		this.login(this);
		
		//this.recuperacionCuenta(this);
		
		this.getContentPane();
		
	}
	
	public void registro(JFrame frame)
	{
		this.setTitle("Registro");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 340, 615);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(new GridLayout(0, 1, 0, 0));
		
		JPanel panel = new JPanel();
		//panel.setBounds(0, 0, this.getWidth(), this.getHeight());
		panel.setBackground(Color.decode("#908DE5"));
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("R e g i s t r o", 0);
		lblNewLabel.setBounds(107, 20, 106, 20);
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setFont(new Font("Lucida Sans", Font.BOLD, 14));
		panel.add(lblNewLabel);
		
		JLabel lblRegistrateGratisLlenando = new JLabel("Llena los siguientes datos", SwingConstants.CENTER);
		lblRegistrateGratisLlenando.setBounds(33, 50, 252, 31);
		lblRegistrateGratisLlenando.setForeground(Color.WHITE);
		lblRegistrateGratisLlenando.setFont(new Font("Lucida Sans", Font.PLAIN, 11));
		panel.add(lblRegistrateGratisLlenando);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(255, 255, 255));
		panel_1.setBounds(0, 95, 315, 460);
		panel.add(panel_1);
		panel_1.setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(25, 40, 200, 22);
		textField.setBorder(null);
		panel_1.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Nombre");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblNewLabel_1.setBounds(25, 25, 150, 14);
		panel_1.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("------------------------------------------------------------------");
		lblNewLabel_2.setForeground(new Color(128, 128, 128));
		lblNewLabel_2.setBounds(25, 55, 270, 14);
		panel_1.add(lblNewLabel_2);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("Correo electrónico");
		lblNewLabel_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblNewLabel_1_1_1.setBounds(25, 122, 100, 14);
		panel_1.add(lblNewLabel_1_1_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBorder(null);
		textField_2.setBounds(25, 138, 200, 22);
		panel_1.add(textField_2);
		
		JLabel lblNewLabel_2_1_1 = new JLabel("------------------------------------------------------------------");
		lblNewLabel_2_1_1.setForeground(Color.GRAY);
		lblNewLabel_2_1_1.setBounds(25, 155, 270, 14);
		panel_1.add(lblNewLabel_2_1_1);
		
		JLabel lblNewLabel_1_1_1_1 = new JLabel("Contraseña");
		lblNewLabel_1_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblNewLabel_1_1_1_1.setBounds(25, 175, 100, 14);
		panel_1.add(lblNewLabel_1_1_1_1);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(25, 190, 200, 22);
		passwordField.setBorder(null);
		panel_1.add(passwordField);
		
		JLabel viewPsw = new JLabel();
		viewPsw.setIcon(new ImageIcon(getClass().getResource("viewPsw.png")));
		viewPsw.setBounds(265, 150, 100, 100);
		panel_1.add(viewPsw);
		
		JLabel lblNewLabel_2_1_1_1 = new JLabel("------------------------------------------------------------------");
		lblNewLabel_2_1_1_1.setForeground(Color.GRAY);
		lblNewLabel_2_1_1_1.setBounds(25, 205, 270, 14);
		panel_1.add(lblNewLabel_2_1_1_1);
		
		JLabel lblNewLabel_1_1_1_1_1 = new JLabel("Confirmar contraseña");
		lblNewLabel_1_1_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblNewLabel_1_1_1_1_1.setBounds(25, 225, 150, 14);
		panel_1.add(lblNewLabel_1_1_1_1_1);
		
		passwordField_1 = new JPasswordField();
		passwordField_1.setBorder(null);
		passwordField_1.setBounds(25, 240, 200, 22);
		panel_1.add(passwordField_1);
		
		JLabel viewPsw1 = new JLabel();
		viewPsw1.setIcon(new ImageIcon(getClass().getResource("viewPsw.png")));
		viewPsw1.setBounds(265, 200, 100, 100);
		panel_1.add(viewPsw1);
		
		JLabel lblNewLabel_2_1_1_1_1 = new JLabel("------------------------------------------------------------------");
		lblNewLabel_2_1_1_1_1.setForeground(Color.GRAY);
		lblNewLabel_2_1_1_1_1.setBounds(25, 255, 270, 14);
		panel_1.add(lblNewLabel_2_1_1_1_1);
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("Acepto los términos y condiciones");
		chckbxNewCheckBox.setFont(new Font("Tahoma", Font.PLAIN, 11));
		chckbxNewCheckBox.setBounds(25, 275, 200, 23);
		chckbxNewCheckBox.setOpaque(false);
		panel_1.add(chckbxNewCheckBox);
		
		JButton btnNewButton = new JButton("Registrarse");
		btnNewButton.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{		 
				 String nombre = textField.getText();
				 String apellido = textField_1.getText();
				 String correo = textField_2.getText();
				 String psw = new String(passwordField.getPassword());
				 String psw1 = new String(passwordField_1.getPassword());
				
				 if(nombre.length() <= 0 || apellido.length() <= 0)
				 {
					 JOptionPane.showMessageDialog(null, "Campos incompletos: (nombre o apellido)", "Error", JOptionPane.WARNING_MESSAGE);
	 						 
				 }				 
					 
				 else if(correo.length() <= 0)
				 {
					 textField_2.setBorder(BorderFactory.createLineBorder(Color.red, 2));
					 JOptionPane.showMessageDialog(null, "Campos incompletos: correo", "Error", JOptionPane.WARNING_MESSAGE);
	 						 
				 }
				 
				 else if(!chckbxNewCheckBox.isSelected())
				{
					JOptionPane.showMessageDialog(null, "Acepte los términos para continuar", "Error", JOptionPane.WARNING_MESSAGE);
				}
				
				 else if(psw.equals(psw1))
				 {
					 JOptionPane.showMessageDialog(null, "Registro completo", "Sucess", JOptionPane.INFORMATION_MESSAGE);
	 					
				 }
				 else
				 {
					 JOptionPane.showMessageDialog(null, "Las contraseñas no coinciden", "Error", JOptionPane.WARNING_MESSAGE);
	 						 
				 }
				 
				 			 
				 
			}});
		
		
		
		btnNewButton.setForeground(new Color(255, 255, 255));
		btnNewButton.setFont(new Font("Lucida Sans", Font.BOLD, 14));
		btnNewButton.setBounds(60, 320, 200, 35);
		btnNewButton.setBackground(Color.decode("#8E8BE1"));
		panel_1.add(btnNewButton);
		
		JLabel lblNewLabel_1_1_1_1_1_1 = new JLabel("----- O registrate con -----");
		lblNewLabel_1_1_1_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblNewLabel_1_1_1_1_1_1.setBounds(97, 380, 150, 14);
		panel_1.add(lblNewLabel_1_1_1_1_1_1);
		
		JLabel facebook = new JLabel();
		facebook.setIcon(new ImageIcon(getClass().getResource("facebook.png")));
		facebook.setBounds(110, 360, 100, 100);
		panel_1.add(facebook);
		
		JLabel google = new JLabel();
		google.setIcon(new ImageIcon(getClass().getResource("google1.png")));
		google.setBounds(150, 360, 100, 100);
		panel_1.add(google);
		
		JLabel twitter = new JLabel();
		twitter.setIcon(new ImageIcon(getClass().getResource("twitter.png")));
		twitter.setBounds(187, 360, 100, 100);
		panel_1.add(twitter);
		
		JButton lblNewLabel_1_1_1_1_1_1_1 = new JButton("¿Ya tienes una cuenta? Inicia sesión");
		lblNewLabel_1_1_1_1_1_1_1.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				frame.remove(panel_1);
				
				login(frame);
				frame.repaint();
				frame.revalidate();			
				
			}
			
		});
		
		lblNewLabel_1_1_1_1_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblNewLabel_1_1_1_1_1_1_1.setBounds(40, 430, 250, 14);
		panel_1.add(lblNewLabel_1_1_1_1_1_1_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Apellido");
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblNewLabel_1_1.setBounds(25, 76, 150, 14);
		panel_1.add(lblNewLabel_1_1);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBorder(null);
		textField_1.setBounds(25, 90, 200, 22);
		panel_1.add(textField_1);
		
		JLabel lblNewLabel_2_1_1_2 = new JLabel("------------------------------------------------------------------");
		lblNewLabel_2_1_1_2.setForeground(Color.GRAY);
		lblNewLabel_2_1_1_2.setBounds(25, 105, 270, 14);
		panel_1.add(lblNewLabel_2_1_1_2);
	}
	
	public void login(JFrame frame)
	{
		this.setTitle("Login");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 340, 615);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(new GridLayout(0, 1, 0, 0));
		
		JPanel panel = new JPanel();
		//panel.setBounds(0, 0, this.getWidth(), this.getHeight());
		panel.setBackground(new Color(255, 255, 255));
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel_3 = new JLabel("B i e n v e n i d o");
		lblNewLabel_3.setFont(new Font("Lucida Sans Unicode", Font.BOLD, 17));
		lblNewLabel_3.setBounds(90, 60, 180, 14);
		panel.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Accede a tu cuenta ingresando lo siguiente");
		lblNewLabel_4.setForeground(new Color(128, 128, 128));
		lblNewLabel_4.setFont(new Font("Lucida Sans", Font.PLAIN, 13));
		lblNewLabel_4.setBounds(20, 100, 280, 20);
		panel.add(lblNewLabel_4);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("Nombre de usuario");
		lblNewLabel_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblNewLabel_1_1_1.setBounds(25, 150, 100, 14);
		panel.add(lblNewLabel_1_1_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBorder(null);
		textField_2.setBounds(25, 165, 200, 25);
		panel.add(textField_2);
		
		JLabel lblNewLabel_2_1_1 = new JLabel("------------------------------------------------------------------");
		lblNewLabel_2_1_1.setForeground(Color.GRAY);
		lblNewLabel_2_1_1.setBounds(25, 185, 270, 14);
		panel.add(lblNewLabel_2_1_1);
		
		JLabel lblNewLabel_1_1_1_1 = new JLabel("Contraseña");
		lblNewLabel_1_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblNewLabel_1_1_1_1.setBounds(25, 210, 100, 14);
		panel.add(lblNewLabel_1_1_1_1);
		
		passwordField_1 = new JPasswordField();
		passwordField_1.setBorder(null);
		passwordField_1.setBounds(25, 227, 200, 20);
		panel.add(passwordField_1);
		
		JLabel viewPsw = new JLabel();
		viewPsw.setIcon(new ImageIcon(getClass().getResource("viewPsw.png")));
		viewPsw.setBounds(265, 190, 100, 100);
		panel.add(viewPsw);
		
		JLabel lblNewLabel_2_1_1_1_1 = new JLabel("------------------------------------------------------------------");
		lblNewLabel_2_1_1_1_1.setForeground(Color.GRAY);
		lblNewLabel_2_1_1_1_1.setBounds(25, 243, 270, 14);
		panel.add(lblNewLabel_2_1_1_1_1);
		
		JCheckBox chckbxNewCheckBox_1 = new JCheckBox("Recordarme");
		chckbxNewCheckBox_1.setFont(new Font("Tahoma", Font.PLAIN, 11));
		chckbxNewCheckBox_1.setBounds(25, 265, 97, 23);
		chckbxNewCheckBox_1.setOpaque(false);		
		panel.add(chckbxNewCheckBox_1);
		
		JButton btnNewButton = new JButton("Acceder");
		btnNewButton.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				try 
				{
					String filePath = "C:\\Users\\lachi\\OneDrive\\Documentos\\Documentos\\json\\users.json";
					FileReader reader = new FileReader(filePath); //leer archivo
					
					StringBuilder jsonString = new StringBuilder(); //guarda el contenido del json
					int p;
					
					while((p = reader.read()) != -1)
					{
						jsonString.append((char) p);//convierte a char
					}
					
					reader.close();
					
					JSONObject jsonObj = new JSONObject(jsonString.toString()); //objeto a partir del contenido de json
					JSONArray usersArray = jsonObj.getJSONArray("users"); //array de usuarios json
					
					for(int i = 0 ; i < usersArray.length() ; i++) //recorremos todos los usuarios
					{
						JSONObject userObj =  usersArray.getJSONObject(i);
						String user = userObj.getString("maidenName");
						String psw = userObj.getString("password");
						
						System.out.println("User: " + user);
						System.out.println("Password: " + psw);
						System.out.println();						
					}

				} 
				
				catch (IOException | JSONException e1) 
				{
					e1.printStackTrace();
				}
				
			}
		});
		btnNewButton.setForeground(new Color(255, 255, 255));
		btnNewButton.setFont(new Font("Lucida Sans", Font.BOLD, 14));
		btnNewButton.setBounds(60, 310, 200, 35);
		btnNewButton.setBackground(Color.decode("#8E8BE1"));
		panel.add(btnNewButton);
		
		JLabel lblNewLabel_1_1_1_1_1 = new JLabel("¿Olvidaste la contraseña?");
		lblNewLabel_1_1_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblNewLabel_1_1_1_1_1.setBounds(100, 360, 130, 14);
		panel.add(lblNewLabel_1_1_1_1_1);
		
		JLabel lblNewLabel_1_1_1_1_1_1 = new JLabel("----- O registrate con -----");
		lblNewLabel_1_1_1_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblNewLabel_1_1_1_1_1_1.setBounds(95, 400, 150, 14);
		panel.add(lblNewLabel_1_1_1_1_1_1);
		
		JLabel facebook = new JLabel();
		facebook.setIcon(new ImageIcon(getClass().getResource("facebook.png")));
		facebook.setBounds(110, 385, 100, 100);
		panel.add(facebook);
		
		JLabel google = new JLabel();
		google.setIcon(new ImageIcon(getClass().getResource("google1.png")));
		google.setBounds(150, 385, 100, 100);
		panel.add(google);
		
		JLabel twitter = new JLabel();
		twitter.setIcon(new ImageIcon(getClass().getResource("twitter.png")));
		twitter.setBounds(187, 385, 100, 100);
		panel.add(twitter);
		
		JButton lblNewLabel_1_1_1_1_1_1_1 = new JButton("¿No tienes una cuenta? Crea una ahora");
		lblNewLabel_1_1_1_1_1_1_1.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				frame.remove(panel);
				
				registro(frame);
				
				frame.repaint();
				frame.revalidate();
				
			}
			
		});
		lblNewLabel_1_1_1_1_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblNewLabel_1_1_1_1_1_1_1.setBounds(40, 496, 250, 14);
		panel.add(lblNewLabel_1_1_1_1_1_1_1);
		
		///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
		
		JMenuBar barra = new JMenuBar(); //se puede colocar mas menús, constructor vacío
		JMenu menuFile = new JMenu("Cuenta");
		JMenu menuFile1 = new JMenu("Usuarios");
		JMenu menuFile2 = new JMenu("Ayuda");
		
		JMenuItem cuentaItem = new JMenuItem("Login");
		cuentaItem.addActionListener(new ActionListener() 
		{
			@Override
			public void actionPerformed(ActionEvent e) 
			{
				frame.getContentPane().removeAll();
				login(frame);
				frame.repaint();
				frame.revalidate();
				
			}
			
		});
		
		JMenuItem registroItem = new JMenuItem("Registro");
		registroItem.addActionListener(new ActionListener() 
		{
			@Override
			public void actionPerformed(ActionEvent e) 
			{
				frame.getContentPane().removeAll();
				registro(frame);
				frame.repaint();
				frame.revalidate();
				
			}
			
		});
		
		JMenuItem recuperacionItem = new JMenuItem("Recuperación de cuenta");
		recuperacionItem.addActionListener(new ActionListener() 
		{
			@Override
			public void actionPerformed(ActionEvent e) 
			{
				frame.getContentPane().removeAll();
				recuperacionCuenta(frame);
				frame.repaint();
				frame.revalidate();
				
			}
			
		});
		
		JMenuItem altaItem = new JMenuItem("Alta");
		altaItem.addActionListener(new ActionListener() 
		{
			@Override
			public void actionPerformed(ActionEvent e) 
			{
				frame.getContentPane().removeAll();
				altaUsuario(frame);
				frame.repaint();
				frame.revalidate();
				
			}
			
		});
		JMenuItem bajaItem = new JMenuItem("Baja");
		bajaItem.addActionListener(new ActionListener() 
		{
			@Override
			public void actionPerformed(ActionEvent e) 
			{
				frame.getContentPane().removeAll();
				darBaja(frame);
				frame.repaint();
				frame.revalidate();
				
			}
			
		});
		JMenuItem consultarItem = new JMenuItem("Consultar");
		consultarItem.addActionListener(new ActionListener() 
		{
			@Override
			public void actionPerformed(ActionEvent e) 
			{
				frame.getContentPane().removeAll();
				consultar(frame);
				frame.repaint();
				frame.revalidate();
				
			}
			
		});
		
		JMenuItem crearUsuario = new JMenuItem("¿Cómo crear un usuario?");
		crearUsuario.addActionListener(new ActionListener() 
		{
			@Override
			public void actionPerformed(ActionEvent e) 
			{
				frame.getContentPane().removeAll();
				crearUsuario(frame);
				frame.repaint();
				frame.revalidate();
				
			}
			
		});
		JMenuItem acceder = new JMenuItem("¿Cómo acceder al sistema?");
		acceder.addActionListener(new ActionListener() 
		{
			@Override
			public void actionPerformed(ActionEvent e) 
			{
				frame.getContentPane().removeAll();
				accederSistema(frame);
				frame.repaint();
				frame.revalidate();
				
			}
			
		});
		JMenuItem forgotPsw = new JMenuItem("¿Qué pasa si olvidé mi contraseña?");
		forgotPsw.addActionListener(new ActionListener() 
		{
			@Override
			public void actionPerformed(ActionEvent e) 
			{
				frame.getContentPane().removeAll();
				forgotPsw(frame);
				frame.repaint();
				frame.revalidate();
				
			}
			
		});
		
		// menu
		barra.add(menuFile);
		barra.add(menuFile1);
		barra.add(menuFile2);
		//opciones cuenta
		menuFile.add(cuentaItem);
		menuFile.add(registroItem);
		menuFile.add(recuperacionItem);
		//opciones usuario
		menuFile1.add(altaItem);
		menuFile1.add(bajaItem);
		menuFile1.add(consultarItem);
		//opciones ayuda
		menuFile2.add(crearUsuario);
		menuFile2.add(acceder);
		menuFile2.add(forgotPsw);
		
		
		this.setJMenuBar(barra);
		
	}
	
	public void recuperacionCuenta(JFrame frame)
	{
		this.setTitle("Recuperación de cuenta");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 340, 615);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(new GridLayout(0, 1, 0, 0));
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(255, 255, 255));
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel_3 = new JLabel("R e c u p e r a r  C u e n t a");
		lblNewLabel_3.setFont(new Font("Lucida Sans Unicode", Font.BOLD, 17));
		lblNewLabel_3.setBounds(50, 60, 250, 20);
		panel.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Recupera tu cuenta ingresando lo siguiente");
		lblNewLabel_4.setForeground(new Color(128, 128, 128));
		lblNewLabel_4.setFont(new Font("Lucida Sans", Font.PLAIN, 13));
		lblNewLabel_4.setBounds(20, 100, 280, 20);
		panel.add(lblNewLabel_4);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("Correo electrónico");
		lblNewLabel_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblNewLabel_1_1_1.setBounds(25, 150, 100, 14);
		panel.add(lblNewLabel_1_1_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBorder(null);
		textField_2.setBounds(25, 165, 200, 25);
		panel.add(textField_2);
		
		JLabel lblNewLabel_2_1_1 = new JLabel("------------------------------------------------------------------");
		lblNewLabel_2_1_1.setForeground(Color.GRAY);
		lblNewLabel_2_1_1.setBounds(25, 185, 270, 14);
		panel.add(lblNewLabel_2_1_1);
		
		
		JButton btnNewButton = new JButton("Recuperar");
		//btnNewButton.addActionListener(new ActionListener() 
//		{
//			public void actionPerformed(ActionEvent e) 
//			{
//				JOptionPane.showMessageDialog(null, "No se puede acceder", "Error", JOptionPane.WARNING_MESSAGE);
//			}
//		});
		btnNewButton.setForeground(new Color(255, 255, 255));
		btnNewButton.setFont(new Font("Lucida Sans", Font.BOLD, 14));
		btnNewButton.setBounds(60, 250, 200, 35);
		btnNewButton.setBackground(Color.decode("#8E8BE1"));
		panel.add(btnNewButton);
		
		JLabel lblNewLabel_1_1_1_1_1_1 = new JLabel("----- O intenta con -----");
		lblNewLabel_1_1_1_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblNewLabel_1_1_1_1_1_1.setBounds(105, 400, 150, 14);
		panel.add(lblNewLabel_1_1_1_1_1_1);
		
		JLabel facebook = new JLabel();
		facebook.setIcon(new ImageIcon(getClass().getResource("facebook.png")));
		facebook.setBounds(110, 385, 100, 100);
		panel.add(facebook);
		
		JLabel google = new JLabel();
		google.setIcon(new ImageIcon(getClass().getResource("google1.png")));
		google.setBounds(150, 385, 100, 100);
		panel.add(google);
		
		JLabel twitter = new JLabel();
		twitter.setIcon(new ImageIcon(getClass().getResource("twitter.png")));
		twitter.setBounds(187, 385, 100, 100);
		panel.add(twitter);
		
		JButton lblNewLabel_1_1_1_1_1_1_1 = new JButton("¿Recordado? okay, regresa al Login");
		lblNewLabel_1_1_1_1_1_1_1.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				frame.getContentPane().removeAll();;
				login(frame);
				frame.repaint();
				frame.revalidate();			
				
			}
			
		});
		lblNewLabel_1_1_1_1_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblNewLabel_1_1_1_1_1_1_1.setBounds(40, 496, 250, 14);
		panel.add(lblNewLabel_1_1_1_1_1_1_1);
	}
	
	public void altaUsuario(JFrame frame)
	{
		this.setTitle("Alta del usuario");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 340, 615);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(new GridLayout(0, 1, 0, 0));
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(255, 255, 255));
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel_3 = new JLabel("A l t a  d e l  u s u a r i o");
		lblNewLabel_3.setFont(new Font("Lucida Sans Unicode", Font.BOLD, 17));
		lblNewLabel_3.setBounds(50, 60, 250, 20);
		panel.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Ingresa los datos para proseguir");
		lblNewLabel_4.setForeground(new Color(128, 128, 128));
		lblNewLabel_4.setFont(new Font("Lucida Sans", Font.PLAIN, 13));
		lblNewLabel_4.setBounds(20, 100, 280, 20);
		panel.add(lblNewLabel_4);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("Correo electrónico");
		lblNewLabel_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblNewLabel_1_1_1.setBounds(25, 150, 100, 14);
		panel.add(lblNewLabel_1_1_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBorder(null);
		textField_2.setBounds(25, 165, 200, 25);
		panel.add(textField_2);
		
		JLabel lblNewLabel_2_1_1 = new JLabel("------------------------------------------------------------------");
		lblNewLabel_2_1_1.setForeground(Color.GRAY);
		lblNewLabel_2_1_1.setBounds(25, 185, 270, 14);
		panel.add(lblNewLabel_2_1_1);
		
		JLabel lblNewLabel_1_1_1_1 = new JLabel("Contraseña");
		lblNewLabel_1_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblNewLabel_1_1_1_1.setBounds(25, 210, 100, 14);
		panel.add(lblNewLabel_1_1_1_1);
		
		passwordField_1 = new JPasswordField();
		passwordField_1.setBorder(null);
		passwordField_1.setBounds(25, 227, 200, 20);
		panel.add(passwordField_1);
		
		JLabel viewPsw = new JLabel();
		viewPsw.setIcon(new ImageIcon(getClass().getResource("viewPsw.png")));
		viewPsw.setBounds(265, 190, 100, 100);
		panel.add(viewPsw);
		
		JLabel lblNewLabel_2_1_1_1_1 = new JLabel("------------------------------------------------------------------");
		lblNewLabel_2_1_1_1_1.setForeground(Color.GRAY);
		lblNewLabel_2_1_1_1_1.setBounds(25, 243, 270, 14);
		panel.add(lblNewLabel_2_1_1_1_1);
		
		
		JButton btnNewButton = new JButton("Dar de alta");
		//btnNewButton.addActionListener(new ActionListener() 
//		{
//			public void actionPerformed(ActionEvent e) 
//			{
//				JOptionPane.showMessageDialog(null, "No se puede acceder", "Error", JOptionPane.WARNING_MESSAGE);
//			}
//		});
		btnNewButton.setForeground(new Color(255, 255, 255));
		btnNewButton.setFont(new Font("Lucida Sans", Font.BOLD, 14));
		btnNewButton.setBounds(60, 320, 200, 35);
		btnNewButton.setBackground(Color.decode("#8E8BE1"));
		panel.add(btnNewButton);
		
		JLabel lblNewLabel_1_1_1_1_1_1 = new JLabel("----- O intenta con -----");
		lblNewLabel_1_1_1_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblNewLabel_1_1_1_1_1_1.setBounds(105, 400, 150, 14);
		panel.add(lblNewLabel_1_1_1_1_1_1);
		
		JLabel facebook = new JLabel();
		facebook.setIcon(new ImageIcon(getClass().getResource("facebook.png")));
		facebook.setBounds(110, 385, 100, 100);
		panel.add(facebook);
		
		JLabel google = new JLabel();
		google.setIcon(new ImageIcon(getClass().getResource("google1.png")));
		google.setBounds(150, 385, 100, 100);
		panel.add(google);
		
		JLabel twitter = new JLabel();
		twitter.setIcon(new ImageIcon(getClass().getResource("twitter.png")));
		twitter.setBounds(187, 385, 100, 100);
		panel.add(twitter);
		
		JButton lblNewLabel_1_1_1_1_1_1_1 = new JButton("¿Equivocado? okay, regresa al Login");
		lblNewLabel_1_1_1_1_1_1_1.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				frame.getContentPane().removeAll();;
				login(frame);
				frame.repaint();
				frame.revalidate();			
				
			}
			
		});
		lblNewLabel_1_1_1_1_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblNewLabel_1_1_1_1_1_1_1.setBounds(40, 496, 250, 14);
		panel.add(lblNewLabel_1_1_1_1_1_1_1);
		
		
	}
	
	public void darBaja(JFrame frame)
	{
		this.setTitle("Baja del usuario");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 340, 615);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(new GridLayout(0, 1, 0, 0));
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(255, 255, 255));
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel_3 = new JLabel("B a j a  d e l  u s u a r i o");
		lblNewLabel_3.setFont(new Font("Lucida Sans Unicode", Font.BOLD, 17));
		lblNewLabel_3.setBounds(50, 60, 250, 20);
		panel.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Ingresa los datos para proseguir");
		lblNewLabel_4.setForeground(new Color(128, 128, 128));
		lblNewLabel_4.setFont(new Font("Lucida Sans", Font.PLAIN, 13));
		lblNewLabel_4.setBounds(20, 100, 280, 20);
		panel.add(lblNewLabel_4);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("Correo electrónico");
		lblNewLabel_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblNewLabel_1_1_1.setBounds(25, 150, 100, 14);
		panel.add(lblNewLabel_1_1_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBorder(null);
		textField_2.setBounds(25, 165, 200, 25);
		panel.add(textField_2);
		
		JLabel lblNewLabel_2_1_1 = new JLabel("------------------------------------------------------------------");
		lblNewLabel_2_1_1.setForeground(Color.GRAY);
		lblNewLabel_2_1_1.setBounds(25, 185, 270, 14);
		panel.add(lblNewLabel_2_1_1);
		
		JLabel lblNewLabel_1_1_1_1 = new JLabel("Contraseña");
		lblNewLabel_1_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblNewLabel_1_1_1_1.setBounds(25, 210, 100, 14);
		panel.add(lblNewLabel_1_1_1_1);
		
		passwordField_1 = new JPasswordField();
		passwordField_1.setBorder(null);
		passwordField_1.setBounds(25, 227, 200, 20);
		panel.add(passwordField_1);
		
		JLabel viewPsw = new JLabel();
		viewPsw.setIcon(new ImageIcon(getClass().getResource("viewPsw.png")));
		viewPsw.setBounds(265, 190, 100, 100);
		panel.add(viewPsw);
		
		JLabel lblNewLabel_2_1_1_1_1 = new JLabel("------------------------------------------------------------------");
		lblNewLabel_2_1_1_1_1.setForeground(Color.GRAY);
		lblNewLabel_2_1_1_1_1.setBounds(25, 243, 270, 14);
		panel.add(lblNewLabel_2_1_1_1_1);
		
		
		JButton btnNewButton = new JButton("Dar de baja");
		//btnNewButton.addActionListener(new ActionListener() 
//		{
//			public void actionPerformed(ActionEvent e) 
//			{
//				JOptionPane.showMessageDialog(null, "No se puede acceder", "Error", JOptionPane.WARNING_MESSAGE);
//			}
//		});
		btnNewButton.setForeground(new Color(255, 255, 255));
		btnNewButton.setFont(new Font("Lucida Sans", Font.BOLD, 14));
		btnNewButton.setBounds(60, 320, 200, 35);
		btnNewButton.setBackground(Color.decode("#8E8BE1"));
		panel.add(btnNewButton);
		
		JLabel lblNewLabel_1_1_1_1_1_1 = new JLabel("----- O intenta con -----");
		lblNewLabel_1_1_1_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblNewLabel_1_1_1_1_1_1.setBounds(105, 400, 150, 14);
		panel.add(lblNewLabel_1_1_1_1_1_1);
		
		JLabel facebook = new JLabel();
		facebook.setIcon(new ImageIcon(getClass().getResource("facebook.png")));
		facebook.setBounds(110, 385, 100, 100);
		panel.add(facebook);
		
		JLabel google = new JLabel();
		google.setIcon(new ImageIcon(getClass().getResource("google1.png")));
		google.setBounds(150, 385, 100, 100);
		panel.add(google);
		
		JLabel twitter = new JLabel();
		twitter.setIcon(new ImageIcon(getClass().getResource("twitter.png")));
		twitter.setBounds(187, 385, 100, 100);
		panel.add(twitter);
		
		JButton lblNewLabel_1_1_1_1_1_1_1 = new JButton("¿Equivocado? okay, regresa al Login");
		lblNewLabel_1_1_1_1_1_1_1.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				frame.getContentPane().removeAll();;
				login(frame);
				frame.repaint();
				frame.revalidate();			
				
			}
			
		});
		lblNewLabel_1_1_1_1_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblNewLabel_1_1_1_1_1_1_1.setBounds(40, 496, 250, 14);
		panel.add(lblNewLabel_1_1_1_1_1_1_1);
	}
	
	public void consultar(JFrame frame)
	{
		this.setTitle("Consulta del usuario");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 340, 615);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(new GridLayout(0, 1, 0, 0));
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(255, 255, 255));
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel_3 = new JLabel("C o n s u l t a");
		lblNewLabel_3.setFont(new Font("Lucida Sans Unicode", Font.BOLD, 17));
		lblNewLabel_3.setBounds(95, 60, 250, 20);
		panel.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Ingresa los datos para consultar cuenta");
		lblNewLabel_4.setForeground(new Color(128, 128, 128));
		lblNewLabel_4.setFont(new Font("Lucida Sans", Font.PLAIN, 13));
		lblNewLabel_4.setBounds(20, 100, 280, 20);
		panel.add(lblNewLabel_4);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("Correo electrónico");
		lblNewLabel_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblNewLabel_1_1_1.setBounds(25, 150, 100, 14);
		panel.add(lblNewLabel_1_1_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBorder(null);
		textField_2.setBounds(25, 165, 200, 25);
		panel.add(textField_2);
		
		JLabel lblNewLabel_2_1_1 = new JLabel("------------------------------------------------------------------");
		lblNewLabel_2_1_1.setForeground(Color.GRAY);
		lblNewLabel_2_1_1.setBounds(25, 185, 270, 14);
		panel.add(lblNewLabel_2_1_1);
		
		JLabel lblNewLabel_1_1_1_1 = new JLabel("Contraseña");
		lblNewLabel_1_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblNewLabel_1_1_1_1.setBounds(25, 210, 100, 14);
		panel.add(lblNewLabel_1_1_1_1);
		
		passwordField_1 = new JPasswordField();
		passwordField_1.setBorder(null);
		passwordField_1.setBounds(25, 227, 200, 20);
		panel.add(passwordField_1);
		
		JLabel viewPsw = new JLabel();
		viewPsw.setIcon(new ImageIcon(getClass().getResource("viewPsw.png")));
		viewPsw.setBounds(265, 190, 100, 100);
		panel.add(viewPsw);
		
		JLabel lblNewLabel_2_1_1_1_1 = new JLabel("------------------------------------------------------------------");
		lblNewLabel_2_1_1_1_1.setForeground(Color.GRAY);
		lblNewLabel_2_1_1_1_1.setBounds(25, 243, 270, 14);
		panel.add(lblNewLabel_2_1_1_1_1);
		
		
		JButton btnNewButton = new JButton("Consultar");
		//btnNewButton.addActionListener(new ActionListener() 
//		{
//			public void actionPerformed(ActionEvent e) 
//			{
//				JOptionPane.showMessageDialog(null, "No se puede acceder", "Error", JOptionPane.WARNING_MESSAGE);
//			}
//		});
		btnNewButton.setForeground(new Color(255, 255, 255));
		btnNewButton.setFont(new Font("Lucida Sans", Font.BOLD, 14));
		btnNewButton.setBounds(60, 320, 200, 35);
		btnNewButton.setBackground(Color.decode("#8E8BE1"));
		panel.add(btnNewButton);
		
		JLabel lblNewLabel_1_1_1_1_1_1 = new JLabel("----- O intenta con -----");
		lblNewLabel_1_1_1_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblNewLabel_1_1_1_1_1_1.setBounds(105, 400, 150, 14);
		panel.add(lblNewLabel_1_1_1_1_1_1);
		
		JLabel facebook = new JLabel();
		facebook.setIcon(new ImageIcon(getClass().getResource("facebook.png")));
		facebook.setBounds(110, 385, 100, 100);
		panel.add(facebook);
		
		JLabel google = new JLabel();
		google.setIcon(new ImageIcon(getClass().getResource("google1.png")));
		google.setBounds(150, 385, 100, 100);
		panel.add(google);
		
		JLabel twitter = new JLabel();
		twitter.setIcon(new ImageIcon(getClass().getResource("twitter.png")));
		twitter.setBounds(187, 385, 100, 100);
		panel.add(twitter);
		
		JButton lblNewLabel_1_1_1_1_1_1_1 = new JButton("¿Equivocado? okay, regresa al Login");
		lblNewLabel_1_1_1_1_1_1_1.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				frame.getContentPane().removeAll();;
				login(frame);
				frame.repaint();
				frame.revalidate();			
				
			}
			
		});
		lblNewLabel_1_1_1_1_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblNewLabel_1_1_1_1_1_1_1.setBounds(40, 496, 250, 14);
		panel.add(lblNewLabel_1_1_1_1_1_1_1);
	}
	
	public void crearUsuario(JFrame frame)
	{
		this.setTitle("Crear usuario");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 340, 615);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(new GridLayout(0, 1, 0, 0));
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(255, 255, 255));
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel_3 = new JLabel("¿C ó m o  c r e a r  u n  u s u a r i o ?");
		lblNewLabel_3.setFont(new Font("Lucida Sans Unicode", Font.BOLD, 17));
		lblNewLabel_3.setBounds(7, 60, 320, 20);
		panel.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Sigue los pasos a continuación:");
		lblNewLabel_4.setForeground(new Color(128, 128, 128));
		lblNewLabel_4.setFont(new Font("Lucida Sans", Font.PLAIN, 13));
		lblNewLabel_4.setBounds(20, 100, 280, 20);
		panel.add(lblNewLabel_4);
		
		
		JButton btnNewButton = new JButton("Hecho");
		//btnNewButton.addActionListener(new ActionListener() 
//		{
//			public void actionPerformed(ActionEvent e) 
//			{
//				JOptionPane.showMessageDialog(null, "No se puede acceder", "Error", JOptionPane.WARNING_MESSAGE);
//			}
//		});
		btnNewButton.setForeground(new Color(255, 255, 255));
		btnNewButton.setFont(new Font("Lucida Sans", Font.BOLD, 14));
		btnNewButton.setBounds(60, 320, 200, 35);
		btnNewButton.setBackground(Color.decode("#8E8BE1"));
		panel.add(btnNewButton);
		
		JLabel lblNewLabel_1_1_1_1_1_1 = new JLabel("----- Visita nuestras redes -----");
		lblNewLabel_1_1_1_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblNewLabel_1_1_1_1_1_1.setBounds(85, 400, 150, 14);
		panel.add(lblNewLabel_1_1_1_1_1_1);
		
		JLabel facebook = new JLabel();
		facebook.setIcon(new ImageIcon(getClass().getResource("facebook.png")));
		facebook.setBounds(110, 385, 100, 100);
		panel.add(facebook);
		
		JLabel google = new JLabel();
		google.setIcon(new ImageIcon(getClass().getResource("google1.png")));
		google.setBounds(150, 385, 100, 100);
		panel.add(google);
		
		JLabel twitter = new JLabel();
		twitter.setIcon(new ImageIcon(getClass().getResource("twitter.png")));
		twitter.setBounds(187, 385, 100, 100);
		panel.add(twitter);
		
		JButton lblNewLabel_1_1_1_1_1_1_1 = new JButton("¿Equivocado? okay, regresa al Login");
		lblNewLabel_1_1_1_1_1_1_1.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				frame.getContentPane().removeAll();;
				login(frame);
				frame.repaint();
				frame.revalidate();			
				
			}
			
		});
		lblNewLabel_1_1_1_1_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblNewLabel_1_1_1_1_1_1_1.setBounds(40, 496, 250, 14);
		panel.add(lblNewLabel_1_1_1_1_1_1_1);
	}
	
	public void accederSistema(JFrame frame)
	{
		this.setTitle("Acceso al sistema");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 340, 615);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(new GridLayout(0, 1, 0, 0));
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(255, 255, 255));
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel_3 = new JLabel("A c c e d e r  a l  s i s t e m a");
		lblNewLabel_3.setFont(new Font("Lucida Sans Unicode", Font.BOLD, 17));
		lblNewLabel_3.setBounds(25, 60, 320, 20);
		panel.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Sigue los pasos a continuación:");
		lblNewLabel_4.setForeground(new Color(128, 128, 128));
		lblNewLabel_4.setFont(new Font("Lucida Sans", Font.PLAIN, 13));
		lblNewLabel_4.setBounds(20, 100, 280, 20);
		panel.add(lblNewLabel_4);
		
		
		JButton btnNewButton = new JButton("Hecho");
		//btnNewButton.addActionListener(new ActionListener() 
//		{
//			public void actionPerformed(ActionEvent e) 
//			{
//				JOptionPane.showMessageDialog(null, "No se puede acceder", "Error", JOptionPane.WARNING_MESSAGE);
//			}
//		});
		btnNewButton.setForeground(new Color(255, 255, 255));
		btnNewButton.setFont(new Font("Lucida Sans", Font.BOLD, 14));
		btnNewButton.setBounds(60, 320, 200, 35);
		btnNewButton.setBackground(Color.decode("#8E8BE1"));
		panel.add(btnNewButton);
		
		JLabel lblNewLabel_1_1_1_1_1_1 = new JLabel("----- Visita nuestras redes -----");
		lblNewLabel_1_1_1_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblNewLabel_1_1_1_1_1_1.setBounds(85, 400, 150, 14);
		panel.add(lblNewLabel_1_1_1_1_1_1);
		
		JLabel facebook = new JLabel();
		facebook.setIcon(new ImageIcon(getClass().getResource("facebook.png")));
		facebook.setBounds(110, 385, 100, 100);
		panel.add(facebook);
		
		JLabel google = new JLabel();
		google.setIcon(new ImageIcon(getClass().getResource("google1.png")));
		google.setBounds(150, 385, 100, 100);
		panel.add(google);
		
		JLabel twitter = new JLabel();
		twitter.setIcon(new ImageIcon(getClass().getResource("twitter.png")));
		twitter.setBounds(187, 385, 100, 100);
		panel.add(twitter);
		
		JButton lblNewLabel_1_1_1_1_1_1_1 = new JButton("¿Equivocado? okay, regresa al Login");
		lblNewLabel_1_1_1_1_1_1_1.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				frame.getContentPane().removeAll();;
				login(frame);
				frame.repaint();
				frame.revalidate();			
				
			}
			
		});
		lblNewLabel_1_1_1_1_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblNewLabel_1_1_1_1_1_1_1.setBounds(40, 496, 250, 14);
		panel.add(lblNewLabel_1_1_1_1_1_1_1);
	}
	
	public void forgotPsw(JFrame frame)
	{
		this.setTitle("Contraseña olvidada");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 340, 615);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(new GridLayout(0, 1, 0, 0));
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(255, 255, 255));
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel_3 = new JLabel("C o n t r a s e ñ a  o l v i d a d a");
		lblNewLabel_3.setFont(new Font("Lucida Sans Unicode", Font.BOLD, 17));
		lblNewLabel_3.setBounds(25, 60, 320, 20);
		panel.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Sigue los pasos a continuación:");
		lblNewLabel_4.setForeground(new Color(128, 128, 128));
		lblNewLabel_4.setFont(new Font("Lucida Sans", Font.PLAIN, 13));
		lblNewLabel_4.setBounds(20, 100, 280, 20);
		panel.add(lblNewLabel_4);
		
		
		JButton btnNewButton = new JButton("Hecho");
		//btnNewButton.addActionListener(new ActionListener() 
//		{
//			public void actionPerformed(ActionEvent e) 
//			{
//				JOptionPane.showMessageDialog(null, "No se puede acceder", "Error", JOptionPane.WARNING_MESSAGE);
//			}
//		});
		btnNewButton.setForeground(new Color(255, 255, 255));
		btnNewButton.setFont(new Font("Lucida Sans", Font.BOLD, 14));
		btnNewButton.setBounds(60, 320, 200, 35);
		btnNewButton.setBackground(Color.decode("#8E8BE1"));
		panel.add(btnNewButton);
		
		JLabel lblNewLabel_1_1_1_1_1_1 = new JLabel("----- Visita nuestras redes -----");
		lblNewLabel_1_1_1_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblNewLabel_1_1_1_1_1_1.setBounds(85, 400, 150, 14);
		panel.add(lblNewLabel_1_1_1_1_1_1);
		
		JLabel facebook = new JLabel();
		facebook.setIcon(new ImageIcon(getClass().getResource("facebook.png")));
		facebook.setBounds(110, 385, 100, 100);
		panel.add(facebook);
		
		JLabel google = new JLabel();
		google.setIcon(new ImageIcon(getClass().getResource("google1.png")));
		google.setBounds(150, 385, 100, 100);
		panel.add(google);
		
		JLabel twitter = new JLabel();
		twitter.setIcon(new ImageIcon(getClass().getResource("twitter.png")));
		twitter.setBounds(187, 385, 100, 100);
		panel.add(twitter);
		
		JButton lblNewLabel_1_1_1_1_1_1_1 = new JButton("¿Equivocado? okay, regresa al Login");
		lblNewLabel_1_1_1_1_1_1_1.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				frame.getContentPane().removeAll();;
				login(frame);
				frame.repaint();
				frame.revalidate();			
				
			}
			
		});
		lblNewLabel_1_1_1_1_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblNewLabel_1_1_1_1_1_1_1.setBounds(40, 496, 250, 14);
		panel.add(lblNewLabel_1_1_1_1_1_1_1);
	}
}
