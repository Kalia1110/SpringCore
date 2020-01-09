package kcp.spring.factorymethod;

import kcp.spring.SuzukiCars.BalenoCar;
import kcp.spring.SuzukiCars.CelerioCars;
import kcp.spring.SuzukiCars.CiazCar;
import kcp.spring.SuzukiCars.ErtigaCar;
import kcp.spring.SuzukiCars.SuzukiCars;
import kcp.spring.SuzukiCars.SwiftCar;
import kcp.spring.tyre.CarTyre;
import kcp.spring.tyre.*;

public class FactoryMethod {
    	public static SuzukiCars getInstance(String carName,String tyreName)  {
    	SuzukiCars suzukiCars=null;
    	CarTyre carTyre=null;
    	if (tyreName.equalsIgnoreCase("CEAT")) {
	    carTyre=new CEAT_Tyres();
	}else if (tyreName.equalsIgnoreCase("MRF")) {
	    carTyre= new MRF_Tyres();
	}else if (tyreName.equalsIgnoreCase("Michelin")) {
	    carTyre= new Michelin_tyres();
	} else if (tyreName.equalsIgnoreCase("Bridgestone")) {
	    carTyre= new Bridgestone_tyres();
	}else {
	    throw new IllegalArgumentException("Invalid tyres");
	}
    	
    	if (carName.equalsIgnoreCase("CelerioCars")) {
    	suzukiCars=new CelerioCars(carTyre);
	}else if(carName.equalsIgnoreCase("SwiftCar")) {
	    suzukiCars=new SwiftCar(carTyre); 
	}else if (carName.equalsIgnoreCase("BalenoCar")) {
	    suzukiCars=new BalenoCar(carTyre);
	}else  if(carName.equalsIgnoreCase("ErtigaCar")){
	    suzukiCars= new ErtigaCar(carTyre);
	}else if (carName.equalsIgnoreCase("CiazCar")) {
	    suzukiCars= new CiazCar(carTyre);
	}else {
	    throw new IllegalArgumentException("Invalid CarName");
	} 
	    return suzukiCars;
    	    
    	}
}
