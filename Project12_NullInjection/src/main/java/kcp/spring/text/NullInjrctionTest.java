package kcp.spring.text;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

import kcp.spring.beans.PersonInfo;

@SuppressWarnings("deprecation")
public class NullInjrctionTest {

    public static void main(String[] args) {
	BeanFactory beanFactory;
	String path = "src/main/java/kcp/spring/configuration/applicationContext.xml";
	PersonInfo p1;
	beanFactory = new XmlBeanFactory(new FileSystemResource(path));
	p1=beanFactory.getBean("person",PersonInfo.class);
	System.out.println(p1);

    }

}
