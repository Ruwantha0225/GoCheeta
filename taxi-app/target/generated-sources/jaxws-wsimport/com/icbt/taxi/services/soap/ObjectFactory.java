
package com.icbt.taxi.services.soap;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.icbt.taxi.services.soap package. 
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

    private final static QName _GetDriverResponse_QNAME = new QName("http://soap.services.taxi.icbt.com/", "getDriverResponse");
    private final static QName _GetDriver_QNAME = new QName("http://soap.services.taxi.icbt.com/", "getDriver");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.icbt.taxi.services.soap
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetDriverResponse }
     * 
     */
    public GetDriverResponse createGetDriverResponse() {
        return new GetDriverResponse();
    }

    /**
     * Create an instance of {@link GetDriver }
     * 
     */
    public GetDriver createGetDriver() {
        return new GetDriver();
    }

    /**
     * Create an instance of {@link Driver }
     * 
     */
    public Driver createDriver() {
        return new Driver();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetDriverResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.services.taxi.icbt.com/", name = "getDriverResponse")
    public JAXBElement<GetDriverResponse> createGetDriverResponse(GetDriverResponse value) {
        return new JAXBElement<GetDriverResponse>(_GetDriverResponse_QNAME, GetDriverResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetDriver }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.services.taxi.icbt.com/", name = "getDriver")
    public JAXBElement<GetDriver> createGetDriver(GetDriver value) {
        return new JAXBElement<GetDriver>(_GetDriver_QNAME, GetDriver.class, null, value);
    }

}
