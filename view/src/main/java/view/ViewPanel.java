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

import contract.IDoorO;

/**
 * The Class ViewPanel.
 *
 * @author Jean-Aymeric Diet
 */
class ViewPanel extends JPanel implements Observer,  IDoorO{

	/** The view frame. */
	private ViewFrame viewFrame;
	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = -998294702363713521L;

	/**
	 * Instantiates a new view panel.
	 *
	 * @param viewFrame
	 *            the view frame
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
	 *            the new view frame
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

	int x = 0;
	int y = 0;
	int pixelNumbers = 32;

	List<BufferedImage> Arimages = new ArrayList<BufferedImage>();

	@Override
	protected void paintComponent(final Graphics graphics) {

		for (x = 0; x < 21; x++) {
			for (y = 0; y < 14; y++) {
				char symbol = '-'; // {call Selectlvl1(x,y)}; ?

				switch (symbol) {
				case '+':
					VBone vbone = new VBone(x, y);
					Arimages.add(vbone.Image());
					break;
				case '-':
					Hbone hbone = new HBone(x, y);
					Arimages.add(hbone.Image());
					//
					break;
				case '#':
					Corners corner = new Corners(x, y);
					Arimages.add(corner.Image());
					//
					break;
				case 'x':
					Purse purse = new Purse(x, y);
					Arimages.add(purse.Image());
					//
					break;
				case 'o':
					CrystalBall crystal = new CrystalBall(x, y);
					Arimages.add(crystal.Image());
					//
					break;
				case '$':
					DoorC door = new DoorC(x, y);
					Arimages.add(door.Image());
					//
					break;
				case '@':
					DoorO door = new DoorO(x, y);
					Arimages.add(door.Image());
					//
					break;
				default:
					Black black = new Black();
					Arimages.add(black);
					break;
				}
			}
		}

		graphics.clearRect(0, 0, this.getWidth(), this.getHeight());
		for (Image img : Arimages) {

			graphics.drawImage(img, x * pixelNumbers, y * pixelNumbers, this);

			if (x == 21) {
				x = 0;
				y++;
			}

			else {
				x++;
			}
		}
	}

	public void DoorO(int x, int y) {
		// TODO Auto-generated method stub
		
	}
}
