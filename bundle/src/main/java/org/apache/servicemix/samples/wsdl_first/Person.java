package org.apache.servicemix.samples.wsdl_first;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

/**
 * This class was generated by Progress FUSE Services Framework 2.2.11-fuse-00-00
 * Sat Jul 25 18:40:36 CEST 2015
 * Generated source version: 2.2.11-fuse-00-00
 * 
 */
 
@WebService(targetNamespace = "http://servicemix.apache.org/samples/wsdl-first", name = "Person")
@XmlSeeAlso({org.apache.servicemix.samples.wsdl_first.types.ObjectFactory.class})
public interface Person {

    @RequestWrapper(localName = "GetPerson", targetNamespace = "http://servicemix.apache.org/samples/wsdl-first/types", className = "org.apache.servicemix.samples.wsdl_first.types.GetPerson")
    @WebMethod(operationName = "GetPerson")
    @ResponseWrapper(localName = "GetPersonResponse", targetNamespace = "http://servicemix.apache.org/samples/wsdl-first/types", className = "org.apache.servicemix.samples.wsdl_first.types.GetPersonResponse")
    public void getPerson(
        @WebParam(mode = WebParam.Mode.INOUT, name = "personId", targetNamespace = "http://servicemix.apache.org/samples/wsdl-first/types")
        javax.xml.ws.Holder<java.lang.String> personId,
        @WebParam(mode = WebParam.Mode.OUT, name = "ssn", targetNamespace = "http://servicemix.apache.org/samples/wsdl-first/types")
        javax.xml.ws.Holder<java.lang.String> ssn,
        @WebParam(mode = WebParam.Mode.OUT, name = "name", targetNamespace = "http://servicemix.apache.org/samples/wsdl-first/types")
        javax.xml.ws.Holder<java.lang.String> name
    ) throws UnknownPersonFault;
}