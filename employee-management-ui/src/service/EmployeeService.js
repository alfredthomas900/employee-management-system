import axios from "axios";

const EMPLOYEE_API_BASE_URL = "http://localhost:8080/v1/employee/service";
const CREATE_EMPLOYEE_API_URL = "/create";

class EmployeeService {
  saveEmployee(employee) {
    return axios.post(
      EMPLOYEE_API_BASE_URL + CREATE_EMPLOYEE_API_URL,
      employee
    );
  }
}

export default new EmployeeService();
