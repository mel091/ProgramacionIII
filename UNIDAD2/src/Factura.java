import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import javax.swing.JLabel;
import java.awt.Color;

public class Factura extends JFrame 
{

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) 
	{
		EventQueue.invokeLater(new Runnable() 
		{
			public void run() 
			{
				try 
				{
					Factura frame = new Factura();
					frame.setVisible(true);
				} catch (Exception e) 
				{
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Factura() 
	{
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 80, 500, 600);
		contentPane = new JPanel();
		//contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setSize(this.getWidth(), this.getHeight());
		panel.setBackground(Color.white);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JPanel facturaLab = new JPanel();
		facturaLab.setBounds(0, 0, 500, 90);
		facturaLab.setBackground(Color.decode("#1E5CB4"));		
		facturaLab.setLayout(null);
		panel.add(facturaLab);
		
		JLabel factura = new JLabel("Factura en Java - NetBeans - ArayList y POO", 2);
		factura.setBounds(15, 5, 600, 60);		
		factura.setFont(new Font("Broadway Normal", Font.BOLD, 15));
		factura.setForeground(Color.white); 		
		facturaLab.add(factura);
		
		JLabel factura1 = new JLabel("[Sin Base de datos]", 2);
		factura1.setBounds(15, 30, 300, 60);		
		factura1.setFont(new Font("Broadway Normal", Font.PLAIN, 12));
		factura1.setForeground(Color.white); 		
		facturaLab.add(factura1);
		
		JLabel datosCliente = new JLabel("Datos del cliente", 2);
		datosCliente.setBounds(20, 95, 95, 30);
		datosCliente.setOpaque(true);
		datosCliente.setFont(new Font("Broadway Normal", Font.PLAIN, 12));
		datosCliente.setForeground(Color.black); 	
		datosCliente.setBackground(Color.white);
		panel.add(datosCliente);
		
		JLabel documento = new JLabel("Documento: ");
		documento.setBounds(38, 127, 100, 20);
		documento.setFont(new Font("Broadway Normal", Font.PLAIN, 12));
		documento.setForeground(Color.black); 	
		panel.add(documento);
		
		JLabel docField = new JLabel(" 123456", 2);
		docField.setBounds(120, 128, 100, 20);
		docField.setOpaque(true);
		docField.setFont(new Font("Broadway Normal", Font.PLAIN, 12));
		docField.setForeground(Color.black);
		docField.setBackground(Color.white);
		docField.setBorder(new LineBorder(Color.lightGray));
		panel.add(docField);
		
		JLabel direccion = new JLabel("Dirección: ");
		direccion.setBounds(38, 155, 100, 20);
		direccion.setFont(new Font("Broadway Normal", Font.PLAIN, 12));
		direccion.setForeground(Color.black); 	
		panel.add(direccion);
		
		JLabel dirField = new JLabel(" Calle 1 #123", 2);
		dirField.setBounds(120, 155, 100, 20);
		dirField.setOpaque(true);
		dirField.setFont(new Font("Broadway Normal", Font.PLAIN, 12));
		dirField.setForeground(Color.black);
		dirField.setBackground(Color.white);
		dirField.setBorder(new LineBorder(Color.lightGray));
		panel.add(dirField);
		
		JLabel name = new JLabel("Nombres: ");
		name.setBounds(245, 127, 100, 20);
		name.setFont(new Font("Broadway Normal", Font.PLAIN, 12));
		name.setForeground(Color.black); 	
		panel.add(name);
		
		JLabel nameField = new JLabel(" Jhon Doe", 2);
		nameField.setBounds(315, 127, 140, 20);
		nameField.setOpaque(true);
		nameField.setFont(new Font("Broadway Normal", Font.PLAIN, 12));
		nameField.setForeground(Color.black);
		nameField.setBackground(Color.white);
		nameField.setBorder(new LineBorder(Color.lightGray));
		panel.add(nameField);
		
		JLabel tel = new JLabel("Teléfono: ");
		tel.setBounds(245, 155, 100, 20);
		tel.setFont(new Font("Broadway Normal", Font.PLAIN, 12));
		tel.setForeground(Color.black); 	
		panel.add(tel);
		
		JLabel telField = new JLabel(" 5554433", 2);
		telField.setBounds(315, 155, 140, 20);
		telField.setOpaque(true);
		telField.setFont(new Font("Broadway Normal", Font.PLAIN, 12));
		telField.setForeground(Color.black);
		telField.setBackground(Color.white);
		telField.setBorder(new LineBorder(Color.lightGray));
		panel.add(telField);
		
		JLabel datos = new JLabel();
		datos.setBounds(10, 110, 465, 75);
		datos.setOpaque(true);
		datos.setBackground(Color.white);
		datos.setBorder(new LineBorder(Color.lightGray));
		panel.add(datos);
		
		JLabel datosdeFac = new JLabel("Datos de factura", 2);
		datosdeFac.setBounds(20, 185, 95, 30);
		datosdeFac.setOpaque(true);
		datosdeFac.setFont(new Font("Broadway Normal", Font.PLAIN, 12));
		datosdeFac.setForeground(Color.black); 	
		datosdeFac.setBackground(Color.white);
		panel.add(datosdeFac);
		
		JLabel numFac = new JLabel("N° Factura: ");
		numFac.setBounds(30, 220, 100, 20);
		numFac.setFont(new Font("Broadway Normal", Font.PLAIN, 12));
		numFac.setForeground(Color.black); 	
		panel.add(numFac);
		
		JLabel num = new JLabel("1");
		num.setBounds(120, 220, 100, 20);
		num.setFont(new Font("Broadway Normal", Font.BOLD, 12));
		num.setForeground(Color.black); 	
		panel.add(num);
		
		JLabel date = new JLabel("Fecha: ");
		date.setBounds(240, 220, 100, 20);
		date.setFont(new Font("Broadway Normal", Font.PLAIN, 12));
		date.setForeground(Color.black); 	
		panel.add(date);
		
		JLabel dateN = new JLabel("2021/50/21");
		dateN.setBounds(310, 220, 100, 20);
		dateN.setFont(new Font("Broadway Normal", Font.BOLD, 12));
		dateN.setForeground(Color.black); 	
		panel.add(dateN);
		
		JLabel datosFac = new JLabel();
		datosFac.setBounds(10, 200, 465, 60);
		datosFac.setOpaque(true);
		datosFac.setBackground(Color.white);
		datosFac.setBorder(new LineBorder(Color.lightGray));
		panel.add(datosFac);
		
		JLabel listImg = new JLabel();
		listImg.setIcon(new ImageIcon(getClass().getResource("list.png")));
		listImg.setBounds(15, 243, 100, 100);
		panel.add(listImg);
		
		JLabel listado = new JLabel("Ver listado de facturas");
		listado.setBounds(45, 285, 200, 20);
		listado.setFont(new Font("Broadway Normal", Font.PLAIN, 12));
		listado.setForeground(Color.black); 	
		panel.add(listado);
		
		JLabel añadir = new JLabel("Añadir");
		añadir.setBounds(305, 285, 200, 20);
		añadir.setFont(new Font("Broadway Normal", Font.PLAIN, 12));
		añadir.setForeground(Color.black); 	
		panel.add(añadir);
		
		JLabel logoAdd = new JLabel();
		logoAdd.setIcon(new ImageIcon(getClass().getResource("addIcon.png")));
		logoAdd.setBounds(280, 245, 100, 100);
		panel.add(logoAdd);
		
		JLabel borrar = new JLabel("Eliminar");
		borrar.setBounds(395, 285, 200, 20);
		borrar.setFont(new Font("Broadway Normal", Font.PLAIN, 12));
		borrar.setForeground(Color.black); 	
		panel.add(borrar);
		
		JLabel borraAdd = new JLabel();
		borraAdd.setIcon(new ImageIcon(getClass().getResource("eliminar.png")));
		borraAdd.setBounds(370, 245, 100, 100);
		panel.add(borraAdd);
		
		String titles[] = {"Producto", "Cantidad", "Valor", "Sub total"};
		String tableData[][] = {
						{"Agua", "2", "500", "1000.0"},
						{"Cereal", "5", "1000", "5000.0"},
						{"Leche", "2", "300", "600.0"}					
						};
		
		JTable tablaUsers = new JTable(tableData, titles);
		//tablaUsers.setBounds(40, 250, 900, 320);
		JScrollPane tableScroll = new JScrollPane(tablaUsers);
		tableScroll.setBounds(10, 310, 465, 100);
		panel.add(tableScroll);
		
		JLabel listaFac = new JLabel();
		listaFac.setBounds(10, 275, 465, 100);
		listaFac.setOpaque(true);
		listaFac.setBackground(Color.white);
		listaFac.setBorder(new LineBorder(Color.lightGray));
		panel.add(listaFac);
		
		JLabel subT = new JLabel("SubTotal: ");
		subT.setBounds(30, 420, 100, 20);
		subT.setFont(new Font("Broadway Normal", Font.PLAIN, 12));
		subT.setForeground(Color.black); 	
		panel.add(subT);
		
		JLabel sub = new JLabel("6600.0");
		sub.setBounds(140, 420, 100, 20);
		sub.setFont(new Font("Broadway Normal", Font.BOLD, 12));
		sub.setForeground(Color.black); 	
		panel.add(sub);
		
		JLabel discount = new JLabel("% Descuento: ");
		discount.setBounds(30, 445, 100, 20);
		discount.setFont(new Font("Broadway Normal", Font.PLAIN, 12));
		discount.setForeground(Color.black); 	
		panel.add(discount);
		
		JLabel discountField = new JLabel(" 5", 2);
		discountField.setBounds(140, 445, 40, 20);
		discountField.setOpaque(true);
		discountField.setFont(new Font("Broadway Normal", Font.PLAIN, 12));
		discountField.setForeground(Color.black);
		discountField.setBackground(Color.white);
		discountField.setBorder(new LineBorder(Color.lightGray));
		panel.add(discountField);
		
		JCheckBox itemBox = new JCheckBox("");
		itemBox.setBounds(195, 440, 80, 30);
		itemBox.setFont(new Font("Consolas", Font.BOLD, 15));
		itemBox.setOpaque(false); 
		itemBox.setSelected(true);
		panel.add(itemBox);
		
		JLabel valorDescontado = new JLabel("Valor descontado: ");
		valorDescontado.setBounds(255, 445, 110, 20);
		valorDescontado.setFont(new Font("Broadway Normal", Font.PLAIN, 12));
		valorDescontado.setForeground(Color.black); 	
		panel.add(valorDescontado);
		
		JLabel valorDesc = new JLabel("330.0");
		valorDesc.setBounds(380, 445, 100, 20);
		valorDesc.setFont(new Font("Broadway Normal", Font.BOLD, 12));
		valorDesc.setForeground(Color.black); 	
		panel.add(valorDesc);
		
		JLabel IVA = new JLabel("IVA 19%: ");
		IVA.setBounds(30, 470, 100, 20);
		IVA.setFont(new Font("Broadway Normal", Font.PLAIN, 12));
		IVA.setForeground(Color.black); 	
		panel.add(IVA);
		
		JLabel iva = new JLabel("1254.0");
		iva.setBounds(140, 470, 100, 20);
		iva.setFont(new Font("Broadway Normal", Font.BOLD, 12));
		iva.setForeground(Color.black); 	
		panel.add(iva);
		
		JLabel totalFactura = new JLabel("Total factura: ");
		totalFactura.setBounds(30, 495, 100, 20);
		totalFactura.setFont(new Font("Broadway Normal", Font.PLAIN, 12));
		totalFactura.setForeground(Color.black); 	
		panel.add(totalFactura);
		
		JLabel total = new JLabel("6600.0");
		total.setBounds(140, 495, 100, 20);
		total.setFont(new Font("Broadway Normal", Font.BOLD, 12));
		total.setForeground(Color.black); 	
		panel.add(total);
		
		JButton finBtn = new JButton("Finalizar factura");
		finBtn.setBounds(250, 515, 130, 25);
		finBtn.setFont(new Font("Arial", Font.PLAIN, 12));
		finBtn.setForeground(Color.black);
		panel.add(finBtn);
		
		JButton clearBtn = new JButton("Limpiar");
		clearBtn.setBounds(390, 515, 80, 25);
		clearBtn.setFont(new Font("Arial", Font.PLAIN, 12));
		clearBtn.setForeground(Color.black);
		panel.add(clearBtn);
		
		JLabel blue = new JLabel();
		blue.setBounds(0, 550, getWidth(), 15);
		blue.setOpaque(true);
		blue.setBackground(Color.decode("#1E5CB4"));
		panel.add(blue);
		
		

	}
}
