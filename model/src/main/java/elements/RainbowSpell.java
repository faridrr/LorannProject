package elements;

import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;

import contract.IModel;
import contract.Permeability;

public class RainbowSpell extends Mobile {
	private int x;
	private int y;
	private char c;
	boolean spelled = false;
	private IModel model;
	BufferedImage image;

	Permeability perm = Permeability.SPELL;

	public RainbowSpell(int x, int y, char c, IModel model) {
		spelled = true;
		this.model = model;
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
	public void move(char c) throws IOException {
		// TODO Auto-generated method stub

	}

	public void move() {
		if (spelled == true) {
			switch (c) {
			case 'R':
				if (this.model.checkBump(this.getX() - 1, this.getY()) == false) {
					this.setX(x--);
				}
				break;

			case 'L':
				if (this.model.checkBump(this.getX() + 1, this.getY()) == false) {
					this.setX(x++);
				}
				break;

			case 'D':
				if (this.model.checkBump(this.getX(), this.getY() - 1) == false) {
					this.setY(y--);
				}
				break;

			case 'U':
				if (this.model.checkBump(this.getX(), this.getY() + 1) == false) {
					this.setY(y++);
				}
				break;
			default:
				break;

			}

		}
		// TODO Auto-generated method stub

	}
}
