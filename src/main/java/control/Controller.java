package control;

import model.GetLyricResult;
import view.Window;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.net.URL;

import javax.imageio.ImageIO;

public class Controller implements ActionListener {

	private Window win;
	private BufferedImage notFoundImage;

	public Controller(Window win) {
		super();
		this.win = win;
		
		try {
			notFoundImage = ImageIO.read(new File("assets/notFound.png"));
		} catch (IOException e) {
			e.printStackTrace();
		}
		win.getBtnSearch().addActionListener(this);
	}

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
					
					URL url = new URL(obj.getLyricCovertArtUrl());
					BufferedImage c = ImageIO.read(url);
					win.getImage().setImage(c);
					
					paragraph(obj.getLyric());
					win.getTextPaneLyrics().setText(obj.getLyric());
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
		
		String outputText = null;
		
		String[] splits = inputText.split(",(?=([^\"]*\"[^\"]*\")*[^\"]*$)");
		
		
		for (int i = 0; i < splits.length; i++) {
		    System.out.println(splits[i].trim());
		}
		
		return outputText;
	}
}
