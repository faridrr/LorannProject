package contract;

import java.awt.image.BufferedImage;
import java.io.IOException;

public interface IMobile {
	void move(char c) throws IOException;

	void launchSpell();

	int getX();

	int getY();

	void setX(int x);

	void setY(int y);

	Permeability getPerm();

	BufferedImage Image() throws IOException;
}
