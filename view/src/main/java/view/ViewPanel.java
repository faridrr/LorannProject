package view;

import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
//import java.awt.Button;
import java.awt.Graphics;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
/*import java.awt.GridLayout;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;*/
import java.util.Observable;
import java.util.Observer;

import javax.imageio.ImageIO;
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

	public void InitialGrid(){
		
		/* 
		 * Max's modifications :
		 * 
		 * viewFrame.setLayout(new GridBagLayout());

		GridBagConstraints gbc = new GridBagConstraints();

		gbc.gridx = 0; // On positionne la case de départ du composant
		gbc.gridy = 0;

		gbc.gridheight = 1; //Proportions des images
		gbc.gridwidth = 1;
		
		
		JPanel cell = new JPanel();
		JPanel cell1 = new JPanel();
		
		cell.setBackground(Color.BLUE);
		cell1.setBackground(Color.RED);
		cell.setPreferredSize(new Dimension(32, 32));
		cell1.setPreferredSize(new Dimension(32, 32));

		gbc.fill = GridBagConstraints.VERTICAL;
		gbc.gridheight = GridBagConstraints.REMAINDER;
		viewFrame.add(cell1, gbc);
		
		gbc.gridy = 1;

		gbc.fill = GridBagConstraints.HORIZONTAL;
		gbc.gridwidth = GridBagConstraints.REMAINDER;
		viewFrame.add(cell, gbc);*/
		
		
		/*
		 * Ced's modifications:
		 */
	/*
		    JPanel cell1 = new JPanel();

		    //Le conteneur principal
		    JPanel content = new JPanel();
		    content.setPreferredSize(new Dimension(300, 120));
		    content.setBackground(Color.BLACK);
		    //On définit le layout manager
		    content.setLayout(new GridBagLayout());
				
		    //L'objet servant à positionner les composants
		    GridBagConstraints gbc = new GridBagConstraints();
				
		    //On positionne la case de départ du composant
		    gbc.gridx = 0;
		    gbc.gridy = 0;
		    //La taille en hauteur et en largeur
		    gbc.gridheight = 1;
		    gbc.gridwidth = 1;
		    content.add(cell1, gbc);
		    //---------------------------------------------
		    //gbc.gridx = 1;

		    //---------------------------------------------
		    //gbc.gridx = 2;		
		
		    //---------------------------------------------
		    //Cette instruction informe le layout que c'est une fin de ligne
		    gbc.gridwidth = GridBagConstraints.REMAINDER;
		    gbc.gridx = 3;	

		    //---------------------------------------------
		    gbc.gridx = 0;
		    gbc.gridy = 1;
		    gbc.gridwidth = 1;
		    gbc.gridheight = 1;
		    
		    //Celle-ci indique que la cellule se réplique de façon verticale
		    gbc.fill = GridBagConstraints.VERTICAL;
		    content.add(cell1, gbc);
		    //---------------------------------------------
		    gbc.gridx = 1;
		    gbc.gridheight = 1;
		    //Celle-ci indique que la cellule se réplique de façon horizontale
		    gbc.fill = GridBagConstraints.HORIZONTAL;
		    gbc.gridwidth = GridBagConstraints.REMAINDER;
		    content.add(cell1, gbc);
		    //---------------------------------------------
		    gbc.gridx = 1;
		    gbc.gridy = 2;
		    gbc.gridwidth = 2;
		    content.add(cell1, gbc);
		    //---------------------------------------------
		    gbc.gridx = 3;
		    gbc.gridwidth = GridBagConstraints.REMAINDER;
		    content.add(cell1, gbc);
		    //---------------------------------------------
		    //On ajoute le conteneur
		    //this.setContentPane(content);
		    this.setVisible(true);	*/	
	}
	
	
	/*
	 * (non-Javadoc)
	 *
	 * @see javax.swing.JComponent#paintComponent(java.awt.Graphics)
	 */
	/*private final Connection connection;
	protected Connection getConnection() {
		return this.connection;
	}
	public char Selectlvl1(int x, int y) throws SQLException{
	
	final String sql = "{call Selectlvl1(?,?)}";
	final CallableStatement call = this.getConnection().prepareCall(sql);
	call.setInt(x, y);
	call.execute();
	final ResultSet resultSet = call.getResultSet();
	return 0;
	
	}
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



	}
	public void GridInit(){

		//Avec le JPanel nommé "content"

		
		viewFrame.setLayout(new GridBagLayout());

		GridBagConstraints gbc = new GridBagConstraints();

		gbc.gridx = 0; // On positionne la case de départ du composan
		gbc.gridy = 0;

		gbc.gridheight = 1; //Proportions des images
		gbc.gridwidth = 1;

		for (int x=0; x<21; x++){

			gbc.gridx = x;

			if (gbc.gridx == 21){

				gbc.gridwidth = GridBagConstraints.REMAINDER; //Cette instruction informe le layout que c'est une fin de ligne

			}
			else{
			}

			for (int y=0; y<13; y++){

				gbc.gridy = y;

				if (gbc.gridy == 13){

				gbc.gridheight = GridBagConstraints.REMAINDER; //Cette instruction informe le layout que c'est une fin de colonne
 
				}
				else{				
				}

				String imgobject = getProcImg(Selectlvl1(x,y));

				viewFrame.add(imgobject, gbc);

			}

		}		
		
	}*/
	@Override
	protected void paintComponent(final Graphics graphics) {
		//graphics.clearRect(0, 0, this.getWidth(), this.getHeight());
		//graphics.drawString(this.getViewFrame().getModel().getMessage(), 10, 20);
		//setLayout (new GridLayout(14,22,1,1)); // 22 colums, 14 rows and 1 gap betwenn each colums and rows
		InitialGrid();
		
		//for(int n = 0; n < 22*14; n++)
		//add(new Button("n"));
		
	
	}
}
