package kcp.spring.beans;

public class TravalAgent {
    private String name;
    private TravalPlan tp;

    
      public TravalAgent() {
     System.out.println("TravalAgent()- 0 param constructor"); }
     
   

    public TravalAgent(String name, TravalPlan tp) {
	this.name = name;
	this.tp = tp;
	System.out.println("TravalAgent.TravalAgent(2 param)");
    }



    @Override
    public String toString() {
	return "TravalAgent [name=" + name + ", tp=" + tp + "]";
    }

    public void setName(String name) {
        this.name = name;
        System.out.println("TravalAgent.setName()");
    }

    public void setTp(TravalPlan tp) {
        this.tp = tp;
    }

}
