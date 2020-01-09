package kcp.spring.components;

public class DieselEngine implements Engine {

    @Override
    public void start() {
	System.out.println(" DieselEngine Started");
	
    }

    @Override
    public void stop() {
	System.out.println(" DieselEngine  ended");
    }

}
