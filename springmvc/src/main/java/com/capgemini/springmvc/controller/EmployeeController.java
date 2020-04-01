package com.capgemini.springmvc.controller;

import java.sql.Date;
import java.text.SimpleDateFormat;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.PostMapping;

import com.capgemini.springmvc.bean.EmployeePrimaryInfo;
import com.capgemini.springmvc.service.EmployeeService;

@Controller
public class EmployeeController {
	@Autowired
	private EmployeeService service;  
	@InitBinder
	public void initBinder(WebDataBinder binder) {
		CustomDateEditor dateEditor = new CustomDateEditor(new SimpleDateFormat("yyyy-mm-dd"), true);
		binder.registerCustomEditor(Date.class, dateEditor);
	}

	@GetMapping("/login")
	public String getAuthForm() {
		return "loginForm";
	}
	@GetMapping("/loginEmployee")
	public String authForm(int id,String password, ModelMap map) {

		EmployeePrimaryInfo auth = service.auth(id, password);
		if(auth.getId()==id && auth.getPassword().equals(password)) {
			map.addAttribute("bean", auth);
			return "searched";
		} else {
			return "loginForm";
		}

	}
	@GetMapping("/add")
	public String getForm() {
		return "addForm";
	}

	@PostMapping("/added")
	public String submitForm(EmployeePrimaryInfo info, ModelMap map) {

		boolean added = service.createEmployeeInfo(info);
		if(added) {
			return "hello";
		} else {
			return "addForm";
		}

	}

	@GetMapping("/search")
	public String getSearchForm() {
		return "searchEmp";
	}

	@GetMapping("/searchEmployee")
	public String getDetail(int id,ModelMap map) {
		EmployeePrimaryInfo bean = service.getEmployeeDetails(id);

		if (bean != null) {
			map.addAttribute("bean", bean);
			return "searched";
		} else {
			return "searchEmp";
		}

	}

	@GetMapping("/delete")
	public String getDeleteForm() {
		return "deleteEmp";
	}
	@GetMapping("/deleteEmployee")
	public String deleted(int id, ModelMap map) {
		boolean deleted = service.deleteEmployeeInfo(id);
		if (deleted) {
			map.addAttribute("hello", "Record is deleted");
			return "hello";
		} else {
			return "deleteEmp";
		}

	}
	@GetMapping("/getAll")
	public String getGetAll() {
		return "AllDetailsOfEmployee";
	}
	@GetMapping("/getAllEmployee")
	public String getAllEmployee(ModelMap map) {
		List<EmployeePrimaryInfo> allRecord = service.getALLInfo();
		map.addAttribute("list", allRecord);
		return "getAllEmployee";
	}

	@GetMapping("/update")
	public String getUpdateForm() {
		return "updateEmp";
	}
	@PostMapping("/updateEmployee")
	public String updated(EmployeePrimaryInfo info, ModelMap map) {
		boolean updated = service.updateEmployeeInfo(info);
		if (updated) {
			map.addAttribute("hello", "Record is Updated");
			return "hello";
		} else {
			return "updateEmp";
		}

	}
}
