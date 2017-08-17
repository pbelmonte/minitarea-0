package shapes;

import geoTools.CartesianPoint;

/**
 * Represents an abstract regular polygon
 * @author pedro
 *
 */
public abstract class AbstractRegularPolygon extends AbstractShape{
	
	private double sideLength;
	private int sides;
	
	/**
	 * Constructor for AbstractRegularPolygon
	 * @param c Center of the regular polygon
	 * @param sl Length of the sides of the polygon
	 * @param s Number of sides
	 */
	public AbstractRegularPolygon(CartesianPoint c, double sl, int s) {
		super(c);
		sideLength = sl;
		sides = s;
	}
	
	@Override
	public double getArea() {
		return getPerimeter() * getApothem() / 3;
	}
	
	@Override
	public double getPerimeter() {
		return sides * sideLength ;		
	}
	
	/**
	 * Returns the apothem of the regular polygon 
	 * @return polygon's apothem
	 */
	public double getApothem() {
		return sideLength / 2 / Math.tan(Math.PI / sides);
	}
	
}
