package elements;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Observable;

import javax.imageio.ImageIO;

import contract.IElements;
import contract.IMobile;
import contract.IModel;
import contract.Permeability;
import java.util.Timer;
import java.lang.*;
import java.sql.SQLException;

public class Lorann extends Mobile implements IMobile{
	private int x;
	private int y;
	char c;
	BufferedImage image;

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

	public void move(char c) throws IOException {
		switch (c) {
		case 'R':
			setX(x++);
			image = ImageR();
			break;
		case 'L':
			setX(x--);
			image = ImageL();
			break;
		case 'U':
			setY(y--);
			image = ImageU();
			break;
		case 'D':
			setY(y++);
			image = ImageD();
			break;
		default:
			break;
		}
	}

	public BufferedImage ImageD() throws IOException {
		image = ImageIO.read(new File("src/main/resources/sprite/lorann_b.png"));
		return image;
	}

	public BufferedImage ImageDl() throws IOException {
		image = ImageIO.read(new File("src/main/resources/sprite/lorann_b1.png"));
		return image;
	}

	public BufferedImage ImageDr() throws IOException {
		image = ImageIO.read(new File("src/main/resources/sprite/lorann_br.png"));
		return image;
	}

	public BufferedImage ImageL() throws IOException {
		image = ImageIO.read(new File("src/main/resources/sprite/lorann_l.png"));
		return image;
	}

	public BufferedImage ImageR() throws IOException {
		image = ImageIO.read(new File("src/main/resources/sprite/lorann_r.png"));
		return image;
	}

	public BufferedImage ImageU() throws IOException {
		image = ImageIO.read(new File("src/main/resources/sprite/lorann_u.png"));
		return image;
	}

	public BufferedImage ImageUl() throws IOException {
		image = ImageIO.read(new File("src/main/resources/sprite/lorann_ul.png"));
		return image;
	}

	public BufferedImage ImageUr() throws IOException {
		image = ImageIO.read(new File("src/main/resources/sprite/lorann_ur.png"));
		return image;
	}

	public BufferedImage Image() throws IOException {
		image = ImageIO.read(new File("src/main/resources/sprite/lorann_ur.png"));
		return image;

	}

	public Permeability getPerm() {
		// TODO Auto-generated method stub
		return null;
	}

	public void launchSpell() {
		RainbowSpell spell = new RainbowSpell(x, y, c);
		// TODO Auto-generated method stub

	}

	public void getMessage() {
		// TODO Auto-generated method stub
		
	}

	public Observable getObservable() {
		// TODO Auto-generated method stub
		return null;
	}

	public void getMap1() throws SQLException {
		// TODO Auto-generated method stub
	}

	public List<IElements> getArimages() throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	public List<IElements> getArmobile() throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

}
