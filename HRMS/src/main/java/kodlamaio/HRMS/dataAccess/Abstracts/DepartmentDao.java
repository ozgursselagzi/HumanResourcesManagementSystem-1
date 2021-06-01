package kodlamaio.HRMS.dataAccess.Abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import kodlamaio.HRMS.entities.Concretes.Department;

public interface DepartmentDao extends JpaRepository<Department,Integer>{

}
