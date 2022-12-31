
package com.sltc.soa.client.stub;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.sltc.soa.client.stub package. 
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

    private final static QName _DatabaseResponse_QNAME = new QName("http://soa.sltc.com/", "databaseResponse");
    private final static QName _ConvertResponse_QNAME = new QName("http://soa.sltc.com/", "convertResponse");
    private final static QName _Database_QNAME = new QName("http://soa.sltc.com/", "database");
    private final static QName _Convert_QNAME = new QName("http://soa.sltc.com/", "convert");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.sltc.soa.client.stub
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ConvertResponse }
     * 
     */
    public ConvertResponse createConvertResponse() {
        return new ConvertResponse();
    }

    /**
     * Create an instance of {@link Database }
     * 
     */
    public Database createDatabase() {
        return new Database();
    }

    /**
     * Create an instance of {@link DatabaseResponse }
     * 
     */
    public DatabaseResponse createDatabaseResponse() {
        return new DatabaseResponse();
    }

    /**
     * Create an instance of {@link Convert }
     * 
     */
    public Convert createConvert() {
        return new Convert();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DatabaseResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soa.sltc.com/", name = "databaseResponse")
    public JAXBElement<DatabaseResponse> createDatabaseResponse(DatabaseResponse value) {
        return new JAXBElement<DatabaseResponse>(_DatabaseResponse_QNAME, DatabaseResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConvertResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soa.sltc.com/", name = "convertResponse")
    public JAXBElement<ConvertResponse> createConvertResponse(ConvertResponse value) {
        return new JAXBElement<ConvertResponse>(_ConvertResponse_QNAME, ConvertResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Database }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soa.sltc.com/", name = "database")
    public JAXBElement<Database> createDatabase(Database value) {
        return new JAXBElement<Database>(_Database_QNAME, Database.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Convert }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soa.sltc.com/", name = "convert")
    public JAXBElement<Convert> createConvert(Convert value) {
        return new JAXBElement<Convert>(_Convert_QNAME, Convert.class, null, value);
    }

}
