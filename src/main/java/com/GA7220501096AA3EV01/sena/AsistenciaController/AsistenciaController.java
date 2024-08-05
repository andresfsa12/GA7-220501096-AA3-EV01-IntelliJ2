package com.GA7220501096AA3EV01.sena.AsistenciaController;


import com.GA7220501096AA3EV01.sena.Asistencia.Service.AsistenciaService;
import com.GA7220501096AA3EV01.sena.AsistenciaModel.AsistenciaModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Asistencia")
public class AsistenciaController {
    @Autowired
    private AsistenciaService asistenciaService;

    @GetMapping
    private ResponseEntity<?> ListAll(){
        List<AsistenciaModel> asistenciaModel = asistenciaService.listAll();
        return ResponseEntity.ok(asistenciaModel);
    }

    @GetMapping("/{Codigo}")
    private ResponseEntity<?> listById(@PathVariable int Codigo){
        AsistenciaModel asistenciaModel = asistenciaService.listById(Codigo);
        return ResponseEntity.ok(asistenciaModel);
    }

    @PostMapping
    private ResponseEntity<?> create(@RequestBody AsistenciaModel asistenciaModel){

        AsistenciaModel asistenciaCreate = asistenciaService.create(asistenciaModel);
        return ResponseEntity.ok(asistenciaCreate);
    }

    @PutMapping("/{Codigo}")
    private ResponseEntity<?> update (@PathVariable int Codigo, @RequestBody AsistenciaModel asistenciaModel){
        asistenciaModel.setCodigo(Codigo);
        AsistenciaModel asistenciaUpdate = asistenciaService.update(asistenciaModel);
        return ResponseEntity.ok(asistenciaUpdate);
    }
    @DeleteMapping("/{Codigo}")
    private ResponseEntity<?> deleteById(@PathVariable int Codigo){
        asistenciaService.deleteById(Codigo);
        return ResponseEntity.ok(null);
    }

}


