package com.prueba.backendShoeStore.IRepository.Operational;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.prueba.backendShoeStore.Controller.Dto.ValidateProductDto;
import com.prueba.backendShoeStore.Entity.Operational.Product;
import com.prueba.backendShoeStore.IRepository.BaseRepository.IBaseRepository;



@Repository
public interface IProductRepository extends  IBaseRepository<Product, String>{
	
	@Query(value= "SELECT * FROM product WHERE (:nameProduct  IS NULL OR name_product LIKE '%' || :nameProduct || '%'   )" +
			"AND (:status IS NULL OR status = :status)", nativeQuery = true)
	List<Product> filters (String nameProduct, String status);
	
	
	@Query(value = "SELECT "

	+ " count(product_name) as quantity "

	+ " FROM "

	+ " product "

	+ " WHERE product_name = :user "

	+ " OR description = :description ", nativeQuery = true)

	Optional<ValidateProductDto> getValidate(String user, String description);

}
