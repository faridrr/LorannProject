package contract;

import java.awt.event.KeyEvent;

/**
 * The Interface IView.
 *
 * @author Cattelan Montes Duffaut | Exia A1 Promo 2015
 */
public interface IView {

	/**
	 * Prints the message.
	 *
	 * @param message
	 *            the message
	 */
	void printMessage(final String message);

	void keyPressed(final KeyEvent e);
}
