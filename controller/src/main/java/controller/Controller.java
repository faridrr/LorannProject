package controller;

import java.awt.event.KeyEvent;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import contract.ControllerOrder;
import contract.IController;
import contract.IElements;
import contract.IMobile;
import contract.IModel;
import contract.IView;

// TODO: Auto-generated Javadoc
/**
 * The Class Controller.
 */
public class Controller implements IController, IView{ // IController interface
													// implementation

	/** The view. */
	private IView view;

	/** The model. */
	private IModel model;

	/**
	 * Instantiates a new controller.
	 *
	 * @param view
	 *            the view
	 * @param model
	 *            the model
	 */
	public Controller(final IView view, final IModel model) { // Controller
																// constructor
		this.setView(view);
		this.setModel(model);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see contract.IController#control()\n
	 */
	public void control() {
		/*
		 * Example of Home display message : this.view.printMessage("Write the message you want to show here");
		 */
		this.view.printMessage("Welcome! Which level do you want? \nPlease press 1, 2, 3, 4 or 5 ");
	}

	/**
	 * Sets the view.
	 *
	 * @param view
	 *            the new view
	 */
	private void setView(final IView view) {
		this.view = view;
	}

	/**
	 * Sets the model.
	 *
	 * @param model
	 *            the new model
	 */
	private void setModel(final IModel model) {
		this.model = model;
	}
	

	/*
	 * (non-Javadoc)
	 *
	 * @see contract.IController#orderPerform(contract.ControllerOrder)
	 */
	
	public void orderPerform(final ControllerOrder controllerOrder) throws IOException, SQLException {
		switch (controllerOrder) {
		case Right:
			this.model.getArmobile().get(0).move('R');
			break;
		case Left:
			this.model.getArmobile().get(0).move('L');
			break;
		case Up:
			this.model.getArmobile().get(0).move('U');
			break;
		case Down:
			this.model.getArmobile().get(0).move('D');
			break;
		case Spell:
			this.model.getArmobile().get(0).launchSpell();
			break;

		default:
			break;
		}
	}

	public void getMap1() throws SQLException {
	}

	public List<IMobile> getArmobile(){
		List<IMobile> Armobile = new ArrayList<IMobile>();
		try {
			 Armobile = model.getArmobile();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return Armobile;
	}
	public void printMessage(String message) {
		// TODO Auto-generated method stub
		
	}

	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	public List<IElements> getArimages(){
		// TODO Auto-generated method stub
		return null;
	}
}
