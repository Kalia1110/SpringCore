package kcp.spring.test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import kcp.spring.beans.BankCostomer;

@SuppressWarnings("deprecation")
public class InnerBeanTest {

    public static void main(String[] args) {
	String path="kcp/spring/configuration/applicationContext.xml";
	BeanFactory beanFactory;
	beanFactory=new XmlBeanFactory(new ClassPathResource(path));
	BankCostomer customer=beanFactory.getBean("kalu",BankCostomer.class);
	System.out.println(customer);
    }

}
