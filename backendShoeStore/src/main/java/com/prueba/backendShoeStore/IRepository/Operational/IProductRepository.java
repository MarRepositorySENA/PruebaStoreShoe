package com.prueba.backendShoeStore.IRepository.Operational;

import org.springframework.stereotype.Repository;

import com.prueba.backendShoeStore.Entity.Operational.Product;
import com.prueba.backendShoeStore.IRepository.BaseRepository.IBaseRepository;

@Repository
public interface IProductRepository extends  IBaseRepository<Product, String>{

}
