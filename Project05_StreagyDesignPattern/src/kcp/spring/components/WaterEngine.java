package kcp.spring.components;

public class WaterEngine implements Engine {

    @Override
    public void start() {
	System.out.println(" WaterEngine Started");	
    }

    @Override
    public void stop() {
	System.out.println(" WaterEngine  ended");
	
    }

}
