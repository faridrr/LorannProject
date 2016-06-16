package elements;

import java.awt.Image;

import javax.swing.ImageIcon;

public class Character extends Mobile {
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

	public void launchSpell() {

	}

	public void ImageB() {
		Image image = new ImageIcon("//view//sprite//lorann_b.png").getImage();
	}

	public void ImageBl() {
		Image image = new ImageIcon("//view//sprite//lorann_bl.png").getImage();
	}

	public void ImageBr() {
		Image image = new ImageIcon("//view//sprite//lorann_br.png").getImage();
	}

	public void ImageL() {
		Image image = new ImageIcon("//view//sprite//lorann_l.png").getImage();
	}

	public void ImageR() {
		Image image = new ImageIcon("//view//sprite//lorann_r.png").getImage();
	}

	public void ImageU() {
		Image image = new ImageIcon("//view//sprite//lorann_u.png").getImage();
	}

	public void ImageUl() {
		Image image = new ImageIcon("//view//sprite//lorann_ul.png").getImage();
	}

	public void ImageUr() {
		Image image = new ImageIcon("//view//sprite//lorann_ur.png").getImage();
	}
}
