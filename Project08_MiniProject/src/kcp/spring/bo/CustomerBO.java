package kcp.spring.bo;

public class CustomerBO {
    private String customerName;
    private String customerAddress;
    private int customerID;
    private double principleAmount;
    private double rateAmount;
    private double totalAmount;
    
    
    public String getCustomerName() {
        return customerName;
    }
    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }
    public String getCustomerAddress() {
        return customerAddress;
    }
    public void setCustomerAddress(String customerAddress) {
        this.customerAddress = customerAddress;
    }
    public int getCustomerID() {
        return customerID;
    }
    public void setCustomerID(int customerID) {
        this.customerID = customerID;
    }
    public double getPrincipleAmount() {
        return principleAmount;
    }
    public void setPrincipleAmount(double principleAmount) {
        this.principleAmount = principleAmount;
    }
    public double getRateAmount() {
        return rateAmount;
    }
    public void setRateAmount(double rateAmount) {
        this.rateAmount = rateAmount;
    }
    public double getTotalAmount() {
        return totalAmount;
    }
    public void setTotalAmount(double totalAmount) {
        this.totalAmount = totalAmount;
    }
}
