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
import java.util.Timer;

/**
 * The Class Model.
 *
 * @author Cattelan Montes Duffaut | Exia A1 Promo 2015
 */

public class Model extends Observable implements IModel, IMobile, IElements {

	Timer timer = new Timer();

	int x;
	int y;
	int lvl;
	private String message;
	List<IElements> Arimages;
	List<IMobile> Armobile;

	public void createMap(int lvl) throws SQLException {
		DAOConnection co = new DAOConnection(DBConnection.getInstance().getConnection());
		Arimages = new ArrayList<IElements>();
		Armobile = new ArrayList<IMobile>();
		this.lvl = lvl;

		switch (lvl) {
		case 1:
			Lorann lorann1 = new Lorann(13, 7, this);
			Armobile.add(0, lorann1);
			break;
		case 2:
			Lorann lorann2 = new Lorann(13, 7, this);
			Armobile.add(0, lorann2);
			break;

		case 3:
			Lorann lorann3 = new Lorann(15, 9, this);
			Armobile.add(0, lorann3);
			break;

		case 4:
			Lorann lorann4 = new Lorann(11, 1, this);
			Armobile.add(0, lorann4);
			break;

		case 5:
			Lorann lorann5 = new Lorann(18, 6, this);
			Armobile.add(0, lorann5);
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
					Arimages.add(0, vbone);
					break;

				case '-':
					HBone hbone = new HBone(x, y);
					Arimages.add(1, hbone); // add() is a method that adds an
											// element on the ArrayList called
											// here "Arimage"
					//
					break;
				case '#':
					Corners corner = new Corners(x, y);
					Arimages.add(2, corner); // add() is a method that adds an
												// element on the ArrayList
												// called
												// here "Arimage"
					//
					break;
				case 'x':
					Purse purse = new Purse(x, y);
					Arimages.add(3, purse); // add() is a method that adds an
											// element on the ArrayList called
											// here "Arimage"
					//
					break;
				case 'o':
					CrystalBall crystal = new CrystalBall(x, y);
					Arimages.add(4, crystal); // add() is a method that adds an
												// element on the ArrayList
												// called
												// here "Arimage"
					//
					break;

				case '@':
					DoorO doorO = new DoorO(x, y);
					Arimages.add(5, doorO); // add() is a method that adds an
											// element on the ArrayList called
											// here "Arimage"
					//
					break;
				case '$':
					DoorC doorC = new DoorC(x, y);
					Arimages.add(6, doorC); // add() is a method that adds an
											// element on the ArrayList called
											// here "Arimage"
					//
					break;

				case 'M':
					Monster1 monster1 = new Monster1(x, y,this);
					Armobile.add(1, monster1);
					break;
				case 'N':
					Monster2 monster2 = new Monster2(x, y,this);
					Armobile.add(2, monster2);
					break;
				case 'O':
					Monster3 monster3 = new Monster3(x, y,this);
					Armobile.add(3, monster3);
					break;
				case 'P':
					Monster4 monster4 = new Monster4(x, y,this);
					Armobile.add(4, monster4);
					break;

				default:
					Black black = new Black(x, y);
					Arimages.add(black); // add() is a method that adds an
					// element on the ArrayList called
					// here "Arimage"
					break;
				}
			}
		}
	}

	public List<IElements> getArimages() {

		return this.Arimages;

	}
	
	public void getMoves(){
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

	public String getName() {
		// TODO Auto-generated method stub
		return null;
	}
	
	public int getLvl(){
		return lvl;
	}

	public void move() {
		// TODO Auto-generated method stub
		
	}

}
