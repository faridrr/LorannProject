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
 * @author Cattelan Montes Duffaut | Exia A1 Promo 2015
 */
public interface IModel {


	/**
	 * Gets the message.
	 *
	 * @return the message
	 */
	void getMessage();
	void addArmobile(IMobile mobile);
	Observable getObservable();
	int getX();
	void setX(int x);
	int getLvl();
	void createMap(int lvl) throws SQLException;
	 public void refresh();

	void launchSpell();


	void move(char c) throws IOException, SQLException;

	List<IElements> getArimages() throws SQLException;

	List<IMobile> getArmobile() throws SQLException;

	Permeability checkBump(int x, int y);
}
