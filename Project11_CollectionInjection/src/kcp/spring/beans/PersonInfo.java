package kcp.spring.beans;

import java.util.List;

public class PersonInfo {
    private List<String> personName;
    private List<String> address;

    @Override
    public String toString() {
	return "PersonInfo [personName=" + personName + ", address=" + address + "]";
    }

    public void setPersonName(List<String> personName) {
	System.out.println(personName.getClass());
	this.personName = personName;
    }

    public void setAddress(List<String> address) {
	this.address = address;
    }
}
