package shapes;

import geoTools.CartesianPoint;

/**
 * Represents an equilateral Triangle 
 * @author pedro
 *
 */
public class Triangle extends AbstractRegularPolygon {
	
	/**
	 * Constructor for Triangle
	 * @param c Center of the triangle
	 * @param sl Length of the sides of the triangle
	 */
	public Triangle(CartesianPoint c, double sl) {
		super(c, sl, 3);
	}

	@Override
	public double getWidth() {
		return getPerimeter() / 3;
	}

	@Override
	public double getHeight() {
		return getApothem() * 3;
	}

	@Override
	public String toString() {
		return "Triangulo centrado en " + getPosition().toString();
	}

}
