package elements;

import java.awt.Image;

import javax.swing.ImageIcon;

public class Purse extends Items{
	private int x;
	private int y;

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

	public void ImagePurse() {
		Image image = new ImageIcon("//view//sprite//Purse.png").getImage();
	}

}
