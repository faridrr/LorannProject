package elements;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import contract.Permeability;

public class Black extends Background {
	private int x;
	private int y;

	public Black(int x, int y) {

		this.x = x;
		this.y = y;

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

	public BufferedImage Image() throws IOException {
		BufferedImage black = ImageIO.read(new File("src/main/resources/sprite/black.png"));
		return black;

	}

	public Permeability getPerm() {
		// TODO Auto-generated method stub
		return null;
	}
}
