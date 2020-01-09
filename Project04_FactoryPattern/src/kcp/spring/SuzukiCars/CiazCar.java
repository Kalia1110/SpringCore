package kcp.spring.SuzukiCars;

import kcp.spring.tyre.CarTyre;

public class CiazCar implements SuzukiCars {
    CarTyre carTyre=null;
    public CiazCar(CarTyre carTyre) {
	this.carTyre=carTyre;
    }
    @Override
    public String Specification() {
	
	return "CiazCar have 1248cc - 1498cc \n"
		+ " Petrol-Electric Hybrid\n"
		+ "Diesel-Diesel-Electric Hybrid \n"
		+ " Manual/Torque Converter Auto  20.28kpl - 28.09kpl\n"
		+" Tyre Provide::"
		+carTyre.getDimension();
    }

    @Override
    public String getGear() {
	return "CiazCar have 5+1 Gear"+"\nPrice::"+carTyre.getTyrePrice();
    }


}
