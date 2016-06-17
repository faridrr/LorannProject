package elements;

import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.Observable;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;

import contract.IModel;

public class VBone extends Background{
	private int x;
	private int y;

	public VBone(int x, int y) {
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

	public void Image() throws IOException {
		BufferedImage vertical_bone = ImageIO.read(new File("src/main/resources/sprite/vertical_bone.png"));
	}

}
