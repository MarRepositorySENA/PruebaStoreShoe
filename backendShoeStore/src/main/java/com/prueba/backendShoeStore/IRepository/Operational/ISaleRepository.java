package com.prueba.backendShoeStore.IRepository.Operational;

import org.springframework.stereotype.Repository;

import com.prueba.backendShoeStore.Entity.Operational.Sale;
import com.prueba.backendShoeStore.IRepository.BaseRepository.IBaseRepository;

@Repository
public interface ISaleRepository extends IBaseRepository<Sale,String>{

}
