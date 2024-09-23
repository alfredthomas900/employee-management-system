package com.alfredthomas.employeeservice.controller;

import com.alfredthomas.employeeservice.constants.EmployeeURIConstants;
import com.alfredthomas.employeeservice.model.request.EmployeeRequest;
import com.alfredthomas.employeeservice.model.response.EmployeeResponse;
import com.alfredthomas.employeeservice.service.EmployeeService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(EmployeeURIConstants.EMPLOYEE_BASE_URI)
@RequiredArgsConstructor
@CrossOrigin(originPatterns = "http://localhost:3000")
public class EmployeeController {
  private final EmployeeService employeeService;

  @PostMapping(EmployeeURIConstants.CREATE_EMPLOYEE_URI)
  public EmployeeResponse createEmployee(@RequestBody EmployeeRequest employeeRequest) {
    return employeeService.createEmployee(employeeRequest);
  }
}
