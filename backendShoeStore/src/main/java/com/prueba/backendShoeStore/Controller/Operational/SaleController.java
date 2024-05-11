package com.prueba.backendShoeStore.Controller.Operational;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.prueba.backendShoeStore.Entity.Operational.Sale;
import com.prueba.backendShoeStore.Service.Operational.SaleService;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;

@CrossOrigin("*")
@RestController
@RequestMapping("/api/v1/store/operational/sale/")
public class SaleController {

	@Autowired
	private SaleService service;
	
	@Operation(summary ="filtros de busqueda nombre y estado de la entidad prodcuto", responses= {
			@ApiResponse(responseCode = "200", description = "lista de filtros encontrados"),
			@ApiResponse(responseCode = "404", description = "regsitros no encontrados")})

	@GetMapping("filters")
	public List<Sale> filters(@RequestParam(required=false) String statusSale){
		return service.filters(statusSale);
	}
}
