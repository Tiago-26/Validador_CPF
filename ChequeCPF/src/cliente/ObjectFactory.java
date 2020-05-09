
package cliente;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the cliente package. 
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

    private final static QName _IsCPF_QNAME = new QName("http://control/", "isCPF");
    private final static QName _IsCPFResponse_QNAME = new QName("http://control/", "isCPFResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: cliente
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link IsCPFResponse }
     * 
     */
    public IsCPFResponse createIsCPFResponse() {
        return new IsCPFResponse();
    }

    /**
     * Create an instance of {@link IsCPF }
     * 
     */
    public IsCPF createIsCPF() {
        return new IsCPF();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IsCPF }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://control/", name = "isCPF")
    public JAXBElement<IsCPF> createIsCPF(IsCPF value) {
        return new JAXBElement<IsCPF>(_IsCPF_QNAME, IsCPF.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IsCPFResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://control/", name = "isCPFResponse")
    public JAXBElement<IsCPFResponse> createIsCPFResponse(IsCPFResponse value) {
        return new JAXBElement<IsCPFResponse>(_IsCPFResponse_QNAME, IsCPFResponse.class, null, value);
    }

}
