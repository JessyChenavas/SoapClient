
package main.webapp.services;

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
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "HotelServiceService", targetNamespace = "http://services.webapp.main/", wsdlLocation = "http://localhost:8080/HotelService?wsdl")
public class HotelServiceService
    extends Service
{

    private final static URL HOTELSERVICESERVICE_WSDL_LOCATION;
    private final static WebServiceException HOTELSERVICESERVICE_EXCEPTION;
    private final static QName HOTELSERVICESERVICE_QNAME = new QName("http://services.webapp.main/", "HotelServiceService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://localhost:8080/HotelService?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        HOTELSERVICESERVICE_WSDL_LOCATION = url;
        HOTELSERVICESERVICE_EXCEPTION = e;
    }

    public HotelServiceService() {
        super(__getWsdlLocation(), HOTELSERVICESERVICE_QNAME);
    }

    public HotelServiceService(WebServiceFeature... features) {
        super(__getWsdlLocation(), HOTELSERVICESERVICE_QNAME, features);
    }

    public HotelServiceService(URL wsdlLocation) {
        super(wsdlLocation, HOTELSERVICESERVICE_QNAME);
    }

    public HotelServiceService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, HOTELSERVICESERVICE_QNAME, features);
    }

    public HotelServiceService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public HotelServiceService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns HotelService
     */
    @WebEndpoint(name = "HotelServicePort")
    public HotelService getHotelServicePort() {
        return super.getPort(new QName("http://services.webapp.main/", "HotelServicePort"), HotelService.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns HotelService
     */
    @WebEndpoint(name = "HotelServicePort")
    public HotelService getHotelServicePort(WebServiceFeature... features) {
        return super.getPort(new QName("http://services.webapp.main/", "HotelServicePort"), HotelService.class, features);
    }

    private static URL __getWsdlLocation() {
        if (HOTELSERVICESERVICE_EXCEPTION!= null) {
            throw HOTELSERVICESERVICE_EXCEPTION;
        }
        return HOTELSERVICESERVICE_WSDL_LOCATION;
    }

}
