package shapes;

import geoTools.CartesianPoint;

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
		return "Cuadrado centrado en (" + getPosition().getX() + ", " + getPosition().getY() + ")";
	}

}
