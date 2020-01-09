package kcp.spring.dto;

import java.io.Serializable;

@SuppressWarnings("serial")
public class CustomerDTO implements Serializable {
    private String customerName;
    private String customerAddress;
    private int customerID;
    private double principleAmount;
    private double rateAmount;
    private double time;
    private double total;
    
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
    public double getTime() {
        return time;
    }
    public void setTime(float time) {
        this.time = time;
    }
    public double getTotal() {
        return total;
    }
    public void setTotal(double total) {
        this.total = total;
    }

}
