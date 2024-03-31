import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridLayout;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.ActionEvent;

public class juegoGato extends JFrame implements ActionListener
{

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	public static boolean turno;
	
	public static JButton btnNewButton;
	public static JButton btnNewButton_1;
	public static JButton btnNewButton_3;
	public static JButton btnNewButton_6;
	public static JButton btnNewButton_2;
	public static JButton btnNewButton_4;
	public static JButton btnNewButton_5;
	public static JButton btnNewButton_7;
	public static JButton btnNewButton_8;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) 
	{		
		turno = false;
		EventQueue.invokeLater(new Runnable() 
		{
			public void run() 
			{
				try 
				{
					juegoGato frame = new juegoGato();
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
	public juegoGato() 
	{
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(new GridLayout(3, 3, 10, 10));
		contentPane = new JPanel();
		
		turno = true;
		
		btnNewButton = new JButton("");		
		btnNewButton_1 = new JButton("");				
		btnNewButton_3 = new JButton("");		
		btnNewButton_6 = new JButton("");				
		btnNewButton_2 = new JButton("");
		btnNewButton_4 = new JButton("");	
		btnNewButton_5 = new JButton("");		
		btnNewButton_7 = new JButton("");		
		btnNewButton_8 = new JButton("");
		
		btnNewButton.setFont(new Font("Arial", Font.PLAIN, 25));
		btnNewButton.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e) 
			{
				JButton btn = ((JButton) e.getSource());
				click(btn);
			}
			
		});
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
		
	}

public void click(JButton btn)
{
	if (turno) 
	{
        btn.setText("X"); // Si es el turno del jugador 1, establece "X"
    } 
	else 
	{
        btn.setText("O"); // Si es el turno del jugador 2, establece "O"
    }
	
	verificarGanador();
    turno = !turno; // Cambia el turno del jugador
    btn.setEnabled(false); 
}

public boolean verificarGanador() 
{
	//horizontal
	if ((btnNewButton.getText().equals("X") || btnNewButton.getText().equals("O")) 
			&& btnNewButton_1.getText().equals(btnNewButton.getText()) 
			&& btnNewButton_3.getText().equals(btnNewButton.getText())) 
	{
        win();
        return true;
	}
	
	if ((btnNewButton_6.getText().equals("X") || btnNewButton_6.getText().equals("O")) 
			&& btnNewButton_2.getText().equals(btnNewButton_6.getText()) 
			&& btnNewButton_4.getText().equals(btnNewButton_6.getText())) 
	{
        win();
        return true;
	}
	
	if ((btnNewButton_5.getText().equals("X") || btnNewButton_5.getText().equals("O")) 
			&& btnNewButton_7.getText().equals(btnNewButton_5.getText()) 
			&& btnNewButton_8.getText().equals(btnNewButton_5.getText())) 
	{
        win();
        return true;
	}
	
	//vertical
	if ((btnNewButton.getText().equals("X") || btnNewButton.getText().equals("O")) 
			&& btnNewButton_6.getText().equals(btnNewButton.getText()) 
			&& btnNewButton_5.getText().equals(btnNewButton.getText())) 
	{
        win();
        return true;
	}
	
	if ((btnNewButton_1.getText().equals("X") || btnNewButton_1.getText().equals("O")) 
			&& btnNewButton_2.getText().equals(btnNewButton_1.getText()) 
			&& btnNewButton_7.getText().equals(btnNewButton_1.getText())) 
	{
        win();
        return true;
	}
	
	if ((btnNewButton_3.getText().equals("X") || btnNewButton_3.getText().equals("O")) 
			&& btnNewButton_4.getText().equals(btnNewButton_3.getText()) 
			&& btnNewButton_8.getText().equals(btnNewButton_3.getText())) 
	{
        win();
        return true;
	}
	
	//diagonal
	if ((btnNewButton.getText().equals("X") || btnNewButton.getText().equals("O")) 
			&& btnNewButton_2.getText().equals(btnNewButton.getText()) 
			&& btnNewButton_8.getText().equals(btnNewButton.getText())) 
	{
        win();
        return true;
	}
	
	if ((btnNewButton_5.getText().equals("X") || btnNewButton_5.getText().equals("O")) 
			&& btnNewButton_2.getText().equals(btnNewButton_5.getText()) 
			&& btnNewButton_3.getText().equals(btnNewButton_5.getText())) 
	{
        win();
        return true;
	}
	else
	{		
		 return false;
	}
  
}

public void win()
{
	 String ganaste = "¡Felicidades! Haz ganado";
	  JOptionPane.showMessageDialog(null, ganaste);
}


@Override
public void actionPerformed(ActionEvent e) {
	// TODO Auto-generated method stub
	
}	

}
