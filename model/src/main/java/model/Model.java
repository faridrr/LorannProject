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
import javax.swing.ImageIcon;

import com.mysql.jdbc.CallableStatement;

import elements.Lorann;
import contract.IElements;
import contract.IMobile;
import contract.IModel;

/**
 * The Class Model.
 *
 * @author Cattelan Montes Duffaut | Exia A1 Promo 2015
 */
public class Model extends Observable implements IModel {

	/** The message. */
	private String message;
	private Lorann character;
	int x;
	int y;
	int lvl = 1;
	List<IElements> Arimages = new ArrayList<IElements>();

	public List<IElements> getArimages() {
		return Arimages;
	}

	public List<IElements> getMap1() throws SQLException {

		DAOConnection co = new DAOConnection(DBConnection.getInstance().getConnection());
		for (x = 0; x < 21; x++) {
			for (y = 0; y < 13; y++) {
				char symbol = co.checkMap(x, y, lvl);
				switch (symbol) {
				case '+':
					VBone vbone = new VBone(x, y);
					Arimages.add(vbone);
					break;
				case 'L':
					Lorann lorann = new Lorann(x, y);
					Arimages.add(lorann); // add() is a method that adds an element on the ArrayList called here "Arimage"
					break;

				case '-':
					HBone hbone = new HBone(x, y);
					Arimages.add(hbone); // add() is a method that adds an element on the ArrayList called here "Arimage"
					//
					break;
				case '#':
					Corners corner = new Corners(x, y);
					Arimages.add(corner); // add() is a method that adds an element on the ArrayList called here "Arimage"
					//
					break;
				case 'x':
					Purse purse = new Purse(x, y);
					Arimages.add(purse); // add() is a method that adds an element on the ArrayList called here "Arimage"
					//
					break;
				case 'o':
					CrystalBall crystal = new CrystalBall(x, y);
					Arimages.add(crystal); // add() is a method that adds an element on the ArrayList called here "Arimage"
					//
					break;
				case '$':
					DoorC doorC = new DoorC(x, y);
					Arimages.add(doorC); // add() is a method that adds an element on the ArrayList called here "Arimage"
					//
					break;
				case '@':
					DoorO doorO = new DoorO(x, y);
					Arimages.add(doorO); // add() is a method that adds an element on the ArrayList called here "Arimage"
					//
					break;
				case '?':
					Black black = new Black(x, y);
					Arimages.add(black); // add() is a method that adds an element on the ArrayList called here "Arimage"
					break;

				default: //default action : if no one character have been recognized, add nothing on the map
					break;
				}
			}

		}
		return Arimages;
	}

	public List<IMobile> getMobile() throws SQLException {

		return null;

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

	public void moveL() {
		// TODO Auto-generated method stub

	}

	public void moveU() {
		// TODO Auto-generated method stub

	}

	public void moveD() {
		// TODO Auto-generated method stub

	}

	public void moveR() {
		// TODO Auto-generated method stub

	}

	public void launchSpell() {
		// TODO Auto-generated method stub

	}

	public void move(char c) throws IOException {
		// TODO Auto-generated method stub

	}

	public int getX() {
		// TODO Auto-generated method stub
		return 0;
	}

	public void setX(int x) {
		// TODO Auto-generated method stub

	}

}
