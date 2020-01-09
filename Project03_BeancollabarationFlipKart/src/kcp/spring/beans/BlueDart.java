package kcp.spring.beans;

public class BlueDart implements Courier{
    public BlueDart() {
	System.out.println("BlueDart 0 param constructor");
    }
    @Override
    public String deliver(int orderID) {
       
        return "BlueDart is ready to order "+orderID;
    }

}
