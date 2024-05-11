package com.prueba.backendShoeStore.Service.Security;

import org.springframework.stereotype.Service;

import com.prueba.backendShoeStore.Entity.Security.Person;
import com.prueba.backendShoeStore.IService.Security.IPersonService;
import com.prueba.backendShoeStore.Service.BaseService.BaseService;

@Service
public class PersonService extends BaseService<Person> implements IPersonService {

}
