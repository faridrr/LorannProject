package controller;

import java.awt.image.BufferedImage;
import java.io.IOException;
import java.sql.SQLException;
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
public class Controller implements IController { // IController interface
													// implementation

	/** The view. */
	private IView view;

	/** The model. */
	private IModel model;
	private IMobile mobile;

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
	 * @see contract.IController#control()
	 */
	public void control() {
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
	public void orderPerform(final ControllerOrder controllerOrder) throws IOException {
		switch (controllerOrder) {
		case Right:
			this.mobile.move('R');
			break;
		case Left:
			this.mobile.move('L');
			break;
		case Up:
			this.mobile.move('U');
			break;
		case Down:
			this.mobile.move('D');
			break;
		case Spell:
			this.mobile.launchSpell();
			break;

		default:
			break;
		}
	}

	public List<IElements> getMap1() throws SQLException {
		return this.model.getMap1();
	}
}
