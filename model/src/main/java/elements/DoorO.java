package elements;

import java.awt.Image;

import javax.swing.ImageIcon;

public class DoorO extends Background {
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

	public void ImageB() {
		Image image = new ImageIcon("//view//sprite//lorann_b.png").getImage();
	}

	public void ImageBl() {
		Image image = new ImageIcon("//view//sprite//lorann_bl.png").getImage();
	}

}
