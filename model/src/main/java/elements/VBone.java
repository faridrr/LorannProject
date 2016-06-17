package elements;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

public class VBone extends Background {
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

	public BufferedImage Image() throws IOException {
		BufferedImage horizontal_bone = ImageIO.read(new File("src/main/resources/sprite/vertical_bone.png"));
		return horizontal_bone;
	}
}
