package view;

import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Observable;
import java.util.Observer;
import javax.swing.JPanel;
import javax.swing.Timer;

import contract.*;

/**
 * The Class ViewPanel.
 *
 * @author Cattelan Montes Duffaut | Exia A1 Promo 2015
 */
class ViewPanel extends JPanel implements Observer, ActionListener, IView{

	/** The view frame. */
	private ViewFrame viewFrame;
	Timer timer = new Timer(200, this); //Creation of the timer
	public List<IElements> Arimages = new ArrayList<IElements>();
	public List<IMobile> Armobile = new ArrayList<IMobile>();
	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = -998294702363713521L;

	/**
	 * Instantiates a new view panel.
	 *
	 * @param viewFrame
	 *            the view frame
	 */
	public ViewPanel(final ViewFrame viewFrame) {
		timer.start();
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
	
	public List<IMobile> getArmobile(){
		return this.Armobile;
	}
	
	public List<IElements> getArimages(){
		return this.Arimages;
	}
	
	

	public void update(final Observable arg0, final Object arg1) {
		this.repaint();
	}
	
	 
	   
	    

	@Override
	protected void paintComponent(final Graphics graphics) {

		int pixelNumbers = 32;
		

		try {
			Arimages = this.viewFrame.getModel().getArimages();
			Armobile = this.viewFrame.getModel().getArmobile();
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		try {
			for (IElements obj : Arimages) { //Painting of the components of the background

				int x = obj.getX();
				int y = obj.getY();
				graphics.drawImage(obj.Image(), x * pixelNumbers, y * pixelNumbers, this);

			}

			for (IMobile obj : Armobile) { //Painting of the components such as the monsters and Lorann

				int x = obj.getX();
				int y = obj.getY();
				graphics.drawImage(obj.Image(), x * pixelNumbers, y * pixelNumbers, this);

			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

	public void actionPerformed(ActionEvent e) { //Refresh thanks to the timer
		for (IMobile obj : this.Armobile){

			obj.move();
			
			repaint();
		}
		
	}

	public void addArmobile(IMobile mobile){
		this.Armobile.add(mobile);
	}

	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

}
