
package com.icbt.taxi.services.soap;

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
 * JAX-WS RI 2.2.8
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "VehicleService", targetNamespace = "http://soap.services.taxi.icbt.com/", wsdlLocation = "http://localhost:8080/taxi-services/VehicleService?wsdl")
public class VehicleService_Service
    extends Service
{

    private final static URL VEHICLESERVICE_WSDL_LOCATION;
    private final static WebServiceException VEHICLESERVICE_EXCEPTION;
    private final static QName VEHICLESERVICE_QNAME = new QName("http://soap.services.taxi.icbt.com/", "VehicleService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://localhost:8080/taxi-services/VehicleService?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        VEHICLESERVICE_WSDL_LOCATION = url;
        VEHICLESERVICE_EXCEPTION = e;
    }

    public VehicleService_Service() {
        super(__getWsdlLocation(), VEHICLESERVICE_QNAME);
    }

    public VehicleService_Service(WebServiceFeature... features) {
        super(__getWsdlLocation(), VEHICLESERVICE_QNAME, features);
    }

    public VehicleService_Service(URL wsdlLocation) {
        super(wsdlLocation, VEHICLESERVICE_QNAME);
    }

    public VehicleService_Service(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, VEHICLESERVICE_QNAME, features);
    }

    public VehicleService_Service(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public VehicleService_Service(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns VehicleService
     */
    @WebEndpoint(name = "VehicleServicePort")
    public VehicleService getVehicleServicePort() {
        return super.getPort(new QName("http://soap.services.taxi.icbt.com/", "VehicleServicePort"), VehicleService.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns VehicleService
     */
    @WebEndpoint(name = "VehicleServicePort")
    public VehicleService getVehicleServicePort(WebServiceFeature... features) {
        return super.getPort(new QName("http://soap.services.taxi.icbt.com/", "VehicleServicePort"), VehicleService.class, features);
    }

    private static URL __getWsdlLocation() {
        if (VEHICLESERVICE_EXCEPTION!= null) {
            throw VEHICLESERVICE_EXCEPTION;
        }
        return VEHICLESERVICE_WSDL_LOCATION;
    }

}
