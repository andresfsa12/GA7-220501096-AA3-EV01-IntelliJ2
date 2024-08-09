package com.GA7220501096AA3EV01.sena.controllers;


import com.GA7220501096AA3EV01.sena.models.NotasModel;
import com.GA7220501096AA3EV01.sena.services.NotasService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping ("/Notas")
public class NotasController {

    @Autowired
    private NotasService notasService;

    @GetMapping
    private ResponseEntity<?> ListAll(){
        List<NotasModel> notasModel = notasService.All();
        return ResponseEntity.ok(notasModel);
    }
    @GetMapping("/{codigo}")
    private ResponseEntity<?> listById(@PathVariable int codigo){
        NotasModel notasModel = notasService.listById(codigo);
        return ResponseEntity.ok(notasModel);
    }

    @PostMapping
    private ResponseEntity<?> create(@RequestBody NotasModel notasModel){
        NotasModel notasCreate = notasService.create(notasModel);
        return ResponseEntity.ok(notasCreate);

    }

    @PutMapping("/{codigo}")
    private ResponseEntity<?> update (@PathVariable int codigo, @RequestBody NotasModel notasModel){
        notasModel.setCodigo(codigo);
        NotasModel notasUpdate = notasService.update(notasModel);
        return ResponseEntity.ok(notasUpdate);
    }
    @DeleteMapping("/{codigo}")
    private ResponseEntity<?> deleteById(@PathVariable int codigo){
        notasService.deleteById(codigo);
        return ResponseEntity.ok(null);
    }

}
