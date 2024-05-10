package com.prueba.backendShoeStore.IService.IBaseService;
import java.util.List;
import java.util.Optional;

public interface IBaseService<T> {

	List<T> all() throws Exception;
	
	
List<T> findByStatusFalse() throws Exception;

    
    Optional<T> findById(String id) throws Exception;

    
    T save(T instanceEntity) throws Exception;

 
    void update(String id, T instanceEntity) throws Exception;

   
    void delete(String id) throws Exception;
}
