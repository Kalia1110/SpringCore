package kcp.spring.beans;

public class TravalAgent {
    private String name;
    private TravalPlan tp;

    
      public TravalAgent() {
     System.out.println("TravalAgent()- 0 param constructor"); }
     
   

    @Override
    public String toString() {
	return "TravalAgent [name=" + name + ", tp=" + tp + "]";
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setTp(TravalPlan tp) {
        this.tp = tp;
    }

}
