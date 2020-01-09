package kcp.spring.beans;

public class Student {
    private String sName;
    private int sRollno;
    private int sMark;
    public Student(String sName, int sRollno, int sMark) {
	this.sName = sName;
	this.sRollno = sRollno;
	this.sMark = sMark;
	
    }
    @Override
    public String toString() {
	return "Student [sName=" + sName + ", sRollno=" + sRollno + ", sMark=" + sMark + "]";
    }
}
