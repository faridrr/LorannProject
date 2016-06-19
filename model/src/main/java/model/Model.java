package model;

import java.awt.image.BufferedImage;
import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Observable;
import elements.*;

import elements.Lorann;
import contract.IElements;
import contract.IMobile;
import contract.IModel;
import contract.Permeability;

/**
 * The Class Model.
 *
 * @author Cattelan Montes Duffaut | Exia A1 Promo 2015
 */
public class Model extends Observable implements IModel, IMobile {

	/** The message. */
	int x;
	int y;
	int lvl = 1;
	private String message;
	List<IElements> Arimages = new ArrayList<IElements>();
	List<IMobile> Armobile = new ArrayList<IMobile>();

	public void createMap() throws SQLException {
		DAOConnection co = new DAOConnection(DBConnection.getInstance().getConnection());
		switch (lvl) {
		case 1:
			Lorann lorann = new Lorann(13, 7);
			Armobile.add(0, lorann);
			break;
		default:
			break;
		}
		for (x = 0; x < 22; x++) {
			for (y = 0; y < 14; y++) {
				char symbol = co.checkMap(x, y, lvl);
				switch (symbol) {
				case '+':
					VBone vbone = new VBone(x, y);
					Arimages.add(vbone);
					break;

				case '-':
					HBone hbone = new HBone(x, y);
					Arimages.add(hbone); // add() is a method that adds an
											// element on the ArrayList called
											// here "Arimage"
					//
					break;
				case '#':
					Corners corner = new Corners(x, y);
					Arimages.add(corner); // add() is a method that adds an
											// element on the ArrayList called
											// here "Arimage"
					//
					break;
				case 'x':
					Purse purse = new Purse(x, y);
					Arimages.add(purse); // add() is a method that adds an
											// element on the ArrayList called
											// here "Arimage"
					//
					break;
				case 'o':
					CrystalBall crystal = new CrystalBall(x, y);
					Arimages.add(crystal); // add() is a method that adds an
											// element on the ArrayList called
											// here "Arimage"
					//
					break;
				case '$':
					DoorC doorC = new DoorC(x, y);
					Arimages.add(doorC); // add() is a method that adds an
											// element on the ArrayList called
											// here "Arimage"
					//
					break;
				case '@':
					DoorO doorO = new DoorO(x, y);
					Arimages.add(doorO); // add() is a method that adds an
											// element on the ArrayList called
											// here "Arimage"
					//
					break;
				case '?':
					Black black = new Black(x, y);
					Arimages.add(black); // add() is a method that adds an
											// element on the ArrayList called
											// here "Arimage"
					break;
				case 'L':
					Lorann lorann = new Lorann(x, y);
					Armobile.add(0, lorann); // add() is a method that adds an
												// element on the ArrayList
												// called here "Arimage"
					break;
				case 'M':
					Monster1 monster1 = new Monster1(x, y);
					Armobile.add(1, monster1);
					break;
				case 'N':
					Monster2 monster2 = new Monster2(x, y);
					Armobile.add(2, monster2);
					break;
				case 'O':
					Monster3 monster3 = new Monster3(x, y);
					Armobile.add(3, monster3);
					break;
				case 'P':
					Monster4 monster4 = new Monster4(x, y);
					Armobile.add(4, monster4);
					break;

				default: // default action : if no one character have been
							// recognized, add nothing on the map
					break;
				}
			}
		}
	}

	public List<IElements> getArimages() {

		return this.Arimages;

	}

	public List<IMobile> getArmobile() {
		return this.Armobile;
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

	public void move(char c) {
		// TODO Auto-generated method stub

	}

	public int getX() {
		// TODO Auto-generated method stub
		return 0;
	}

	public void setX(int x) {
		// TODO Auto-generated method stub

	}

	public int getY() {
		// TODO Auto-generated method stub
		return 0;
	}

	public void setY(int y) {
		// TODO Auto-generated method stub

	}

	public Permeability getPerm() {
		// TODO Auto-generated method stub
		return null;
	}

	public BufferedImage Image() throws IOException {
		// TODO Auto-generated method stub
		return null;
	}

}
