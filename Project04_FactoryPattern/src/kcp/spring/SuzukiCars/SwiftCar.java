package kcp.spring.SuzukiCars;

import kcp.spring.tyre.CarTyre;

public class SwiftCar implements SuzukiCars {
    CarTyre carTyre;
    public SwiftCar(CarTyre carTyre) {
	this.carTyre=carTyre;
    }
    @Override
    public String Specification() {
	
	return " SwiftCar have 1197cc - 1248cc \n "
		+ "Petrol/Diesel \n "
		+ "Manual/AMT Auto \n "
		+ "21.21kpl - 28.4kpl"+" Tyre Provide::"
		+" Tyre Provide::"
		+carTyre.getDimension();
    }

    @Override
    public String getGear() {
	return "SwiftCar have 5+1 Gear"+"\nPrice::"+carTyre.getTyrePrice();
    }

}
