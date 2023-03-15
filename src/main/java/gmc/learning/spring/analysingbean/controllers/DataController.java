package gmc.learning.spring.analysingbean.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import gmc.learning.spring.analysingbean.models.Data;
import gmc.learning.spring.analysingbean.services.CRUDService;

@RestController
@RequestMapping(path = "/data")
public class DataController {
	
	@Autowired
	private List<Data> getDataStore;
	@Autowired
	private CRUDService crudService;
	
	@GetMapping
	private List<Data> getDatas() {
		return getDataStore;
	}
	
	@PostMapping
	private List<Data> addData(@RequestBody Data data) {
		return crudService.addData(data);
	}
	
	@PutMapping
	private List<Data> updateData(@RequestBody Data data) {
		return crudService.updateData(data);
	}
	
	@DeleteMapping(path = "/{order}")
	private List<Data> deleteDataByOrder(@PathVariable Integer order) {
		return crudService.deleteDataByOrder(order);
	}

}
