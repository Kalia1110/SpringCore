package kcp.spring.beans;

import java.util.Set;

public class CollegeSet {
    private Set<String> collegeName;
    private Set<Integer> totalStudent;

    public void setCollegeName(Set<String> collegeName) {
	System.out.println(collegeName.getClass());
	this.collegeName = collegeName;
    }

    public void setTotalStudent(Set<Integer> totalStudent) {
	this.totalStudent = totalStudent;
    }

    @Override
    public String toString() {
	return "CollegeSet [collegeName=" + collegeName + ", totalStudent=" + totalStudent + "]";
    }
    
}
