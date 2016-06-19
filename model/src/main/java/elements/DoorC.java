package elements;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import contract.Permeability;

public class DoorC extends Background{
	private int x;
	private int y;
	
	public DoorC(int x, int y){
		
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
		BufferedImage doorC = ImageIO.read(new File("src/main/resources/sprite/gate_closed.png"));
		return doorC;
	}

	public Permeability getPerm() {
		// TODO Auto-generated method stub
		return null;
	}

	public void move(char c) {
		// TODO Auto-generated method stub
		
	}

}
