package com.SpringBoot.Lab_Assessment_5.EmployeeRepository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.SpringBoot.Lab_Assessment_5.EmployeeEntity.Employee;


@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long>{

}
