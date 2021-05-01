package control;

import model.GetLyricResult;
import view.Window;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.imageio.ImageIO;

public class Controller implements ActionListener {

	private Window win;
	private BufferedImage notFoundImage;

	public Controller(Window win) {
		super();
		this.win = win;
		
		try {
			notFoundImage = ImageIO.read(new File("assets/notFound.png"));
			win.getImage().setImage(notFoundImage);
		} catch (IOException e) {
			e.printStackTrace();
		}
		win.getBtnSearch().addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		GetLyricResult obj;
		
		if(e.getSource() == win.getBtnSearch()) {

			obj = null;
			try {
				String author = win.getTextFieldAuthor().getText();
				String song = win.getTextFieldSong().getText();
				
				String resp = APIConnection.getLyric(author, song);
				
				if(!resp.equals("")) {
					obj = APIConnection.xlmToObject(resp);

					win.getTextFieldAuthor().setText("");
					win.getTextFieldSong().setText("");
					
					win.getLblArtist().setText(obj.getLyricArtist());
					win.getLblSong().setText(obj.getLyricSong());

					try {
						URL url = new URL(obj.getLyricCovertArtUrl());
						BufferedImage c = ImageIO.read(url);
						win.getImage().setImage(c);
					} catch(Exception err){
						win.getImage().setImage(notFoundImage);
					}

					win.getTextPaneLyrics().setText(paragraph(obj.getLyric()));
				} else {
					win.getImage().setImage(notFoundImage);
					
					win.getLblArtist().setText("Artista");
					win.getLblSong().setText("Canzone");
					
					win.getTextPaneLyrics().setText("NOT FOUND");
				}
				
			} catch(Exception err) {
				err.printStackTrace();
			}
		}
	}
	public static String paragraph(String inputText) {
		System.out.println(inputText);

		String[] splits = inputText.split("(?<=[a-zÀ-ÖØ-öø-ÿ]|,|\\]|\\)|\\?|\\!|(?<![A-Z])\\.)(?=[A-Z0-9]|\\[|\\(|(?=\\'[A-Z]))");
		//,(?=([^"]*"[^"]*")*[^"]*$)
		//((?<=[a-z]|,)([A-Z]|\[)|jsoc)

		return String.join("\n", splits);
	}
}
