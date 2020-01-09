package kcp.spring.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

import kcp.spring.beans.EnggCourse;

@SuppressWarnings("deprecation")
public class CollectonMergingTest {

    public static void main(String[] args) {
	BeanFactory beanFactory;
	String path = "src/main/java/kcp/spring/configuration/applicationContext.xml";
	EnggCourse course;
	beanFactory = new XmlBeanFactory(new FileSystemResource(path));
	course = beanFactory.getBean("me", EnggCourse.class);
	System.out.println(course);
    }

}
