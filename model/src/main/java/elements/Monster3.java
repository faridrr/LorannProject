package elements;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import contract.Permeability;

public class Monster3 extends Mobile {
	private int x;
	private int y;
	
	public Monster3(int x, int y){
		
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
		BufferedImage monster_3 = ImageIO.read(new File("src/main/resources/sprite/monster_3.png"));
		return monster_3;
	}

	public Permeability getPerm() {
		// TODO Auto-generated method stub
		return null;
	}
}
