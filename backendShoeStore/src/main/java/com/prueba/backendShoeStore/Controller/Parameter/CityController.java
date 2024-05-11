package com.prueba.backendShoeStore.Controller.Parameter;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.prueba.backendShoeStore.Controller.BaseController.BaseController;
import com.prueba.backendShoeStore.Entity.Parameter.City;

@CrossOrigin("*")
@RestController
@RequestMapping("/api/v1/store/parameter/city/")
public class CityController extends BaseController<City> {

}
