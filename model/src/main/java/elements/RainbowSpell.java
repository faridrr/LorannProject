package elements;

import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
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

	public void Image1() throws IOException {
		BufferedImage fireball_1 = ImageIO.read(new File("src/main/resources/sprite/fireball_1.png"));
	}

	public void Image2() throws IOException {
		BufferedImage fireball_2 = ImageIO.read(new File("src/main/resources/sprite/fireball_2.png"));
	}

	public void Image3() throws IOException {
		BufferedImage fireball_3 = ImageIO.read(new File("src/main/resources/sprite/fireball_3.png"));
	}

	public void Image4() throws IOException {
		BufferedImage fireball_4 = ImageIO.read(new File("src/main/resources/sprite/fireball_4.png"));
	}

	public void Image5() throws IOException {
		BufferedImage fireball_5 = ImageIO.read(new File("src/main/resources/sprite/fireball_5.png"));
	}
}
