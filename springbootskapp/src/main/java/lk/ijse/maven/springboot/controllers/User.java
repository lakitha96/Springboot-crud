package lk.ijse.maven.springboot.controllers;

import lk.ijse.maven.springboot.entity.UserEntity;
import lk.ijse.maven.springboot.services.UserServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class User {

    @Autowired
    private UserServices userServices;


    @GetMapping("/all")
    public List<UserEntity> getAll() {
        return userServices.findAllUsers();
    }

    @PostMapping("/add")
    public String addUser(@RequestBody UserEntity userEntity) {
        return userServices.addUser(userEntity);
    }

    @PutMapping("/update")
    public String updateUser(@RequestBody UserEntity newUserEntity) {
        return userServices.updateUser(newUserEntity);
    }





}
