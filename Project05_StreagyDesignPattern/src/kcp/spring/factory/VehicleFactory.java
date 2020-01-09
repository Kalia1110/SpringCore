package kcp.spring.factory;

import kcp.spring.components.DieselEngine;
import kcp.spring.components.Engine;
import kcp.spring.components.PetrolEngine;
import kcp.spring.components.Vehicel;
import kcp.spring.components.WaterEngine;

public class VehicleFactory {

    public static Vehicel getInstance(String engineType) {
	Engine engine=null;
	if (engineType.equalsIgnoreCase("water")) {
	    engine=new WaterEngine();
	}else if(engineType.equalsIgnoreCase("petrol")) {
	    engine=new PetrolEngine();
	}else if (engineType.equalsIgnoreCase("diesel")) {
	    engine=new DieselEngine();
	}else {
	    throw new IllegalArgumentException("invalid engine");
	}
	Vehicel vehicel=new Vehicel(engine);
	//vehicel.getEngine(engine);
	return vehicel;
    }

}
