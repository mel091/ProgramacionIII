package MVC;

import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class AuthController //llama pantallas
{
	private JFrame frame;
	private AuthView view;
	
	public AuthController()
	{
		frame = new JFrame();
		frame.setVisible(false);
		frame.setBounds(400, 100, 456, 535);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(new GridLayout(0, 1, 0, 0));
		
		view = new AuthView();
	}
	
	public void login()
	{
		frame.add(view.login());
		frame.setVisible(true);
		frame.repaint();
		frame.revalidate();
	}

}
