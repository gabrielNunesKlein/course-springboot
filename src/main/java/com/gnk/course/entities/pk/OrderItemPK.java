package com.gnk.course.entities.pk;

import java.io.Serializable;

<<<<<<< HEAD
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
=======
import javax.persistence.Embeddable;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
>>>>>>> 130bd5f7fda8df93b335ed6379e5de688b67f42d

import com.gnk.course.entities.Order;
import com.gnk.course.entities.Product;

<<<<<<< HEAD
public class OrderItemPK implements Serializable{
	private static final long serialVersionUID = 1L;

	@ManyToOne
	@JoinColumn(name = "order_id")
	private Order order;

	@ManyToOne
	@JoinColumn(name = "product_id")
	private Product product;

=======
@Embeddable
public class OrderItemPK implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	@ManyToMany
	@JoinColumn(name = "order_id")
	private Order order;
	
	@ManyToMany
	@JoinColumn(name = "product_id")
	private Product product;
	
>>>>>>> 130bd5f7fda8df93b335ed6379e5de688b67f42d
	public Order getOrder() {
		return order;
	}
	public void setOrder(Order order) {
		this.order = order;
	}
	public Product getProduct() {
		return product;
	}
	public void setProduct(Product product) {
		this.product = product;
	}
<<<<<<< HEAD

=======
	
>>>>>>> 130bd5f7fda8df93b335ed6379e5de688b67f42d
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((order == null) ? 0 : order.hashCode());
		result = prime * result + ((product == null) ? 0 : product.hashCode());
		return result;
	}
<<<<<<< HEAD

=======
	
>>>>>>> 130bd5f7fda8df93b335ed6379e5de688b67f42d
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		OrderItemPK other = (OrderItemPK) obj;
		if (order == null) {
			if (other.order != null)
				return false;
		} else if (!order.equals(other.order))
			return false;
		if (product == null) {
			if (other.product != null)
				return false;
		} else if (!product.equals(other.product))
			return false;
		return true;
	}
<<<<<<< HEAD
	
=======
>>>>>>> 130bd5f7fda8df93b335ed6379e5de688b67f42d
}
