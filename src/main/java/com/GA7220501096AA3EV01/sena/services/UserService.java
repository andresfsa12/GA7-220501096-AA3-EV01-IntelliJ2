package com.GA7220501096AA3EV01.sena.services;

import com.GA7220501096AA3EV01.sena.models.UserModel;
import com.GA7220501096AA3EV01.sena.repositories.IUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Optional;


@Service
public class UserService {

    @Autowired
    IUserRepository userRepository;
    public ArrayList<UserModel> getUsers() { return (ArrayList <UserModel>) userRepository.findAll();
    }

    public UserModel saveUser(UserModel Acudiente){
        return userRepository.save(Acudiente);
    }

    public Optional<UserModel> getById(Long ID){
        return userRepository.findById(ID);
    }
    public UserModel updateById(UserModel request, Long ID){
        UserModel user = userRepository.findById(ID).get();

        user.setNOMBRE(request.getNOMBRE());
        user.setAPELLIDO(request.getAPELLIDO());
        user.setN_CELULAR(request.getN_CELULAR());
        user.setDIRECCION(request.getDIRECCION());
        user.setPASSWORD(request.getPASSWORD());

        return user;
    }
    public Boolean deleteUser (Long ID){
        try {
            userRepository.deleteById(ID);
            return true;
        }catch (Exception e) {
            return false;
        }
    }
}
