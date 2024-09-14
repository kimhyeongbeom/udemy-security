//package com.easybytes.controller;
//
//import org.springframework.http.HttpStatus;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RestController;
//import com.easybytes.model.Customer;
//import com.easybytes.repository.CustomerRepository;
//import lombok.RequiredArgsConstructor;
//
//@RestController
//@RequiredArgsConstructor
//public class LoginController {
//    private final CustomerRepository customerRepository;
//
//    @PostMapping("/register")
//    public ResponseEntity<String> registerUser(@RequestBody Customer customer) {
//        Customer savedCustomer = null;
//        ResponseEntity response = null;
//
//        try {
//            savedCustomer = customerRepository.save(customer);
//            if (savedCustomer.getId() > 0 ) {
//                response = ResponseEntity.status(HttpStatus.CREATED).body("User registered successfully");
//            }
//        } catch (Exception e) {
//            response = ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("User registration failed : " + e.getMessage());
//        }
//
//        return response;
//    }
//}
