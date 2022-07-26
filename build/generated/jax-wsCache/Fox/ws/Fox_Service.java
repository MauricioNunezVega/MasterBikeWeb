
package ws;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.11-b150120.1832
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "Fox", targetNamespace = "http://WS/", wsdlLocation = "http://localhost:8080/WebServiceFox/Fox?wsdl")
public class Fox_Service
    extends Service
{

    private final static URL FOX_WSDL_LOCATION;
    private final static WebServiceException FOX_EXCEPTION;
    private final static QName FOX_QNAME = new QName("http://WS/", "Fox");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://localhost:8080/WebServiceFox/Fox?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        FOX_WSDL_LOCATION = url;
        FOX_EXCEPTION = e;
    }

    public Fox_Service() {
        super(__getWsdlLocation(), FOX_QNAME);
    }

    public Fox_Service(WebServiceFeature... features) {
        super(__getWsdlLocation(), FOX_QNAME, features);
    }

    public Fox_Service(URL wsdlLocation) {
        super(wsdlLocation, FOX_QNAME);
    }

    public Fox_Service(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, FOX_QNAME, features);
    }

    public Fox_Service(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public Fox_Service(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns Fox
     */
    @WebEndpoint(name = "FoxPort")
    public Fox getFoxPort() {
        return super.getPort(new QName("http://WS/", "FoxPort"), Fox.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns Fox
     */
    @WebEndpoint(name = "FoxPort")
    public Fox getFoxPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://WS/", "FoxPort"), Fox.class, features);
    }

    private static URL __getWsdlLocation() {
        if (FOX_EXCEPTION!= null) {
            throw FOX_EXCEPTION;
        }
        return FOX_WSDL_LOCATION;
    }

}
