package com.prueba.backendShoeStore.Entity.Security;

import com.prueba.backendShoeStore.Entity.BaseEntity.ABaseEntity;
import com.prueba.backendShoeStore.Entity.Enum.TypeDocument;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.Table;

@Entity
@Table(name = "person")
public class Person extends ABaseEntity {

	@Column(name = "name", length = 45, nullable = false)
	private String name;

	@Column(name = "last_name", length = 45, nullable = false)
	private String LastName;

	@Enumerated(EnumType.STRING)
	@Column(name = "type_document")
	private TypeDocument typeDocument;

	@Column(name = "phone", length = 13, nullable = false)
	private String phone;

	@Column(name = "address", length = 45, nullable = false)
	private String address;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLastName() {
		return LastName;
	}

	public void setLastName(String lastName) {
		LastName = lastName;
	}

	public TypeDocument getTypeDocument() {
		return typeDocument;
	}

	public void setTypeDocument(TypeDocument typeDocument) {
		this.typeDocument = typeDocument;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	
	

}
