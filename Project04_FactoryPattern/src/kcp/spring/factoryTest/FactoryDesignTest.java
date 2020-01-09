package kcp.spring.factoryTest;

import kcp.spring.SuzukiCars.SuzukiCars;
import kcp.spring.factorymethod.FactoryMethod;


public class FactoryDesignTest {

   
    public static void main(String[] args)  {
	SuzukiCars suzukiCars=null;
	suzukiCars=FactoryMethod.getInstance("CelerioCars","CEAT");
	System.out.println(suzukiCars.Specification());
	System.out.println(suzukiCars.getGear());
	
	System.out.println("**********************************************************");
	suzukiCars=FactoryMethod.getInstance("ErtigaCar","Bridgestone");
	System.out.println(suzukiCars.Specification());
	System.out.println(suzukiCars.getGear());
	System.out.println("**********************************************************");
	suzukiCars=FactoryMethod.getInstance("CiazCar","Michelin");
	System.out.println(suzukiCars.Specification());
	System.out.println(suzukiCars.getGear());
	System.out.println("**********************************************************");

    }

}
