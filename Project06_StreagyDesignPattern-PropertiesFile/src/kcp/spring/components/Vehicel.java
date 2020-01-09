package kcp.spring.components;

public class Vehicel {
    Engine engine = null;

//    public Vehicel(Engine engine) {
//	this.engine = engine;
//    }

    	public void getEngine (Engine engine) {
	    this.engine=engine;
	}
    public void jourany(String start, String end) {
	engine.start();
	System.out.println("jourany Started from " + start);
	engine.stop();
	System.out.println("jourany ended to " + end);
    }

}
