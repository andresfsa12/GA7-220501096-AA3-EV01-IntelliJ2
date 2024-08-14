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
        List<AsistenciaModel> asistenciaModel = asistenciaService.All();
        return ResponseEntity.ok(asistenciaModel);
    }

    @GetMapping("/{codigo}")
    private ResponseEntity<?> listById(@PathVariable int codigo){
        AsistenciaModel asistenciaModel = asistenciaService.listById(codigo);
        return ResponseEntity.ok(asistenciaModel);
    }

    @PostMapping
    private ResponseEntity<?> create(@RequestBody AsistenciaModel asistenciaModel){

        AsistenciaModel asistenciaCreate = asistenciaService.create(asistenciaModel);
        return ResponseEntity.ok(asistenciaCreate);
    }

    @PutMapping("/{codigo}")
    private ResponseEntity<?> update (@PathVariable int codigo, @RequestBody AsistenciaModel asistenciaModel){
        asistenciaModel.setCodigo(codigo);
        AsistenciaModel asistenciaUpdate = asistenciaService.update(asistenciaModel);
        return ResponseEntity.ok(asistenciaUpdate);
    }
    @DeleteMapping("/{codigo}")
    private ResponseEntity<?> deleteById(@PathVariable int codigo){
        asistenciaService.deleteById(codigo);
        return ResponseEntity.ok(null);
    }

}


