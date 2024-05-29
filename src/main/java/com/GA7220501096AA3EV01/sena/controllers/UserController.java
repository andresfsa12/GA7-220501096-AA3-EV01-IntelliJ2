package com.GA7220501096AA3EV01.sena.controllers;


import com.GA7220501096AA3EV01.sena.models.UserModel;
import com.GA7220501096AA3EV01.sena.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Acudiente")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping
    private ResponseEntity<?> listAll(){
        List<UserModel> Acudiente = userService.listAll();
        return ResponseEntity.ok(Acudiente);
    }
    @GetMapping("/{codigo}")
    private ResponseEntity<?> listById(@PathVariable int codigo){
        UserModel userModel = userService.listById(codigo);
        return ResponseEntity.ok(userModel);
    }
    @PostMapping
    private ResponseEntity<?> create(@RequestBody UserModel userModel){
        UserModel userCreate = userService.create(userModel);
        return ResponseEntity.ok(userCreate);
    }
    @PutMapping("/{codigo}")
    private ResponseEntity<?> update(@PathVariable int codigo, @RequestBody UserModel userModel){
        userModel.setCodigo(codigo);
        UserModel userUpdate = userService.update(userModel);
        return ResponseEntity.ok(userUpdate);
    }
    @DeleteMapping ("/{codigo}")
    private ResponseEntity<?> deleteById(@PathVariable int codigo){
        userService.deleteById(codigo);
        return ResponseEntity.ok(null);
    }


}
