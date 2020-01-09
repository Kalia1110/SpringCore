package kcp.spring.beans;

import java.util.Properties;

public class Faculty {
    private Properties fName;

    public void setfName(Properties fName) {
	System.out.println(fName.getClass());
	this.fName = fName;
    }

    @Override
    public String toString() {
	return "Faculty [fName=" + fName + "]";
    }
    
}
