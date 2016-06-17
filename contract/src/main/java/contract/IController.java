package contract;

import java.awt.image.BufferedImage;
import java.util.List;

/**
 * The Interface IController.
 *
 * @author Cattelan Montes Duffaut | Exia A1 Promo 2015
 */
public interface IController {

	/**
	 * Control.
	 */
	public void control();

	/**
	 * Order perform.
	 *
	 * @param controllerOrder
	 *          the controller order
	 */
	public void orderPerform(ControllerOrder controllerOrder);
	List<BufferedImage> getMap1();
}
