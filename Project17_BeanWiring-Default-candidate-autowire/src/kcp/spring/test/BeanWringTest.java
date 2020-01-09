package kcp.spring.test;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

import kcp.spring.beans.TravalAgent;

public class BeanWringTest {

    public static void main(String[] args) {
	 String path="kcp/spring/configuration/applicationContext.xml";
	DefaultListableBeanFactory factory=new DefaultListableBeanFactory();
	XmlBeanDefinitionReader reader=new XmlBeanDefinitionReader(factory);
	reader.loadBeanDefinitions(path);
	TravalAgent agent=factory.getBean("agent",TravalAgent.class);
	System.out.println(agent);

    }

}
