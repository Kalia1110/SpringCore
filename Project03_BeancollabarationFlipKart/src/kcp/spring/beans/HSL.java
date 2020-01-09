package kcp.spring.beans;

public class HSL implements Courier {
    public HSL() {
	System.out.println("hsl 0 param constructor");
    }
    @Override
    public String deliver(int orderID) {
        
        return "HSL is ready to order "+orderID;
    }

}
