package shapes;

import geoTools.CartesianPoint;

/**
 * Represents a Rectangle
 * @author pedro
 *
 */
public class Rectangle extends AbstractShape {
	
	private double width;
	private double height;
	
	/**
	 * Constructor for Rectangle
	 * @param c Center of the rectangle
	 * @param w Width of the rectangle
	 * @param h Height of the rectangle
	 */
	public Rectangle(CartesianPoint c, double w, double h) {
		super(c);
		width = w;
		height = h;
	}

	@Override
	public double getArea() {
		return width * height;
	}

	@Override
	public double getPerimeter() {
		return 2 * (width + height);
	}

	@Override
	public double getWidth() {
		return width;
	}

	@Override
	public double getHeight() {
		return height;
	}

	@Override
	public String toString() {
		return "Rectangulo centrado en " + getPosition().toString();
	}

}
