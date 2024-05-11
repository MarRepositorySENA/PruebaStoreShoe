package com.prueba.backendShoeStore.Service.Operational;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.prueba.backendShoeStore.Entity.Operational.Client;
import com.prueba.backendShoeStore.IRepository.Operational.IClientRepository;
import com.prueba.backendShoeStore.IService.Operational.IClientService;
import com.prueba.backendShoeStore.Service.BaseService.BaseService;


@Service
public class ClientService extends BaseService<Client> implements IClientService{

	@Autowired
	private IClientRepository repository;

	@Override
	public List<Client> filters(String nameClient, String status) {
		// TODO Auto-generated method stub
		return repository.filters(nameClient, status) ;
	}
	
	
}
