package com.GA7220501096AA3EV01.sena.DocenteCrontroller;

import com.GA7220501096AA3EV01.sena.DocenteModel.DocenteModel;
import com.GA7220501096AA3EV01.sena.DocenteService.DocenteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping ("/Docente")
public class DocenteController {

    @Autowired
    private DocenteService docenteService;

    @GetMapping
    private ResponseEntity<?> ListAll(){
        List<DocenteModel> docenteModel = docenteService.listAll();
        return ResponseEntity.ok(docenteModel);
    }
    @GetMapping("/{id}")
    private ResponseEntity<?> listById(@PathVariable int id){
        DocenteModel docenteModel = docenteService.listById(id);
        return ResponseEntity.ok(docenteModel);
    }

    @PostMapping
    private ResponseEntity<?> create(@RequestBody DocenteModel docenteModel){

        DocenteModel docenteCreate = docenteService.create(docenteModel);
        return ResponseEntity.ok(docenteCreate);
    }

    @PutMapping("/{id}")
    private ResponseEntity<?> update (@PathVariable int id, @RequestBody DocenteModel docenteModel){
        docenteModel.setId(id);
        DocenteModel docenteUpdate = docenteService.update(docenteModel);
        return ResponseEntity.ok(docenteUpdate);
    }
    @DeleteMapping("/{id}")
    private ResponseEntity<?> deleteById(@PathVariable int id){
        docenteService.deleteById(id);
        return ResponseEntity.ok(null);
    }

}
