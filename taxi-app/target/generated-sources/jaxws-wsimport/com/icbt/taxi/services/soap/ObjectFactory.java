
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

    private final static QName _GetVehicle_QNAME = new QName("http://soap.services.taxi.icbt.com/", "getVehicle");
    private final static QName _GetVehicleResponse_QNAME = new QName("http://soap.services.taxi.icbt.com/", "getVehicleResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.icbt.taxi.services.soap
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetVehicle }
     * 
     */
    public GetVehicle createGetVehicle() {
        return new GetVehicle();
    }

    /**
     * Create an instance of {@link GetVehicleResponse }
     * 
     */
    public GetVehicleResponse createGetVehicleResponse() {
        return new GetVehicleResponse();
    }

    /**
     * Create an instance of {@link Vehicle }
     * 
     */
    public Vehicle createVehicle() {
        return new Vehicle();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetVehicle }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.services.taxi.icbt.com/", name = "getVehicle")
    public JAXBElement<GetVehicle> createGetVehicle(GetVehicle value) {
        return new JAXBElement<GetVehicle>(_GetVehicle_QNAME, GetVehicle.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetVehicleResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.services.taxi.icbt.com/", name = "getVehicleResponse")
    public JAXBElement<GetVehicleResponse> createGetVehicleResponse(GetVehicleResponse value) {
        return new JAXBElement<GetVehicleResponse>(_GetVehicleResponse_QNAME, GetVehicleResponse.class, null, value);
    }

}
