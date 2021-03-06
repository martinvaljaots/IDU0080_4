package ttu.idu0080.order.server;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import javax.xml.ws.Service;

/**
 * This class was generated by Apache CXF 3.1.9
 * 2017-05-15T22:21:34.296+03:00
 * Generated source version: 3.1.9
 * 
 */
@WebServiceClient(name = "OrderServiceService", 
                  wsdlLocation = "file:/C:/Users/Smarta/Documents/Veebiteenused/ariprotsessi_ylesande_lsamaterjalid/5/ProductServiceClientServiceClient_naide/MyProductService/WebContent/wsdl/orders.wsdl",
                  targetNamespace = "http://server.order.idu0080.ttu/") 
public class OrderServiceService extends Service {

    public final static URL WSDL_LOCATION;

    public final static QName SERVICE = new QName("http://server.order.idu0080.ttu/", "OrderServiceService");
    public final static QName OrderServicePort = new QName("http://server.order.idu0080.ttu/", "OrderServicePort");
    static {
        URL url = null;
        try {
            url = new URL("file:/C:/Users/Smarta/Documents/Veebiteenused/ariprotsessi_ylesande_lsamaterjalid/5/ProductServiceClientServiceClient_naide/MyProductService/WebContent/wsdl/orders.wsdl");
        } catch (MalformedURLException e) {
            java.util.logging.Logger.getLogger(OrderServiceService.class.getName())
                .log(java.util.logging.Level.INFO, 
                     "Can not initialize the default wsdl from {0}", "file:/C:/Users/Smarta/Documents/Veebiteenused/ariprotsessi_ylesande_lsamaterjalid/5/ProductServiceClientServiceClient_naide/MyProductService/WebContent/wsdl/orders.wsdl");
        }
        WSDL_LOCATION = url;
    }

    public OrderServiceService(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public OrderServiceService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public OrderServiceService() {
        super(WSDL_LOCATION, SERVICE);
    }
    
    public OrderServiceService(WebServiceFeature ... features) {
        super(WSDL_LOCATION, SERVICE, features);
    }

    public OrderServiceService(URL wsdlLocation, WebServiceFeature ... features) {
        super(wsdlLocation, SERVICE, features);
    }

    public OrderServiceService(URL wsdlLocation, QName serviceName, WebServiceFeature ... features) {
        super(wsdlLocation, serviceName, features);
    }    




    /**
     *
     * @return
     *     returns OrderService
     */
    @WebEndpoint(name = "OrderServicePort")
    public OrderService getOrderServicePort() {
        return super.getPort(OrderServicePort, OrderService.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns OrderService
     */
    @WebEndpoint(name = "OrderServicePort")
    public OrderService getOrderServicePort(WebServiceFeature... features) {
        return super.getPort(OrderServicePort, OrderService.class, features);
    }

}
