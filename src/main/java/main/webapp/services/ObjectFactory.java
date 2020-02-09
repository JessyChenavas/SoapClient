
package main.webapp.services;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the main.webapp.services package. 
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

    private final static QName _GetRooms_QNAME = new QName("http://services.webapp.main/", "getRooms");
    private final static QName _GetRoomsResponse_QNAME = new QName("http://services.webapp.main/", "getRoomsResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: main.webapp.services
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetRooms }
     * 
     */
    public GetRooms createGetRooms() {
        return new GetRooms();
    }

    /**
     * Create an instance of {@link GetRoomsResponse }
     * 
     */
    public GetRoomsResponse createGetRoomsResponse() {
        return new GetRoomsResponse();
    }

    /**
     * Create an instance of {@link Room }
     * 
     */
    public Room createRoom() {
        return new Room();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetRooms }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.webapp.main/", name = "getRooms")
    public JAXBElement<GetRooms> createGetRooms(GetRooms value) {
        return new JAXBElement<GetRooms>(_GetRooms_QNAME, GetRooms.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetRoomsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.webapp.main/", name = "getRoomsResponse")
    public JAXBElement<GetRoomsResponse> createGetRoomsResponse(GetRoomsResponse value) {
        return new JAXBElement<GetRoomsResponse>(_GetRoomsResponse_QNAME, GetRoomsResponse.class, null, value);
    }

}
