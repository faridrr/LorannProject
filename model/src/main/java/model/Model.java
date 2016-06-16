package model;

import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Observable;

import javax.imageio.ImageIO;

import elements.Lorann;
import contract.IModel;

/**
 * The Class Model.
 *
 * @author Jean-Aymeric Diet
 */
public class Model extends Observable implements IModel {

	/** The message. */
	private String message;
	private Lorann character;
	BufferedImage bone;
	BufferedImage corner;
	List<BufferedImage> Arimages = new ArrayList<BufferedImage>();

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
	public void initImages() {
		try {
			bone = ImageIO.read(new File("src/main/resources/sprite/bone.png"));
			corner = ImageIO.read(new File("src/main/resources/sprite/crystal_ball.png"));
			Arimages.add(corner);
			Arimages.add(bone);
		} catch (

		IOException e)

		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public Image getMessage() {
		

		return bone;
	}

	/**
	 * Sets the message.
	 *
	 * @param message
	 *            the new message
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
		this.character.launchSpell(character);
		// TODO Auto-generated method stub

	}
}
