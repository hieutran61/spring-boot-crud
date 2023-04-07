package com.hieutran.demospringboot.service;

import com.hieutran.demospringboot.model.Employee;
import com.hieutran.demospringboot.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeServiceImpl implements IEmployeeService {
    @Autowired
    private EmployeeRepository employeeRepository;

    @Override
    public Employee addEmployee(Employee employee) {
        if (employee != null)
            return employeeRepository.save(employee);
        return null;
    }

    @Override
    public Employee updateEmployee(long id, Employee employeeUpdated) {
        if (employeeUpdated != null){
            Employee emp = employeeRepository.getById(id);
            if (emp != null){
                emp.setName(employeeUpdated.getName());
                emp.setAddress(employeeUpdated.getAddress());
                return employeeRepository.save(emp);
            }
        }
        return null;
    }

    @Override
    public boolean deleteEmployee(long id) {
        if (id >= 1){
            Employee emp = employeeRepository.getById(id);
            if (emp != null) {
                employeeRepository.delete(emp);
                return true;
            }
        }
        return false;
    }

    @Override
    public List<Employee> getAllEmployee() {
        return employeeRepository.findAll();
    }

    @Override
    public Employee getEmployee(long id) {
        return employeeRepository.getById(id);
    }
}
