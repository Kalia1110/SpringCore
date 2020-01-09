package kcp.spring.test;

import java.util.Scanner;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


import kcp.spring.controller.StudentControl;
import kcp.spring.vo.StudentVO;

public class StudentApp {

    @SuppressWarnings("resource")
	public static void main(String[] args) throws Exception {
	 final String path="kcp/spring/configuration/applicationContext.xml";
		ApplicationContext context=null;
		context=new ClassPathXmlApplicationContext(path);
		StudentControl control=context.getBean("studentControl",StudentControl.class);
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Student Name:: ");
		String sName=sc.next();
//		System.out.println("Enter Student rollno:: ");
//		String sRollno=sc.next();
		System.out.println("Enter Student Address:: ");
		String sAddress=sc.next();
		System.out.println("Enter Student Mark1:: ");
		String mark1=sc.next();
		System.out.println("Enter Student Mark2:: ");
		String mark2=sc.next();
		System.out.println("Enter Student Mark3:: ");
		String mark3=sc.next();
		System.out.println("Enter Student Mark4:: ");
		String mark4=sc.next();
		StudentVO vo=new StudentVO();
		vo.setsName(sName);
		//vo.setsRollno(sRollno);
		vo.setsAddress(sAddress);
		vo.setMark1(mark1);
		vo.setMark2(mark2);
		vo.setMark3(mark3);
		vo.setMark4(mark4);
		System.out.println(control.processData(vo));
		

    }

}
