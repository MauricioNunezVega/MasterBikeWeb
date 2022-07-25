
package ws;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the ws package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _Datos_QNAME = new QName("http://WS/", "Datos");
    private final static QName _DatosResponse_QNAME = new QName("http://WS/", "DatosResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: ws
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Datos }
     * 
     */
    public Datos createDatos() {
        return new Datos();
    }

    /**
     * Create an instance of {@link DatosResponse }
     * 
     */
    public DatosResponse createDatosResponse() {
        return new DatosResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Datos }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://WS/", name = "Datos")
    public JAXBElement<Datos> createDatos(Datos value) {
        return new JAXBElement<Datos>(_Datos_QNAME, Datos.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DatosResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://WS/", name = "DatosResponse")
    public JAXBElement<DatosResponse> createDatosResponse(DatosResponse value) {
        return new JAXBElement<DatosResponse>(_DatosResponse_QNAME, DatosResponse.class, null, value);
    }

}
