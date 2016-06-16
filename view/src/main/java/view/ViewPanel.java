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
	
	BufferedImage bone;
	BufferedImage corner;
	BufferedImage lorann;
	int x = 0;
	int y = 0;
	int nb = 32;
	
	List<BufferedImage> Arimages = new ArrayList<BufferedImage>();
	@Override
	protected void paintComponent(final Graphics graphics) {
		try {
			bone = ImageIO.read(new File("src/main/resources/sprite/bone.png"));
			corner = ImageIO.read(new File("src/main/resources/sprite/crystal_ball.png"));
			lorann = ImageIO.read(new File("src/main/resources/sprite/lorann_b.png"));
			
			Arimages.add(corner);
			Arimages.add(bone);
			Arimages.add(lorann);
		} catch (IOException e){

	}
		graphics.clearRect(0, 0, this.getWidth(), this.getHeight());
		for(Image img : Arimages){
			graphics.drawImage(img,  x*nb, y*nb, this);
			x++;
			y++;
		}
	}
}
