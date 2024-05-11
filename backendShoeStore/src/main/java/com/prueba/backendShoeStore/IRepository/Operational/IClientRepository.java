package com.prueba.backendShoeStore.IRepository.Operational;

import com.prueba.backendShoeStore.Entity.Operational.Client;
import com.prueba.backendShoeStore.IRepository.BaseRepository.IBaseRepository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;



@Repository
public interface IClientRepository extends IBaseRepository<Client, String> {

	@Query(value= "SELECT * FROM client WHERE (:nameClient  IS NULL OR name LIKE '%' || :nameClient || '%'   )" +
			"AND (:status IS NULL OR status = :status)", nativeQuery = true)
	List<Client> filters (String nameClient, String status);
}
