package com.GA7220501096AA3EV01.sena.controllers;


import com.GA7220501096AA3EV01.sena.models.EstudianteModel;
import com.GA7220501096AA3EV01.sena.services.EstudianteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping ("/Estudiante")
public class EstudianteController {

    @Autowired
    private EstudianteService estudianteService;

    @GetMapping
    private ResponseEntity<?> ListAll(){
        List<EstudianteModel> estudianteModel = estudianteService.All();
        return ResponseEntity.ok(estudianteModel);
    }
    @GetMapping("/{codigo}")
    private ResponseEntity<?> listById(@PathVariable int codigo){
        EstudianteModel estudianteModel = estudianteService.listById(codigo);
        return ResponseEntity.ok(estudianteModel);
    }

    @PostMapping
    private ResponseEntity<?> create(@RequestBody EstudianteModel estudianteModel){
        EstudianteModel estudianteCreate = estudianteService.create(estudianteModel);
        return ResponseEntity.ok(estudianteCreate);

    }

    @PutMapping("/{codigo}")
    private ResponseEntity<?> update (@PathVariable int codigo, @RequestBody EstudianteModel estudianteModel){
        estudianteModel.setCodigo(codigo);
        EstudianteModel estudianteUpdate = estudianteService.update(estudianteModel);
        return ResponseEntity.ok(estudianteUpdate);
    }
    @DeleteMapping("/{codigo}")
    private ResponseEntity<?> deleteById(@PathVariable int codigo){
        estudianteService.deleteById(codigo);
        return ResponseEntity.ok(null);
    }

}
