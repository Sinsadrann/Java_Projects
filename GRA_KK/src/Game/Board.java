package Game;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JPanel;

import Game.Button;

public class Board extends JPanel implements ActionListener 
{
	public Button[][] fields;
	public Board()
	{
	}
	@Override
	public void actionPerformed(ActionEvent e) 
	{
		Object source = e.getSource();
		for(int i = 0; i < 3; i++)
		{
			for(int j =0; j < 3; j++)
			{
				if(source == (fields[i][j]))
				{
				fields[i][j].setIcon(new ImageIcon(getClass().getResource("images/krzyzyk.jpg")));
				fields[i][j].setText("KUPA");
				System.out.println("KUPA");
				}			
			}
		}
	}

}
