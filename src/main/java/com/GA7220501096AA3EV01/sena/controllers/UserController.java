package com.GA7220501096AA3EV01.sena.controllers;

import com.GA7220501096AA3EV01.sena.models.UserModel;
import com.GA7220501096AA3EV01.sena.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.yaml.snakeyaml.events.Event;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

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
    @GetMapping("/{ID}")
    private ResponseEntity<?> listById(@PathVariable int ID){
        UserModel userModel = userService.listById(ID);
        return ResponseEntity.ok(userModel);
    }
    @PostMapping
    private ResponseEntity<?> create(@RequestBody UserModel userModel){
        UserModel userCreate = userService.create(userModel);
        return ResponseEntity.ok(userCreate);
    }
    @PutMapping("/{ID}")
    private ResponseEntity<?> update(@PathVariable int ID, @RequestBody UserModel userModel){
        userModel.setID(ID);
        UserModel userUpdate = userService.update(userModel);
        return ResponseEntity.ok(userUpdate);
    }
    @DeleteMapping ("/{ID}")
    private ResponseEntity<?> deleteById(@PathVariable int ID){
        userService.deleteById(ID);
        return ResponseEntity.ok(null);
    }


}
