package kcp.spring.beans;

public class Rectangle implements Shape {

    private double rectangle;
    public Rectangle() {
	System.out.println("Rectangle:: 0-param constructor");
    }

    @Override
    public double area(double value1, double value2) {
	rectangle=1/2*value1*value2;
	return rectangle ;
    }

}
