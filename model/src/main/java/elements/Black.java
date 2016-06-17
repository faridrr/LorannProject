package elements;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class Black extends Background{
	
	public void Image () throws IOException{
		
		BufferedImage black = ImageIO.read(new File("src/main/resources/sprite/black.png"));
	}

}
