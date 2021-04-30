package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JSplitPane;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextPane;
import java.awt.FlowLayout;
import javax.swing.BoxLayout;
import javax.swing.Icon;

import java.awt.Component;
import java.awt.Dimension;

import javax.imageio.ImageIO;
import javax.swing.Box;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.swing.ImageIcon;

public class Window extends JFrame {

	private static final long serialVersionUID = -3511543085625008909L;
	
	private JPanel contentPane;
	private JPanel panel;
	private JPanel panel_1;
	private JPanel panel_2;
	private JScrollPane scrollPane;
	private JTextPane textPaneLyrics;
	private PlaceholderTextField textFieldAuthor;
	private PlaceholderTextField textFieldSong;
	private JButton btnSearch;
	private Box verticalBox_1;
	private Box verticalBox;
	private JLabel lblSong;
	private JLabel lblArtist;
	private Component verticalStrut;
	private Component first;
	private ImageView image;
	private Component verticalStrut_1;

	/**
	 * Create the frame.
	 */
	public Window() {
		setTitle("Red Baron");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 716, 450);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		panel = new JPanel();
		contentPane.add(panel, BorderLayout.CENTER);
		panel.setLayout(new BorderLayout(0, 0));
		
		panel_1 = new JPanel();
		panel.add(panel_1, BorderLayout.NORTH);
		
		textFieldAuthor = new PlaceholderTextField();
		textFieldAuthor.setPlaceholder("Artista");
		panel_1.add(textFieldAuthor);
		textFieldAuthor.setColumns(10);
		
		textFieldSong = new PlaceholderTextField();
		textFieldSong.setPlaceholder("Canzone");
		panel_1.add(textFieldSong);
		textFieldSong.setColumns(10);
		
		//bottone cerca
		Icon icon = new ImageIcon("resources/iconSearch.png");
		btnSearch = new JButton(icon);
		panel_1.add(btnSearch);
		
		panel_2 = new JPanel();
		panel.add(panel_2, BorderLayout.CENTER);
		panel_2.setLayout(new BorderLayout(5, 0));
		
		scrollPane = new JScrollPane();
		panel_2.add(scrollPane, BorderLayout.CENTER);
		
		textPaneLyrics = new JTextPane();
		textPaneLyrics.setEditable(false);
		scrollPane.setViewportView(textPaneLyrics);
		
		verticalBox_1 = Box.createVerticalBox();
		panel_2.add(verticalBox_1, BorderLayout.WEST);
		
		first = Box.createVerticalStrut(10);
		verticalBox_1.add(first);
		
		image = new ImageView(new Dimension(150, 150));
		verticalBox_1.add(image);
		
		verticalStrut_1 = Box.createVerticalStrut(10);
		verticalBox_1.add(verticalStrut_1);
		
		verticalBox = Box.createVerticalBox();
		verticalBox.setAlignmentX(Component.CENTER_ALIGNMENT);
		verticalBox_1.add(verticalBox);
		
		lblSong = new JLabel("Canzone");
		verticalBox.add(lblSong);
		
		verticalStrut = Box.createVerticalStrut(10);
		verticalBox.add(verticalStrut);
		
		lblArtist = new JLabel("Artista       ");
		verticalBox.add(lblArtist);
	}

	public JButton getBtnSearch() {
		return btnSearch;
	}

	public JTextPane getTextPaneLyrics() {
		return textPaneLyrics;
	}

	public PlaceholderTextField getTextFieldAuthor() {
		return textFieldAuthor;
	}

	public PlaceholderTextField getTextFieldSong() {
		return textFieldSong;
	}

	public JLabel getLblArtist() {
		return lblArtist;
	}

	public JLabel getLblSong() {
		return lblSong;
	}

	public ImageView getImage() {
		return image;
	}

}
