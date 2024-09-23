package com.alfredthomas.employeeservice.service;

import com.alfredthomas.employeeservice.model.request.EmployeeRequest;
import com.alfredthomas.employeeservice.model.response.EmployeeResponse;

import java.util.List;

public interface EmployeeService {
  EmployeeResponse createEmployee(EmployeeRequest employeeRequest);

    List<EmployeeResponse> getAllEmployees();
}
