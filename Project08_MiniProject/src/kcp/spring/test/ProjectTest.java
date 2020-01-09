package kcp.spring.test;

import java.util.Scanner;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import kcp.spring.controller.CustomerController;
import kcp.spring.vo.CustomerVO;

@SuppressWarnings("deprecation")
public class ProjectTest {

    public static void main(String[] args) throws Exception {
	System.out.println("main Start");
	 final String path="kcp/spring/configuration/applicationContext.xml";
	Resource resource;
	BeanFactory beanFactory;
	resource=new ClassPathResource(path);
	beanFactory= new XmlBeanFactory(resource);
	CustomerController control=beanFactory.getBean("customerController",CustomerController.class);
	CustomerVO vo=new CustomerVO();
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter Customer Name:: ");
	String name=sc.next();
	System.out.println("Enter Customer ID:: ");
	String cid=sc.next();
	System.out.println("Enter Customer Address:: ");
	String address=sc.next();
	System.out.println("Enter Customer pAmout:: ");
	String pAmout=sc.next();
	System.out.println("Enter Customer Rate of amout:: ");
	String rateAmout=sc.next();
	
	vo.setCustomerName(name);
	vo.setCustomerID(cid);
	vo.setCustomerAddress(address);
	vo.setPrincipleAmount(pAmout);
	vo.setRateAmount(rateAmout);
	
	System.out.println(vo.toString());
	String result=control.processData(vo);
	System.out.println(result);
	System.out.println("main end");

	
	

    }

}
