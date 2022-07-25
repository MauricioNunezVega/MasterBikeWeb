
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
@WebServiceClient(name = "Proveedor", targetNamespace = "http://WS/", wsdlLocation = "http://localhost:8080/WebService/Proveedor?wsdl")
public class Proveedor_Service
    extends Service
{

    private final static URL PROVEEDOR_WSDL_LOCATION;
    private final static WebServiceException PROVEEDOR_EXCEPTION;
    private final static QName PROVEEDOR_QNAME = new QName("http://WS/", "Proveedor");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://localhost:8080/WebService/Proveedor?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        PROVEEDOR_WSDL_LOCATION = url;
        PROVEEDOR_EXCEPTION = e;
    }

    public Proveedor_Service() {
        super(__getWsdlLocation(), PROVEEDOR_QNAME);
    }

    public Proveedor_Service(WebServiceFeature... features) {
        super(__getWsdlLocation(), PROVEEDOR_QNAME, features);
    }

    public Proveedor_Service(URL wsdlLocation) {
        super(wsdlLocation, PROVEEDOR_QNAME);
    }

    public Proveedor_Service(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, PROVEEDOR_QNAME, features);
    }

    public Proveedor_Service(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public Proveedor_Service(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns Proveedor
     */
    @WebEndpoint(name = "ProveedorPort")
    public Proveedor getProveedorPort() {
        return super.getPort(new QName("http://WS/", "ProveedorPort"), Proveedor.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns Proveedor
     */
    @WebEndpoint(name = "ProveedorPort")
    public Proveedor getProveedorPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://WS/", "ProveedorPort"), Proveedor.class, features);
    }

    private static URL __getWsdlLocation() {
        if (PROVEEDOR_EXCEPTION!= null) {
            throw PROVEEDOR_EXCEPTION;
        }
        return PROVEEDOR_WSDL_LOCATION;
    }

}
