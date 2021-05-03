
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

import com.formdev.flatlaf.FlatLightLaf;

import control.Controller;
import view.Window;

/**
 * Classe di avvio del programma
 *
 * @author Moscatelli Alessandro
 * @author Silvello Lorenzo
 */
public class Main {

	public static void main(String[] args) {
		Window win = new Window();
		try {
			UIManager.setLookAndFeel(new FlatLightLaf());
		} catch (UnsupportedLookAndFeelException e) {
			e.printStackTrace();
		}
		
		Controller contr = new Controller(win);
		
		win.setResizable(false);
		win.setVisible(true);
	}
	
}
