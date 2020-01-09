package kcp.spring.StreagyDesignPattern;

import kcp.spring.components.Vehicel;
import kcp.spring.factory.VehicleFactory;

public class StreagyTest {

    public static void main(String[] args)throws Exception {
		Vehicel vehicel=null;
		vehicel=VehicleFactory.getInstance();
		vehicel.jourany("Bhanjanagar", "Berhampur");
		System.out.println();
		vehicel=VehicleFactory.getInstance();
		vehicel.jourany("hyderabad", "goa");
    }

}
