package model;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Observable;
import elements.*;

import javax.imageio.ImageIO;

import com.mysql.jdbc.CallableStatement;

import elements.Lorann;
import contract.IElements;
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
	int x;
	int y;

	public List<IElements> getMap1() throws SQLException {

		List<IElements> Arimages = new ArrayList<IElements>();
		DAOConnection co = new DAOConnection(DBConnection.getInstance().getConnection());
		for (x = 0; x < 21; x++) {
			for (y = 0; y < 13; y++) {
				char symbol = co.checkMap(x, y);
				switch (symbol) {
				case '+':
					VBone vbone = new VBone(x, y);
					Arimages.add(vbone);
					break;
				case '-':
					HBone hbone = new HBone(x, y);
					Arimages.add(hbone);
					//
					break;
				case '#':
					Corners corner = new Corners(x, y);
					Arimages.add(corner);
					//
					break;
				case 'x':
					Purse purse = new Purse(x, y);
					Arimages.add(purse);
					//
					break;
				case 'o':
					CrystalBall crystal = new CrystalBall(x, y);
					Arimages.add(crystal);
					//
					break;
				case '$':
					DoorC doorC = new DoorC(x, y);
					Arimages.add(doorC);
					//
					break;
				case '@':
					DoorO doorO = new DoorO(x, y);
					Arimages.add(doorO);
					//
					break;
				case '?':
					Black black = new Black(x, y);
					Arimages.add(black);
					break;
				default:
					break;
				}
			}

		}

		return Arimages;
	}

	/**
	 * Instantiates a new model.
	 */
	public Model() {
		this.message = "Initialisation du jeu.";
	}

	public void getMessage() {

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
