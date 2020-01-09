package kcp.spring.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import kcp.spring.beans.Crickter;

@SuppressWarnings("deprecation")
public class DepandencyLookuTest {

    public static void main(String[] args) {
	 String path="kcp/spring/configuration/applicationContext.xml";
	 BeanFactory bf;
	 Crickter ckter=null;
	 bf= new XmlBeanFactory(new ClassPathResource(path));
	 ckter=bf.getBean("ckt",Crickter.class);
	 //System.out.println(ckter);
	 ckter.batting();
	 ckter.bowling();
	 ckter.fielding();

    }

}
