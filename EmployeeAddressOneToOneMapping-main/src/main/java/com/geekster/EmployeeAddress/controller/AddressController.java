package com.geekster.EmployeeAddress.controller;

import com.geekster.EmployeeAddress.model.Address;
import com.geekster.EmployeeAddress.model.Employee;
import com.geekster.EmployeeAddress.service.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/address")
public class AddressController {

    @Autowired
    private AddressService addressService;

    @GetMapping(value = "getAll")
    public List<Address> getAllAddresses() {
        return addressService.getAllAddress();
    }

    @GetMapping(value = "/get/{id}")
    public ResponseEntity<Address> getAddressById(@PathVariable Long id)
    {
        return addressService.getAddressById(id);
    }

    @PostMapping(value = "/add")
    public ResponseEntity<Address> createAddress(@RequestBody Address address){
        return addressService.AddAddress(address);
    }

    @PutMapping(value = "/update/id")
    public ResponseEntity<Address> updateAddress(@PathVariable Long id,@RequestBody Address address){
        return addressService.updateAddress(id,address);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Void> deleteAddress(@PathVariable Long id) {
        return addressService.deleteAddressById(id);
    }
}


//    {
//            "street": "456 Park Ave",
//            "city": "San Francisco",
//            "state": "CA",
//            "zipcode": "123456",
//
//            "employee":{
//            "firstName": "ankit",
//            "lastName": "sarwar"
//            }
//
//            }