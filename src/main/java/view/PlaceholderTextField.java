package view;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;

import javax.swing.JTextField;
import javax.swing.text.Document;

/**
 * 
 * @author Moscatelli
 * @author Silvello 
 * 
 * Classe che implementa un componenete grafico placeholder
 *
 */
public class PlaceholderTextField extends JTextField {

	private static final long serialVersionUID = 3604111637077723730L;
	private String placeholder;

    public PlaceholderTextField() {}

    public PlaceholderTextField(final Document pDoc, final String pText, final int pColumns){
        super(pDoc, pText, pColumns);
    }

    public PlaceholderTextField(final int pColumns) {
        super(pColumns);
    }

    public PlaceholderTextField(final String pText) {
        super(pText);
    }

    public PlaceholderTextField(final String pText, final int pColumns) {
        super(pText, pColumns);
    }
    /**
     * Metodo che torna un placeholder
     * 
     * @return Oggetto placeholder
     */
    public String getPlaceholder() {
        return placeholder;
    }
    /**
     * Metodo che imposta le caratteristiche del placeholder
     * 
     */
    @Override
    protected void paintComponent(Graphics pG) {
        super.paintComponent(pG);

        if (placeholder == null || placeholder.length() == 0 || getText().length() > 0) {
            return;
        }

        final Graphics2D g = (Graphics2D) pG;
        g.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        g.setColor(getDisabledTextColor());
        g.drawString(placeholder, getInsets().left, pG.getFontMetrics()
            .getMaxAscent() + getInsets().top);
    }
    /**
     * Metodo che imposta il testo del placeholder
     * 
     * @param s Stringa da impostare 
     */
    public void setPlaceholder(final String s) {
        placeholder = s;
    }

}