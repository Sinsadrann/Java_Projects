package gra;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JPanel;


public class plansza extends JPanel implements ActionListener 
{
	public Przycisk[] plansza;
	public plansza()
	{
		plansza = new Przycisk[9];
		for(int i = 0; i < 9; i++)
		{
			plansza[i] = new Przycisk();
		}
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		Object source = e.getSource();

		if(source ==plansza[0])
		{
			
		}
	}

}
