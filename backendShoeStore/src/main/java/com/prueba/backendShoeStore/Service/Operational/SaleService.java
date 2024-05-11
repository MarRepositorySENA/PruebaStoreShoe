package com.prueba.backendShoeStore.Service.Operational;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.prueba.backendShoeStore.Entity.Operational.Sale;
import com.prueba.backendShoeStore.IRepository.Operational.ISaleRepository;
import com.prueba.backendShoeStore.IService.Operational.ISaleService;
import com.prueba.backendShoeStore.Service.BaseService.BaseService;

@Service
public class SaleService extends BaseService<Sale> implements ISaleService{

	@Autowired
	private ISaleRepository repository;
	
	@Override
	public List<Sale> filters(String statusSale) {
		// TODO Auto-generated method stub
		return repository.filters(statusSale);
	}

}
