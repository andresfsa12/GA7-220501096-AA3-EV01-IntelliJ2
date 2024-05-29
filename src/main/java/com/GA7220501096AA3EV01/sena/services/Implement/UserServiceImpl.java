package com.GA7220501096AA3EV01.sena.services.Implement;

import com.GA7220501096AA3EV01.sena.models.UserModel;
import com.GA7220501096AA3EV01.sena.repositories.IUserRepository;
import com.GA7220501096AA3EV01.sena.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

public class UserServiceImpl implements UserService {

    @Autowired
    private IUserRepository userRepository;

    @Override
    public List<UserModel> listAll() {
        return userRepository.findAll();
    }

    @Override
    public UserModel listById(int ID) {
        return userRepository.findById(ID).get();
    }

    @Override
    public UserModel create(UserModel userModel) {
        return userRepository.save(userModel);
    }

    @Override
    public UserModel update(UserModel userModel) {
        return userRepository.save(userModel);
    }

    @Override
    public void deleteById(int ID) {
        userRepository.deleteById(ID);
    }
}
