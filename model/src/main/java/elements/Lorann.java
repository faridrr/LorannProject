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
	char bufferSpell = 0;

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

	public void launchSpell(Lorann character) {
		RainbowSpell spell = new RainbowSpell(character, bufferSpell);

	}

	public void moveR() {
		this.x++;
		bufferSpell = 'R';
	}

	public void moveL() {
		this.x--;
		bufferSpell = 'L';
	}

	public void moveD() {
		this.y++;
		bufferSpell = 'D';
	}

	public void moveU() {
		this.y--;
		bufferSpell = 'U';
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

	public String getMessage() {
		return null;
	}

	public void loadMessage(String key) {

	}

	public Observable getObservable() {
		return null;
	}

	Thread t ;
	
	public BufferedImage Image() throws IOException {
	
	/*BufferedImage image = ImageIO.read(new File("src/main/resources/sprite/lorann_u.png"));
		return image;
		
	try {  
		Thread.sleep(500); //thread to sleep for 500 milliseconds = 5 seconds
		} catch (Exception e) {
			   System.out.println(e);
			   }	
		*/
		BufferedImage image = ImageIO.read(new File("src/main/resources/sprite/lorann_b.png"));
		return image;
	
	}

	public Permeability getPerm() {
		// TODO Auto-generated method stub
		return null;
	}

}
