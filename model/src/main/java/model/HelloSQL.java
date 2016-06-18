package model;

import java.awt.image.BufferedImage;
import java.io.IOException;

import contract.Permeability;

/**
 * The Class HelloSQL.
 *
 * @author Cattelan Montes Duffaut | Exia A1 Promo 2015
 */
class HelloWorld extends Elements {

	/** The id. */
	private int			id;

	/** The key. */
	private String	key;

	/** The message. */
	private String	message;

	/**
	 * Instantiates a new hello world.
	 *
	 * @param id
	 *          the id
	 * @param key
	 *          the key
	 * @param message
	 *          the message
	 */
	public HelloWorld(final int id, final String key, final String message) {
		this.setId(id);
		this.setKey(key);
		this.setMessage(message);
	}

	/**
	 * Instantiates a new hello world.
	 */
	public HelloWorld() {
		this(0, "", "");
	}

	/**
	 * Gets the id.
	 *
	 * @return the id
	 */
	public int getId() {
		return this.id;
	}

	/**
	 * Sets the id.
	 *
	 * @param id
	 *          the new id
	 */
	public void setId(final int id) {
		this.id = id;
	}

	/**
	 * Gets the key.
	 *
	 * @return the key
	 */
	public String getKey() {
		return this.key;
	}

	/**
	 * Sets the key.
	 *
	 * @param key
	 *          the new key
	 */
	public void setKey(final String key) {
		this.key = key;
	}

	/**
	 * Gets the message.
	 *
	 * @return the message
	 */
	public String getMessage() {
		return this.message;
	}

	/**
	 * Sets the message.
	 *
	 * @param message
	 *          the new message
	 */
	public void setMessage(final String message) {
		this.message = message;
	}

	public int getX() {
		// TODO Auto-generated method stub
		return 0;
	}

	public int getY() {
		// TODO Auto-generated method stub
		return 0;
	}

	public void setX(int x) {
		// TODO Auto-generated method stub
		
	}

	public void setY(int y) {
		// TODO Auto-generated method stub
		
	}

	public BufferedImage Image() throws IOException {
		// TODO Auto-generated method stub
		return null;
	}

	public Permeability getPerm() {
		// TODO Auto-generated method stub
		return null;
	}

}
