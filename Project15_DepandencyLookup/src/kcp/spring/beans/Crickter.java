package kcp.spring.beans;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

@SuppressWarnings("deprecation")
public class Crickter {
    String beanid;
    public void setBeanid(String beanid) {
        this.beanid = beanid;
    }
    public Crickter() {
	System.out.println("Crickter 0 param constructor");
    }
    public void bowling() {
	System.out.println("crickter bowling");
    }

    public void fielding() {
	System.out.println("crickter fielding");
    }

    public void batting() {
	Bat bat = null;
	String path = "kcp/spring/configuration/applicationContext.xml";
	BeanFactory bf = null;
	bf = new XmlBeanFactory(new ClassPathResource(path));
	bat = bf.getBean("bat", Bat.class);
	// System.out.println(bat);
	int runs = bat.batting();
	System.out.println("Crickter bating with  runs::" + runs);

    }

}
