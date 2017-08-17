package shapes;

import geoTools.CartesianPoint;

/**
 * Represents a Pentagon
 * @author pedro
 *
 */
public class Pentagon extends AbstractRegularPolygon {
	
	/**
	 * Constructor for Pentagon
	 * @param c Center of the pentagon
	 * @param sl Length of the sides of the pentagon 
	 */
	public Pentagon(CartesianPoint c, double sl) {
		super(c, sl, 5);
	}

	@Override
	public double getWidth() {
		return (1 + Math.sqrt(5)) * getPerimeter() / 5 / 2;
	}

	@Override
	public double getHeight() {
		return Math.sqrt(5 + 2 * Math.sqrt(5)) * getPerimeter() / 5 / 2;
	}

	@Override
	public String toString() {
		return "Pentagono centrado en " + getPosition().toString();
	}

}
