//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.04.07 at 03:39:12 PM CEST 
//


package com.jboss.fuse.demo.jaxb;

import javax.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.jboss.fuse.demo.jaxb package. 
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
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.jboss.fuse.demo.jaxb
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Order }
     * 
     */
    public Order createOrder() {
        return new Order();
    }

    /**
     * Create an instance of {@link Order.Orderlines }
     * 
     */
    public Order.Orderlines createOrderOrderlines() {
        return new Order.Orderlines();
    }

    /**
     * Create an instance of {@link Order.Orderlines.Orderline }
     * 
     */
    public Order.Orderlines.Orderline createOrderOrderlinesOrderline() {
        return new Order.Orderlines.Orderline();
    }

    /**
     * Create an instance of {@link Order.Customer }
     * 
     */
    public Order.Customer createOrderCustomer() {
        return new Order.Customer();
    }

    /**
     * Create an instance of {@link Order.Orderlines.Orderline.Article }
     * 
     */
    public Order.Orderlines.Orderline.Article createOrderOrderlinesOrderlineArticle() {
        return new Order.Orderlines.Orderline.Article();
    }

}
