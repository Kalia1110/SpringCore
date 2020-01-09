package kcp.spring.beans;

import java.util.Map;

public class fruitsMap {
    private Map<?, ?> fruitName;

    @Override
    public String toString() {
	return "fruitsMap [fruitName=" + fruitName + "]";
    }

    public void setFruitName(Map<?, ?> fruitName) {
	System.out.println(fruitName.getClass());
        this.fruitName = fruitName;
    }
    

}
