package elements;

import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;

import contract.IElements;
import contract.IMobile;
import contract.IModel;
import contract.Permeability;

public class RainbowSpell extends Mobile implements IElements {
	private int x;
	private int y;
	private char c;
	boolean spelled = false;
	private IModel model;
	BufferedImage image;
	boolean wall;
	boolean lorann;
	Permeability checkPerm;
	List<IMobile> Armobile;

	Permeability perm = Permeability.SPELL;

	public RainbowSpell(int x, int y, char c, IModel model) {

		spelled = true;
		this.model = model;
		this.x = x;
		this.y = y;
		this.c = c;

	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public BufferedImage Image1() throws IOException {
		BufferedImage image = ImageIO.read(new File("src/main/resources/sprite/fireball_1.png"));
		return image;
	}

	public BufferedImage Image2() throws IOException {
		BufferedImage image = ImageIO.read(new File("src/main/resources/sprite/fireball_2.png"));
		return image;
	}

	public BufferedImage Image3() throws IOException {
		BufferedImage image = ImageIO.read(new File("src/main/resources/sprite/fireball_3.png"));
		return image;
	}

	public BufferedImage Image4() throws IOException {
		BufferedImage image = ImageIO.read(new File("src/main/resources/sprite/fireball_4.png"));
		return image;
	}

	public BufferedImage Image5() throws IOException {
		BufferedImage image = ImageIO.read(new File("src/main/resources/sprite/fireball_5.png"));
		return image;
	}

	public BufferedImage Image() throws IOException {
		// TODO Auto-generated method stub
		return image;
	}

	public Permeability getPerm() {
		// TODO Auto-generated method stub
		return null;
	}

	public void launchSpell(char c) {
		// TODO Auto-generated method stub

	}

	public void move(char c) {
		// TODO Auto-generated method stub

	}

	public void moveL() {

		if (this.wall == false) {
			if (this.model.checkBump(this.getX() + 1, this.getY()) == Permeability.MONSTER) {
				// kill monster
			} else if (this.model.checkBump(this.getX() + 1, this.getY()) == Permeability.CHARACTER) {
				Armobile.remove(this);
			} else if (this.model.checkBump(this.getX() + 1, this.getY()) == Permeability.PENETRABLE) {
				this.setX(this.getX() + 1);
			} else if (this.model.checkBump(this.getX() + 1, this.getY()) == Permeability.BLOCKING) {
				this.wall = true;
				this.setX(this.getX() - 1);

			} else if (this.model.checkBump(this.getX() + 1, this.getY()) == Permeability.COLLECTABLE) {
				this.setX(this.getX() - 1);
				this.wall = true;
			}
		}

		else if (this.wall == true) {
			if (this.model.checkBump(this.getX() + 1, this.getY()) == Permeability.MONSTER) {
				// kill monster
			} else if (this.model.checkBump(this.getX() - 1, this.getY()) == Permeability.CHARACTER) {
				Armobile.remove(this);
			} else if (this.model.checkBump(this.getX() - 1, this.getY()) == Permeability.PENETRABLE) {
				this.setX(this.getX() - 1);
			} else if (this.model.checkBump(this.getX() - 1, this.getY()) == Permeability.BLOCKING) {
				this.wall = false;
				this.setX(this.getX() + 1);

			} else if (this.model.checkBump(this.getX() - 1, this.getY()) == Permeability.COLLECTABLE) {
				this.setX(this.getX() + 1);
				this.wall = false;
			}
		}
	}

	public void moveU() {
		
		if (this.wall == false) {
			if (this.model.checkBump(this.getX(), this.getY() + 1) == Permeability.MONSTER) {
				// kill monster
			} else if (this.model.checkBump(this.getX(), this.getY() + 1) == Permeability.CHARACTER) {
				Armobile.remove(this);
			} else if (this.model.checkBump(this.getX(), this.getY() + 1) == Permeability.PENETRABLE) {
				this.setX(this.getY() + 1);
			} else if (this.model.checkBump(this.getX(), this.getY() + 1) == Permeability.BLOCKING) {
				this.wall = true;
				this.setX(this.getY() - 1);

			} else if (this.model.checkBump(this.getX(), this.getY() + 1) == Permeability.COLLECTABLE) {
				this.setX(this.getY() - 1);
				this.wall = true;
			}
		}

		else if (this.wall == true) {
			if (this.model.checkBump(this.getX(), this.getY()) == Permeability.MONSTER) {
				// kill monster
			} else if (this.model.checkBump(this.getX(), this.getY() - 1) == Permeability.CHARACTER) {
				Armobile.remove(this);
			} else if (this.model.checkBump(this.getX(), this.getY() - 1) == Permeability.PENETRABLE) {
				this.setX(this.getY() - 1);
			} else if (this.model.checkBump(this.getX(), this.getY() - 1) == Permeability.BLOCKING) {
				this.wall = false;
				this.setX(this.getY() + 1);

			} else if (this.model.checkBump(this.getX(), this.getY() - 1) == Permeability.COLLECTABLE) {
				this.setX(this.getY() + 1);
				this.wall = false;
			}
		}
	}

	public void moveR() {
		System.out.println(Armobile.indexOf("spell"));
		if (this.wall == false) {
			if (this.model.checkBump(this.getX() - 1, this.getY()) == Permeability.MONSTER) {
				// kill monster
			} else if (this.model.checkBump(this.getX() - 1, this.getY()) == Permeability.CHARACTER) {
				spelled = false;
				Armobile.remove(this);
			} else if (this.model.checkBump(this.getX() - 1, this.getY()) == Permeability.PENETRABLE) {
				this.setX(this.getX() - 1);
			} else if (this.model.checkBump(this.getX() - 1, this.getY()) == Permeability.BLOCKING) {
				this.wall = true;this.spelled = false;
				System.out.println(this.Armobile.indexOf("spell"));

			} else if (this.model.checkBump(this.getX() - 1, this.getY()) == Permeability.COLLECTABLE) {
				this.setX(this.getX() + 1);
				this.wall = true;
			}
		}

		else if (this.wall == true) {
			if (this.model.checkBump(this.getX() + 1, this.getY()) == Permeability.MONSTER) {
				// kill monster
			} else if (this.model.checkBump(this.getX() + 1, this.getY()) == Permeability.CHARACTER) {
				Armobile.remove(this);
			} else if (this.model.checkBump(this.getX() + 1, this.getY()) == Permeability.PENETRABLE) {
				this.setX(this.getX() + 1);
			} else if (this.model.checkBump(this.getX() + 1, this.getY()) == Permeability.BLOCKING) {
				this.wall = false;
				this.setX(this.getX() - 1);

			} else if (this.model.checkBump(this.getX() + 1, this.getY()) == Permeability.COLLECTABLE) {
				this.setX(this.getX() - 1);
				this.wall = false;
			}
		}
	}

	public void moveD() {

		if (this.wall == false) {
			if (this.model.checkBump(this.getX(), this.getY() - 1) == Permeability.MONSTER) {
				// kill monster
			} else if (this.model.checkBump(this.getX(), this.getY() - 1) == Permeability.CHARACTER) {
				Armobile.remove(this);
			} else if (this.model.checkBump(this.getX(), this.getY() - 1) == Permeability.PENETRABLE) {
				this.setX(this.getY() - 1);
			} else if (this.model.checkBump(this.getX(), this.getY() - 1) == Permeability.BLOCKING) {
				this.wall = true;
				this.setX(this.getY() + 1);

			} else if (this.model.checkBump(this.getX(), this.getY() - 1) == Permeability.COLLECTABLE) {
				this.setX(this.getY() + 1);
				this.wall = true;
			}
		}

		else if (this.wall == true) {
			if (this.model.checkBump(this.getX(), this.getY() + 1) == Permeability.MONSTER) {
				// kill monster
			} else if (this.model.checkBump(this.getX(), this.getY() + 1) == Permeability.CHARACTER) {
				Armobile.remove(this);
			} else if (this.model.checkBump(this.getX(), this.getY() + 1) == Permeability.PENETRABLE) {
				this.setX(this.getY() + 1);
			} else if (this.model.checkBump(this.getX(), this.getY() + 1) == Permeability.BLOCKING) {
				this.wall = false;
				this.setX(this.getY() - 1);

			} else if (this.model.checkBump(this.getX(), this.getY() + 1) == Permeability.COLLECTABLE) {
				this.setX(this.getY() - 1);
				this.wall = false;
			}
		}
	}

	public void move() {
		if (spelled == true) {
			try {
				image = Image1();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			switch (c) {

			case 'R':
				moveR();
				break;

			case 'L':
				moveL();
				break;
			case 'U':
				moveU();
				break;

			case 'D':
				moveD();
				break;
			}

		}
		// TODO Auto-generated method stub

	}

	public String getName() {
		// TODO Auto-generated method stub
		return null;
	}

	public List<IElements> getArimages() {
		// TODO Auto-generated method stub
		return null;
	}
}
