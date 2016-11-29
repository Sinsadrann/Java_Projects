package Game;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;

import Game.Button;
import Game.Board;


public class MainWindow extends JFrame implements ActionListener 
{
	Board board;
	BoardImpl Iboard;
	int v,c;
	public MainWindow()
	{
		super("Kó³ko-krzy¿yk");//konstruktor nad klasy
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//zeby wylaczalo sie krzyzykiem
		setLayout(new GridLayout(3,3)); 
		board = new Board();
		board.fields = new Button[3][3];
		for(int i = 0; i < 3; i++)
		{
			for(int j =0; j < 3; j++)
			{
			board.fields[i][j] = new Button();
			board.fields[i][j].addActionListener(this);
			add(board.fields[i][j]);
			}
		}

		setLocation(600,300);
		setSize(600,600);
		setResizable(false);//nie mozna rozszezyc
		setVisible(true);
		
		Iboard = new BoardImpl();
	}
	
	public BoardImpl getIboard()
	{
		return this.Iboard;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) 
	{
		Object source = e.getSource();
		for(int i = 0; i < 3; i++)
		{
			for(int j =0; j < 3; j++)
			{
				if(source == (JButton)board.fields[i][j])
				{
					this.v = i;
					this.c = j;
				if(Iboard.drawFigure(i,j,Game.OBJECTS.CIRCLE,Game.OBJECTS.CROSS) == true)
				{
					board.fields[i][j].setIcon(new ImageIcon(getClass().getResource("images/cross.jpg")));
				}
				}			
			}
		}
	}
}
