package main;

import java.sql.SQLException;

import controller.Controller;
import model.Model;
import view.View;

/**
 * The Class Main.
 *
 * @author Cattelan Montes Duffaut | Exia A1 Promo 2015
 */
public abstract class Main {

	/**
	 * The main method.
	 *
	 * @param args
	 *            the arguments
	 * @throws SQLException
	 */
	public static void main(final String[] args) throws SQLException {

		final Model model = new Model();
		model.createMap();
		final View view = new View(model);
		final Controller controller = new Controller(view, model);
		view.setController(controller);

		controller.control();
	}
}