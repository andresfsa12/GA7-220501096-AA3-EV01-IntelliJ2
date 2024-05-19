package com.GA7220501096AA3EV01.sena.controllers;

import com.GA7220501096AA3EV01.sena.models.UserModel;
import com.GA7220501096AA3EV01.sena.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Optional;

@RestController
@RequestMapping("/Acudiente")
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping
    public ArrayList<UserModel> getUsers(){
        return this.userService.getUsers();
    }
    @PostMapping
    public UserModel saveUser(@RequestBody UserModel Acudiente){
        return this.userService.saveUser(Acudiente);
    }

    @GetMapping(path = "/{ID}")
    public Optional<UserModel> getUserById(@PathVariable("ID") Long ID){
        return this.userService.getById(ID);
    }
    //Sigue linea de editar
    @PutMapping(path = "/{ID}")
    public UserModel updateUserById(@RequestBody UserModel request,@PathVariable("ID") Long ID){
        return this.userService.updateById(request, ID);
    }

    @DeleteMapping(path = "/{ID}")
    public String deleteById(@PathVariable("ID")Long ID){
        boolean ok = this.userService.deleteUser(ID);
        if (ok){
            return "User with ID"+ID+"deleted";
        }
        else {
            return "Error, tenemos un problema y no podemos borrar el usuario con ID "+ID;
        }
    }
}
