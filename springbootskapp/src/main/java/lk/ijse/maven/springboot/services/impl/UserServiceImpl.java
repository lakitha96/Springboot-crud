package lk.ijse.maven.springboot.services.impl;

import lk.ijse.maven.springboot.entity.UserEntity;
import lk.ijse.maven.springboot.repositories.UserRepository;
import lk.ijse.maven.springboot.services.UserServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;



@Service
public class UserServiceImpl implements UserServices {

    @Autowired
    private UserRepository userRepository;


    @Override
    public List<UserEntity> findAllUsers() {
        List<UserEntity> allUsers = userRepository.findAll();
        return allUsers;
    }

    @Override
    public String addUser(UserEntity userEntity) {
        userRepository.save(userEntity);
        return "user added";
    }

    @Override
    public String updateUser(UserEntity newUserEntity) {
        String msg=null;
        if(newUserEntity.getId() != null){
            userRepository.save(newUserEntity);
            msg="data update";
        }else{
            msg="update error";
        }
        return msg;
    }




}
