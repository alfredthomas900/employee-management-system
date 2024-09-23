package com.alfredthomas.employeeservice.util;

import com.alfredthomas.employeeservice.model.entity.Employee;
import com.alfredthomas.employeeservice.model.request.EmployeeRequest;
import com.alfredthomas.employeeservice.model.response.EmployeeResponse;
import org.springframework.beans.BeanUtils;

public class EmployeeUtils {

  public static Employee mapToEmployeeEntity(EmployeeRequest employeeRequest) {
    Employee employee = new Employee();
    BeanUtils.copyProperties(employeeRequest, employee);
    return employee;
  }

  private EmployeeUtils() {}

  public static EmployeeResponse mapToEmployeeResponse(Employee savedEmployee) {
    EmployeeResponse employeeResponse = new EmployeeResponse();
    BeanUtils.copyProperties(savedEmployee, employeeResponse);
    return employeeResponse;
  }
}
