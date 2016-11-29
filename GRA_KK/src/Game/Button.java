package Game;
import javax.swing.ImageIcon;
import javax.swing.JButton;

public class Button extends JButton 
{
	public Button()
	{	setIcon(new ImageIcon(getClass().getResource("images/blank.jpg")));
		setSize(80, 80);
	};
}
