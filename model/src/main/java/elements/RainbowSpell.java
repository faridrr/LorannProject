package elements;

import java.awt.Image;

import javax.swing.ImageIcon;

public class RainbowSpell extends Mobile {
	private int x;
	private int y;

	public RainbowSpell(Lorann character, char c) {
		x = character.getX();
		y = character.getY();
		
		if (c == 'R') {
// TODO 
		} else if (c == 'L') {
// TODO
		} else if (c == 'D') {
// TODO
		} else if (c == 'U') {
// TODO
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

	public void Image1() {
		Image image = new ImageIcon("//view//sprite//fireball_1.png").getImage();
	}

	public void Image2() {
		Image image = new ImageIcon("//view//sprite//fireball_2.png").getImage();
	}

	public void Image3() {
		Image image = new ImageIcon("//view//sprite//fireball_3.png").getImage();
	}

	public void Image4() {
		Image image = new ImageIcon("//view//sprite//fireball_4.png").getImage();
	}

	public void Image5() {
		Image image = new ImageIcon("//view//sprite//fireball_5.png").getImage();
	}
}
