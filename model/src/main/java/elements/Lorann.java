package elements;

import java.awt.Image;
import java.util.Observable;
import javax.swing.ImageIcon;

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

	public void ImageB() {
		Image image = new ImageIcon("src/main/resources/sprite/lorann_b.png").getImage();
	}

	public void ImageBl() {
		Image image = new ImageIcon("src/main/resources/sprite/lorann_bl.png").getImage();
	}

	public void ImageBr() {
		Image image = new ImageIcon("src/main/resources/sprite/lorann_br.png").getImage();
	}

	public void ImageL() {
		Image image = new ImageIcon("src/main/resources/sprite/lorann_l.png").getImage();
	}

	public void ImageR() {
		Image image = new ImageIcon("src/main/resources/sprite/lorann_r.png").getImage();
	}

	public void ImageU() {
		Image image = new ImageIcon("src/main/resources/sprite/lorann_u.png").getImage();
	}

	public void ImageUl() {
		Image image = new ImageIcon("src/main/resources/sprite/lorann_ul.png").getImage();
	}

	public void ImageUr() {
		Image image = new ImageIcon("src/main/resources/sprite/lorann_ur.png").getImage();
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
