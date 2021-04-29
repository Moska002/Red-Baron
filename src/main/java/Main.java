import control.Controller;
import view.Window;

public class Main {

	public static void main(String[] args) {
		Window win = new Window();
		
		Controller contr = new Controller(win);
		
		win.setVisible(true);
	}

}
