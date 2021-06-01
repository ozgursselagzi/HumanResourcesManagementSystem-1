package kodlamaio.HRMS.business.Concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import kodlamaio.HRMS.business.Abstracts.DepartmentService;
import kodlamaio.HRMS.dataAccess.Abstracts.DepartmentDao;
import kodlamaio.HRMS.entities.Concretes.Department;

public class DepartmentManager implements DepartmentService{

	private DepartmentDao departmentDao;
	
	@Autowired
	public DepartmentManager(DepartmentDao departmentDao) {
		super();
		this.departmentDao = departmentDao;
	}


	@Override
	public List<Department> getAll() {
		
		return this.departmentDao.findAll();
		
	}

}
