package com.prueba.backendShoeStore.IRepository.Operational;

import com.prueba.backendShoeStore.IRepository.BaseRepository.IBaseRepository;

import org.springframework.stereotype.Repository;

import com.prueba.backendShoeStore.Entity.Operational.Client;

@Repository
public interface IClientRepository extends IBaseRepository<Client, String> {

}
