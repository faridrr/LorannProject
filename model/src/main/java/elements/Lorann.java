package elements;

import java.awt.event.KeyEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Observable;

import javax.imageio.ImageIO;

import contract.ControllerOrder;
import contract.IElements;
import contract.IMobile;
import contract.IModel;
import contract.IView;
import contract.Permeability;
import model.Model;

import java.sql.SQLException;

public class Lorann extends Mobile {
	private int x;
	private int y;
	private IModel model;
	char c;
	List<IElements> Arimages = new ArrayList<IElements>();
	BufferedImage image;

	public Lorann(int x, int y, IModel model) throws SQLException {
		this.model = model;
		this.Arimages = this.model.getArimages();
		this.x = x;
		this.y = y;

		try {
			this.image = ImageIO.read(new File("src/main/resources/sprite/lorann_b.png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

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

	public void move(char c) throws IOException, SQLException {

		switch (c) {
		case 'R':
			this.image = ImageR();
			this.c = c;

			for (IElements obj : this.Arimages) {
				if ((obj.getX() == this.getX() + 1) && (obj.getY() == this.getY())) {
					if (obj.getPerm() == Permeability.PENETRABLE) {
						this.setX(getX() + 1);
						break;
					} else if (obj.getPerm() == Permeability.COLLECTABLE) {
						this.setX(getX() + 1);
						IElements black = new Black(obj.getX(), obj.getY());

						Arimages.set(Arimages.indexOf(obj), black);
						break;
					}

				}
			}
			break;

		case 'L':
			this.image = ImageL();
			this.c = c;

			for (IElements obj : this.Arimages) {
				if ((obj.getX() == this.getX() - 1) && (obj.getY() == this.getY())) {
					if (obj.getPerm() == Permeability.PENETRABLE) {
						this.setX(getX() - 1);
						break;
					} else if (obj.getPerm() == Permeability.COLLECTABLE) {
						this.setX(getX() - 1);
						IElements black = new Black(obj.getX(), obj.getY());

						Arimages.set(Arimages.indexOf(obj), black);
						break;
					}

				}
			}
			break;

		case 'U':
			this.image = ImageU();
			this.c = c;

			for (IElements obj : this.Arimages) {
				if ((obj.getY() == this.getY() - 1) && (obj.getX() == this.getX())) {
					if (obj.getPerm() == Permeability.PENETRABLE) {
						this.setY(getY() - 1);
						break;
					} else if (obj.getPerm() == Permeability.COLLECTABLE) {
						this.setY(getY() - 1);
						IElements black = new Black(obj.getX(), obj.getY());

						Arimages.set(Arimages.indexOf(obj), black);
						break;
					}

				}
			}
			break;

		case 'D':
			this.image = ImageD();
			this.c = c;

			for (IElements obj : this.Arimages) {
				if ((obj.getY() == this.getY() + 1) && (obj.getX() == this.getX())) {
					if (obj.getPerm() == Permeability.PENETRABLE) {
						this.setY(getY() + 1);
						break;
					} else if (obj.getPerm() == Permeability.COLLECTABLE) {
						this.setY(getY() + 1);
						IElements black = new Black(obj.getX(), obj.getY());

						Arimages.set(Arimages.indexOf(obj), black);
						break;
					}

				}
			}
			break;

		default:
			break;

		}
	}

	public BufferedImage ImageD() throws IOException {
		image = ImageIO.read(new File("src/main/resources/sprite/lorann_b.png"));
		return image;
	}

	public BufferedImage ImageDl() throws IOException {
		image = ImageIO.read(new File("src/main/resources/sprite/lorann_b1.png"));
		return image;
	}

	public BufferedImage ImageDr() throws IOException {
		image = ImageIO.read(new File("src/main/resources/sprite/lorann_br.png"));
		return image;
	}

	public BufferedImage ImageL() throws IOException {
		image = ImageIO.read(new File("src/main/resources/sprite/lorann_l.png"));
		return image;
	}

	public BufferedImage ImageR() throws IOException {
		image = ImageIO.read(new File("src/main/resources/sprite/lorann_r.png"));
		return image;
	}

	public BufferedImage ImageU() throws IOException {
		image = ImageIO.read(new File("src/main/resources/sprite/lorann_u.png"));
		return image;
	}

	public BufferedImage ImageUl() throws IOException {
		image = ImageIO.read(new File("src/main/resources/sprite/lorann_ul.png"));
		return image;
	}

	public BufferedImage ImageUr() throws IOException {
		image = ImageIO.read(new File("src/main/resources/sprite/lorann_ur.png"));
		return image;
	}

	public BufferedImage Image() throws IOException {
		return image;

	}

	public Permeability getPerm() {
		// TODO Auto-generated method stub
		return null;
	}

	public void launchSpell() {
		RainbowSpell spell = new RainbowSpell(this.getX(), this.getY(), this.c);

		// TODO Auto-generated method stub

	}

	public void getMessage() {
		// TODO Auto-generated method stub

	}

	public Observable getObservable() {
		// TODO Auto-generated method stub
		return null;
	}

	public void getMap1() throws SQLException {
		// TODO Auto-generated method stub
	}

	public void control() {
		// TODO Auto-generated method stub

	}

	public void orderPerform(ControllerOrder controllerOrder) throws IOException, SQLException {
		// TODO Auto-generated method stub

	}

	public void printMessage(String message) {
		// TODO Auto-generated method stub

	}

	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub

	}

	public List<IMobile> getArmobile() {
		// TODO Auto-generated method stub
		return null;
	}

	public List<IElements> getArimages() {
		// TODO Auto-generated method stub
		return null;
	}

}
