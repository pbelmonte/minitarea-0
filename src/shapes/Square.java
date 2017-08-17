package shapes;

import geoTools.CartesianPoint;

/**
 * Represents a Square
 * @author pedro
 *
 */
public class Square extends Rectangle {
	
	/**
	 * Constructor for Square
	 * @param c Center of square
	 * @param s Side of square
	 */
	public Square(CartesianPoint c, double s) {
		super(c, s, s);
	}
	
	public String toString() {
		return "Cuadrado centrado en " + getPosition().toString();
	}

}
