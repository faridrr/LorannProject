package model;

import java.sql.SQLException;
import java.util.Observable;
import elements.Character;
import contract.IModel;

/**
 * The Class Model.
 *
 * @author Jean-Aymeric Diet
 */
public class Model extends Observable implements IModel {

	/** The message. */
	private String message;
	private Character character;

	/**
	 * Instantiates a new model.
	 */
	public Model() {
		this.message = "Initialisation du jeu.";
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see contract.IModel#getMessage()
	 */
	public String getMessage() {
		return this.message;
	}

	/**
	 * Sets the message.
	 *
	 * @param message
	 *          the new message
	 */
	private void setMessage(final String message) {
		this.message = message;
		this.setChanged();
		this.notifyObservers();
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see contract.IModel#getMessage(java.lang.String)
	 */
	public void loadMessage(final String key) {
		try {
			final DAOLorann daoHelloWorld = new DAOLorann(DBConnection.getInstance().getConnection());
			this.setMessage(daoHelloWorld.find(key).getMessage());
		} catch (final SQLException e) {
			e.printStackTrace();
		}
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see contract.IModel#getObservable()
	 */
	public Observable getObservable() {
		return this;
	}

	public void moveR() {
		this.character.moveR();
		// TODO Auto-generated method stub
		
	}

	public void moveL() {
		// TODO Auto-generated method stub
		this.character.moveL();
	}

	public void moveU() {
		// TODO Auto-generated method stub
		this.character.moveU();
	}

	public void moveD() {
		// TODO Auto-generated method stub
		this.character.moveD();
	}

	public void launchSpell() {
		// TODO Auto-generated method stub
		this.character.launchSpell();
	}
}
