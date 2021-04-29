package control;

import view.Window;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Controller implements ActionListener {

	private Window win;

	public Controller(Window win) {
		super();
		this.win = win;
		
		win.getBtnSearch().addActionListener(this);
	}

	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource() == win.getBtnSearch()) {
			System.out.println("tut");
			
			try {
				String resp = APIConnection.getLyric(win.getTextFieldAuthor().getText(), win.getTextFieldSong().getText());
				System.out.println(resp);
			} catch(Exception err) {
				err.printStackTrace();
			}
		}
	}

}
