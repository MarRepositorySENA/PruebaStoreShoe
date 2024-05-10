package com.prueba.backendShoeStore.IRepository.Operational;

import org.springframework.stereotype.Repository;

import com.prueba.backendShoeStore.Entity.Operational.DescriptionSale;
import com.prueba.backendShoeStore.IRepository.BaseRepository.IBaseRepository;

@Repository
public interface IDescriptionSaleRepository extends IBaseRepository<DescriptionSale, String>{

}
