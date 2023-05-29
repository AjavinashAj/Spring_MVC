package in.ashokit.repository;

import org.springframework.data.repository.CrudRepository;

import in.ashokit.binding.Employee;

public interface EmpRepository extends CrudRepository<Employee ,Integer>{

}
