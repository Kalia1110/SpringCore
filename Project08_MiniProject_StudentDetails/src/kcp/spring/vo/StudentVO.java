package kcp.spring.vo;

public class StudentVO {

    private String sName, sAddress, sRollno;
    private String mark1, mark2, mark3, mark4;

    public String getsRollno() {
	return sRollno;
    }

    public void setsRollno(String sRollno) {
	this.sRollno = sRollno;
    }

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

    public String getMark1() {
	return mark1;
    }

    public void setMark1(String mark1) {
	this.mark1 = mark1;
    }

    public String getMark2() {
	return mark2;
    }

    public void setMark2(String mark2) {
	this.mark2 = mark2;
    }

    public String getMark3() {
	return mark3;
    }

    public void setMark3(String mark3) {
	this.mark3 = mark3;
    }

    public String getMark4() {
	return mark4;
    }

    public void setMark4(String mark4) {
	this.mark4 = mark4;
    }
}
