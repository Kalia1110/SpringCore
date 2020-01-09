package kcp.spring.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.core.io.FileSystemResource;
import org.springframework.core.io.Resource;

import kcp.spring.Empolyee.Employee;

@SuppressWarnings("deprecation")
public class Employee_SetterInjection {

	public static void main(String[] args) {
		ApplicationContext context;
		Employee emp=null;
		context=new FileSystemXmlApplicationContext("src/kcp/spring/cnfs/Applicationcontext.xml");
		emp=context.getBean("emp",Employee.class);
		emp.Display();
	}

}
