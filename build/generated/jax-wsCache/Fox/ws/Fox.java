
package ws;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.11-b150120.1832
 * Generated source version: 2.2
 * 
 */
@WebService(name = "Fox", targetNamespace = "http://WS/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface Fox {


    /**
     * 
     * @param datos
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "operation", targetNamespace = "http://WS/", className = "ws.Operation")
    @ResponseWrapper(localName = "operationResponse", targetNamespace = "http://WS/", className = "ws.OperationResponse")
    @Action(input = "http://WS/Fox/operationRequest", output = "http://WS/Fox/operationResponse")
    public String operation(
        @WebParam(name = "datos", targetNamespace = "")
        String datos);

}