
/*
 * 
 */

package org.apache.servicemix.samples.wsdl_first;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import javax.xml.ws.Service;

/**
 * This class was generated by Progress FUSE Services Framework 2.2.11-fuse-00-00
 * Sat Jul 25 18:40:36 CEST 2015
 * Generated source version: 2.2.11-fuse-00-00
 * 
 */


@WebServiceClient(name = "PersonService", 
                  wsdlLocation = "file:/C:/Data/workspaceQS1/adapter/src/main/resources/wsdl/person.wsdl",
                  targetNamespace = "http://servicemix.apache.org/samples/wsdl-first") 
public class PersonService extends Service {

    public final static URL WSDL_LOCATION;
    public final static QName SERVICE = new QName("http://servicemix.apache.org/samples/wsdl-first", "PersonService");
    public final static QName Soap = new QName("http://servicemix.apache.org/samples/wsdl-first", "soap");
    static {
        URL url = null;
        try {
            url = new URL("file:/C:/Data/workspaceQS1/adapter/src/main/resources/wsdl/person.wsdl");
        } catch (MalformedURLException e) {
            System.err.println("Can not initialize the default wsdl from file:/C:/Data/workspaceQS1/adapter/src/main/resources/wsdl/person.wsdl");
            // e.printStackTrace();
        }
        WSDL_LOCATION = url;
    }

    public PersonService(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public PersonService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public PersonService() {
        super(WSDL_LOCATION, SERVICE);
    }
    
//    public PersonService(WebServiceFeature ... features) {
//        super(WSDL_LOCATION, SERVICE, features);
//    }
//    public PersonService(URL wsdlLocation, WebServiceFeature ... features) {
//        super(wsdlLocation, SERVICE, features);
//    }
//
//    public PersonService(URL wsdlLocation, QName serviceName, WebServiceFeature ... features) {
//        super(wsdlLocation, serviceName, features);
//    }

    /**
     * 
     * @return
     *     returns Person
     */
    @WebEndpoint(name = "soap")
    public Person getSoap() {
        return super.getPort(Soap, Person.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns Person
     */
    @WebEndpoint(name = "soap")
    public Person getSoap(WebServiceFeature... features) {
        return super.getPort(Soap, Person.class, features);
    }

}
