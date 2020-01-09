package kcp.spring.SuzukiCars;

import kcp.spring.tyre.CarTyre;

public class ErtigaCar implements SuzukiCars {
    CarTyre carTyre=null;
    public ErtigaCar(CarTyre carTyre) {
	this.carTyre=carTyre;
    }
    @Override
    public String Specification() {
	
	return " ErtigaCar have 1462cc - 1498cc\n "
		+ " Petrol-Electric Hybrid/Diesel\n "
		+ " Manual/Torque Converter Auto \n"
		+ " 17.99kpl - 24.2kpl"
		+" Tyre Provide::"
		+carTyre.getDimension();
    }

    @Override
    public String getGear() {
	return "ErtigaCar have 5+1 Gear"+"\nPrice::"+carTyre.getTyrePrice();
    }

}
