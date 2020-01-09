package kcp.spring.vo;

public class PassengerVO {
    private String PassangerName;
    private String Age;
    private String Address;
    private String sourcePoint;
    private String destinationPoint;
    private String jouranyAmount;
    private String totalDistance;
	
	public String getTotalDistance() {
	    return totalDistance;
	}
	public void setTotalDistance(String totalDistance) {
	    this.totalDistance = totalDistance;
	}
    
    public String getPassangerName() {
        return PassangerName;
    }
    public void setPassangerName(String passangerName) {
        PassangerName = passangerName;
    }
    public String getAge() {
        return Age;
    }
    public void setAge(String age) {
        Age = age;
    }
    public String getAddress() {
        return Address;
    }
    public void setAddress(String address) {
        Address = address;
    }
    public String getSourcePoint() {
        return sourcePoint;
    }
    public void setSourcePoint(String sourcePoint) {
        this.sourcePoint = sourcePoint;
    }
    public String getDestinationPoint() {
        return destinationPoint;
    }
    public void setDestinationPoint(String destinationPoint) {
        this.destinationPoint = destinationPoint;
    }
    public String getJouranyAmount() {
        return jouranyAmount;
    }
    public void setJouranyAmount(String jouranyAmount) {
        this.jouranyAmount = jouranyAmount;
    }
   
}
