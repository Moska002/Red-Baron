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

public class Window extends JFrame {

	private static final long serialVersionUID = -3511543085625008909L;
	
	private JPanel contentPane;
	private JPanel panel;
	private JPanel panel_1;
	private JPanel panel_2;
	private JScrollPane scrollPane;
	private JTextPane textPaneLyrics;
	private JTextField textFieldAuthor;
	private JTextField textFieldSong;
	private JButton btnSearch;

	/**
	 * Create the frame.
	 */
	public Window() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		panel = new JPanel();
		contentPane.add(panel, BorderLayout.CENTER);
		panel.setLayout(new BorderLayout(0, 0));
		
		panel_1 = new JPanel();
		panel.add(panel_1, BorderLayout.NORTH);
		
		textFieldAuthor = new JTextField();
		panel_1.add(textFieldAuthor);
		textFieldAuthor.setColumns(10);
		
		textFieldSong = new JTextField();
		panel_1.add(textFieldSong);
		textFieldSong.setColumns(10);
		
		btnSearch = new JButton("New button");
		panel_1.add(btnSearch);
		
		panel_2 = new JPanel();
		panel.add(panel_2, BorderLayout.CENTER);
		panel_2.setLayout(new BorderLayout(0, 0));
		
		scrollPane = new JScrollPane();
		panel_2.add(scrollPane, BorderLayout.CENTER);
		
		textPaneLyrics = new JTextPane();
		textPaneLyrics.setEditable(false);
		scrollPane.setViewportView(textPaneLyrics);
		
	}

	public JTextPane getTextPaneLyrics() {
		return textPaneLyrics;
	}

	public JTextField getTextFieldAuthor() {
		return textFieldAuthor;
	}

	public JTextField getTextFieldSong() {
		return textFieldSong;
	}

	public JButton getBtnSearch() {
		return btnSearch;
	}

}
