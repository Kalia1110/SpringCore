package kcp.spring.beans;

import java.util.Date;

public class PersonInfo {
    private int eid;
    private String name;
    private Date dob;
    private long adharNo;

    public PersonInfo(int eid, String name, Date dob, long adharNo) {
	this.eid = eid;
	this.name = name;
	this.dob = dob;
	this.adharNo = adharNo;
    }

    @Override
    public String toString() {
	return "PersonInfo [eid=" + eid + ", name=" + name + ", dob=" + dob + ", adharNo=" + adharNo + "]";
    }

}
