package contract;

import java.awt.image.BufferedImage;
import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

/**
 * The Interface IController.
 *
 * @author Cattelan Montes Duffaut | Exia A1 Promo 2015
 */
public interface IController {

	/**
	 * Control.

	/**
	 * Order perform.
	 *
	 * @param controllerOrder
	 *          the controller order
	 * @throws IOException 
	 * @throws SQLException 
	 */
	public void orderPerform(ControllerOrder controllerOrder) throws IOException, SQLException;
	void getMap1() throws SQLException;

	public List<IElements> getArimages()throws SQLException ;
	public List<IMobile> getArmobile()throws SQLException ;
}
