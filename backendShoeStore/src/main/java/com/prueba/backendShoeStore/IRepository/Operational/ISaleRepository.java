package com.prueba.backendShoeStore.IRepository.Operational;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.prueba.backendShoeStore.Entity.Operational.Sale;
import com.prueba.backendShoeStore.IRepository.BaseRepository.IBaseRepository;

@Repository
public interface ISaleRepository extends IBaseRepository<Sale,String>{
	@Query(value= "SELECT * FROM sale WHERE (:statusSale IS NULL OR status_sale = :status)", nativeQuery = true)
	List<Sale> filters ( String statusSale);
}
