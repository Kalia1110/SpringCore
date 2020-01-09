package kcp.spring.constructorInjection;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.FileSystemResource;
import org.springframework.core.io.Resource;

import kcp.spring.beans.WishMessage;

@SuppressWarnings("deprecation")
public class ConstructorInjectionTest {


	public static void main(String[] args) {
		Resource res=null;
		BeanFactory beanFactory=null;
		WishMessage msg=null;
		//Object obj=null;
		//res=new FileSystemResource("src/kcp/spring/configuration/applicationContext.xml");
		res=new  ClassPathResource("kcp/spring/configuration/applicationContext.xml");
		beanFactory=new XmlBeanFactory(res);
		msg=beanFactory.getBean("wish", WishMessage.class);
		//obj=beanFactory.getBean("wish");
		//msg=(WishMessage) obj;
		System.out.println(msg.wishMessageGeneretor(" kalu "));

	}

}
