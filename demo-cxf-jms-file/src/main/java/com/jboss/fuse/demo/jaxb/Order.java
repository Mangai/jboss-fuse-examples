package com.jboss.fuse.demo.jaxb;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = { "customer", "date", "orderlines" })
@XmlRootElement(name = "order")
public class Order {

	@XmlElement(required = true)
	protected Order.Customer customer;
	@XmlElement(required = true)
	@XmlSchemaType(name = "date")
	protected XMLGregorianCalendar date;
	@XmlElement(required = true)
	protected Order.Orderlines orderlines;

	public Order.Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Order.Customer value) {
		this.customer = value;
	}

	public XMLGregorianCalendar getDate() {
		return date;
	}

	public void setDate(XMLGregorianCalendar value) {
		this.date = value;
	}

	public Order.Orderlines getOrderlines() {
		return orderlines;
	}

	public void setOrderlines(Order.Orderlines value) {
		this.orderlines = value;
	}

	@XmlAccessorType(XmlAccessType.FIELD)
	@XmlType(name = "", propOrder = { "name", "city", "country" })
	public static class Customer {

		@XmlElement(required = true)
		protected String name;
		@XmlElement(required = true)
		protected String city;
		@XmlElement(required = true)
		protected String country;
		@XmlAttribute(name = "id")
		protected String id;

		public String getName() {
			return name;
		}

		public void setName(String value) {
			this.name = value;
		}

		public String getCity() {
			return city;
		}

		public void setCity(String value) {
			this.city = value;
		}

		public String getCountry() {
			return country;
		}

		public void setCountry(String value) {
			this.country = value;
		}

		public String getId() {
			return id;
		}

		public void setId(String value) {
			this.id = value;
		}

		@Override
		public String toString() {
			return "Customer [name=" + name + ", city=" + city + ", country="
					+ country + ", id=" + id + "]";
		}
	}

	@XmlAccessorType(XmlAccessType.FIELD)
	@XmlType(name = "", propOrder = { "orderline" })
	public static class Orderlines {

		protected List<Order.Orderlines.Orderline> orderline;

		public List<Order.Orderlines.Orderline> getOrderline() {
			if (orderline == null) {
				orderline = new ArrayList<Order.Orderlines.Orderline>();
			}
			return this.orderline;
		}

		@XmlAccessorType(XmlAccessType.FIELD)
		@XmlType(name = "", propOrder = { "article", "quantity" })
		public static class Orderline {

			@XmlElement(required = true)
			protected Order.Orderlines.Orderline.Article article;
			protected byte quantity;

			public Order.Orderlines.Orderline.Article getArticle() {
				return article;
			}

			public void setArticle(Order.Orderlines.Orderline.Article value) {
				this.article = value;
			}

			public byte getQuantity() {
				return quantity;
			}

			public void setQuantity(byte value) {
				this.quantity = value;
			}

			@XmlAccessorType(XmlAccessType.FIELD)
			@XmlType(name = "", propOrder = { "description" })
			public static class Article {

				@XmlElement(required = true)
				protected String description;
				@XmlAttribute(name = "id")
				protected String id;

				public String getDescription() {
					return description;
				}

				public void setDescription(String value) {
					this.description = value;
				}

				public String getId() {
					return id;
				}

				public void setId(String value) {
					this.id = value;
				}

			}

		}

	}

	@Override
	public String toString() {
		return "Order [customer=" + customer + ", date=" + date
				+ ", orderlines=" + (orderlines == null || orderlines.getOrderline() == null ? 0 : orderlines.getOrderline().size()) + "]";
	}
}
