package contract;

import java.awt.image.BufferedImage;
import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

public interface IElements {
int getX();
int getY();
void setX( int x);
void setY(int y);
Permeability getPerm();
BufferedImage Image() throws IOException;
void move(char c) throws IOException, SQLException;
List<IElements> getArimages();

}
