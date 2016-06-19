package elements;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.Observable;

import javax.imageio.ImageIO;
import contract.Permeability;
import java.util.Timer;
import java.lang.*;

public class Lorann extends Mobile {
	private int x;
	private int y;
	char c;

	public Lorann(int x, int y) {
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


	public void move(char c) {
		switch (c) {
		case 'R':
			this.x++;
			this.c = c;
			break;
		case 'L':
			this.x--;
			this.c = c;
			break;
		case 'U':
			this.y--;
			this.c = c;
			break;
		case 'D':
			this.x++;
			this.c = c;
			break;
		default:
			break;
		}
	}

	public BufferedImage ImageB() throws IOException {
		BufferedImage image = ImageIO.read(new File("src/main/resources/sprite/lorann_b.png"));
		return image;
	}

	public BufferedImage ImageBl() throws IOException {
		BufferedImage image = ImageIO.read(new File("src/main/resources/sprite/lorann_b1.png"));
		return image;
	}

	public BufferedImage ImageBr() throws IOException {
		BufferedImage image = ImageIO.read(new File("src/main/resources/sprite/lorann_br.png"));
		return image;
	}

	public BufferedImage ImageL() throws IOException {
		BufferedImage image = ImageIO.read(new File("src/main/resources/sprite/lorann_l.png"));
		return image;
	}

	public BufferedImage ImageR() throws IOException {
		BufferedImage image = ImageIO.read(new File("src/main/resources/sprite/lorann_r.png"));
		return image;
	}

	public BufferedImage ImageU() throws IOException {
		BufferedImage image = ImageIO.read(new File("src/main/resources/sprite/lorann_u.png"));
		return image;
	}

	public BufferedImage ImageUl() throws IOException {
		BufferedImage image = ImageIO.read(new File("src/main/resources/sprite/lorann_ul.png"));
		return image;
	}

	public BufferedImage ImageUr() throws IOException {
		BufferedImage image = ImageIO.read(new File("src/main/resources/sprite/lorann_ur.png"));
		return image;
	}

	public BufferedImage Image() throws IOException {

		/*
		 * BufferedImage image = ImageIO.read(new
		 * File("src/main/resources/sprite/lorann_u.png")); return image;
		 * 
		 * try { Thread.sleep(500); //thread to sleep for 500 milliseconds = 5
		 * seconds } catch (Exception e) { System.out.println(e); }
		 */
		BufferedImage image = ImageIO.read(new File("src/main/resources/sprite/lorann_b.png"));
		return image;

	}

	public Permeability getPerm() {
		// TODO Auto-generated method stub
		return null;
	}

	public void launchSpell() {
		RainbowSpell spell = new RainbowSpell(x,y, c);
		// TODO Auto-generated method stub
		
	}

}
