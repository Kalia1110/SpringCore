package kcp.spring.test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;
import org.springframework.core.io.Resource;

@SuppressWarnings("deprecation")
public class CalcualateArea {
    		
    private static String file="src/kcp/spring/configuration/applicationcontext.xml";
    public CalcualateArea() {
	System.out.println("calculate:: 0-param constructor");

    }

    public static void main(String[] args) {
	Resource res=null;
	BeanFactory beanFactory=null;
	kcp.spring.beans.Area val=null;
	res= new FileSystemResource(file);
	beanFactory= new XmlBeanFactory(res);
	val=beanFactory.getBean("area",kcp.spring.beans.Area.class);
	System.out.println(val.getArea1(1, 2));
	
	
	

	

    }

}
