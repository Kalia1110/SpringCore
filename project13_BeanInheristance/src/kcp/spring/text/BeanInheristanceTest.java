package kcp.spring.text;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import kcp.spring.beans.PulsorBike;

@SuppressWarnings("deprecation")
public class BeanInheristanceTest {

    public static void main(String[] args) {
	String path="kcp/spring/configuration/applicationContext.xml";
	BeanFactory beanFactory;
	PulsorBike p1,p2;
	beanFactory=new XmlBeanFactory( new ClassPathResource(path));
	p1=beanFactory.getBean("rajaplusor",PulsorBike.class);
	System.out.println(p1);
	System.out.println("***********************");
	System.out.println();
	p2=beanFactory.getBean("jagaplusor",PulsorBike.class);
	System.out.println(p2);
    }

}
