package shapes;

import geoTools.CartesianPoint;

public class Circle extends Oval {
	
	/**
	 * Constructor for Circle
	 * @param c Center of circle
	 * @param r Radius of circle
	 */
	public Circle(CartesianPoint c, double r) {
		super(c, r, r);
	}
	
	@Override
	public String toString() {
		return "Circulo centrado en (" + getPosition().getX() + ", " + getPosition().getY() + ")";		
	}
}
