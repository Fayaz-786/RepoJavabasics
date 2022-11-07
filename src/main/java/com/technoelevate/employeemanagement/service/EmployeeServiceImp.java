package com.technoelevate.employeemanagement.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.technoelevate.employeemanagement.dao.EmployeeDao;
import com.technoelevate.employeemanagement.entity.Employee;
@Service
public class EmployeeServiceImp implements EmployeeService{
	@Autowired
	public EmployeeDao employeeDao;

	@Override
	public boolean register(Employee employee) {
		if(employee.getEmpId().startsWith("TYC")) {
		      return employeeDao.register(employee);
		}
		return false;	
	}	
}