package kodlamaio.HRMS.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlamaio.HRMS.business.Abstracts.DepartmentService;
import kodlamaio.HRMS.entities.Concretes.Department;

@RestController
@RequestMapping("/api/departments")
public class DepartmentsControllers {
	
	private DepartmentService departmentService;

	@Autowired
	public DepartmentsControllers(DepartmentService departmentService) {
		super();
		this.departmentService = departmentService;
	}
	
	@GetMapping("/getAll")
	public List<Department> getAll(){
		return this.departmentService.getAll();
	}
	

}
