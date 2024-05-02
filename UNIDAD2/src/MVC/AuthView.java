package MVC;

import java.awt.Color;
import java.awt.Font;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileReader;
import java.io.IOException;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class AuthView 
{
	JPanel panel;
	JTextField textField_2, textField_3;
	JPasswordField passwordField_1;
	AuthModel modelo;
	
	public AuthView()
	{
		 panel = new JPanel();
		 panel.setLayout(null);
		 modelo = new AuthModel();
		 
	}

	public JPanel login()
	{
		//login
		JLabel lblNewLabel_3 = new JLabel("B i e n v e n i d o");
		lblNewLabel_3.setFont(new Font("Lucida Sans Unicode", Font.BOLD, 17));
		lblNewLabel_3.setBounds(100, 100, 340, 615);
		panel.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Accede a tu cuenta ingresando lo siguiente");
		lblNewLabel_4.setForeground(new Color(128, 128, 128));
		lblNewLabel_4.setFont(new Font("Lucida Sans", Font.PLAIN, 13));
		lblNewLabel_4.setBounds(20, 120, 280, 20);
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
		
//		JLabel lblNewLabel_2_1_1 = new JLabel("------------------------------------------------------------------");
//		lblNewLabel_2_1_1.setForeground(Color.GRAY);
//		lblNewLabel_2_1_1.setBounds(25, 185, 270, 14);
//		panel.add(lblNewLabel_2_1_1);
		
		JLabel lblNewLabel_1_1_1_1 = new JLabel("Contraseña");
		lblNewLabel_1_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblNewLabel_1_1_1_1.setBounds(25, 210, 100, 14);
		panel.add(lblNewLabel_1_1_1_1);
		
		textField_3 = new JTextField();
		textField_3.setBorder(null);
		textField_3.setBounds(25, 227, 200, 20);
		panel.add(textField_3);
		
//		JLabel lblNewLabel_2_1_1_1_1 = new JLabel("------------------------------------------------------------------");
//		lblNewLabel_2_1_1_1_1.setForeground(Color.GRAY);
//		lblNewLabel_2_1_1_1_1.setBounds(25, 243, 270, 14);
//		panel.add(lblNewLabel_2_1_1_1_1);
//		panel.setBackground(Color.pink);
		
		JButton btnNewButton = new JButton("Acceder");
		btnNewButton.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				if(modelo.login(textField_2.getText(), textField_3.getText()))
				{
					System.out.println("Bienvenido");
				}
			
				else
					System.out.println("Intenta de nuevo");
			
			}});
		btnNewButton.setForeground(new Color(255, 255, 255));
		btnNewButton.setFont(new Font("Lucida Sans", Font.BOLD, 14));
		btnNewButton.setBounds(60, 310, 200, 35);
		btnNewButton.setBackground(Color.decode("#8E8BE1"));
		panel.add(btnNewButton);
		
		return panel;
	}
	
	public JPanel registro()
	{
		//login
		panel.setBackground(Color.red);
		return panel;
	}
}
