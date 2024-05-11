package com.prueba.backendShoeStore.Entity.Operational;

import java.math.BigDecimal;

import com.prueba.backendShoeStore.Entity.BaseEntity.ABaseEntity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

import jakarta.persistence.Table;

@Entity
@Table(name="description_sale")
public class DescriptionSale extends ABaseEntity{
	
	
	@Column(name = "quantity",  nullable = false)
	private String quantity;
	
	@Column(name = "price",  precision = 2, scale = 1)
	private BigDecimal price;
	
	@Column(name = "discount",  precision = 2, scale = 1)
	private BigDecimal discount;
	
	@Column(name = "subtotal",  precision = 2, scale = 1)
	private BigDecimal subtotal;
	
	
	@ManyToOne(fetch = FetchType.EAGER, optional = false)
	@JoinColumn(name = "sale_id", nullable = false, unique = true)
	private Sale sale;
	
	@ManyToOne(fetch = FetchType.EAGER, optional = false)
	@JoinColumn(name = "product_id", nullable = false, unique = true)
	private Product product;

	
	//encapsulamiento
	public String getQuantity() {
		return quantity;
	}

	public void setQuantity(String quantity) {
		this.quantity = quantity;
	}

	public BigDecimal getPrice() {
		return price;
	}

	public void setPrice(BigDecimal price) {
		this.price = price;
	}

	public BigDecimal getDiscount() {
		return discount;
	}

	public void setDiscount(BigDecimal discount) {
		this.discount = discount;
	}

	public BigDecimal getSubtotal() {
		return subtotal;
	}

	public void setSubtotal(BigDecimal subtotal) {
		this.subtotal = subtotal;
	}

	public Sale getSale() {
		return sale;
	}

	public void setSale(Sale sale) {
		this.sale = sale;
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}
	
	
	
}
