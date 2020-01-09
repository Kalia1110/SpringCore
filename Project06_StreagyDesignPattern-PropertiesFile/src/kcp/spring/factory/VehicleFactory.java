package kcp.spring.factory;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import kcp.spring.components.Engine;
import kcp.spring.components.Vehicel;

public class VehicleFactory {
    public static String file = "src/kcp/spring/commmons/app.properties";
    static Properties props = null;
    static {
	try {
	    InputStream is = new FileInputStream(file);
	    props=new Properties();
	    props.load(is);
	   
	} catch (IOException e) {
	    e.printStackTrace();
	}
    }

    @SuppressWarnings("rawtypes")
    public static Vehicel getInstance() throws Exception {
	Engine engine = null;
	Class c1 = Class.forName(props.getProperty("dependent"));
	engine = (Engine) c1.newInstance();
	Vehicel vehicel=null;
	Class c2=Class.forName(props.getProperty("target"));
	vehicel= (Vehicel) c2.newInstance();
	vehicel.getEngine(engine);
	return vehicel;
    }

}
