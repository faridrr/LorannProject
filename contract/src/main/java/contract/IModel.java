package contract;

import java.awt.Image;
import java.awt.image.BufferedImage;
import java.util.List;
import java.util.Observable;

/**
 * The Interface IModel.
 *
 * @author Jean-Aymeric Diet
 */
public interface IModel {

	/**
	 * Gets the message.
	 *
	 * @return the message
	 */
	Image getMessage();

	/**
	 * Load the message.
	 *
	 * @param key
	 *          the key
	 */

	/**
	 * Gets the observable.
	 *
	 * @return the observable
	 */
	Observable getObservable();
	void moveL();
	void moveU();
	void moveD();
	void moveR();
	void launchSpell();
	
	void getImage();
}
