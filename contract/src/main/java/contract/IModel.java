package contract;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
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
	void getMessage();

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
	List<BufferedImage> getMap1() throws SQLException;
}
