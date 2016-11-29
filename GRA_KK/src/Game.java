import java.awt.EventQueue;

import Game.BoardImpl;
import Game.Bot;
import Game.MainWindow;
import Game.OBJECTS;



public class Game
{
	OBJECTS player = OBJECTS.CIRCLE;
	OBJECTS enemy = OBJECTS.CIRCLE;
	
	static MainWindow window;
	static BoardImpl Iboard;
	static Bot bot;
	
	public static void main(String[] args) 
	{
		
		window = new MainWindow();
		Iboard = new BoardImpl();
		bot = new Bot();
		
		
	}
	
	public BoardImpl getBoardImpl()
	{
		return this.Iboard;
	}
}
