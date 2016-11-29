package gra;
import java.awt.GridLayout;
import java.awt.Image;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class Okno extends JFrame {

	public Okno() {
		super("Hello World");//konstruktor nad klasy
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//zeby wylaczalo sie krzyzykiem
		setLayout(new GridLayout(3,3)); 
		plansza Plansza = new plansza();
		for(int i = 0; i < 3; i++)
		{
			for(int j =0; j < 3; j++)
			{
				Plansza.plansza[i][j] = new Przycisk();
				//plansza[i].setIcon(new ImageIcon(getClass().getResource("images/kolo.jpg")));
				add(Plansza.plansza[i][j]);
			}
		}
		setLocation(600,300);
		setSize(600,600);
		setResizable(false);//nie mozna rozszezyc
		setVisible(true);
	}
}