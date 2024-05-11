package com.prueba.backendShoeStore.Controller.Security;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.prueba.backendShoeStore.Controller.BaseController.BaseController;
import com.prueba.backendShoeStore.Entity.Security.Person;

@CrossOrigin("*")
@RestController
@RequestMapping("/api/v1/store/security/person/")
public class PersonController extends BaseController<Person>{

}
