package model;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Observable;
import java.util.TimerTask;

import javax.swing.JOptionPane;
import javax.swing.Timer;

import org.junit.experimental.theories.Theories;

import elements.*;
import contract.IElements;
import contract.IMobile;
import contract.IModel;
import contract.Permeability;

/**
 * The Class Model.
 *
 * @author Cattelan Montes Duffaut | Exia A1 Promo 2015
 */

public class Model extends Observable implements IModel, IMobile, IElements {

	int x;
	int y;
	int delay = 0;
	int period = 0;
	int lvl;
	private Permeability permBump = Permeability.BLOCKING;
	private String message;
	List<IElements> Arimages;
	List<IMobile> Armobile;

	public int LevelSelection() {
		int level = 6;
		String[] TabLvl = { "1", "2", "3", "4", "5" };
		JOptionPane jop = new JOptionPane();
		while (level == 6) {

			level = jop.showOptionDialog(null, "Welcome! Which level do you want? ", "Level selection",
					JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null, TabLvl, TabLvl[0]);
		}

		return level;

	}

	public void createMap(int lvl) throws SQLException {

		DAOConnection co = new DAOConnection(DBConnection.getInstance().getConnection());
		Arimages = new ArrayList<IElements>();
		Armobile = new ArrayList<IMobile>();
		this.lvl = lvl;

		switch (lvl) {
		case 1:
			Lorann lorann1 = new Lorann(13, 7, this);
			Armobile.add(lorann1);

			break;
		case 2:
			// add Loran :
			Lorann lorann2 = new Lorann(13, 7, this);
			Armobile.add(lorann2);

			// add the monster (4,19,"M"),
			Monster1 monster1 = new Monster1(19, 4, this);
			Armobile.add(monster1);

			break;

		case 3:
			// add Loran :
			Lorann lorann3 = new Lorann(15, 9, this);
			Armobile.add(lorann3);

			// add the monsters:
			Monster4 monster2 = new Monster4(19, 4, this);
			Armobile.add(monster2);

			Monster2 monster3 = new Monster2(5, 10, this);
			Armobile.add(monster3);

			Monster1 monster4 = new Monster1(8, 6, this);
			Armobile.add(monster4);

			break;

		case 4:
			// add Loran :
			Lorann lorann4 = new Lorann(11, 1, this);
			Armobile.add(lorann4);

			// add the monsters:
			Monster4 monster5 = new Monster4(7, 9, this);
			Armobile.add(monster5);

			Monster2 monster6 = new Monster2(12, 9, this);
			Armobile.add(monster6);

			break;

		case 5:
			// add Loran :
			Lorann lorann5 = new Lorann(18, 6, this);
			Armobile.add(lorann5);

			// add the monsters:
			Monster3 monster7 = new Monster3(8, 6, this);
			Armobile.add(monster7);

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
					Arimages.add(vbone); // add() is a method that adds an
											// element on the ArrayList called
											// here "Arimage"
					break;

				case '-':
					HBone hbone = new HBone(x, y);
					Arimages.add(hbone); // add() is a method that adds an
											// element on the ArrayList called
											// here "Arimage"
					break;

				case '#':
					Corners corner = new Corners(x, y);
					Arimages.add(corner); // add() is a method that adds an
											// element on the ArrayList called
											// here "Arimage"
					break;

				case 'x':
					Purse purse = new Purse(x, y);
					Arimages.add(purse); // add() is a method that adds an
											// element on the ArrayList called
											// here "Arimage"
					break;

				case 'o':
					CrystalBall crystal = new CrystalBall(x, y);
					Arimages.add(crystal); // add() is a method that adds an
											// element on the ArrayList called
											// here "Arimage"
					break;

				case '@':
					DoorO doorO = new DoorO(x, y);
					Arimages.add(doorO); // add() is a method that adds an
											// element on the ArrayList called
											// here "Arimage"
					break;

				case '$':
					DoorC doorC = new DoorC(x, y);
					Arimages.add(doorC); // add() is a method that adds an
											// element on the ArrayList called
											// here "Arimage"
					break;

				default:
					Black black = new Black(x, y);
					Arimages.add(black);
					break;

				}
			}
		}
	}

	public List<IElements> getArimages() {

		return this.Arimages;

	}

	public Permeability checkBump(int x, int y) {
		Permeability permBump = null;

		for (IElements obj : Arimages) {
			if ((obj.getX() == x) && (obj.getY() == y)) {
				if (obj.getPerm() == Permeability.PENETRABLE) {
					return this.permBump = Permeability.PENETRABLE;
				} else {
					if (obj.getPerm() == Permeability.CHARACTER) {
						 this.permBump = Permeability.CHARACTER;
					} else if (obj.getPerm() == Permeability.MONSTER) {
						 this.permBump = Permeability.MONSTER;
					} else if (obj.getPerm() == Permeability.SPELL) {
						 this.permBump = Permeability.SPELL;
					} else if (obj.getPerm() == Permeability.BLOCKING) {
						 this.permBump = Permeability.BLOCKING;
					} else if (obj.getPerm() == Permeability.COLLECTABLE) {
						 this.permBump = Permeability.COLLECTABLE;
					}

				}
			}
		}
		return this.permBump;

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

	public void launchSpell(char c) {
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

	public int getLvl() {
		return lvl;
	}

	public void move() {
		// TODO Auto-generated method stub

	}

	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub

	}

	public void refresh() {
		// TODO Auto-generated method stub

	}

	public void launchSpell() {
		// TODO Auto-generated method stub

	}

	public int LevelChoice(String message) {
		// TODO Auto-generated method stub
		return 0;
	}

	public Permeability checkPermBump() {
		// TODO Auto-generated method stub
		return null;
	}

	public void addArmobile(IMobile mobile){
		this.Armobile.add(mobile);
	}
	
	public void delArmobile(IMobile mobile){
		this.Armobile.remove(mobile);
	}

}
