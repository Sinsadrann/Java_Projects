package gra;
import java.awt.*;

import java.awt.EventQueue;



public class gra 
{
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			@Override
			public void run() {
				Class<gra> game = gra.class;
				Okno okienko = new Okno();
			}
		});
	}

}
	


