package view;

import java.awt.event.KeyEvent;

import javax.swing.SwingUtilities;

import contract.ControllerOrder;
import contract.IController;
import contract.IModel;
import contract.IView;

/**
 * The Class View.
 *
 * @author Cattelan Montes Duffaut | Exia A1 Promo 2015
 */
public class View implements IView, Runnable {

	/** The frame. */
	private final ViewFrame viewFrame;

	/**
	 * Instantiates a new view.
	 *
	 * @param model
	 *            the model
	 */
	public View(final IModel model) {
		this.viewFrame = new ViewFrame(model);
		SwingUtilities.invokeLater(this);
	}

	/**
	 * Key code to controller order.
	 *
	 * @param keyCode
	 *            the key code
	 * @return the controller order
	 */
	protected static ControllerOrder keyCodeToControllerOrder(final int keyCode) { // Controller
			
		switch (keyCode) {
		case KeyEvent.VK_RIGHT:
			return ControllerOrder.Right;
		case KeyEvent.VK_LEFT:
			return ControllerOrder.Left;
		case KeyEvent.VK_UP:
			return ControllerOrder.Up;
		case KeyEvent.VK_DOWN:
			return ControllerOrder.Down;
		case KeyEvent.VK_SPACE:
			return ControllerOrder.Spell;
		}
		return null;
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see contract.IView#printMessage(java.lang.String)
	 */
	public void printMessage(final String message) {
		this.viewFrame.printMessage(message);
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see java.lang.Runnable#run()
	 */
	public void run() {
		this.viewFrame.setVisible(true);
	}

	/**
	 * Sets the controller.
	 *
	 * @param controller
	 *            the new controller
	 */
	public void setController(final IController controller) {
		this.viewFrame.setController(controller);
	}

	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

}
