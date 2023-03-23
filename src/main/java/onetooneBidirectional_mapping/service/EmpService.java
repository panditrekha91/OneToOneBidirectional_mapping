package onetooneBidirectional_mapping.service;

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
}
