import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Calculadora extends JFrame
{
	public Calculadora()
	{
		this.setVisible(true);
		
		this.setSize(350, 440);
		this.setLocation(300, 200);
		
		this.setLocationRelativeTo(null); 
		
		this.setLayout(null);		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
		
		this.setResizable(false);
		
		this.setTitle("Calculadora");
		
		this.IniciarComponentes();
	}
	
	public void IniciarComponentes()
	{
		this.principal();
		this.repaint();
	}
	
	public void principal()
	{
		JPanel panelPrincipal = new JPanel();
		panelPrincipal.setSize(this.getWidth(), this.getHeight()); 
		panelPrincipal.setLocation(0, 0); 
		panelPrincipal.setBackground(Color.darkGray);
		panelPrincipal.setLayout(null);
		
		JLabel screen = new JLabel("222", 0); 
		screen.setSize(315, 55); 
		screen.setFont(new Font("Tw Cen MT", Font.BOLD, 30));
		screen.setForeground(Color.white); 
		screen.setLocation(10, 10); 
		screen.setOpaque(true);
		screen.setBackground(Color.black);
		panelPrincipal.add(screen); 
		
		JLabel vacio = new JLabel(""); 
		vacio.setSize(232, 50); 
		vacio.setLocation(92, 75); 
		vacio.setOpaque(true);
		vacio.setBackground(Color.gray);
		panelPrincipal.add(vacio); 
		
		JButton botonC = new JButton("CE");
		botonC.setBounds(10, 75, 70, 50);
		botonC.setFont(new Font("Tw Cen MT", Font.BOLD, 25));
		botonC.setOpaque(true);
		botonC.setBackground(Color.decode("#F09022"));
		panelPrincipal.add(botonC);
		
		JButton boton7 = new JButton("7");
		boton7.setBounds(10, 140, 70, 50);
		boton7.setFont(new Font("Tw Cen MT", Font.BOLD, 25));
		boton7.setOpaque(true);
		boton7.setBackground(Color.white);
		panelPrincipal.add(boton7);
		
		JButton boton8 = new JButton("8");
		boton8.setBounds(92, 140, 70, 50);
		boton8.setFont(new Font("Tw Cen MT", Font.BOLD, 25));
		boton8.setOpaque(true);
		boton8.setBackground(Color.white);
		panelPrincipal.add(boton8);
		
		JButton boton9 = new JButton("9");
		boton9.setBounds(173, 140, 70, 50);
		boton9.setFont(new Font("Tw Cen MT", Font.BOLD, 25));
		boton9.setOpaque(true);
		boton9.setBackground(Color.white);
		panelPrincipal.add(boton9);
		
		JButton div = new JButton("/");
		div.setBounds(255, 140, 70, 50);
		div.setFont(new Font("Tw Cen MT", Font.BOLD, 25));
		div.setOpaque(true);
		div.setBackground(Color.decode("#F09022"));
		panelPrincipal.add(div);
		
		JButton boton4 = new JButton("4");
		boton4.setBounds(10, 205, 70, 50);
		boton4.setFont(new Font("Tw Cen MT", Font.BOLD, 25));
		boton4.setOpaque(true);
		boton4.setBackground(Color.white);
		panelPrincipal.add(boton4);
		
		JButton boton5 = new JButton("5");
		boton5.setBounds(92, 205, 70, 50);
		boton5.setFont(new Font("Tw Cen MT", Font.BOLD, 25));
		boton5.setOpaque(true);
		boton5.setBackground(Color.white);
		panelPrincipal.add(boton5);
		
		JButton boton6 = new JButton("6");
		boton6.setBounds(173, 205, 70, 50);
		boton6.setFont(new Font("Tw Cen MT", Font.BOLD, 25));
		boton6.setOpaque(true);
		boton6.setBackground(Color.white);
		panelPrincipal.add(boton6);
		
		JButton asterisco = new JButton("*");
		asterisco.setBounds(255, 205, 70, 50);
		asterisco.setFont(new Font("Tw Cen MT", Font.BOLD, 25));
		asterisco.setOpaque(true);
		asterisco.setBackground(Color.decode("#F09022"));
		panelPrincipal.add(asterisco);
		
		JButton boton1 = new JButton("1");
		boton1.setBounds(10, 270, 70, 50);
		boton1.setFont(new Font("Tw Cen MT", Font.BOLD, 25));
		boton1.setOpaque(true);
		boton1.setBackground(Color.white);
		panelPrincipal.add(boton1);
		
		JButton boton2 = new JButton("2");
		boton2.setBounds(92, 270, 70, 50);
		boton2.setFont(new Font("Tw Cen MT", Font.BOLD, 25));
		boton2.setOpaque(true);
		boton2.setBackground(Color.white);
		panelPrincipal.add(boton2);
		
		JButton boton3 = new JButton("3");
		boton3.setBounds(173, 270, 70, 50);
		boton3.setFont(new Font("Tw Cen MT", Font.BOLD, 25));
		boton3.setOpaque(true);
		boton3.setBackground(Color.white);
		panelPrincipal.add(boton3);
		
		JButton resta = new JButton("-"); //#F09022
		resta.setBounds(255, 270, 70, 50);
		resta.setFont(new Font("Tw Cen MT", Font.BOLD, 25));
		resta.setOpaque(true);
		resta.setBackground(Color.decode("#F09022"));
		panelPrincipal.add(resta);
		
		JButton boton0 = new JButton("0");
		boton0.setBounds(10, 335, 70, 50);
		boton0.setFont(new Font("Tw Cen MT", Font.BOLD, 25));
		boton0.setOpaque(true);
		boton0.setBackground(Color.white);
		panelPrincipal.add(boton0);
		
		JButton punto = new JButton(".");
		punto.setBounds(92, 335, 70, 50);
		punto.setFont(new Font("Tw Cen MT", Font.BOLD, 25));
		punto.setOpaque(true);
		punto.setBackground(Color.decode("#F09022"));
		panelPrincipal.add(punto);
		
		JButton resultado = new JButton("=");
		resultado.setBounds(173, 335, 70, 50);
		resultado.setFont(new Font("Tw Cen MT", Font.BOLD, 25));
		resultado.setOpaque(true);
		resultado.setBackground(Color.decode("#F09022"));
		panelPrincipal.add(resultado);
		
		JButton suma = new JButton("+");
		suma.setBounds(255, 335, 70, 50);
		suma.setFont(new Font("Tw Cen MT", Font.BOLD, 25));
		suma.setOpaque(true);
		suma.setBackground(Color.decode("#F09022"));
		panelPrincipal.add(suma);
		
		this.add(panelPrincipal); //IMPORTANTE 
	}

}
