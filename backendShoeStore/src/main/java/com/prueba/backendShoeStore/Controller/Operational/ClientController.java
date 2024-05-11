package com.prueba.backendShoeStore.Controller.Operational;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.prueba.backendShoeStore.Controller.BaseController.BaseController;
import com.prueba.backendShoeStore.Entity.Operational.Client;
import com.prueba.backendShoeStore.Service.Operational.ClientService;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;

@CrossOrigin("*")
@RestController
@RequestMapping("/api/v1/store/operational/client/")

public class ClientController extends BaseController<Client>{

	@Autowired
	private ClientService service;
	
	@Operation(summary ="filtros de busqueda nombre y estado de la entidad cliente", responses= {
			@ApiResponse(responseCode = "200", description = "lista de filtros encontrados"),
			@ApiResponse(responseCode = "404", description = "regsitros no encontrados")})

	@GetMapping("filters")
	public List<Client> filters(@RequestParam(required=false) String nameClient, @RequestParam(required=false) String status){
		return service.filters(nameClient, status);
	}
}
