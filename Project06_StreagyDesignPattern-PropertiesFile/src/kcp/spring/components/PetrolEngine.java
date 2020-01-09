package kcp.spring.components;

public class PetrolEngine implements Engine {

    @Override
    public void start() {
	System.out.println(" PetrolEngine Started");
	
    }

    @Override
    public void stop() {
	System.out.println(" PetrolEngine  ended");
	
    }

}
