package com.prueba.backendShoeStore.IRepository.Parameter;

import org.springframework.stereotype.Repository;

import com.prueba.backendShoeStore.Entity.Parameter.Department;
import com.prueba.backendShoeStore.IRepository.BaseRepository.IBaseRepository;

@Repository
public interface IDepartmentRepository extends IBaseRepository<Department, String>{
	
	

}
