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
public class Controller implements IController{ // IController interface
													// implementation

	/** The view. */
	private IView view;

	/** The model. */
	private IModel model;
	private char c;

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
		//this.view.printMessage("Welcome! Which level do you want? \nPlease press 1, 2, 3, 4 or 5 ");
		this.view.LevelChoice("Welcome! Which level do you want? \nPlease press 1, 2, 3, 4 or 5 ");
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
			this.c = 'R';
			this.model.getArmobile().get(0).move(c);
			break;
			
		case Left:
			this.c = 'L';
			this.model.getArmobile().get(0).move(c);
			break;
			
		case Up:
			this.c = 'U';
			this.model.getArmobile().get(0).move(c);
			break;
			
		case Down:
			this.c = 'D';
			this.model.getArmobile().get(0).move(c);
			break;
			
		case UpperRight:
			this.c = '9';
			this.model.getArmobile().get(0).move(c);
			break;
			
		case UpperLeft:
			this.c = '7';
			this.model.getArmobile().get(0).move(c);
			break;
			
		case LowerRight:
			this.c = '3';
			this.model.getArmobile().get(0).move(c);
			break;
			
		case LowerLeft:
			this.c = '1';
			this.model.getArmobile().get(0).move(c);
			break;
			
		case Spell:
			this.model.getArmobile().get(0).launchSpell(c);
			break;

		default:
			break;
		}
	}

	public void getMap1() throws SQLException {
	}

	public List<IMobile> getArmobile(){
		
		return null;
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
