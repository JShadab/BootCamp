package com.shad;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.shad.config.SpringConfig;
import com.shad.dao.EmployeeDAO;
import com.shad.model.Employee;

public class App {

	public static void main(String[] args) {

		ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);

		EmployeeDAO employeeDAO = context.getBean(EmployeeDAO.class);

		/** For saving employee **/

//		Employee employee = new Employee();
//		employee.setId(3);
//		employee.setAge(34);
//		employee.setEmail("shadab.khan.2628@gmail.com");
//		employee.setName("Shadab");
//		employee.setPassword("223344");
//		employee.setSalary(1000);
//		
//		employeeDAO.add(employee);

//		System.out.println("Employee saved successfully");
		
		/** For updating employee **/

//		Employee employee = new Employee();
//		employee.setId(3);
//		employee.setAge(34);
//		employee.setEmail("shadab.khan.2628@gmail.com");
//		employee.setName("Shadab_New");
//		employee.setPassword("shad123");
//		employee.setSalary(2000);
//
//		employeeDAO.update(employee);
//
//		System.out.println("Employee updated successfully");
		
		/** For deleting employee **/

//		employeeDAO.delete(3);
//		System.out.println("Employee deleted successfully");
		
		/** For get employee by its id **/

//		Employee emp1 = employeeDAO.findById(1);
//		System.out.println(emp1);
//
//		Employee emp2 = employeeDAO.findById(2);
//		System.out.println(emp2);
//
//		Employee emp3 = employeeDAO.findById(3);
//		System.out.println(emp3);
		
		/** For getting all employees **/

		List<Employee> listOfEmps = employeeDAO.findAll();
		System.out.println(listOfEmps);

		// JdbcTemplate jdbcTemplate = context.getBean(JdbcTemplate.class);

		// 1. Getting the number of rows present in 'emp' table

//		String sql = "SELECT COUNT(*) FROM emp";
//
//		int rows = jdbcTemplate.queryForObject(sql, Integer.class);
//
//		System.out.println(rows);

	}

}
