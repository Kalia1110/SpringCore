package kcp.spring.beans;

import java.util.Arrays;

public class TravalPlan {
    private String[] placeName;

    public TravalPlan() {
	System.out.println("TravalPlan.TravalPlan()0 param constructor");

    }

    public void setPlaceName(String[] placeName) {
	this.placeName = placeName;
    }

    @Override
    public String toString() {
	return "TravalPlan [placeName=" + Arrays.toString(placeName) + "]";
    }

    public TravalPlan(String[] placeName) {
	this.placeName = placeName;
    }
}
