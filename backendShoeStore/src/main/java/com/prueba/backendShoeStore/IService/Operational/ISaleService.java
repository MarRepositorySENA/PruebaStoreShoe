package com.prueba.backendShoeStore.IService.Operational;

import java.util.List;

import com.prueba.backendShoeStore.Entity.Operational.Sale;
import com.prueba.backendShoeStore.IService.IBaseService.IBaseService;

public interface ISaleService extends IBaseService<Sale> {
	
	public List<Sale> filters ( String statusSale);

}
