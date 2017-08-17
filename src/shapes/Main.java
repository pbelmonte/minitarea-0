package shapes;

import geoTools.CartesianPoint;

/**
 * Programa de prueba
 * @author pedro
 *
 */
public class Main {

	public static void main(String[] args) {
		Oval o = new Oval(new CartesianPoint(1.0, 1.5), 4.0, 2.0);
		Rectangle r = new Rectangle(new CartesianPoint(10.0, 10.5), 4.0, 2.0);
		Circle c = new Circle(new CartesianPoint(15.4, 17.0), 4.0);
		Square s = new Square(new CartesianPoint(20.1, 22), 4.5);
		Triangle t = new Triangle(new CartesianPoint(29.4, 27.1), 4.0);
		Pentagon p = new Pentagon(new CartesianPoint(36.0, 34.5), 3.0);
		
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
		
		System.out.println(c.getArea());
		System.out.println(c.getPerimeter());
		System.out.println(c.getWidth());
		System.out.println(c.getHeight());
		System.out.println(c.toString());
		
		System.out.println(s.getArea());
		System.out.println(s.getPerimeter());
		System.out.println(s.getWidth());
		System.out.println(s.getHeight());
		System.out.println(s.toString());
		
		System.out.println(t.getArea());
		System.out.println(t.getPerimeter());
		System.out.println(t.getWidth());
		System.out.println(t.getHeight());
		System.out.println(t.toString());
		
		System.out.println(p.getArea());
		System.out.println(p.getPerimeter());
		System.out.println(p.getWidth());
		System.out.println(p.getHeight());
		System.out.println(p.toString());
		
	}

}
