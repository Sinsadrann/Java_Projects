package Game;

public class BoardImpl 
{
	OBJECTS[][] Iboard = {{Game.OBJECTS.BLANK,Game.OBJECTS.BLANK,Game.OBJECTS.BLANK},
						  {Game.OBJECTS.BLANK,Game.OBJECTS.BLANK,Game.OBJECTS.BLANK},
						  {Game.OBJECTS.BLANK,Game.OBJECTS.BLANK,Game.OBJECTS.BLANK}};
	
	public BoardImpl()
	{
	}
	
	public Boolean drawFigure (int v, int c, Game.OBJECTS enemy, Game.OBJECTS player)
	{
		if(Iboard[v][c] == enemy)
		{
			return false;
		}
		else 
		{
			Iboard[v][c] = player;
			return true;
		}
	}

	public void checkField(int v, int c)
	{

	}
	
}
