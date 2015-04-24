package com.jboss.fuse.demo.ws;

import javax.jws.WebParam;
import javax.jws.WebService;

import com.jboss.fuse.demo.jaxb.Order;

@WebService
public interface IncomingOrder {
	public String sendOrder(@WebParam(name = "order", targetNamespace="http://demo.fuse.jboss.com/order") Order order); 
}
