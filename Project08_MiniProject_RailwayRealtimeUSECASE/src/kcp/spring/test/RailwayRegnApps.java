package kcp.spring.test;

import java.util.Scanner;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import kcp.spring.controller.MainController;
import kcp.spring.vo.PassengerVO;

@SuppressWarnings("deprecation")
public class RailwayRegnApps {

    public static void main(String[] args) {
	Resource resource;
	BeanFactory beanFactory;
	MainController controller;
	 String path="kcp/spring/configuration/applicationContext.xml";
	resource=new ClassPathResource(path);
	beanFactory=new XmlBeanFactory(resource);
	controller=beanFactory.getBean("MainController",MainController.class);
	Scanner sc= new Scanner(System.in);
	System.out.println("************************Passenger Detail****************************");
	System.out.println("Enter Passenger Name:: ");
	String passangerName=sc.nextLine();
	System.out.println("Enter Passenger age:: ");
	String age=sc.nextLine();
	System.out.println("Enter Passenger Address:: ");
	String address=sc.nextLine();
	System.out.println("Enter Passenger SourcePoint:: ");
	String sourcePoint=sc.nextLine();
	System.out.println("Enter Passenger destinationPoint:: ");
	String destinationPoint=sc.nextLine();
	System.out.println("Enter Passenger totalDistance:: ");
	String totalDistance=sc.nextLine();
	System.out.println("Enter Passenger jouranyAmount:: ");
	String jouranyAmount=sc.nextLine();
	PassengerVO vo=new PassengerVO();
	vo.setPassangerName(passangerName);
	vo.setAge(age);
	vo.setAddress(address);
	vo.setSourcePoint(sourcePoint);
	vo.setDestinationPoint(destinationPoint);
	vo.setTotalDistance(totalDistance);
	vo.setJouranyAmount(jouranyAmount);
	try {
	    String result=controller.processData(vo);
	    System.out.println(result);
	} catch (Exception e) {
	    // TODO Auto-generated catch block
	    e.printStackTrace();
	}
	

    }

}
