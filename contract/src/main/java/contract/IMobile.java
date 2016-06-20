package contract;

import java.awt.image.BufferedImage;
import java.io.IOException;
import java.sql.SQLException;

public interface IMobile {
	void move(char c) throws IOException, SQLException;
	void move();

	void launchSpell(char c);

	int getX();

	int getY();

	void setX(int x);

	void setY(int y);

	Permeability getPerm();

	BufferedImage Image() throws IOException;

}
