package kcp.spring.SuzukiCars;

import kcp.spring.tyre.CarTyre;

public class CelerioCars implements SuzukiCars {
    CarTyre carTyre=null;
    public CelerioCars(CarTyre carTyre) {
	this.carTyre=carTyre;
	//System.out.println("CelerioCars"+carTyre);
    }
    @Override
    public String Specification() {
	
	
	return "    CelerioCars'998cc' \n"
		+ "'Petrol/Petrol-CNG'and Manual/AMT Auto\n"
		+"23.1kpl"+" Tyre Provide::\n"+carTyre.getDimension();
	
    }

    @Override
    public String getGear() {
	return "CelerioCars have 5+1 Gear"+"\nPrice::\n"+carTyre.getTyrePrice();
    }


}
