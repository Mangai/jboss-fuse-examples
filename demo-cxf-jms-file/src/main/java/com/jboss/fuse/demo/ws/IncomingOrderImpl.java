package com.jboss.fuse.demo.ws;

import javax.jws.WebService;

import com.jboss.fuse.demo.jaxb.Order;

@WebService(endpointInterface = "com.jboss.fuse.demo.ws.IncomingOrder")
public class IncomingOrderImpl implements IncomingOrder {
	@Override
	public String sendOrder(Order order) {
		return "OK";
	}
}
