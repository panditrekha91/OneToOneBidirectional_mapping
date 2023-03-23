package onetooneBidirectional_mapping.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import onetooneBidirectional_mapping.model.Employee;

@Repository
public interface EmpInterface extends JpaRepository<Employee,Integer> {

	
	
}
