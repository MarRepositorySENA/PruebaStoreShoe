package com.prueba.backendShoeStore.IService.Operational;

import com.prueba.backendShoeStore.IService.IBaseService.IBaseService;

import java.util.List;

import com.prueba.backendShoeStore.Entity.Operational.Client;
public interface IClientService extends IBaseService<Client>{

	public List<Client> filters (String nameClient, String status);
}
