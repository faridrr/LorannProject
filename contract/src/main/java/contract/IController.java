package contract;

/**
 * The Interface IController.
 *
 * @author Cattelan Montes Duffaut | Exia A1 Promo 2016
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
}
