package com.GA7220501096AA3EV01.sena.controllers;


import com.GA7220501096AA3EV01.sena.models.GradoModel;
import com.GA7220501096AA3EV01.sena.services.GradoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping ("/Grado")
public class GradoController {

    @Autowired
    private GradoService gradoService;

    @GetMapping
    private ResponseEntity<?> ListAll(){
        List<GradoModel> gradoModel = gradoService.All();
        return ResponseEntity.ok(gradoModel);
    }
    @GetMapping("/{codigo}")
    private ResponseEntity<?> listById(@PathVariable int codigo){
        GradoModel gradoModel = gradoService.listById(codigo);
        return ResponseEntity.ok(gradoModel);
    }

    @PostMapping
    private ResponseEntity<?> create(@RequestBody GradoModel gradoModel){
        GradoModel gradoCreate = gradoService.create(gradoModel);
        return ResponseEntity.ok(gradoCreate);

    }

    @PutMapping("/{codigo}")
    private ResponseEntity<?> update (@PathVariable int codigo, @RequestBody GradoModel gradoModel){
        gradoModel.setCodigo(codigo);
        GradoModel gradoUpdate = gradoService.update(gradoModel);
        return ResponseEntity.ok(gradoUpdate);
    }
    @DeleteMapping("/{codigo}")
    private ResponseEntity<?> deleteById(@PathVariable int codigo){
        gradoService.deleteById(codigo);
        return ResponseEntity.ok(null);
    }

}
