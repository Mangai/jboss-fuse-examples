package com.jboss.fuse.demo;


import org.apache.camel.Exchange;
import org.apache.camel.Processor;

public class OrderProcessor implements Processor {
	@Override
	public void process(Exchange exchange) throws Exception {
		String msg = exchange.getIn().getBody(String.class);
		
		if (msg.contains("Clue1")) {
			throw new OutOfStockException("Items are out of stock in UK");
			
		} else if (msg.contains("Clue2")) {
			throw new RuntimeException("Processing order failed " + exchange.getExchangeId());
		}
	}
}
