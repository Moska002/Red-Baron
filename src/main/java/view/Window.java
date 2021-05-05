package view;

import java.awt.BorderLayout;
import java.awt.Dimension;

import javax.swing.Box;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextPane;
import javax.swing.border.EmptyBorder;

/**
 *
 */
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
	private JPanel panel_3;
	private ImageView image;
	private Box verticalBox;
	private JLabel lblSong;
	private JLabel lblArtist;

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

		// bottone cerca
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

		panel_3 = new JPanel();
		panel_2.add(panel_3, BorderLayout.WEST);
		panel_3.setLayout(new BorderLayout(0, 0));

		image = new ImageView(new Dimension(100, 190));
		image.setLayout(null);
		panel_3.add(image, BorderLayout.NORTH);

		verticalBox = Box.createVerticalBox();
		panel_3.add(verticalBox, BorderLayout.SOUTH);

		lblSong = new JLabel("Canzone");
		verticalBox.add(lblSong);

		lblArtist = new JLabel("Artista");
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
