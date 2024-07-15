package com.company.controller;


import com.company.client.EmployeeClient;
import com.company.client.UserClient;
import com.company.dto.ResponseWrapper;
import com.company.dto.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class Consume_FeignClient {

    private final EmployeeClient employeeClient;
    private final UserClient userClient;


    public Consume_FeignClient(EmployeeClient employeeClient, UserClient userClient) {
        this.employeeClient = employeeClient;
        this.userClient = userClient;

    }

    @GetMapping("/api/v1/users")
    public ResponseEntity<List<User>> getUsers(){

        return ResponseEntity.ok(userClient.getUsers());
    }


    @GetMapping("/api/v1/employee")
    public ResponseEntity<ResponseWrapper> getEmployee(){

        return ResponseEntity.ok(
                new ResponseWrapper(
                        "Employee retrieved",
                        employeeClient.getEmployee("6298ebfecd0551211fce37a6")));

    }



}