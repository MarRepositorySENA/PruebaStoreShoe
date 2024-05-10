package com.prueba.backendShoeStore.Entity.Operational;

import com.prueba.backendShoeStore.Entity.BaseEntity.ABaseEntity;
import com.prueba.backendShoeStore.Entity.Parameter.City;
import com.prueba.backendShoeStore.Entity.Security.Person;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="client")
public class Client extends ABaseEntity {
	
		@ManyToOne(fetch = FetchType.LAZY, optional = false)
		@JoinColumn(name = "person_id", nullable = false, unique = true)
		private Person person;
		
		@ManyToOne(fetch = FetchType.LAZY, optional = false)
		@JoinColumn(name = "city_id", nullable = false, unique = true)
		private City city;

		public Person getPerson() {
			return person;
		}

		public void setPerson(Person person) {
			this.person = person;
		}

		public City getCity() {
			return city;
		}

		public void setCity(City city) {
			this.city = city;
		}
		
		
		

}
