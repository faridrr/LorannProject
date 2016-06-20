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
	private IElements elements;
	char c;
	List<IElements> Arimages = new ArrayList<IElements>();
	BufferedImage image;

	public Lorann(int x, int y) throws SQLException {
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
		Arimages = this.elements.getArimages();

		switch (c) {
		case 'R':
			for (IElements obj : Arimages) {
				if (this.getX() + 1 != obj.getX() && this.getY() == obj.getY()) {
					if (obj.getPerm() == Permeability.PENETRABLE) {
						this.setX(getX() + 1);
						this.image = ImageR();
						this.c = c;
					}
				}
			}
			break;
		case 'L':
			for (IElements obj : Arimages) {
				if ((this.getX() - 1 != obj.getX()) && this.getY() == obj.getY()) {
					if (obj.getPerm() == Permeability.PENETRABLE) {
					this.setX(getX() - 1);
					this.image = ImageR();
					this.c = c;
					}
				}
			}
			break;
		case 'U':
			
			for (IElements obj : Arimages) {
				if (this.getX() == obj.getX() && this.getY() - 1 != obj.getY()) {
					if (obj.getPerm() == Permeability.PENETRABLE) {
						this.setY(getY() - 1);
						this.image = ImageU();
						this.c = c;
					}
				}
			}
			break;
		case 'D':
			
			for (IElements obj : Arimages) {
				if (this.getX() == obj.getX() && this.getY() + 1 != obj.getY()) {
					if (obj.getPerm() == Permeability.PENETRABLE) {			
						this.setY(getY() + 1);
						this.image = ImageD();
						this.c = c;
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
