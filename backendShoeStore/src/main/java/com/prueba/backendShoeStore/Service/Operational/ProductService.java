package com.prueba.backendShoeStore.Service.Operational;

import org.springframework.stereotype.Service;

import com.prueba.backendShoeStore.Entity.Operational.Product;
import com.prueba.backendShoeStore.IService.Operational.IProductService;
import com.prueba.backendShoeStore.Service.BaseService.BaseService;

@Service
public class ProductService extends BaseService<Product> implements IProductService{

}
