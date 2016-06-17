package elements;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.Observable;

import javax.imageio.ImageIO;

public class Lorann extends Mobile {
	private int x;
	private int y;
	char bufferSpell = 0;

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

	public void ImageB() throws IOException {
		BufferedImage image = ImageIO.read(new File("src/main/resources/sprite/lorann_b.png"));
	}

	public void ImageBl() throws IOException {
		BufferedImage image = ImageIO.read(new File("src/main/resources/sprite/lorann_b1.png"));
	}

	public void ImageBr() throws IOException {
		BufferedImage image = ImageIO.read(new File("src/main/resources/sprite/lorann_br.png"));
	}

	public void ImageL() throws IOException {
		BufferedImage image = ImageIO.read(new File("src/main/resources/sprite/lorann_l.png"));
	}

	public void ImageR() throws IOException {
		BufferedImage image = ImageIO.read(new File("src/main/resources/sprite/lorann_r.png"));
	}

	public void ImageU() throws IOException {
		BufferedImage image = ImageIO.read(new File("src/main/resources/sprite/lorann_u.png"));
	}

	public void ImageUl() throws IOException {
		BufferedImage image = ImageIO.read(new File("src/main/resources/sprite/lorann_ul.png"));
	}

	public void ImageUr() throws IOException {
		BufferedImage image = ImageIO.read(new File("src/main/resources/sprite/lorann_ur.png"));
	}

	public String getMessage() {
		return null;
	}

	public void loadMessage(String key) {

	}

	public Observable getObservable() {
		return null;
	}

}
