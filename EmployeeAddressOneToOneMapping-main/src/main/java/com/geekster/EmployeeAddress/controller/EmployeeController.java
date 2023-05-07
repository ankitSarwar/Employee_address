package com.geekster.EmployeeAddress.controller;

import com.geekster.EmployeeAddress.model.Address;
import com.geekster.EmployeeAddress.model.Employee;
import com.geekster.EmployeeAddress.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/employees")
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @GetMapping(value = "/getAll")
    public List<Employee> getAllEmployees(){
        return employeeService.getAllEmployees();
    }

    @GetMapping("/get/{id}")
    public ResponseEntity<Employee> getEmployeeById(@PathVariable Long id){
        return employeeService.findEmployeeById(id);
    }

    @PostMapping(value = "/add")
    public ResponseEntity<Employee> createEmployee(@RequestBody Employee employee){
        return employeeService.createEmployee(employee);

//        List<Address> employeeList = Employee.getAddress1();
//
//        for(Address address :  employeeList)
//        {
//            address.setEmployee1(employee);
//        }

    }

    @PutMapping("/update/{id}")
    public ResponseEntity<Employee> updateEmployees(@PathVariable Long id, @RequestBody Employee employee){
        return employeeService. updateEmployees(id,employee);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Void> deleteEmployee(@PathVariable Long id)
    {
       return employeeService.deleteEmployeeById(id);
    }

}




//    {
//            "firstName": "ankit",
//            "lastName": "sarwar",
//            "address": {
//
//            "street": "456 Park Ave",
//            "city": "San Francisco",
//            "state": "CA",
//            "zipcode": "123456"
//            }
//            }

