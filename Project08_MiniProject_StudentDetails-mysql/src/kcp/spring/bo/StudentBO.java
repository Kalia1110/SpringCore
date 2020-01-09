package kcp.spring.bo;

public class StudentBO {
    private String sName, sAddress;
   // private int sRollno;
    private String result;
    private double totalMark, avgMark;

//    public int getsRollno() {
//	return sRollno;
//    }
//
//    public void setsRollno(int sRollno) {
//	this.sRollno = sRollno;
//    }

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

    public String getResult() {
	return result;
    }

    public void setResult(String result) {
	this.result = result;
    }

}
