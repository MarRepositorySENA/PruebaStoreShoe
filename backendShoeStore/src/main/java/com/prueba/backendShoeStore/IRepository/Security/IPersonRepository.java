package com.prueba.backendShoeStore.IRepository.Security;

import org.springframework.stereotype.Repository;

import com.prueba.backendShoeStore.Entity.Security.Person;
import com.prueba.backendShoeStore.IRepository.BaseRepository.IBaseRepository;

@Repository
public interface IPersonRepository extends IBaseRepository<Person, String> {

}
