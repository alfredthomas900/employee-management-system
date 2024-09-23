package com.alfredthomas.employeeservice.service;

import com.alfredthomas.employeeservice.model.entity.Employee;
import com.alfredthomas.employeeservice.model.request.EmployeeRequest;
import com.alfredthomas.employeeservice.model.response.EmployeeResponse;
import com.alfredthomas.employeeservice.repository.EmployeeRepository;
import com.alfredthomas.employeeservice.util.EmployeeUtils;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class EmployeeServiceImpl implements EmployeeService {

  private final EmployeeRepository employeeRepository;

  @Override
  public EmployeeResponse createEmployee(EmployeeRequest employeeRequest) {
    Employee employee = EmployeeUtils.mapToEmployeeEntity(employeeRequest);
    return EmployeeUtils.mapToEmployeeResponse(employeeRepository.save(employee));
  }

  @Override
  public List<EmployeeResponse> getAllEmployees() {
    return EmployeeUtils.mapToEmployeeResponseList(employeeRepository.findAll());
  }
}
