package com.prueba.backendShoeStore.IRepository.Parameter;

import org.springframework.stereotype.Repository;

import com.prueba.backendShoeStore.Entity.Parameter.City;
import com.prueba.backendShoeStore.IRepository.BaseRepository.IBaseRepository;

@Repository
public interface ICityRepository extends IBaseRepository<City, String>{

}
