//
// Este arquivo foi gerado pela Arquitetura JavaTM para Implementação de Referência (JAXB) de Bind XML, v2.2.7 
// Consulte <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas as modificações neste arquivo serão perdidas após a recompilação do esquema de origem. 
// Gerado em: 2019.06.26 às 09:51:25 PM BRT 
//


package br.com.drsolutions.wsdlservidor.assets;

import javax.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the br.com.drsolutions.wsdlservidor.assets package. 
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


    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: br.com.drsolutions.wsdlservidor.assets
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetPaisResponse }
     * 
     */
    public GetPaisResponse createGetPaisResponse() {
        return new GetPaisResponse();
    }

    /**
     * Create an instance of {@link Pais }
     * 
     */
    public Pais createPais() {
        return new Pais();
    }

    /**
     * Create an instance of {@link GetPaisRequest }
     * 
     */
    public GetPaisRequest createGetPaisRequest() {
        return new GetPaisRequest();
    }

}
