import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.FlowLayout;
import javax.swing.JLabel;

public class JuegoGato1 extends JFrame implements ActionListener{

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	
	public int contX, contY;
	public static boolean turno;
	
	JLabel lblNewLabel = new JLabel("X: 0", 0);
	JLabel lblNewLabel_1 = new JLabel("O: 0", 0);
	
	public static JButton btnNewButton;
	public static JButton btnNewButton_1;
	public static JButton btnNewButton_3;
	public static JButton btnNewButton_6;
	public static JButton btnNewButton_2;
	public static JButton btnNewButton_4;
	public static JButton btnNewButton_5;
	public static JButton btnNewButton_7;
	public static JButton btnNewButton_8;
	private JPanel panel;
	private JButton btnNewButton_9;
	private JPanel panel_1;
	
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JuegoGato1 frame = new JuegoGato1();
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
	public JuegoGato1() {
		this.setTitle("Tic tac toe");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 350);
		contentPane = new JPanel();
		
		turno = true;
		
		btnNewButton = new JButton("");		
		btnNewButton.setBounds(0, 40, 138, 67);
		btnNewButton_1 = new JButton("");				
		btnNewButton_1.setBounds(148, 40, 138, 67);
		btnNewButton_3 = new JButton("");		
		btnNewButton_3.setBounds(296, 40, 138, 67);
		btnNewButton_6 = new JButton("");				
		btnNewButton_6.setBounds(0, 120, 138, 67);
		btnNewButton_2 = new JButton("");
		btnNewButton_2.setBounds(148, 120, 138, 67);
		btnNewButton_4 = new JButton("");	
		btnNewButton_4.setBounds(296, 120, 138, 67);
		btnNewButton_5 = new JButton("");		
		btnNewButton_5.setBounds(0, 200, 138, 67);
		btnNewButton_7 = new JButton("");		
		btnNewButton_7.setBounds(148, 200, 138, 67);
		btnNewButton_8 = new JButton("");
		btnNewButton_8.setBounds(296, 200, 138, 67);
		
		btnNewButton.setFont(new Font("Arial", Font.PLAIN, 25));
		btnNewButton.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e) 
			{
				JButton btn = ((JButton) e.getSource());
				click(btn);
			}
			
		});
		getContentPane().setLayout(null);
		getContentPane().add(btnNewButton);	
		
		btnNewButton_1.setFont(new Font("Arial", Font.PLAIN, 25));
		btnNewButton_1.addActionListener(new ActionListener()
		{
				
			public void actionPerformed(ActionEvent e) 
			{
				JButton btn = ((JButton) e.getSource());
				click(btn);
			}
			
		});
		getContentPane().add(btnNewButton_1);		
		
		btnNewButton_3.setFont(new Font("Arial", Font.PLAIN, 25));
		btnNewButton_3.addActionListener(new ActionListener()
		{
				
			public void actionPerformed(ActionEvent e) 
			{
				JButton btn = ((JButton) e.getSource());
				click(btn);
			}
			
		});
		getContentPane().add(btnNewButton_3);	
		
		btnNewButton_6.setFont(new Font("Arial", Font.PLAIN, 25));
		btnNewButton_6.addActionListener(new ActionListener()
		{
				
			public void actionPerformed(ActionEvent e) 
			{
				JButton btn = ((JButton) e.getSource());
				click(btn);
			}
			
		});
		getContentPane().add(btnNewButton_6);	
		
		btnNewButton_2.setFont(new Font("Arial", Font.PLAIN, 25));
		btnNewButton_2.addActionListener(new ActionListener()
		{
				
			public void actionPerformed(ActionEvent e) 
			{
				JButton btn = ((JButton) e.getSource());
				click(btn);
			}
			
		});
		getContentPane().add(btnNewButton_2);		
		
		btnNewButton_4.setFont(new Font("Arial", Font.PLAIN, 25));
		btnNewButton_4.addActionListener(new ActionListener()
		{
				
			public void actionPerformed(ActionEvent e) 
			{
				JButton btn = ((JButton) e.getSource());
				click(btn);
			}
			
		});
		getContentPane().add(btnNewButton_4);		
		
		btnNewButton_5.setFont(new Font("Arial", Font.PLAIN, 25));
		btnNewButton_5.addActionListener(new ActionListener()
		{
				
			public void actionPerformed(ActionEvent e) 
			{
				JButton btn = ((JButton) e.getSource());
				click(btn);
			}
			
		});
		getContentPane().add(btnNewButton_5);		
		contentPane = new JPanel();
		
		btnNewButton_7.setFont(new Font("Arial", Font.PLAIN, 25));
		btnNewButton_7.addActionListener(new ActionListener()
		{
				
			public void actionPerformed(ActionEvent e) 
			{
				JButton btn = ((JButton) e.getSource());
				click(btn);
			}
			
		});
		getContentPane().add(btnNewButton_7);		
		
		btnNewButton_8.setFont(new Font("Arial", Font.PLAIN, 25));
		btnNewButton_8.addActionListener(new ActionListener()
		{
				
			public void actionPerformed(ActionEvent e) 
			{
				JButton btn = ((JButton) e.getSource());
				click(btn);
			}
			
		});
		getContentPane().add(btnNewButton_8);
		
		panel = new JPanel();
		panel.setBounds(10, 275, 415, 30);
		getContentPane().add(panel);
		panel.setLayout(null);
		
		btnNewButton_9 = new JButton("Reiniciar");
		btnNewButton_9.setBackground(Color.decode("#52223c"));
		btnNewButton_9.setForeground(Color.white);
		btnNewButton_9.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				reiniciar();
			}
		});
		
		btnNewButton_9.setBounds(0, 2, 415, 25);
		panel.add(btnNewButton_9);
		
		panel_1 = new JPanel();
		panel_1.setBounds(10, 5, 415, 30);
		getContentPane().add(panel_1);
		panel_1.setLayout(new GridLayout(1, 0, 0, 0));
		
		//puntos X
		lblNewLabel.setOpaque(true);
		lblNewLabel.setBackground(Color.decode("#6b666d"));
		lblNewLabel.setForeground(Color.white);
		panel_1.add(lblNewLabel);
		
		//puntos O
		lblNewLabel_1.setOpaque(true);
		lblNewLabel_1.setBackground(Color.decode("#6c3751"));
		lblNewLabel_1.setForeground(Color.white);
		panel_1.add(lblNewLabel_1);
		
	}

public void click(JButton btn)
{
	if (turno) 
	{
        btn.setText("X"); // Si es el turno del jugador 1, establece "X"
        btn.setBackground(Color.decode("#6b666d"));
    } 
	else 
	{
        btn.setText("O"); // Si es el turno del jugador 2, establece "O"
        btn.setBackground(Color.decode("#6c3751"));
    }
	
	verificarGanador();
    turno = !turno; // Cambia el turno del jugador
    btn.setEnabled(false); 
    
    String ganador = verificarGanador();
    if (!ganador.isEmpty()) 
    {
    	if(ganador.equals("X"))
    	{
    		contX+=10;
    		System.out.println("X: " + contX);
    	}
    	else if(ganador.equals("O"))
    	{
    		contY+=10;
    		System.out.println("O: " + contY);
    	}
        win(ganador);
    }
    
}

public String verificarGanador() 
{
	//horizontal
	if ((btnNewButton.getText().equals("X") || btnNewButton.getText().equals("O")) 
			&& btnNewButton_1.getText().equals(btnNewButton.getText()) 
			&& btnNewButton_3.getText().equals(btnNewButton.getText())) 
	{
		
        return btnNewButton.getText(); 

	}
	
	if ((btnNewButton_6.getText().equals("X") || btnNewButton_6.getText().equals("O")) 
			&& btnNewButton_2.getText().equals(btnNewButton_6.getText()) 
			&& btnNewButton_4.getText().equals(btnNewButton_6.getText())) 
	{
        
        return btnNewButton_6.getText(); 
       
	}
	
	if ((btnNewButton_5.getText().equals("X") || btnNewButton_5.getText().equals("O")) 
			&& btnNewButton_7.getText().equals(btnNewButton_5.getText()) 
			&& btnNewButton_8.getText().equals(btnNewButton_5.getText())) 
	{
       
        return btnNewButton_5.getText(); 
	}
	
	//vertical
	if ((btnNewButton.getText().equals("X") || btnNewButton.getText().equals("O")) 
			&& btnNewButton_6.getText().equals(btnNewButton.getText()) 
			&& btnNewButton_5.getText().equals(btnNewButton.getText())) 
	{
        
        return btnNewButton.getText(); 
	}
	
	if ((btnNewButton_1.getText().equals("X") || btnNewButton_1.getText().equals("O")) 
			&& btnNewButton_2.getText().equals(btnNewButton_1.getText()) 
			&& btnNewButton_7.getText().equals(btnNewButton_1.getText())) 
	{
       
        return btnNewButton_1.getText(); 
	}
	
	if ((btnNewButton_3.getText().equals("X") || btnNewButton_3.getText().equals("O")) 
			&& btnNewButton_4.getText().equals(btnNewButton_3.getText()) 
			&& btnNewButton_8.getText().equals(btnNewButton_3.getText())) 
	{
        
        return btnNewButton_3.getText(); 
	}
	
	//diagonal
	if ((btnNewButton.getText().equals("X") || btnNewButton.getText().equals("O")) 
			&& btnNewButton_2.getText().equals(btnNewButton.getText()) 
			&& btnNewButton_8.getText().equals(btnNewButton.getText())) 
	{
       
        return btnNewButton.getText(); 
	}
	
	if ((btnNewButton_5.getText().equals("X") || btnNewButton_5.getText().equals("O")) 
			&& btnNewButton_2.getText().equals(btnNewButton_5.getText()) 
			&& btnNewButton_3.getText().equals(btnNewButton_5.getText())) 
	{
        
        return btnNewButton_5.getText(); 
	}
	else
	{		
		 return "";
	}
  
}

public void win(String g)
{
	
	 String ganaste = "¡Felicidades! Haz ganado jugador " + g;
	  JOptionPane.showMessageDialog(null, ganaste);
	  
	  if(g.equals("X"))
	  {
		  lblNewLabel.setText("X: " + contX);
	  }
	  else if(g.equals("O"))
	  {
		  lblNewLabel_1.setText("O: " + contX);
	  }
	
	  reiniciar();
}

public void reiniciar()
{
	btnNewButton.setText("");
    btnNewButton_1.setText("");
    btnNewButton_2.setText("");
    btnNewButton_3.setText("");
    btnNewButton_4.setText("");
    btnNewButton_5.setText("");
    btnNewButton_6.setText("");
    btnNewButton_7.setText("");
    btnNewButton_8.setText("");
    
    btnNewButton.setEnabled(true);
    btnNewButton_1.setEnabled(true);
    btnNewButton_2.setEnabled(true);
    btnNewButton_3.setEnabled(true);
    btnNewButton_4.setEnabled(true);
    btnNewButton_5.setEnabled(true);
    btnNewButton_6.setEnabled(true);
    btnNewButton_7.setEnabled(true);
    btnNewButton_8.setEnabled(true);
    
    btnNewButton.setBackground(null);
    btnNewButton_1.setBackground(null);
    btnNewButton_2.setBackground(null);
    btnNewButton_3.setBackground(null);
    btnNewButton_4.setBackground(null);
    btnNewButton_5.setBackground(null);
    btnNewButton_6.setBackground(null);
    btnNewButton_7.setBackground(null);
    btnNewButton_8.setBackground(null);
}




@Override
public void actionPerformed(ActionEvent e) {
	// TODO Auto-generated method stub
	
}
}
