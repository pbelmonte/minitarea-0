package shapes;

import geoTools.CartesianPoint;

/**
 * Programa de prueba
 * @author pedro
 *
 */
public class Main {

	public static void main(String[] args) {
		Oval o = new Oval(new CartesianPoint(1.0, 1.5), 2.0, 1.0);
		Rectangle r = new Rectangle(new CartesianPoint(10.0, 10.5), 4.0, 2.0);
		
		System.out.println(o.getArea());
		System.out.println(o.getPerimeter());
		System.out.println(o.getWidth());
		System.out.println(o.getHeight());
		System.out.println(o.toString());
		
		System.out.println(r.getArea());
		System.out.println(r.getPerimeter());
		System.out.println(r.getWidth());
		System.out.println(r.getHeight());
		System.out.println(r.toString());
		
	}

}
