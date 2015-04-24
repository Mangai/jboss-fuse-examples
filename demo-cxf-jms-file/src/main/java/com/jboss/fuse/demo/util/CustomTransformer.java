package com.jboss.fuse.demo.util;

import java.util.HashMap;
import java.util.Map;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.jboss.fuse.demo.jaxb.Order;
import com.jboss.fuse.demo.jaxb.Order.Orderlines.Orderline;

public class CustomTransformer implements Processor {
	private static final Logger LOG = LoggerFactory.getLogger(CustomTransformer.class);
	
	@Override
	public void process(Exchange exchange) throws Exception {
		Order order = exchange.getIn().getBody(Order.class);
		LOG.info("Custom processor doing stuff on {}", order);

		// extract order lines
		Map<String, Byte> orderLines = new HashMap<>();
		for (Orderline orderLine : order.getOrderlines().getOrderline()) {
			orderLines.put(orderLine.getArticle().getId(), orderLine.getQuantity());
		}
		
		exchange.getOut().setBody(orderLines);
	}
}
