package com.bku.inautix.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.bku.inautix.dao.impl.EmployeeDAOImpl;
import com.bku.inautix.model.Employee;

@Controller
public class EmpService {

	@Autowired
	EmployeeDAOImpl empDAOImpl;
	
	
	@RequestMapping(value = "/employees")
	public String getEmployees(Model model) {
		List<Employee> list = empDAOImpl.getEmployees();
        model.addAttribute("employees", list);
        System.out.println("employees");
      return "jsonTemplate";
	 }	
	

    @RequestMapping("employee/{empId}")
    public String getEmployee(@PathVariable("empId") int empId, Model model){
		Employee emp = empDAOImpl.getEmployee(empId);
        model.addAttribute("employees", emp);
      return "jsonTemplate";
    }

	@RequestMapping(value = "/insert/{id}/{name}/{phn}/{gender}/{age}/{pass}")
	public String getEmployees(@PathVariable("id") int id, @PathVariable("name") String name, @PathVariable("phn") Long phn, @PathVariable("gender") String gender, @PathVariable("age") int age, @PathVariable("pass") String pass) {
		/*Employee emp=new Employee();
		emp.setEmpId(id);
		emp.setName(name);
		emp.setPhone(phn);
		emp.setAge(age);
		emp.setGender(gender);
		emp.setPass(pass);*/
		empDAOImpl.setEmployee(id, name, phn,age,gender,pass);
        //model.addAttribute("employees", list);
      return "jsonTemplate";
	 }	
    
	@RequestMapping("/login/{id}/{pass}")
	public String validate(@PathVariable("id") int id, @PathVariable("pass") String pass, Model model)
	{
		
		Employee emp=empDAOImpl.validateEmployee(id, pass);
		model.addAttribute("employees", emp);
		
		return "jsonTemplate";
	}
}

