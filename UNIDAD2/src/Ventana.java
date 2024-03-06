import java.awt.BasicStroke;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.GridLayout;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Ventana extends JFrame
{
	public Ventana()
	{
		this.setVisible(true);
		
		this.setSize(1000, 520);
		this.setLocation(100, 100);
		
		this.setLocationRelativeTo(null); 
		
		this.setLayout(null);		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
		
		this.setTitle("wo");
		
		this.setMinimumSize(new Dimension(250,250));
		this.setMaximumSize(new Dimension(1000,750));
		this.setResizable(true);
		
		
			
		this.IniciarComponentes();
	}
	
	public void paint(Graphics g) //g = contexto = lienzo OBLIGATORIAMENTE DEBE LLAMARSE PAINT
	{
		super.paint(g);
		
		Graphics2D g2 = (Graphics2D)g; // utiliza el contexto y crea el pincel
		
		g2.setColor(Color.decode("#32CCE2")); //fondo
		g2.fillRect(0, 0, this.getWidth(), this.getHeight());
		
		int sepRayitas = 420;
		
		for(int i = 0 ; i <= 2 ;i++)
		{
			g2.setColor(Color.decode("#A37102"));
			g2.fillRect(0, sepRayitas, this.getWidth(), 15);
			
			sepRayitas -= 28;
		}
		
		g2.setColor(Color.decode("#795815")); //lodo(?
		g2.fillRect(0, 495, this.getWidth(), 28);
		
		g2.setColor(Color.decode("#67A438"));
		g2.fillRect(0, 460, this.getWidth(), 20); //past
		
		g2.setColor(Color.decode("#E1C173")); //tierra
		g2.fillRect(0, 480, this.getWidth(), 20);
		
		g2.setColor(Color.decode("#1E5414")); //pasto
		g2.fillRect(0, 450, this.getWidth(), 10);
		
		g2.setColor(Color.decode("#73706B")); //chimenea grande
		g2.fillRect(630, 100, 70, 200);
		
		g2.setColor(Color.decode("#4D4C49")); //chimenea xikita
		g2.fillRect(615, 100, 100, 35);
		
		g2.setColor(Color.red);
		int xPoints1[] = {750, 300, 380}; //primero: ancho, segundo: , ultimo: pico de arriba
		int yPoints1[] = {230, 230, 40}; //primero: esquina izq , segundo: esq der , ultimo altura
		g2.fillPolygon(xPoints1, yPoints1, 3);
		
		int xOffset = 0; // Desplazamiento horizontal inicial

		for (int i = 0; i <= 2; i++) 
		{
		    g2.setColor(Color.decode("#F8AC43"));
		    
		    int xPoints[] = {50 + xOffset, 100 + xOffset, 75 + xOffset};
		    int yPoints[] = {350, 350, 300}; 
		    g2.fillPolygon(xPoints, yPoints, 3);
		   
		    g2.fillRect(50 + xOffset, 350, 50, 100);

		    // Aumenta el desplazamiento horizontal para la siguiente iteración
		    xOffset += 88; 
		}
		
		int xOffset1 = 0; // Desplazamiento horizontal inicial

		for (int i = 0; i <= 2; i++) 
		{
		    g2.setColor(Color.decode("#F8AC43"));
		    
		    int xPoints[] = {750 + xOffset1, 800 + xOffset1, 775 + xOffset1};
		    int yPoints[] = {350, 350, 300}; 
		    g2.fillPolygon(xPoints, yPoints, 3);
		   
		    g2.fillRect(750 + xOffset1, 350, 50, 100);

		    // Aumenta el desplazamiento horizontal para la siguiente iteración
		    xOffset1 += 88; 
		}
		
			g2.setColor(Color.decode("#F7BB35")); //casa
			g2.fillRect(330, 230, 390, 220);
			
			int sepRayasCasita = 435;
			
			for(int i = 0 ; i <= 8 ;i++)
			{
				g2.setColor(Color.decode("#C47907"));
				g2.fillRect(330, sepRayasCasita, 390, 5);
				
				sepRayasCasita -= 25;
			}
		 
		 	g2.setColor(Color.decode("#73706B")); //banqueta
		 	g2.fillRect(300, 420, 445, 30);
		
		 	g2.setColor(Color.decode("#694B08")); //puerta marco
			g2.fillRect(355, 255, 100, 165);
			
			g2.setColor(Color.decode("#9A7115")); //puerta 
			g2.fillRect(360, 260, 90, 155);
			
			g2.setColor(Color.gray);
			g2.fillArc(435, 340, 15, 15, 20, 360);
			
			g2.setColor(Color.decode("#F10E14")); //ventana1
			g2.fillRect(480, 260, 105, 105);
			
			g2.setColor(Color.white);
			g2.fillRect(485, 265, 45, 45);
			g2.setColor(Color.white);
			g2.fillRect(535, 265, 45, 45);
			g2.setColor(Color.white);
			g2.fillRect(485, 315, 45, 45);
			g2.setColor(Color.white);
			g2.fillRect(535, 315, 45, 45);
			
			g2.setColor(Color.decode("#F10E14")); //ventana2
			g2.fillRect(600, 260, 105, 105);
			
			g2.setColor(Color.white);
			g2.fillRect(605, 265, 45, 45);
			g2.setColor(Color.white);
			g2.fillRect(655, 265, 45, 45);
			g2.setColor(Color.white);
			g2.fillRect(605, 315, 45, 45);
			g2.setColor(Color.white);
			g2.fillRect(655, 315, 45, 45);
		
			g2.setColor(Color.decode("#4D4C49")); //solecito
			g2.fillRect(475, 365, 235, 12);
			
			g2.setColor(Color.decode("#F2BE1A")); //manija
			g2.fillArc(860, 50, 100, 100, 45, 360);
			
			g2.setColor(Color.decode("#B47703")); //letrero
			g2.fillRect(50, 80, 200, 80);
			g2.setColor(Color.black);
			g2.setFont(new Font("Consolas", Font.BOLD, 15));
			g2.drawString("refugio de gatitos", 80, 125);
			

		
//		g2.clearRect(100, 100, 100, 100); //borra zona especiifica
		
//		g2.drawOval(400, 400, 50, 80);
//		g2.fillOval(350, 400, 50, 80);
//		
//		int xPoints[] = {100, 250, 300};
//		int yPoints[] = {100, 200, 300};
//		//g2.drawPolygon(xPoints, yPoints, 3);
//		g2.fillPolygon(xPoints, yPoints, 3); //este y el de abajito hacen lo mismo
//		//g2.drawLine(30, 70, 770, 70);
//		g2.setStroke(new BasicStroke(10));
//		
//		g2.drawRoundRect(430, 150, 200, 150, 10, 10);
//		
//		try
//		{
//			BufferedImage image = ImageIO.read(new File("src/seven1.png"));
//			g2.drawImage(image, 50, 200, null);
//			
//		}catch(IOException e)
//		{
//			e.printStackTrace();
//		}
	
	}
	
	public void IniciarComponentes()
	{
		//size, location, bg - opaque(opaque oblogatoria), texto string en el constructor
		//this.login();
		//this.registro();
		//this.admin();
		//this.calculadora();
		//this.calculadoraDiseño();
				//this.paint(getGraphics()); no es necesaria
		this.repaint(); //con esto ya no tenemos que redimensionar para que cargue, lo mismo con el de abajo
		this.validate();
		
	}
	
	public void login()
	{
				//ventana 1
				JPanel login = new JPanel();
				login.setSize(this.getWidth()/2, this.getHeight());
				login.setBackground(Color.decode("#2D36AD"));
				login.setLayout(null);				
				
				//etiqueta 
				JLabel loginTag = new JLabel("USER LOGIN", 0); //0 para centrar, 2 izq, 4 der
				loginTag.setSize(200, 60); //tamaño al elemento
				loginTag.setFont(new Font("Broadway Normal", Font.ITALIC, 25));
				loginTag.setForeground(Color.white); //color de fuente
				loginTag.setLocation(150, 15); //ubicacion, alternativa es setBounds 
				login.add(loginTag); //que sea visible la etiqueta en la ventana
				
				JLabel marcoTag = new JLabel("MY ACCOUNT"); //0 para centrar, 2 izq, 4 der
				marcoTag.setSize(400, 60); //tamaño al elemento
				marcoTag.setFont(new Font("Cooper Negra", Font.BOLD, 30));
				marcoTag.setForeground(Color.yellow); //color de fuente
				marcoTag.setLocation(150, 100); //ubicacion, alternativa es setBounds 
				System.out.println("Font: " + marcoTag.getFont());

				login.add(marcoTag);
				
				JLabel userTag = new JLabel("Enter your user name:");
				userTag.setBounds(130, 165, 300, 50); 
				userTag.setFont(new Font("Consolas", Font.BOLD, 15));
				userTag.setForeground(Color.white);
				login.add(userTag);
				
				JLabel logoUser = new JLabel();
				logoUser.setIcon(new ImageIcon(getClass().getResource("usuario.png")));
				logoUser.setBounds(100, 165, 100, 100);
				login.add(logoUser);
				
				JLabel pswTag = new JLabel("Enter your password:");
				pswTag.setBounds(130, 250, 200, 40);  
				pswTag.setFont(new Font("Consolas", Font.BOLD, 15));
				pswTag.setForeground(Color.white);
				login.add(pswTag);
				
				JLabel logoPsw = new JLabel();
				logoPsw.setIcon(new ImageIcon(getClass().getResource("psw.png")));
				logoPsw.setBounds(100, 245, 100, 100);
				login.add(logoPsw);
				
				JButton loginBtn = new JButton("Login");
				loginBtn.setBounds(190, 330, 130, 40);
				loginBtn.setFont(new Font("Arial", Font.BOLD, 16));
				loginBtn.setForeground(Color.black);
				loginBtn.setBackground(Color.yellow);
				login.add(loginBtn);
				
				JLabel createAcc = new JLabel("¿No tienes cuenta?");
				createAcc.setBounds(193, 385, 300, 50); //x, y, campo para el escrito(x, y)
				createAcc.setFont(new Font("Consolas", Font.BOLD, 13));
				createAcc.setForeground(Color.white);
				login.add(createAcc);
				
				JButton crearBtn = new JButton("Crea una");
				crearBtn .setBounds(190, 420, 130, 30);
				crearBtn.setFont(new Font("Arial", Font.BOLD, 12));
				crearBtn .setForeground(Color.black);
				crearBtn .setBackground(Color.yellow);
				login.add(crearBtn );
				
				JLabel marco = new JLabel(""); //0 para centrar, 2 izq, 4 der
				marco.setSize(400, 300); //tamaño al elemento
				marco.setLocation(50, 90); //ubicacion, alternativa es setBounds 
				marco.setOpaque(true);
				marco.setBackground(Color.decode("#1A217A"));
				login.add(marco); 
				
				JTextField userField = new JTextField();
				userField.setBounds(130, 200, 250, 30);
				userField.setFont((new Font("Consolas", Font.BOLD, 15)));
				login.add(userField);				
				
				JPasswordField pswField = new JPasswordField();
				pswField.setBounds(130, 280, 250, 30);
				pswField.setFont((new Font("Consolas", Font.BOLD, 15)));
				login.add(pswField);
				
//				JCheckBox remember = new JCheckBox("Recordarme");
//				remember.setOpaque(false); 
//				remember.setBounds(90, 250, 100, 20);
//				login.add(remember);
//				
//				JLabel forgotTag = new JLabel("¿Olvidaste tu contraseña?");
//				forgotTag.setBounds(240, 240, 260, 40);
//				login.add(forgotTag);
								
				this.add(login);
				
	}
	
	public void registro()
	{
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
	//	itemBox2.setBorderPainted(true); //hacer bordes bonitos
	//	itemBox2.setBorder(BorderFactory.createLineBorder(Color.white, 2));
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
	}
	
	public void admin()

	
	{
		JPanel adminPanel = new JPanel();
		adminPanel.setSize(this.getWidth(), this.getHeight()); 
		adminPanel.setLocation(0, 0); //pantalla completa + lo de arriba
		adminPanel.setBackground(Color.decode("#AAA7E6"));
		adminPanel.setLayout(null); //quitar el molde de la etiqueta, si no está en null se delimita el area
		
		JMenuBar barra = new JMenuBar(); //se puede colocar mas menús, constructor vacío
		JMenu menuFile = new JMenu("Archivo"); //puede recibir atributo tipo String
		JMenuItem openItem = new JMenuItem("Abrir archivo  . . .");
		JMenuItem createItem = new JMenuItem("Crear archivo  . . .");
		
		barra.add(menuFile); //se agregan los menus al menu
		menuFile.add(openItem);
		menuFile.add(createItem);
		
		this.setJMenuBar(barra); //implementar menu, nuestro menu es JMenuBar
		
		JLabel usersTag = new JLabel("USUARIOS", 0); //0 para centrar, 2 izq, 4 der
		usersTag.setSize(400, 50); //tamaño al elemento
		usersTag.setFont(new Font("Tw Cen MT", Font.BOLD, 25));
		usersTag.setForeground(Color.white); //color de fuente
		usersTag.setLocation(310, 30); //ubicacion, alternativa es setBounds 
		usersTag.setOpaque(true);//permite ponerle fondo
		usersTag.setBackground(Color.darkGray);
		adminPanel.add(usersTag); //que sea visible la etiqueta en la ventana
		
		JLabel titleWidget = new JLabel("Total de usuarios: ", 0);
		titleWidget.setBounds(40, 120, 270, 40);
		titleWidget.setFont(new Font("Tw Cen MT", Font.BOLD, 25));
		titleWidget.setForeground(Color.white);
		adminPanel.add(titleWidget);
		
		JLabel contentWidget = new JLabel("100", 0);
		contentWidget.setBounds(40, 150, 270, 40);
		contentWidget.setFont(new Font("Tw Cen MT", Font.PLAIN, 25));
		contentWidget.setForeground(Color.white);
		adminPanel.add(contentWidget);
		
		JLabel widget = new JLabel("");
		widget.setBounds(40, 120, 270, 80);
		widget.setOpaque(true);
		widget.setBackground(Color.darkGray);
		adminPanel.add(widget);
		
		JButton download = new JButton("Exportar");
		download.setBounds(720, 200, 100, 40);
		download.setFont(new Font("Tw Cen MT", Font.BOLD, 17));
		download.setOpaque(true);
		download.setBackground(Color.white);
		adminPanel.add(download);
		
		JButton addUser = new JButton("Añadir");
		addUser.setBounds(840, 200, 100, 40);
		addUser.setFont(new Font("Tw Cen MT", Font.BOLD, 17));
		addUser.setOpaque(true);
		addUser.setBackground(Color.white);
		adminPanel.add(addUser);
		
//		JLabel tabla = new JLabel("");
//		tabla.setBounds(40, 250, 900, 320);
//		tabla.setOpaque(true);
//		tabla.setBackground(Color.darkGray);
//		adminPanel.add(tabla);
		
		String titles[] = {"No. Control", "Nombre", "Apellidos", "Semestre", "Promedio", "Acciones"};
		String tableData[][] = {
				{"No. Control", "Nombre", "Apellidos", "Semestre", "Promedio", "Acciones"},
				{"No. Control", "Nombre", "Apellidos", "Semestre", "Promedio", "Acciones"},
				{"No. Control", "Nombre", "Apellidos", "Semestre", "Promedio", "Acciones"},
				{"No. Control", "Nombre", "Apellidos", "Semestre", "Promedio", "Acciones"},
				{"No. Control", "Nombre", "Apellidos", "Semestre", "Promedio", "Acciones"},
				{"No. Control", "Nombre", "Apellidos", "Semestre", "Promedio", "Acciones"},
				{"No. Control", "Nombre", "Apellidos", "Semestre", "Promedio", "Acciones"},
				{"No. Control", "Nombre", "Apellidos", "Semestre", "Promedio", "Acciones"},
				{"No. Control", "Nombre", "Apellidos", "Semestre", "Promedio", "Acciones"},
				{"No. Control", "Nombre", "Apellidos", "Semestre", "Promedio", "Acciones"},
				{"No. Control", "Nombre", "Apellidos", "Semestre", "Promedio", "Acciones"},
				{"No. Control", "Nombre", "Apellidos", "Semestre", "Promedio", "Acciones"},
				{"No. Control", "Nombre", "Apellidos", "Semestre", "Promedio", "Acciones"},
				{"No. Control", "Nombre", "Apellidos", "Semestre", "Promedio", "Acciones"},
				{"No. Control", "Nombre", "Apellidos", "Semestre", "Promedio", "Acciones"},
				{"No. Control", "Nombre", "Apellidos", "Semestre", "Promedio", "Acciones"},
				{"No. Control", "Nombre", "Apellidos", "Semestre", "Promedio", "Acciones"},
				{"No. Control", "Nombre", "Apellidos", "Semestre", "Promedio", "Acciones"},
				{"No. Control", "Nombre", "Apellidos", "Semestre", "Promedio", "Acciones"},
				{"No. Control", "Nombre", "Apellidos", "Semestre", "Promedio", "Acciones"},
				{"No. Control", "Nombre", "Apellidos", "Semestre", "Promedio", "Acciones"},
				{"No. Control", "Nombre", "Apellidos", "Semestre", "Promedio", "Acciones"},
				{"No. Control", "Nombre", "Apellidos", "Semestre", "Promedio", "Acciones"},
				{"No. Control", "Nombre", "Apellidos", "Semestre", "Promedio", "Acciones"},
				{"No. Control", "Nombre", "Apellidos", "Semestre", "Promedio", "Acciones"},
				{"No. Control", "Nombre", "Apellidos", "Semestre", "Promedio", "Acciones"},
				{"No. Control", "Nombre", "Apellidos", "Semestre", "Promedio", "Acciones"},
				{"No. Control", "Nombre", "Apellidos", "Semestre", "Promedio", "Acciones"}
				};
		
		JTable tablaUsers = new JTable(tableData, titles);
		//tablaUsers.setBounds(40, 250, 900, 320);
		JScrollPane tableScroll = new JScrollPane(tablaUsers);
		tableScroll.setBounds(50, 250, 900, 320);
		
		adminPanel.add(tableScroll);
		
		
		this.add(adminPanel);
	}

	public void calculadora()
	{
		this.setSize(480, 650);//se cambia el tamaño dentro de la funcion para que cambie dependiendo de ella
		
		JPanel panel = new JPanel();
		panel.setSize(this.getWidth(), this.getHeight());
		panel.setBackground(Color.decode("#31283E"));
		panel.setLayout(new BorderLayout());
		
		JLabel text = new JLabel("100.00", 0);
		text.setOpaque(true);
		text.setBackground(Color.white);
		text.setFont(new Font("Consolas", Font.BOLD, 40));
		panel.add(text, BorderLayout.NORTH);
		
		JPanel centro = new JPanel();
		centro.setBackground(Color.decode("#7749B7"));
		centro.setLayout(new GridLayout(4, 3, 5, 5)); //renglones, columnas y separaciones
		panel.add(centro, BorderLayout.CENTER);
		
		String buttons[] = {"7", "8", "9", "6", "5", "4", "3", "2", "1", "0", ".", "/"};
		
		for(int i = 0 ; i < 12 ; i++)
		{
			JButton boton = new JButton(buttons[i]);
			boton.setFont(new Font("Consolas", Font.BOLD, 25));
			boton.setBackground(Color.decode("#C3A3F0"));
			centro.add(boton);
		}
		
		
		JPanel east = new JPanel();
		east.setBackground(Color.decode("#7749B7"));
		east.setLayout(new GridLayout(4, 1, 5, 5));
		panel.add(east, BorderLayout.EAST);
		
		String buttons2[] = {"  +  ", "  -  ", "  =  "};
		
		for(int i = 0 ; i < 3 ; i++)
		{
			JButton boton = new JButton(buttons2[i]);
			boton.setFont(new Font("Consolas", Font.BOLD, 20));
			boton.setBackground(Color.decode("#DBC7F6"));
			east.add(boton);
		}
		
		JPanel west = new JPanel();
		west.setBackground(Color.decode("#7749B7"));
		west.setLayout(new BoxLayout(west, BoxLayout.Y_AXIS));
		panel.add(west, BorderLayout.WEST);
		
		String buttons3[] = {"   MC   ", "   M+   ", "   *    "};
		
		for(int i = 0 ; i < 3 ; i++)
		{
			JButton boton = new JButton(buttons3[i]);
			boton.setFont(new Font("Consolas", Font.BOLD, 20));
			boton.setBackground(Color.decode("#DBC7F6"));
			west.add(boton);
		}
		
		this.add(panel);
	}
	
	public void calculadoraDiseño() {
	    this.setTitle("Calculadora Interés");
	    this.setSize(500, 650);
	    
	    JPanel panelPrincipal = new JPanel();
	    panelPrincipal.setSize(this.getWidth(), this.getHeight());
	    panelPrincipal.setLocation(0, 0);
	    panelPrincipal.setBackground(Color.white);
	    panelPrincipal.setLayout(null);
	    
	    JLabel tag1 = new JLabel("Interés", 2);
	    tag1.setOpaque(true);
	    tag1.setFont(new Font("Broadway Normal", Font.ITALIC, 20));
	    tag1.setBackground(Color.white);
	    tag1.setForeground(Color.red);
	    tag1.setBounds(0, 0, 500, 50);
	    panelPrincipal.add(tag1);
	    
	    JLabel title = new JLabel("    Calcular Interés", 2);
	    title.setBounds(30, 32, 435, 50);
	    title.setFont(new Font("Consolas", Font.BOLD, 13));
	    title.setForeground(Color.black);
	    title.setBackground(Color.green);
	    title.setOpaque(true);
	    panelPrincipal.add(title);
	    
	    
	    JLabel calcularPic = new JLabel();
	    calcularPic.setIcon(new ImageIcon(getClass().getResource("calcular1.png")));
	    calcularPic.setBounds(85, 297, 100, 100);
		panelPrincipal.add(calcularPic);
		
	    JButton calcular = new JButton("    Calcular");
	    calcular.setBounds(75, 330, 130, 35);
	    calcular.setFont(new Font("Arial", Font.BOLD, 12));
	    calcular.setForeground(Color.white);
	    calcular.setBackground(Color.black);
	    panelPrincipal.add(calcular);
	    
	    JLabel cancelarPic = new JLabel();
	    cancelarPic.setIcon(new ImageIcon(getClass().getResource("cancelar.png")));
	    cancelarPic.setBounds(295, 297, 100, 100);
		panelPrincipal.add(cancelarPic);
	    
	    JButton cancelar = new JButton("    Cancelar");
	    cancelar.setBounds(280, 330, 130, 35);
	    cancelar.setFont(new Font("Arial", Font.BOLD, 12));
	    cancelar.setForeground(Color.white);
	    cancelar.setBackground(Color.black);
	    panelPrincipal.add(cancelar);
	    
	    JLabel extra = new JLabel("");
	    extra.setBounds(30, 320, 435, 60);
	    extra.setBackground(Color.green);
	    extra.setOpaque(true);
	    panelPrincipal.add(extra);
	   
	    // Cambiar el layout manager de screen1 a GridLayout
	    JPanel screen1 = new JPanel(new GridLayout(3, 2)); // Cambia 2, 2 según el número de filas y columnas que desees
	    screen1.setSize(435, 260);
	    screen1.setLocation(30, 60);
	    screen1.setOpaque(true);
	    screen1.setBackground(Color.green);
	        
	    // Agregar componentes al GridLayout
	    JLabel capital = new JLabel("          Capital:");
	    capital.setBounds(65, 90, 300, 50);
	    capital.setFont(new Font("Consolas", Font.PLAIN, 12));
	    capital.setForeground(Color.black);
	    panelPrincipal.add(capital);
	    
	    JTextField capitalTxt = new JTextField();
	    capitalTxt.setPreferredSize(new Dimension(15, 30));
	    capitalTxt.setFont((new Font("Arial", Font.BOLD, 15)));
	    panelPrincipal.add(capitalTxt);
	    
	    JLabel time = new JLabel("          Tiempo:");
	    time.setBounds(65, 150, 300, 50);
	    time.setFont(new Font("Consolas", Font.PLAIN, 12));
	    time.setForeground(Color.black);
	    panelPrincipal.add(time);
	    
	    JTextField timeTxt = new JTextField();
	    timeTxt.setBounds(165, 155, 250, 30);
	    timeTxt.setFont((new Font("Arial", Font.BOLD, 15)));
	    panelPrincipal.add(timeTxt);
	    
	    JLabel tasa = new JLabel("          Tasa Interés:");
	    tasa.setBounds(65, 210, 300, 50);
	    tasa.setFont(new Font("Consolas", Font.PLAIN, 12));
	    tasa.setForeground(Color.black);
	    panelPrincipal.add(tasa);
	    
	    JTextField tasaTxt = new JTextField();
	    tasaTxt.setBounds(165, 215, 250, 30);
	    tasaTxt.setFont((new Font("Arial", Font.BOLD, 15)));
	    panelPrincipal.add(tasaTxt);
	    
	    screen1.add(capital);
	    screen1.add(capitalTxt);
	    screen1.add(time);
	    screen1.add(timeTxt);
	    screen1.add(tasa);
	    screen1.add(tasaTxt);
	    
	    panelPrincipal.add(screen1);
	    
	    JPanel screen2 = new JPanel(new GridLayout(2, 2)); // Cambia 2, 2 según el número de filas y columnas que desees
	    screen2.setSize(435, 150);
	    screen2.setLocation(30, 400); // Ajusta la posición vertical para evitar superposición
	    screen2.setOpaque(true);
	    screen2.setBackground(Color.pink);

	    // Agregar componentes a screen2
	    JLabel interes = new JLabel("          Interés:");
	    interes.setBounds(65, 90, 300, 50);
	    interes.setFont(new Font("Consolas", Font.PLAIN, 12));
	    interes.setForeground(Color.black);
	    panelPrincipal.add(interes);
	    
	    JTextField interesTxt = new JTextField();
	    interesTxt.setPreferredSize(new Dimension(15, 30));
	    interesTxt.setFont((new Font("Arial", Font.BOLD, 15)));
	    panelPrincipal.add(interesTxt);
	    
	    JLabel monto = new JLabel("          Monto:");
	    monto.setBounds(65, 150, 300, 50);
	    monto.setFont(new Font("Consolas", Font.PLAIN, 12));
	    monto.setForeground(Color.black);
	    panelPrincipal.add(monto);
	    
	    JTextField montoTxt = new JTextField();
	    montoTxt.setBounds(165, 155, 250, 30);
	    montoTxt.setFont((new Font("Arial", Font.BOLD, 15)));
	    panelPrincipal.add(montoTxt);
    
	    screen2.add(interes);
	    screen2.add(interesTxt);  
	    screen2.add(monto);
	    screen2.add(montoTxt);

	    panelPrincipal.add(screen2);

	    
	    this.add(panelPrincipal);
	}

}
