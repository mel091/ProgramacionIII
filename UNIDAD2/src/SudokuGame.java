import java.awt.Color;
import java.awt.Component;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridLayout;
import java.awt.Point;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.FlowLayout;
import java.awt.Font;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import javax.swing.Timer;
import java.time.Duration;
import java.time.Instant;
import java.util.concurrent.TimeUnit;

public class SudokuGame extends JFrame {

    private static final long serialVersionUID = 1L;
    private JPanel contentPane;
    private JLabel tiempo;
    
    ArrayList<Integer> numbers = new ArrayList<>();
    private List<JButton> buttons = new ArrayList<>();
    
    public boolean ordenado = true;
    public Timer time;

    public static void main(String[] args){
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                	
                    SudokuGame frame = new SudokuGame();
                    
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    public SudokuGame() 
    {
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
        
        tiempo = new JLabel("Tiempo: ");
        tiempo.setBounds(160, 0, 200, 20);
        tiempo.setForeground(Color.white);
        //tiempo.setOpaque(true);
        panel.add(tiempo);
        
        
        reiniciar();

        int[] buttonPosX = {20, 115, 210, 305, 20, 115, 210, 305, 20, 115, 210, 305, 20, 115, 210, 305};
        int[] buttonPosY = {20, 20, 20, 20, 100, 100, 100, 100, 180, 180, 180, 180, 260, 260, 260, 260};
        
        for (int i = 0; i < 16; i++) //crea botones en las coordenadas asignadas
        {
            JButton button ;
            
            if(numbers.get(i) != 16)
            {
            	button = new JButton(numbers.get(i).toString());
            }
            else
            {
            	button = new JButton("");
            }
            
            button.setFont(new Font("Tahoma", Font.BOLD, 16));
            button.setBounds(buttonPosX[i], buttonPosY[i], 95, 80);
            button.setBackground(Color.white);;
            button.addActionListener(new ActionListener() 
            {
                public void actionPerformed(ActionEvent e) {
                }
            });
            panel.add(button);
            buttons.add(button);
        }
        
        JButton btnPause = new JButton("Pausa");
        btnPause.setBackground(Color.white);
        btnPause.addActionListener(new ActionListener() 
        {
            public void actionPerformed(ActionEvent e) 
            {
            	if(time.isRunning())
            	{
            		time.stop();
            		
            	}
            	else
            	{
            		time.start();
            	}
                 
            }
        });
        btnPause.setFont(new Font("Tahoma", Font.BOLD, 16));
        btnPause.setBounds(230, 350, 140, 70);
        panel.add(btnPause);
        
        JButton btnReinicio = new JButton("Reiniciar");
        btnReinicio.setBackground(Color.white);
        btnReinicio.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                
            	reiniciar();

                for (Component component : panel.getComponents()) 
                {
                    if (component instanceof JButton) 
                    {
                        JButton button = (JButton) component;
                        if (button != btnReinicio && button != btnPause) 
                        {
                            int index = panel.getComponentZOrder(button);
                            if (index < numbers.size()) 
                            {
                                if (numbers.get(index) != 16) 
                                {
                                    button.setText(numbers.get(index).toString());
                                } 
                                else 
                                {
                                    button.setText("");
                                }
                            }
                        }
                    }
                }


            }
        });
        
        btnReinicio.setFont(new Font("Tahoma", Font.BOLD, 16));
        btnReinicio.setBounds(50, 350, 140, 70);
        panel.add(btnReinicio);
        
        
        
        ActionListener buttonActionLis = new ActionListener()
		{
			@Override
			public void actionPerformed(ActionEvent e) 
			{
				JButton btnOriginal = (JButton) e.getSource(); //saber q botón es clickeado
				JButton btnEmpty = null;
				
				for(Component component : panel.getComponents())
				{
					if(component instanceof JButton)
					{
						JButton btn = (JButton) component;
						if(btn.getText().equals(""))
						{
							btnEmpty = btn;
							break;
						}
					}
				}
				
				int btnOriginalX = btnOriginal.getBounds().x;
				int btnOriginalY = btnOriginal.getBounds().y;
				int emptyBtnX = btnEmpty.getBounds().x;
				int emptyBtnY = btnEmpty.getBounds().y;
				
				//distancia horizontal entre el original y el vacio, comprobando que esta a su lado y NO en la misma columna y si está en la misma fila
				if((Math.abs(btnOriginalX - emptyBtnX) == 95 && btnOriginalY == emptyBtnY) || 
				   (Math.abs(btnOriginalY - emptyBtnY) == 80 && btnOriginalX == emptyBtnX))
					//distancia vertical entre original y vacio, comprobando q esta arriba o abajo y NO en la misma fila, y si está en la misma columna
				{
					//almaacena temporalmente la ubicacion de un boton clickeado antes de realizar intercambio
					Point tempLocation = btnOriginal.getLocation();
					btnOriginal.setLocation(btnEmpty.getLocation());
					btnEmpty.setLocation(tempLocation);
					
					revalidate();
					repaint();
					
					 if(checkWin()) 
					 {
	                        JOptionPane.showMessageDialog(null, "¡Felicidades! ¡Has ganado!");
	                    }
					 
					
					
				}
				
			}
	
		};
		
		//MOVIMIENTO NO BORRAR
		for(Component component : panel.getComponents())
		{
			{
				if(component instanceof JButton)
				{
					JButton btn = (JButton) component;
					btn.addActionListener(buttonActionLis);
				}
			}
		}
		
		
		
	//cuenta segundos de ejecución
	time = new Timer(1000, new ActionListener() 
	{
		private long startTime = System.currentTimeMillis();
		
		public void actionPerformed(ActionEvent e)
		{
			long elapsedTime = System.currentTimeMillis() - startTime;
            long seconds = TimeUnit.MILLISECONDS.toSeconds(elapsedTime);
            tiempo.setText("Tiempo: " + seconds + " segundos");
		}
		
		
	});	
	time.start(); //////////////////////////////////////////////////
		
       
    } //no borrar
    
    public boolean checkWin() 
    {
        int lastIndex = buttons.size() - 1;
        for (int i = 0; i < lastIndex; i++) 
        {
            JButton current = buttons.get(i);
            JButton next = buttons.get(i + 1);
            
            // Verifica si los botones están en orden ascendente y el último botón está vacío
            if (!current.getText().equals(Integer.toString(i + 1)) || (i == lastIndex - 1 && !next.getText().equals(""))) {
                return false;
            }
        }
        return true;
    }

   
    public void reiniciar()
    {
    	numbers.clear();
        for (int i = 1; i <= 16; i++) 
        {
            numbers.add(i);
        }
        Collections.shuffle(numbers);
        
        revalidate();
        repaint();
    }
    
    
} //nup
