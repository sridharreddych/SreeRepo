package com.sree.junit.Employee_Management;

import java.util.List;

public interface EmployeeService {
 
    void saveEmployee(Employee employee);
 
    List<Employee> findAllEmployees();
 
    void deleteEmployeeBySsn(String ssn);
}
