package view;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.geom.AffineTransform;

import javax.swing.JPanel;

/**
 * 
 * Classe che gestisce i frame in maniera dinamica
 * 
 * @author Alessandro Moscatelli
 *
 */
public class ImageView extends JPanel {

	private static final long serialVersionUID = -794328180373293223L;
	private Image img;

	/**
	 * Metodo costruttore della classe
	 */
	public ImageView() {
		super();
	}
	
	/**
	 * Metodo costruttore della classe
	 * 
	 * @param maxSize Dimensione massima della finestra
	 */
	public ImageView(Dimension maxSize) {
		super();
		setMaximumSize(maxSize);
	}

	/**
	 * Il metodo da visualizzare un'immagine e aggiorna il pannello
	 * 
	 * @param value Immagine da visualizzare
	 */
	public void setImage(Image value) {
		if (img != value) {
			Image old = img;
			this.img = value;
			firePropertyChange("image", old, img);
			revalidate();
			repaint();
		}
	}

	
	@Override
	public Dimension getPreferredSize() {
		Dimension max = getMaximumSize();

		if (img != null) {
			Dimension dimImg = new Dimension(img.getWidth(this), img.getHeight(this));

			if (dimImg.getWidth() >= max.getWidth() || dimImg.getHeight() >= max.getHeight()) {
				return max;
			} else {
				return dimImg;
			}
		} else {
			return max;
		}
	}

	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);

		Graphics2D g2d = (Graphics2D) g.create();
		if (img != null) {

			int width = getWidth();
			int height = getHeight();

			double scaleFactor = getScaleFactorToFit(new Dimension(img.getWidth(this), img.getHeight(this)), getSize());

			int x = (int) ((width - (img.getWidth(this) * scaleFactor)) / 2);
			int y = (int) ((height - (img.getHeight(this) * scaleFactor)) / 2);

			AffineTransform at = new AffineTransform();
			at.translate(x, y);
			at.scale(scaleFactor, scaleFactor);
			g2d.setTransform(at);
			g2d.drawImage(img, 0, 0, this);
			g2d.dispose();
		} else {
			g2d.fillRect(0, 0, WIDTH, HEIGHT);
		}
	}
	/**
	 * 
	 * Ritorna il rapporto di scala
	 * 
	 * @param iMasterSize Dimensione
	 * @param iTargetSize Dimensione scalata
	 * @return Rapporto
	 */
	public double getScaleFactor(int iMasterSize, int iTargetSize) {

		return (double) iTargetSize / (double) iMasterSize;

	}
	/**
	 * 
	 * Ritorna il rapporto di scala per adattare le immagini al pannello
	 * 
	 * @param original Dimensioni originali
	 * @param toFit	Dimensioni bersaglio
	 * @return Rapporto di scala
	 */
	public double getScaleFactorToFit(Dimension original, Dimension toFit) {

		double dScale = 1d;

		if (original != null && toFit != null) {

			double dScaleWidth = getScaleFactor(original.width, toFit.width);
			double dScaleHeight = getScaleFactor(original.height, toFit.height);

			dScale = Math.min(dScaleHeight, dScaleWidth);

		}

		return dScale;

	}

}
