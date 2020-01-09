package kcp.spring.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import kcp.spring.beans.CollegeSet;
import kcp.spring.beans.Faculty;
import kcp.spring.beans.PersonInfo;
import kcp.spring.beans.Student;
import kcp.spring.beans.fruitsMap;

@SuppressWarnings("deprecation")
public class CollectionTest {

    public static void main(String[] args) {
	
	BeanFactory beanFactory;
	String path = "kcp/spring/configuration/ApplicationContext.xml";
	beanFactory = new XmlBeanFactory(new ClassPathResource(path));
	Student st1 = beanFactory.getBean("student", Student.class);
	System.out.println(st1);
	System.out.println();
	CollegeSet st2 = beanFactory.getBean("clg", CollegeSet.class);
	System.out.println(st2);
	System.out.println();
	PersonInfo st3 = beanFactory.getBean("person", PersonInfo.class);
	System.out.println(st3);
	System.out.println();
	fruitsMap st4 = beanFactory.getBean("fruits", fruitsMap.class);
	System.out.println(st4);
	System.out.println();
	Faculty st5 = beanFactory.getBean("faculty", Faculty.class);
	System.out.println(st5);

    }

}
