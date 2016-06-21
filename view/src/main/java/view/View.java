package view;

import java.awt.event.KeyEvent;
import java.util.List;

import javax.swing.SwingUtilities;

import contract.ControllerOrder;
import contract.IController;
import contract.IElements;
import contract.IMobile;
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
	protected static ControllerOrder keyCodeToControllerOrder(final int keyCode) { //KeyEvent which get back the enter
			
		switch (keyCode) {
		case KeyEvent.VK_NUMPAD6: //NUMPAD mean the number at the right of the keyboard
			return ControllerOrder.Right;
			
		case KeyEvent.VK_NUMPAD4:
			return ControllerOrder.Left;
			
		case KeyEvent.VK_NUMPAD8:
			return ControllerOrder.Up;
			
		case KeyEvent.VK_NUMPAD2:
			return ControllerOrder.Down;
			
		case KeyEvent.VK_NUMPAD9:
			return ControllerOrder.UpperRight;
			
		case KeyEvent.VK_NUMPAD7:
			return ControllerOrder.UpperLeft;
			
		case KeyEvent.VK_NUMPAD3:
			return ControllerOrder.LowerRight;
			
		case KeyEvent.VK_NUMPAD1:
			return ControllerOrder.LowerLeft;
		
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

	public List<IMobile> getArmobile() {
		// TODO Auto-generated method stub
		return null;
	}

	public List<IElements> getArimages() {
		// TODO Auto-generated method stub
		return null;
	}


	public void addArmobile(IMobile mobile) {
		// TODO Auto-generated method stub
		
	}

}
