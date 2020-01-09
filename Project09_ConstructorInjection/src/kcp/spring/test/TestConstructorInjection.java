package kcp.spring.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import kcp.spring.beans.Student;

@SuppressWarnings("deprecation")
public class TestConstructorInjection {

    public static void main(String[] args) {
	Resource resource;
	BeanFactory beanFactory;
	Student s1,s2,s3;
	String path="kcp/spring/configuration/applicationContext.xml";
	resource=new ClassPathResource(path);
	beanFactory=new XmlBeanFactory(resource);
	s1=beanFactory.getBean("student",Student.class);
	System.out.println(s1);
	s2=beanFactory.getBean("student1",Student.class);
	System.out.println(s2);
	s3=beanFactory.getBean("student3",Student.class);
	System.out.println(s3);


    }

}
