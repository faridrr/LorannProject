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

	Observable getObservable();
	int getX();
	void setX(int x);

	void launchSpell();

	List<IElements> getMap1() throws SQLException;

	void move(char c) throws IOException;
}
