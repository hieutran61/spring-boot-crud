package com.hieutran.demospringboot.service;

import com.hieutran.demospringboot.model.Employee;

import java.util.List;

public interface IEmployeeService {
    // Them nv
    public Employee addEmployee(Employee employee);

    // Chinh sua thong tin nv
    public Employee updateEmployee(long id, Employee employeeUpdated);

    // Xoa nv
    public boolean deleteEmployee(long id);

    // Lay ra danh sach nv
    public List<Employee> getAllEmployee();

    // Lay ra 1 nv
    public Employee getEmployee(long id);

}
