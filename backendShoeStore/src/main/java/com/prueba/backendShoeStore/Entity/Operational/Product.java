package com.prueba.backendShoeStore.Entity.Operational;

import java.math.BigDecimal;

import com.prueba.backendShoeStore.Entity.BaseEntity.ABaseEntity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "product")
public class Product extends ABaseEntity {

	@Column(name = "name_product", length = 45, nullable = false)
	private String nameProduct;

	@Column(name = "description", length = 45, nullable = false)
	private String description;

	@Column(name = "quantity")
	private Integer quantity;

	@Column(name = "price", precision = 2, scale = 1)
	private BigDecimal price;

	@Column(name = "vat_percentage", precision = 2)
	private BigDecimal vatPercentaget;

	@Column(name = "discount_percentage", precision = 2)
	private BigDecimal discountPercentage;

	// encapsulamiento
	public String getNameProduct() {
		return nameProduct;
	}

	public void setNameProduct(String nameProduct) {
		this.nameProduct = nameProduct;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	public BigDecimal getPrice() {
		return price;
	}

	public void setPrice(BigDecimal price) {
		this.price = price;
	}

	public BigDecimal getVatPercentaget() {
		return vatPercentaget;
	}

	public void setVatPercentaget(BigDecimal vatPercentaget) {
		this.vatPercentaget = vatPercentaget;
	}

	public BigDecimal getDiscountPercentage() {
		return discountPercentage;
	}

	public void setDiscountPercentage(BigDecimal discountPercentage) {
		this.discountPercentage = discountPercentage;
	}

}
