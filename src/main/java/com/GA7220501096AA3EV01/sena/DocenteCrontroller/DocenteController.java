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
        List<DocenteModel> docenteModel = docenteService.All();
        return ResponseEntity.ok(docenteModel);
    }
    @GetMapping("/{codigo}")
    private ResponseEntity<?> listById(@PathVariable int codigo){
        DocenteModel docenteModel = docenteService.listById(codigo);
        return ResponseEntity.ok(docenteModel);
    }

    @PostMapping
    private ResponseEntity<?> create(@RequestBody DocenteModel docenteModel){
        DocenteModel docenteCreate = docenteService.create(docenteModel);
        return ResponseEntity.ok(docenteCreate);

    }

    @PutMapping("/{codigo}")
    private ResponseEntity<?> update (@PathVariable int codigo, @RequestBody DocenteModel docenteModel){
        docenteModel.setCodigo(codigo);
        DocenteModel docenteUpdate = docenteService.update(docenteModel);
        return ResponseEntity.ok(docenteUpdate);
    }
    @DeleteMapping("/{codigo}")
    private ResponseEntity<?> deleteById(@PathVariable int codigo){
        docenteService.deleteById(codigo);
        return ResponseEntity.ok(null);
    }

}
