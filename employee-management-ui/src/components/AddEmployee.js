import React, { useState } from "react";
import EmployeeService from "../service/EmployeeService";

const AddEmployee = () => {
  const [Employee, setEmployee] = useState({
    id: "",
    firstName: "",
    lastName: "",
    email: "",
  });

  const handleChange = (event) => {
    const value = event.target.value;
    setEmployee({
      ...Employee,
      [event.target.name]: value,
    });
  };

  const saveEmployee = (event) => {
    event.preventDefault();
    EmployeeService.saveEmployee(Employee)
      .then((res) => {
        console.log("Employee added successfully : ", res);
      })
      .catch((error) => {
        console.log(error + "Error while adding employee");
      });
  };

  return (
    <div className="flex max-w-2xl mx-auto shadow border-b">
      <div className="px-8 py-8">
        <div className="font-thin text-2xl tracking-wider">
          <h1> Add New Employee </h1>
        </div>
        <div className="items-center justify-center h1-14 w-full my-4">
          <label className="block text-gray-600 text-sm font-normal">
            First Name
          </label>
          <input
            type="text"
            name="firstName"
            value={Employee.firstName}
            onChange={(event) => handleChange(event)}
            className="h-10 w-96 border mt-2 px-2 py-2"
          ></input>
        </div>
        <div className="items-center justify-center h1-14 w-full my-4">
          <label className="block text-gray-600 text-sm font-normal">
            Last Name
          </label>
          <input
            type="text"
            name="lastName"
            value={Employee.lastName}
            onChange={(event) => handleChange(event)}
            className="h-10 w-96 border mt-2 px-2 py-2"
          ></input>
        </div>
        <div className="items-center justify-center h1-14 w-full my-4">
          <label className="block text-gray-600 text-sm font-normal">
            E-mail
          </label>
          <input
            type="email"
            name="email"
            value={Employee.email}
            onChange={(event) => handleChange(event)}
            className="h-10 w-96 border mt-2 px-2 py-2"
          ></input>
        </div>
        <div className="items-center justify-center h1-14 w-full my-4 space-x-4 pt-4">
          <button
            onClick={saveEmployee}
            className="rounded text-white font-semibold bg-green-400 hover:bg-green-700 py-2 px-6"
          >
            Save
          </button>
          <button className="rounded text-white font-semibold bg-red-400 hover:bg-red-700 py-2 px-6">
            Clear
          </button>
        </div>
      </div>
    </div>
  );
};

export default AddEmployee;
