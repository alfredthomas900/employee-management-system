package com.alfredthomas.employeeservice.service;

import com.alfredthomas.employeeservice.model.request.EmployeeRequest;
import com.alfredthomas.employeeservice.model.response.EmployeeResponse;

public interface EmployeeService {
  EmployeeResponse createEmployee(EmployeeRequest employeeRequest);
}
