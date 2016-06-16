package view;


//import java.awt.Button;
import java.awt.Graphics;

import java.util.Observable;
import java.util.Observer;

import javax.swing.JPanel;

/**
 * The Class ViewPanel.
 *
 * @author Cattelan Montes Duffaut | Exia A1 Promo 2015
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
	/*
	
	public String getImageProc(char symbol){

		String s;

		switch(symbol){

			case '+':
				s = "view\\src\\main\\resources\\sprite\\vertical_bone.png";
				break;

			case '-':
				s = "view\\src\\main\\resources\\sprite\\horizontal_bone.png";
				break;

			case 'o':
				s = "view\\src\\main\\resources\\sprite\\crystall_ball.png";
				break;

			case 'x':
				s = "view\\src\\main\\resources\\sprite\\purse.png";
				break;

			case '#':
				s = "view\\src\\main\\resources\\sprite\\bone.png";
				break;

			case '$':
				s = "view\\src\\main\\resources\\sprite\\gate_closed.png";
				break;

			case '@':
				s = "view\\src\\main\\resources\\sprite\\gate_open.png";
				break;

			default:
				s = null;
				break;
		}
		return s;



	}*/
	@Override
	protected void paintComponent(final Graphics graphics) {
		//graphics.clearRect(0, 0, this.getWidth(), this.getHeight());
		//graphics.drawString(this.getViewFrame().getModel().getMessage(), 10, 20);
		
	
	}
}
