package PageFactoryandTestdata;

import java.io.FileInputStream;

import java.io.IOException;
import java.util.Properties;

public class configReader {
   
	 public static Properties getPropertyObject() throws IOException {
		 String varValue = System.getenv("L2CONFIG_FILE");
	    	System.out.println(varValue);
	        FileInputStream fb = new FileInputStream(varValue);
	        Properties prop = new Properties();
	        prop.load(fb);
	        return prop;
	    }
    
    public static String getASINO() throws IOException {
    	 return getPropertyObject().getProperty("ORDERS_ASI");
    }

    public static String getOrdersUser() throws IOException {
    	 return getPropertyObject().getProperty("ORDERS_USER");
    }

    public static String getOrdersPassword() throws IOException {
    	 return getPropertyObject().getProperty("ORDERS_PASSWORD");
      
    }


  
}