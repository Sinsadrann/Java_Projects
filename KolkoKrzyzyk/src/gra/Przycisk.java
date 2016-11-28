package gra;
import javax.swing.ImageIcon;
import javax.swing.JButton;

public class Przycisk extends JButton {
	public Przycisk()
	{	setIcon(new ImageIcon(getClass().getResource("images/puste.jpg")));
		setSize(80, 80);
	};

}
