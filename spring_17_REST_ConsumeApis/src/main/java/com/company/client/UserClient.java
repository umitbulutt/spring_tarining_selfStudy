package com.company.client;


import com.company.dto.User;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@FeignClient(url = "https://jsonplaceholder.typicode.com/users", name = "USER-CLIENT")
public interface UserClient {

    @GetMapping("/users")       //https://jsonplaceholder.typicode.com/users
    List<User>   getUsers();






}
