package com.prueba.backendShoeStore.IRepository.Parameter;

import org.springframework.stereotype.Repository;

import com.prueba.backendShoeStore.Entity.Parameter.Country;
import com.prueba.backendShoeStore.IRepository.BaseRepository.IBaseRepository;

@Repository
public interface ICountryRepository extends IBaseRepository<Country, String>{

}
