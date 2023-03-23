package onetooneBidirectional_mapping.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import onetooneBidirectional_mapping.model.Employee;
import onetooneBidirectional_mapping.service.EmpService;

@RestController
@RequestMapping("/employee")
public class EmpController {

	@Autowired
	private EmpService empservice;
	
	@PostMapping
	public ResponseEntity<Employee> addemp(@Valid @RequestBody Employee obj)
	{
		Employee e=empservice.insertemp(obj);
		return new ResponseEntity<>(e,HttpStatus.CREATED);
	}
	
	@GetMapping
	public List<Employee> getAll()
	{
		return empservice.getAllemp();
		
	}
	
}
