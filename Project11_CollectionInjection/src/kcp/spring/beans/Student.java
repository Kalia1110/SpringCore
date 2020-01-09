package kcp.spring.beans;

import java.util.Date;
import java.util.Arrays;

public class Student {

    private int[] marks;
    private Date[] dates;

    public void setMarks(int[] marks) {
	this.marks = marks;
    }

    public void setDates(Date[] dates) {
	this.dates = dates;
    }

    @Override
    public String toString() {
	return "Student [marks=" + Arrays.toString(marks) + ", dates=" + Arrays.toString(dates) + "]";
    }
    
}
