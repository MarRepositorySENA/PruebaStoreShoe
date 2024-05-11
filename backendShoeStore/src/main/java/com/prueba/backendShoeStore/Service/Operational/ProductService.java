package com.prueba.backendShoeStore.Service.Operational;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.prueba.backendShoeStore.Entity.Operational.Product;
import com.prueba.backendShoeStore.IRepository.Operational.IProductRepository;
import com.prueba.backendShoeStore.IService.Operational.IProductService;
import com.prueba.backendShoeStore.Service.BaseService.BaseService;

@Service
public class ProductService extends BaseService<Product> implements IProductService{
	
	@Autowired
	private IProductRepository repository;
	
	@Override
	public List<Product> filters(String nameProduct, String status) {
		// TODO Auto-generated method stub
		return repository.filters(nameProduct, status);
	}

}
