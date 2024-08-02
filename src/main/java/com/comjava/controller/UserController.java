package com.comjava.controller;

//import com.comjava.dto.request.ApiResponse;
import com.comjava.service.UserService;
import com.comjava.entity.User;
import com.comjava.dto.request.userCreationRequest;
import com.comjava.dto.request.userUpdateRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RequestMapping("/users")
@RestController
public class UserController {
    @Autowired
    private  UserService userService;
    @PostMapping (consumes = "application/json")
//    public ApiResponse<User> creatUser(@RequestBody @Validated userCreationRequest request ) {
//        ApiResponse<User> apiResponse = new ApiResponse<>();
//        apiResponse.setResult(userService.creatRequest(request));
//        return apiResponse;
//    }
    public User createUser(@RequestBody userCreationRequest request ) {
        return userService.creatRequest(request);
    }


    @GetMapping
    public List<User> getUsers() {
    return userService.getUsers();
    }

    @GetMapping("/{userid}")
    public User getUserid(@PathVariable String userid) {
        return userService.getUserid(userid);
    }

    @PutMapping("/{userid}")
    public User updateUserid(@PathVariable String userid,  @RequestBody userUpdateRequest request) {
        return userService.updateUser(userid,request);
    }

    @DeleteMapping("/{userid}")
    public String deleteUser (@PathVariable String userid) {
        return userService.deleteUser(userid);
    }



}
