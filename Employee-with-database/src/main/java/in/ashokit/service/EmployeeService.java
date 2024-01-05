package in.ashokit.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.ashokit.binding.Employee;
import in.ashokit.repository.EmpRepository;

@Service
public class EmployeeService {

	@Autowired
	private EmpRepository empRepo;

	public void saveData(Employee emp) {
		empRepo.save(emp);
	}

}
