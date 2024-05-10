package com.prueba.backendShoeStore.IRepository.Parameter;

import org.springframework.stereotype.Repository;

import com.prueba.backendShoeStore.Entity.Parameter.Continent;
import com.prueba.backendShoeStore.IRepository.BaseRepository.IBaseRepository;

@Repository
public interface IContinentRepository extends IBaseRepository<Continent, String>{

}
