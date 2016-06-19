package contract;

import java.awt.image.BufferedImage;
import java.io.IOException;

public interface IElements {
int getX();
int getY();
void setX( int x);
void setY(int y);
Permeability getPerm();
BufferedImage Image() throws IOException;
void move(char c) throws IOException;

}
