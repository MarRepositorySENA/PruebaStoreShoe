package com.prueba.backendShoeStore.IService.Operational;

import java.util.List;

import com.prueba.backendShoeStore.Entity.Operational.Product;
import com.prueba.backendShoeStore.IService.IBaseService.IBaseService;

public interface IProductService extends IBaseService<Product> {
	
	public List<Product> filters (String nameProduct, String status);

}
