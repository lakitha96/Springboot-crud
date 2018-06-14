package lk.ijse.maven.springboot.services;

import lk.ijse.maven.springboot.entity.UserEntity;

import java.util.List;

public interface UserServices {

    List<UserEntity> findAllUsers();

    String addUser(UserEntity userEntity);

    String updateUser(UserEntity newUserEntity);



}
