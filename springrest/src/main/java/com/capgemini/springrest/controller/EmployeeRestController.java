package com.capgemini.springrest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.capgemini.springrest.beans.EmployeePrimaryInfo;
import com.capgemini.springrest.beans.EmployeeResponce;
import com.capgemini.springrest.service.EmployeeService;

@RestController
public class EmployeeRestController {
	@Autowired
	private EmployeeService service;

	@GetMapping(path="/getEmployee", produces = MediaType.APPLICATION_JSON_VALUE)
	@ResponseBody
	public EmployeePrimaryInfo getEmployee(int id) {
		EmployeePrimaryInfo employeeInfo = service.getEmployeeDetails(id);

		return employeeInfo;
	}

	@PostMapping(path = "/addEmployee", consumes = {MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE}, 
			produces = {MediaType.APPLICATION_JSON_VALUE,MediaType.APPLICATION_ATOM_XML_VALUE})
	@ResponseBody
	public EmployeeResponce addEmployee(@RequestBody EmployeePrimaryInfo empInfo) {
		boolean isAdded = service.createEmployeeInfo(empInfo);
		EmployeeResponce responce = new EmployeeResponce();
		if (isAdded) {

			responce.setMessage("Record is inserted");
		} else {
			responce.setError(true);
			responce.setMessage("Unable to Add Employee");
		}
		return responce;
	}

	@GetMapping(path = "/getAllEmployee", produces = MediaType.APPLICATION_JSON_VALUE)
	//@ResponseBody
	public EmployeeResponce getAllEmployee() {
		List<EmployeePrimaryInfo> employeeList = service.getALLInfo();
		EmployeeResponce response = new EmployeeResponce();
		if (employeeList != null && !employeeList.isEmpty()) {
			response.setEmployeeList(employeeList);

		} else {
			response.setError(true);
			response.setMessage("No data present");
		}
		return response;
	}
	@DeleteMapping(path = "/deleteEmployee/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
	//@ResponseBody
	public EmployeeResponce deleteEmployee(@PathVariable(name = "id") int id) {
		boolean isDeleted = service.deleteEmployeeInfo(id);
		EmployeeResponce response = new EmployeeResponce();
		if (isDeleted) {
			response.setMessage("Record is  Deleted");
		} else {
			response.setError(true);
			response.setMessage("Record is not Deleted");
		}
		return response;
	}


	@PutMapping(path = "/updateEmployee", 
			produces = MediaType.APPLICATION_JSON_VALUE)
	@ResponseBody
	public EmployeeResponce updateEmployee(EmployeePrimaryInfo empInfo) {
		boolean isUpdated = service.updateEmployeeInfo(empInfo);
		EmployeeResponce responce = new EmployeeResponce();
		if (isUpdated) {

			responce.setMessage("Record is Updated");
		} else {
			responce.setError(true);
			responce.setMessage("Record is not Updated");
		}
		return responce;
	}
}
