package com.prueba.backendShoeStore.Entity.Operational;

import java.util.Date;

import com.prueba.backendShoeStore.Entity.BaseEntity.ABaseEntity;
import com.prueba.backendShoeStore.Entity.Enum.StatusSale;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.FetchType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="sale")
public class Sale extends ABaseEntity{

	@Column(name="total", length = 45, nullable=false)
	private String total;
	
	@Column(name="date_sale", nullable=false)
	private Date dateSale;
	
	@Enumerated(EnumType.STRING)
	@Column(name="status_sale")
	private StatusSale statusSale;
	
	@ManyToOne(fetch= FetchType.EAGER, optional=false)
	@JoinColumn (name="client_id", nullable=false)
	private Client client;

	public String getTotal() {
		return total;
	}

	public void setTotal(String total) {
		this.total = total;
	}

	public Date getDateSale() {
		return dateSale;
	}

	public void setDateSale(Date dateSale) {
		this.dateSale = dateSale;
	}

	public StatusSale getStatusSale() {
		return statusSale;
	}

	public void setStatusSale(StatusSale statusSale) {
		this.statusSale = statusSale;
	}

	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}
	
	
	
}
