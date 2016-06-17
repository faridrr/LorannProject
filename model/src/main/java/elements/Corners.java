package elements;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class Corners extends Background{
	private int x;
	private int y;
	
	public Corners(int x, int y){
		
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
		BufferedImage bone = ImageIO.read(new File("src/main/resources/sprite/bone.png"));
	}
}
