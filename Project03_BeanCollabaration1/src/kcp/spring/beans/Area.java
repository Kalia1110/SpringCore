package kcp.spring.beans;
import kcp.spring.beans.Shape;

public class Area {
    private Shape shape;
    public Area() {
	System.out.println("Area:: 0-param constructor");

    }

    public void setShape(Shape shape) {
	this.shape = shape;
    }
    public double getArea1(double x,double y) {
	double a=shape.area(x, y);
	return a;
    }

}
