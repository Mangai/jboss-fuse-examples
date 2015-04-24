package com.jboss.fuse.demo.util;


import java.util.List;

import org.apache.camel.Exchange;
import org.apache.camel.Header;
import org.apache.cxf.binding.soap.SoapHeader;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.w3c.dom.Element;

public class CustomSOAPProcessor {
	private static final Logger LOG = LoggerFactory.getLogger(CustomSOAPProcessor.class);
	

    public void process(
            @Header("org.apache.cxf.headers.Header.list") List<SoapHeader> soapHeaders,
            Exchange exchange) {       
 
        // Print SOAP Headers
        for (SoapHeader soapHeader : soapHeaders) {
        	LOG.info("SOAP Header '{}': '{}'", soapHeader.getName().getLocalPart() , ((Element)soapHeader.getObject()).getTextContent());
        }
 
    }
}
