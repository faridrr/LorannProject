package contract;

import java.util.List;
import java.awt.event.KeyEvent;

/**
 * The Interface IView.
 *
 * @author Cattelan Montes Duffaut | Exia A1 Promo 2015
 */
public interface IView {

	public List<IMobile> getArmobile();
	public List<IElements> getArimages();

	/**
	 * Prints the message.
	 *
	 * @param message
	 *            the message
	 */
	//void printMessage(final String message);

	void keyPressed(final KeyEvent e);
}
