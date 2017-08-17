package shapes;

import geoTools.CartesianPoint;

public abstract class AbstractRegularPolygon extends AbstractShape{
	
	private int sides;
	
	/**
	 * Constructor for AbstractRegularPolygon
	 * @param c
	 * @param s
	 */
	public AbstractRegularPolygon(CartesianPoint c, int s) {
		super(c);
		sides = s;
	}
	
	public int interiorAngles() {
		return (int) 180.0 / sides * (sides - 2);
	}
	
}
