package shapes;

import geoTools.CartesianPoint;

/**
 * Represents an Oval
 * @author pedro
 *
 */
public class Oval extends AbstractShape {
	
	private double semiAxisX;
	private double semiAxisY;
	
	/**
	 * Contructor for Oval
	 * @param c Center of oval
	 * @param X Semi-Axis X of oval
	 * @param Y Semi-Axis Y of oval
	 */
	public Oval(CartesianPoint c, double X, double Y) {
		super(c);
		semiAxisX = X;
		semiAxisY = Y;
	}
	
	@Override
	public double getArea() {
		return Math.PI * semiAxisX * semiAxisY;
	}

	@Override
	public double getPerimeter() {
		return Math.PI * (3 * (semiAxisX + semiAxisY) - Math.sqrt((3 * semiAxisX + semiAxisY) * (semiAxisX + 3 * semiAxisY)));
	}

	@Override
	public double getWidth() {
		return 2 * semiAxisX;
	}

	@Override
	public double getHeight() {
		return 2 * semiAxisY;
	}

	@Override
	public String toString() {
		return "Ovalo centrado en (" + getPosition().getX() + ", " + getPosition().getY() + ")";
	}
	
	

}
