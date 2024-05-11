package com.prueba.backendShoeStore.Controller.Operational;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.prueba.backendShoeStore.Controller.BaseController.BaseController;
import com.prueba.backendShoeStore.Entity.Operational.Client;

@CrossOrigin("*")
@RestController
@RequestMapping("/api/v1/store/operational/client/")

public class ClientController extends BaseController<Client>{

}
