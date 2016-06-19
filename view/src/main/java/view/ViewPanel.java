package view;

import java.awt.Graphics;
import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Observable;
import java.util.Observer;
import javax.swing.JPanel;
import contract.*;

/**
 * The Class ViewPanel.
 *
 * @author Cattelan Montes Duffaut | Exia A1 Promo 2015
 */
class ViewPanel extends JPanel implements Observer {

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

	@Override
	protected void paintComponent(final Graphics graphics) {

		int pixelNumbers = 32;
		List<IElements> Arimages;
		Arimages = new ArrayList<IElements>();
		try {
			Arimages = this.viewFrame.getController().getMap1();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		for (IElements obj : Arimages) {
			try {
				int x = obj.getX();
				int y = obj.getY();
				graphics.drawImage(obj.Image(), x * pixelNumbers, y * pixelNumbers, this);
			} catch (IOException e) {
				e.printStackTrace();
			}

		}
		repaint();
	}

}
