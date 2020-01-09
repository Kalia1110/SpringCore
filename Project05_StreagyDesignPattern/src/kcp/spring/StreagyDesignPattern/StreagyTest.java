package kcp.spring.StreagyDesignPattern;

import kcp.spring.components.Vehicel;
import kcp.spring.factory.VehicleFactory;

public class StreagyTest {

    public static void main(String[] args) {
		Vehicel vehicel=null;
		vehicel=VehicleFactory.getInstance("water");
		vehicel.jourany("Bhanjanagar", "Berhampur");
		System.out.println();
		vehicel=VehicleFactory.getInstance("petrol");
		vehicel.jourany("hyderabad", "goa");
    }

}
