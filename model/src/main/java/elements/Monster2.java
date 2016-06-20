package elements;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.imageio.ImageIO;

import contract.IElements;
import contract.IMobile;
import contract.IModel;
import contract.Permeability;

public class Monster2 extends Mobile {
	private int x;
	private int y;
	private IModel model;

	Permeability perm = Permeability.MONSTER;

	private List<IMobile> Armobile = new ArrayList<IMobile>();
	private List<IElements> Arimages = new ArrayList<IElements>();
	
	public Monster2(int x, int y) throws SQLException{
		
		this.Armobile = this.model.getArmobile();
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
		BufferedImage monster_2 = ImageIO.read(new File("src/main/resources/sprite/monster_2.png"));
		return monster_2;
	}

	public Permeability getPerm() {
		return this.perm;
	}


	public void move(char c) throws IOException {
		
		/*
		 * Upper-left
		 */
		
		if ((this.Armobile.get(0).getX() < this.x) && (this.Armobile.get(0).getY() < this.y)){

			for (IElements obj : this.Arimages) {
				if (((obj.getX() == this.getX() - 1) && (obj.getY() == this.getY())) && ((obj.getX() == this.getX()) && (obj.getY() == this.getY() - 1))){
					if (obj.getPerm() == Permeability.PENETRABLE || obj.getPerm() == Permeability.CHARACTER) {
						this.setX(getX() - 1);
						this.setY(getY() - 1);
						break;
					}
				}
			}
		}
		
		/*
		 * Upper-right
		 */
		
		else if ((this.Armobile.get(0).getX() > this.x) && (this.Armobile.get(0).getY() < this.y)){

			for (IElements obj : this.Arimages) {
				if (((obj.getX() == this.getX() + 1) && (obj.getY() == this.getY()) && (obj.getX() == this.getX()) && (obj.getY() == this.getY() - 1))){
					if (obj.getPerm() == Permeability.PENETRABLE || obj.getPerm() == Permeability.CHARACTER) {
						this.setX(getX() + 1);
						this.setY(getY() - 1);
						break;
					}
				}
			}
		}
		
		/*
		 * Lower-left
		 */
		
		else if ((this.Armobile.get(0).getX() < this.x) && (this.Armobile.get(0).getY() > this.y)){

			for (IElements obj : this.Arimages) {
				if (((obj.getX() == this.getX() - 1) && (obj.getY() == this.getY()) && (obj.getX() == this.getX()) && (obj.getY() == this.getY() + 1))){
					if (obj.getPerm() == Permeability.PENETRABLE || obj.getPerm() == Permeability.CHARACTER) {
						this.setX(getX() - 1);
						this.setY(getY() + 1);
						break;
					}
				}
			}
		}
		
		/*
		 * Lower-right
		 */
		
		else if ((this.Armobile.get(0).getX() > this.x) && (this.Armobile.get(0).getY() > this.y)){

			for (IElements obj : this.Arimages) {
				if (((obj.getX() == this.getX() + 1) && (obj.getY() == this.getY()) && (obj.getX() == this.getX()) && (obj.getY() == this.getY() + 1))){
					if (obj.getPerm() == Permeability.PENETRABLE || obj.getPerm() == Permeability.CHARACTER) {
						this.setX(getX() + 1);
						this.setY(getY() + 1);
						break;
					}
				}
			}
		}
		
		/*
		 * Left
		 */
		
		else if ((this.Armobile.get(0).getX() < this.x) && (this.Armobile.get(0).getY() == this.y)){

			for (IElements obj : this.Arimages) {
				if ((obj.getX() == this.getX() - 1) && (obj.getY() == this.getY())) {
					if (obj.getPerm() == Permeability.PENETRABLE || obj.getPerm() == Permeability.CHARACTER) {
						this.setX(getX() - 1);
						break;
					}
				}
			}
		}
		
		/*
		 * Right
		 */

		else if ((this.Armobile.get(0).getX() > this.x) && (this.Armobile.get(0).getY() == this.y)){
			
			for (IElements obj : this.Arimages) {
				if ((obj.getX() == this.getX() + 1) && (obj.getY() == this.getY())) {
					if (obj.getPerm() == Permeability.PENETRABLE || obj.getPerm() == Permeability.CHARACTER) {
						this.setX(getX() + 1);
						break;
					}
				}
			}
		}
		
		/*
		 * Up
		 */

		else if ((this.Armobile.get(0).getX() == this.x) && (this.Armobile.get(0).getY() < this.y)){
			

			for (IElements obj : this.Arimages) {
				if ((obj.getY() == this.getY() - 1) && (obj.getX() == this.getX())) {
					if (obj.getPerm() == Permeability.PENETRABLE || obj.getPerm() == Permeability.CHARACTER) {
						this.setY(getY() - 1);
						break;
					}
				}
			}	
		}
		
		/*
		 * Down
		 */

		else if ((this.Armobile.get(0).getX() == this.x) && (this.Armobile.get(0).getY() > this.y)){
			
			for (IElements obj : this.Arimages) {
				if ((obj.getY() == this.getY() + 1) && (obj.getX() == this.getX())) {
					if (obj.getPerm() == Permeability.PENETRABLE || obj.getPerm() == Permeability.CHARACTER) {
						this.setY(getY() + 1);
					}
				}
			}	
		}

	}

	public void launchSpell() {
		// TODO Auto-generated method stub
		
	}
}
