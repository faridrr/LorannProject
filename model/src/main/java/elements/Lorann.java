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

public class Lorann extends Mobile implements IMobile, IModel{
	private int x;
	private int y;
	char c;

	BufferedImage image;

	public Lorann(int x, int y) {
		this.x = x;
		this.y = y;
		
		
		try {
			this.image = ImageIO.read(new File("src/main/resources/sprite/lorann_b.png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

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
			this.setX(getX() + 1);
			this.image = ImageR();
			this.c = c;
			break;
		case 'L':
			this.setX(getX() - 1);
			this.image = ImageL();
			this.c = c;
			break;
		case 'U':
			this.setY(getY() - 1);
			this.image = ImageU();
			this.c = c;
			break;
		case 'D':
			this.setY(getY() + 1);
			this.image = ImageD();
			this.c = c;
			break;
		default:
			break;
		}
	}
	
	public void colision (char c){

		int characterX;
		int characterY;

		characterX = this.getX();
		characterY = this.getY();

		//access to list

 		for(IElements obj : Arimages){

			int objetX = obj.getX();
			int objetY = obj.getY();

			switch(c){

				case 'R':
					if(characterX + 1 == objetX && characterY == objetY){	
						this.setX(getX() - 1);
					}

					else {
					}
					break;


				case 'L':
					if(characterX - 1 == objetX && characterY == objetY){	
						this.setX(getX() + 1);
					}

					else {
					}
					break;

				case 'U':
					if(characterX == objetX && characterY - 1 == objetY){	
						this.setX(getY() + 1);
					}

					else {
					}
					break;

				case 'D':
					if(characterX + 1 == objetX && characterY + 1 == objetY){	
						this.setX(getY() - 1);
					}

					else {
					}
					break;

			}
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
		return image;

	}
	
	
	public Permeability getPerm() {
		// TODO Auto-generated method stub
		return null;
	}

	public void launchSpell() {
		RainbowSpell spell = new RainbowSpell(this.getX(), this.getY(), this.c);

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

	public List<IMobile> getArmobile() throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

}
