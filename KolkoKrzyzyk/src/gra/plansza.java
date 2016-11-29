package gra;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;


public class plansza extends JPanel implements ActionListener 
{
	public Przycisk[][] plansza;
	public plansza()
	{
		plansza = new Przycisk[9][3];
		for(int i = 0; i < 3; i++)
		{
			for(int j =0; j < 3; j++)
			{
			plansza[i][j] = new Przycisk();
			plansza[i][j].addActionListener(this);
			}
		}
	}
	@Override
	public void actionPerformed(ActionEvent e) 
	{
		Object source = e.getSource();
		for(int i = 0; i < 3; i++)
		{
			for(int j =0; j < 3; j++)
			{
				if(source == (JButton)plansza[i][j])
				{
				plansza[i][j].setIcon(new ImageIcon(getClass().getResource("images/krzyzyk.jpg")));
				plansza[i][j].setText("KUPA");
				System.out.println("KUPA");
				}			
			}
		}
	}

}
