package com.comjava.service;

import com.comjava.entity.User;
import com.comjava.dto.request.userCreationRequest;
import com.comjava.dto.request.userUpdateRequest;
import com.comjava.enums.Role;
import com.comjava.exception.AppException;
import com.comjava.exception.ErrorCode;
import com.comjava.mapper.UserMapper;
import com.comjava.service.UserService;
import com.comjava.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.HashSet;
import java.util.List;

@Service
public class UserService {
    @Autowired
    public UserRepository userRepository;
    @Autowired
    public UserMapper userMapper;

    public User creatRequest (userCreationRequest request) {
//        User user = new User();
        if(userRepository.existsByUsername(request.getUsername()))
            throw new RuntimeException("trùng thông tin đăng nhập");
        User user = userMapper.toUser(request);
        PasswordEncoder passwordEncoder = new BCryptPasswordEncoder(10);
        user.setPassword(passwordEncoder.encode(request.getPassword()));

        HashSet<String> roles = new HashSet<>();
        roles.add(Role.USER.name());

        user.setRoles(roles);


        return userRepository.save(user);
    }

    public User updateUser (String userid, userUpdateRequest request) {
        User user = getUserid(userid);
        userMapper.updateUser(user , request);
//        user.setFirstname(request.getFirstname());
//        user.setLastname(request.getLastname());
//        user.setPassword(request.getPassword());
//        user.setDate(request.getDate());
        return userRepository.save(user);
    }

    public List<User> getUsers () {
        return userRepository.findAll();
    }

    public User getUserid (String userid) {
        return userRepository.findById(userid).orElseThrow(() -> new RuntimeException("user not found"));
    }

    public String deleteUser (String userid) {
        userRepository.deleteById(userid);
        return "Success";
    }

}
