package shapes;

import geoTools.CartesianPoint;

public class Rectangle extends AbstractShape {
	
	private double width;
	private double height;
	
	/**
	 * Constructor for Rectangle
	 * @param c Center of rectangle
	 * @param w Width of rectangle
	 * @param h Height of rectangle
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
		return "Rectangulo centrado en (" + getPosition().getX() + ", " + getPosition().getY() + ")";
	}

}
