package kcp.spring.dto;

import java.io.Serializable;

@SuppressWarnings("serial")
public class StudentDTO implements Serializable {
    private String sName, sAddress;
    private int sRollno;
    private int mark1, mark2, mark3, mark4;
    private double totalMark, avgMark;

    public String getsName() {
	return sName;
    }

    public void setsName(String sName) {
	this.sName = sName;
    }

    public String getsAddress() {
	return sAddress;
    }

    public void setsAddress(String sAddress) {
	this.sAddress = sAddress;
    }

    public int getsRollno() {
	return sRollno;
    }

    public void setsRollno(int sRollno) {
	this.sRollno = sRollno;
    }

    public int getMark1() {
	return mark1;
    }

    public void setMark1(int mark1) {
	this.mark1 = mark1;
    }

    public int getMark2() {
	return mark2;
    }

    public void setMark2(int mark2) {
	this.mark2 = mark2;
    }

    public int getMark3() {
	return mark3;
    }

    public void setMark3(int mark3) {
	this.mark3 = mark3;
    }

    public int getMark4() {
	return mark4;
    }

    public void setMark4(int mark4) {
	this.mark4 = mark4;
    }

    public double getTotalMark() {
	return totalMark;
    }

    public void setTotalMark(double totalMark) {
	this.totalMark = totalMark;
    }

    public double getAvgMark() {
	return avgMark;
    }

    public void setAvgMark(double avgMark) {
	this.avgMark = avgMark;
    }

}
