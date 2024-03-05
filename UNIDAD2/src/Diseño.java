import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.BoxLayout;
import javax.swing.ButtonGroup;
import javax.swing.JScrollPane;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JCheckBox;
import java.awt.Color;
import java.awt.FlowLayout;
import javax.swing.JInternalFrame;
import java.awt.CardLayout;
import java.awt.Font;
import java.awt.Component;
import javax.swing.GroupLayout;
import javax.swing.ImageIcon;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import java.awt.GridLayout;
import javax.swing.JTextArea;
import javax.swing.JRadioButton;
import javax.swing.JComboBox;
import javax.swing.DropMode;
import javax.swing.JSpinner;
import javax.swing.SpinnerListModel;
import javax.swing.JList;
import javax.swing.AbstractListModel;
import javax.swing.ListSelectionModel;
import javax.swing.JScrollBar;
import javax.swing.JSplitPane;
import javax.swing.JTable;

import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.border.BevelBorder;

public class Diseño extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField nameField;
	private JTextField last1Field;
	private JTextField last2Field;
	private JTextField birthField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Diseño frame = new Diseño();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Diseño() {
		setTitle("Registro de Usuarios");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 539, 450);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 255, 64));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		
		JLabel lblNewLabel = new JLabel("  Registro de Usuarios");
		lblNewLabel.setBounds(5, 5, 162, 16);
		lblNewLabel.setForeground(new Color(255, 0, 0));
		lblNewLabel.setAlignmentY(Component.TOP_ALIGNMENT);
		lblNewLabel.setFont(new Font("Lucida Fax", Font.BOLD | Font.ITALIC, 13));
		
		JPanel panel = new JPanel();
		panel.setBounds(15, 27, 295, 245);
		panel.setBackground(new Color(0, 255, 255));
		
		JPanel panel_2 = new JPanel();
		panel_2.setBounds(15, 280, 295, 117);
		panel_2.setBackground(new Color(255, 81, 81));
		
		JPanel panel_3 = new JPanel();
		panel_3.setBounds(320, 280, 191, 117);
		panel_3.setBackground(new Color(128, 255, 255));
		contentPane.setLayout(null);
		contentPane.add(lblNewLabel);
		contentPane.add(panel);
		
		JLabel datos = new JLabel(" Datos generales                                      ");
		datos.setFont(new Font("Tahoma", Font.BOLD, 11));
		
		JLabel nombres = new JLabel("Nombres:");
		
		JLabel apellidoP = new JLabel("Apellido Paterno:");
		
		nameField = new JTextField();
		nameField.setColumns(10);
		
		JLabel apellidoM = new JLabel("Apellido Materno:");
		
		last1Field = new JTextField();
		last1Field.setColumns(10);
		
		last2Field = new JTextField();
		last2Field.setColumns(10);
		
		birthField = new JTextField();
		birthField.setColumns(10);
		
		JLabel birth = new JLabel("Fecha de nacimiento:");
		
		JLabel sexElection = new JLabel("Sexo:");
		
		JRadioButton masc = new JRadioButton("Masculino");
		masc.setOpaque(false);
		
		JRadioButton fem = new JRadioButton("Femenino");
		fem.setOpaque(false);
		
		ButtonGroup sex = new ButtonGroup();
		sex.add(masc);
		sex.add(fem);
		
		String nacionalidad[] = {"Mexicano", "Estadounidense", "Japonés"};
		JComboBox nacSeleccion = new JComboBox(nacionalidad);
		
		JLabel nacionalidadLabel = new JLabel("Nacionalidad:");
		GroupLayout gl_panel = new GroupLayout(panel);
		gl_panel.setHorizontalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel.createSequentialGroup()
							.addGap(14)
							.addGroup(gl_panel.createParallelGroup(Alignment.TRAILING)
								.addComponent(nombres)
								.addComponent(apellidoP)
								.addComponent(apellidoM)
								.addComponent(birth)
								.addComponent(sexElection)
								.addComponent(nacionalidadLabel))
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
								.addComponent(masc)
								.addGroup(gl_panel.createParallelGroup(Alignment.TRAILING, false)
									.addComponent(birthField, Alignment.LEADING, 0, 0, Short.MAX_VALUE)
									.addComponent(last2Field, Alignment.LEADING, 0, 0, Short.MAX_VALUE)
									.addComponent(last1Field, Alignment.LEADING, 0, 0, Short.MAX_VALUE)
									.addComponent(nameField, Alignment.LEADING, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
								.addComponent(fem)
								.addComponent(nacSeleccion, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
						.addGroup(gl_panel.createSequentialGroup()
							.addContainerGap()
							.addComponent(datos)))
					.addGap(15))
		);
		gl_panel.setVerticalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addContainerGap()
					.addComponent(datos)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
						.addComponent(nombres)
						.addComponent(nameField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
						.addComponent(apellidoP)
						.addComponent(last1Field, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(11)
					.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
						.addComponent(apellidoM)
						.addComponent(last2Field, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
						.addComponent(birth)
						.addComponent(birthField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
						.addComponent(sexElection)
						.addComponent(masc))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(fem)
					.addGap(13)
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addComponent(nacSeleccion, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(nacionalidadLabel))
					.addContainerGap())
		);
		panel.setLayout(gl_panel);
		contentPane.add(panel_2);
		panel_2.setLayout(null);
		
		
		
		
		JLabel datosOp = new JLabel("Datos opcionales                                          ");
		datosOp.setBounds(36, 0, 222, 14);
		panel_2.add(datosOp);
		datosOp.setFont(new Font("Tahoma", Font.BOLD, 11));
		
		JLabel descripcion = new JLabel("Descripción      ");
		descripcion.setBounds(54, 19, 118, 13);
		descripcion.setFont(new Font("Tahoma", Font.BOLD, 11));
		panel_2.add(descripcion);
	
		
		JLabel pref = new JLabel("Preferencias");
		pref.setBounds(177, 19, 80, 13);
		pref.setFont(new Font("Tahoma", Font.BOLD, 11));
		panel_2.add(pref);
		
		
		JScrollPane scrollPref = new JScrollPane();
		scrollPref.setBounds(150, 35, 130, 80);
        scrollPref.setToolTipText("Lista de elementos");
        panel_2.add(scrollPref);

        // Creamos un array de ejemplo de elementos
        String[] preferenciasScroll = {"Cocinar", "Jugar videojuegos", "Dormir", "Ejercitarse", "Salir", "Otro"};

        // Creamos una JList y la agregamos al JScrollPane
        JList<String> lista = new JList<>(preferenciasScroll);
        scrollPref.setViewportView(lista);
        
        JScrollPane scrollDescrip = new JScrollPane();
        scrollDescrip.setBounds(25, 35, 115, 80);
        panel_2.add(scrollDescrip);
        
        JTextArea txtrUmuuu = new JTextArea();
        txtrUmuuu.setEditable(false);
        txtrUmuuu.setText("gojo está vivo\r\nun sueñito ya, dios plan\r\nlmao\r\nzzz\r\nbrraaaa");
        scrollDescrip.setViewportView(txtrUmuuu);

        setVisible(true);
        
        
		
		
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(320, 27, 191, 245);
		contentPane.add(panel_1);
		panel_1.setBackground(new Color(255, 128, 128));
		panel_1.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		JLabel perfil = new JLabel("Perfil de Usuario                  ");
		panel_1.add(perfil);
		perfil.setFont(new Font("Tahoma", Font.BOLD, 11));
		
		JLabel pic = new JLabel();
		panel_1.add(pic);
		pic.setIcon(new ImageIcon(getClass().getResource("seven1.png")));
		
		JCheckBox birthVisible = new JCheckBox("Mostrar fecha de nacimiento");
		birthVisible.setFont(new Font("Trebuchet MS", Font.BOLD, 12));
		birthVisible.setOpaque(false);
		panel_1.add(birthVisible);
		
		JCheckBox picVisible = new JCheckBox("Mostrar foto de perfil");
		picVisible.setFont(new Font("Trebuchet MS", Font.BOLD, 12));
		picVisible.setOpaque(false);
		panel_1.add(picVisible);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBackground(new Color(128, 255, 255));
		panel_4.setBounds(320, 280, 190, 115);
		contentPane.add(panel_4);
		panel_4.setLayout(null);
		
		JButton newBtn = new JButton("Nuevo");
		newBtn.setBounds(56, 11, 89, 23);
		newBtn.setForeground(new Color(255, 255, 255));
		newBtn.setBackground(new Color(42, 42, 42));
		panel_4.add(newBtn);
		
		JButton saveBtn = new JButton("Guardar");
		saveBtn.setBounds(56, 45, 89, 23);
		saveBtn.setForeground(new Color(255, 255, 255));
		saveBtn.setBackground(new Color(42, 42, 42));
		panel_4.add(saveBtn);
		
		JButton exitBtn = new JButton("Salir");
		exitBtn.setBounds(56, 79, 89, 23);
		exitBtn.setForeground(new Color(255, 255, 255));
		exitBtn.setBackground(new Color(42, 42, 42));
		panel_4.add(exitBtn);
		
	}
}
