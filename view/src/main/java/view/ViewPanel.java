package view;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Observable;
import java.util.Observer;

import javax.imageio.ImageIO;
import javax.swing.JPanel;

/**
 * The Class ViewPanel.
 *
 * @author Jean-Aymeric Diet
 */
class ViewPanel extends JPanel implements Observer {

	/** The view frame. */
	private ViewFrame					viewFrame;
	/** The Constant serialVersionUID. */
	private static final long	serialVersionUID	= -998294702363713521L;

	/**
	 * Instantiates a new view panel.
	 *
	 * @param viewFrame
	 *          the view frame
	 */
	public ViewPanel(final ViewFrame viewFrame) {
		this.setViewFrame(viewFrame);
		viewFrame.getModel().getObservable().addObserver(this);
	}

	/**
	 * Gets the view frame.
	 *
	 * @return the view frame
	 */
	private ViewFrame getViewFrame() {
		return this.viewFrame;
	}

	/**
	 * Sets the view frame.
	 *
	 * @param viewFrame
	 *          the new view frame
	 */
	private void setViewFrame(final ViewFrame viewFrame) {
		this.viewFrame = viewFrame;
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see java.util.Observer#update(java.util.Observable, java.lang.Object)
	 */
	public void update(final Observable arg0, final Object arg1) {
		this.repaint();
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see javax.swing.JComponent#paintComponent(java.awt.Graphics)
	 */
	// Example : BufferedImage NAME;
	
	BufferedImage black;
	BufferedImage bone;
	BufferedImage horizontal_bone;
	BufferedImage vertical_bone;
	BufferedImage corner;
	BufferedImage crystal_ball;
	BufferedImage fireball_1;
	BufferedImage fireball_2;
	BufferedImage fireball_3;
	BufferedImage fireball_4;
	BufferedImage fireball_5;
	BufferedImage gate_closed;
	BufferedImage gate_open;
	BufferedImage horizontal;
	// 8 loran images missing here
	BufferedImage monster_1;
	BufferedImage monster_2;
	BufferedImage monster_3;
	BufferedImage monster_4;
	BufferedImage purse;
	BufferedImage lorann;
	
	
	int x = 0;
	int y = 0;
	int pixelNumbers = 32;
	
	List<BufferedImage> Arimages = new ArrayList<BufferedImage>();
	@Override
	protected void paintComponent(final Graphics graphics) {
		try {
			black = ImageIO.read(new File("src/main/resources/sprite/black.png"));
			bone = ImageIO.read(new File("src/main/resources/sprite/bone.png"));
			vertical_bone = ImageIO.read(new File("src/main/resources/sprite/vertical_bone.png"));
			horizontal_bone = ImageIO.read(new File("src/main/resources/sprite/horizontal_bone.png"));
			
			fireball_1 = ImageIO.read(new File("src/main/resources/sprite/fireball_1.png"));
			fireball_2 = ImageIO.read(new File("src/main/resources/sprite/fireball_2.png"));
			fireball_3 = ImageIO.read(new File("src/main/resources/sprite/fireball_3.png"));
			fireball_4 = ImageIO.read(new File("src/main/resources/sprite/fireball_4.png"));
			
			
			gate_closed = ImageIO.read(new File("src/main/resources/sprite/gate_closed.png"));
			gate_open = ImageIO.read(new File("src/main/resources/sprite/gate_open.png"));
			crystal_ball = ImageIO.read(new File("src/main/resources/sprite/crystal_ball.png"));
			lorann = ImageIO.read(new File("src/main/resources/sprite/lorann_b.png"));
			
			purse = ImageIO.read(new File("src/main/resources/sprite/purse.png"));
			
			monster_1 = ImageIO.read(new File("src/main/resources/sprite/monster_1.png"));
			monster_2 = ImageIO.read(new File("src/main/resources/sprite/monster_2.png"));
			monster_3 = ImageIO.read(new File("src/main/resources/sprite/monster_3.png"));
			monster_4 = ImageIO.read(new File("src/main/resources/sprite/monster_4.png"));
			
			/*
			 * Testing every images on the display
			 */
			Arimages.add(bone);
			Arimages.add(black);
			Arimages.add(vertical_bone);
			Arimages.add(horizontal_bone);
			Arimages.add(lorann);
			
			Arimages.add(fireball_1);
			Arimages.add(fireball_2);
			Arimages.add(fireball_3);
			Arimages.add(fireball_4);
			
			Arimages.add(gate_closed);
			Arimages.add(gate_open);
			Arimages.add(crystal_ball);
			Arimages.add(purse);
			Arimages.add(monster_1);
			Arimages.add(monster_2);
			Arimages.add(monster_3);
			Arimages.add(monster_4);
			
			
			
		} catch (IOException e){

	}
		graphics.clearRect(0, 0, this.getWidth(), this.getHeight());
		for(Image img : Arimages){
			
			
			graphics.drawImage(img,  x*pixelNumbers, y*pixelNumbers, this);
			
			//x++;
			
			//testing a conditional loop to the images display:
			 if (x == 21){
				x = 0;
				y++;
			}
			else {
				x++;
			}
				
			
			;
		}
	}
}
