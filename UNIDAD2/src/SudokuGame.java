import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridLayout;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.FlowLayout;
import java.awt.Font;

public class SudokuGame extends JFrame {

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
					SudokuGame frame = new SudokuGame();
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
	public SudokuGame() {
		this.setTitle("Puzzle numbers");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 445, 480);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(new GridLayout(0, 1, 0, 0));
		
		JPanel panel = new JPanel();
		contentPane.add(panel);
		panel.setLayout(null);
		panel.setBackground(new Color(72, 61, 139));
		
		JButton btn1 = new JButton("1");
		btn1.setFont(new Font("Tahoma", Font.BOLD, 16));
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btn1.setBounds(20, 20, 95, 80);
		panel.add(btn1);
		
		JButton btn2 = new JButton("2");
		btn2.setFont(new Font("Tahoma", Font.BOLD, 16));
		btn2.setBounds(115, 20, 95, 80);
		panel.add(btn2);
		
		JButton btn3 = new JButton("3");
		btn3.setFont(new Font("Tahoma", Font.BOLD, 16));
		btn3.setBounds(210, 20, 95, 80);
		panel.add(btn3);
		
		JButton btn4 = new JButton("4");
		btn4.setFont(new Font("Tahoma", Font.BOLD, 16));
		btn4.setBounds(305, 20, 95, 80);
		panel.add(btn4);
		
		JButton btn5 = new JButton("5");
		btn5.setFont(new Font("Tahoma", Font.BOLD, 16));
		btn5.setBounds(20, 100, 95, 80);
		panel.add(btn5);
		
		JButton btn6 = new JButton("6");
		btn6.setFont(new Font("Tahoma", Font.BOLD, 16));
		btn6.setBounds(115, 100, 95, 80);
		panel.add(btn6);
		
		JButton btn7 = new JButton("7");
		btn7.setFont(new Font("Tahoma", Font.BOLD, 16));
		btn7.setBounds(210, 100, 95, 80);
		panel.add(btn7);
		
		JButton btn8 = new JButton("8");
		btn8.setFont(new Font("Tahoma", Font.BOLD, 16));
		btn8.setBounds(305, 100, 95, 80);
		panel.add(btn8);
		
		JButton btn9 = new JButton("9");
		btn9.setFont(new Font("Tahoma", Font.BOLD, 16));
		btn9.setBounds(20, 180, 95, 80);
		panel.add(btn9);
		
		JButton btn10 = new JButton("10");
		btn10.setFont(new Font("Tahoma", Font.BOLD, 16));
		btn10.setBounds(115, 180, 95, 80);
		panel.add(btn10);
		
		JButton btn11 = new JButton("11");
		btn11.setFont(new Font("Tahoma", Font.BOLD, 16));
		btn11.setBounds(210, 180, 95, 80);
		panel.add(btn11);
		
		JButton btn12 = new JButton("12");
		btn12.setFont(new Font("Tahoma", Font.BOLD, 16));
		btn12.setBounds(305, 180, 95, 80);
		panel.add(btn12);
		
		JButton btn13 = new JButton("13");
		btn13.setFont(new Font("Tahoma", Font.BOLD, 16));
		btn13.setBounds(20, 260, 95, 80);
		panel.add(btn13);
		
		JButton btn14 = new JButton("14");
		btn14.setFont(new Font("Tahoma", Font.BOLD, 16));
		btn14.setBounds(115, 260, 95, 80);
		panel.add(btn14);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(20, 350, 380, 70);
		panel.add(panel_1);
		panel_1.setLayout(new GridLayout(1, 0, 0, 0));
		
		JButton btnReinicio = new JButton("Reiniciar");
		btnReinicio.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnReinicio.setFont(new Font("Tahoma", Font.BOLD, 16));
		panel_1.add(btnReinicio);
		
		JButton btn15 = new JButton("15");
		btn15.setFont(new Font("Tahoma", Font.BOLD, 16));
		btn15.setBounds(210, 260, 95, 80);
		panel.add(btn15);
		
		JButton emptyButton = new JButton("");
		emptyButton.setFont(new Font("Tahoma", Font.BOLD, 16));
		emptyButton.setBounds(305, 260, 95, 80);
		emptyButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		panel.add(emptyButton);
	}

}
