package com.GA7220501096AA3EV01.sena.services;

import com.GA7220501096AA3EV01.sena.models.UserModel;
import org.apache.catalina.User;

import java.util.List;


public interface UserService {
    List<UserModel> listAll();
    UserModel listById(int ID);
    UserModel create(UserModel userModel);
    UserModel update(UserModel userModel);
    void deleteById(int ID);
}

