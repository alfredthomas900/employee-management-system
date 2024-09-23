package com.alfredthomas.employeeservice.util;

import com.alfredthomas.employeeservice.model.entity.Employee;
import com.alfredthomas.employeeservice.model.request.EmployeeRequest;
import com.alfredthomas.employeeservice.model.response.EmployeeResponse;
import org.springframework.beans.BeanUtils;

import java.util.List;
import java.util.stream.Collectors;

public class EmployeeUtils {

  public static Employee mapToEmployeeEntity(EmployeeRequest employeeRequest) {
    Employee employee = new Employee();
    BeanUtils.copyProperties(employeeRequest, employee);
    return employee;
  }

  public static EmployeeResponse mapToEmployeeResponse(Employee savedEmployee) {
    EmployeeResponse employeeResponse = new EmployeeResponse();
    BeanUtils.copyProperties(savedEmployee, employeeResponse);
    return employeeResponse;
  }

  public static List<EmployeeResponse> mapToEmployeeResponseList(List<Employee> employeeList) {
    return employeeList.stream()
        .map(EmployeeUtils::mapToEmployeeResponse)
        .collect(Collectors.toList());
  }

  private EmployeeUtils() {}
}
