package kcp.spring.SuzukiCars;

import kcp.spring.tyre.CarTyre;

public class BalenoCar implements SuzukiCars {
    CarTyre carTyre=null;
    public BalenoCar(CarTyre carTyre) {
	this.carTyre=carTyre;
    }

    @Override
    public String Specification() {
	
	return "BalenoCar have '1197cc - 1248cc' and\n"
		+ "'Petrol/Petrol-Electric Hybrid/Diesel'and"
		+"Manual/CVT Auto"+"19.56kpl - 27.39kpl"+" Tyre Provide::"+carTyre.getDimension();
    }

    @Override
    public String getGear() {
	return "BalenoCar have 5+1 Gear"+"\nPrice::"+carTyre.getTyrePrice();
    }

}
      