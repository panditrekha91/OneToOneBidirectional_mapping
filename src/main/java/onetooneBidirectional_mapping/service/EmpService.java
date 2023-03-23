package onetooneBidirectional_mapping.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import onetooneBidirectional_mapping.model.Employee;
import onetooneBidirectional_mapping.repository.EmpInterface;

@Service
public class EmpService {

	@Autowired
	private EmpInterface empinterface;
	
	public Employee insertemp(Employee e)
	{
		Employee obj=empinterface.save(e);
		return obj;
		
	}

	public List<Employee> getAllemp() {
		
		return empinterface.findAll();
	}

	public void deleteemp(int id) {
		
		empinterface.deleteById(id);
	}
}
