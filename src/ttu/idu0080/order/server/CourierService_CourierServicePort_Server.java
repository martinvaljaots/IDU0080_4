
package ttu.idu0080.order.server;

/**
 * Please modify this class to meet your needs
 * This class is not complete
 */

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.Endpoint;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

/**
 * This class was generated by Apache CXF 3.1.9
 * 2017-05-15T22:21:02.488+03:00
 * Generated source version: 3.1.9
 * 
 */
public class CourierService_CourierServicePort_Server{

    protected CourierService_CourierServicePort_Server() throws java.lang.Exception {
        System.out.println("Starting Server");
        Object implementor = new CourierServicePortImpl();
        String address = "http://tund.ttu.ee:80/orderservice/couriers";
        Endpoint.publish(address, implementor);
    }
    
    public static void main(String args[]) throws java.lang.Exception { 
        new CourierService_CourierServicePort_Server();
        System.out.println("Server ready..."); 
        
        Thread.sleep(5 * 60 * 1000); 
        System.out.println("Server exiting");
        System.exit(0);
    }
}
