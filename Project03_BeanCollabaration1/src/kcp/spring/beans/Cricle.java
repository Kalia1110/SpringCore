package kcp.spring.beans;

public class Cricle implements Shape {

    private double area;
    public Cricle() {
	System.out.println("cricle:: 0-param constructor");
    }

    @Override
    public double area(double value1,double value2) {
	final double pi=3.14;
	area=pi*value1*value2;
	return area;
    }

}
