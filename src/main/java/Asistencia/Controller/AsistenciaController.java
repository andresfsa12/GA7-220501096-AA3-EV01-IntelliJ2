package Asistencia.Controller;


import Asistencia.Service.AsistenciaService;
import Asistencia.model.Asistencia;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cglib.transform.impl.AddStaticInitTransformer;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/asistencia")
public class AsistenciaController {

    @Autowired
    private AsistenciaService asistenciaService;

    @GetMapping
    private ResponseEntity<?> ListAll(){
        List<Asistencia> asistencia = asistenciaService.listAll();
        return ResponseEntity.ok(asistencia);
    }

    @GetMapping("/{CodigoAsistencia}")
    private ResponseEntity<?> listById(@PathVariable int CodigoAsistencia){
        Asistencia asistencia = asistenciaService.listById(CodigoAsistencia);
        return ResponseEntity.ok(asistencia);
    }

    @PostMapping
    private ResponseEntity<?> create(@RequestBody Asistencia asistencia){

        Asistencia asistenciaCreate = asistenciaService.create(asistencia);
        return ResponseEntity.ok(asistenciaCreate);
    }

    @PutMapping("/{CodigoAsistencia}")
    private ResponseEntity<?> update (@PathVariable int CodigoAsistencia, @RequestBody Asistencia asistencia){
        asistencia.setCodigoAsistencia(CodigoAsistencia);
        Asistencia asistenciaUpdate = asistenciaService.update(asistencia);
        return ResponseEntity.ok(asistenciaUpdate);
    }

    @DeleteMapping("/{CodigoAsistencia}")
    private ResponseEntity<?> deleteById(@PathVariable int CodigoAsistencia){
        asistenciaService.deleteById(CodigoAsistencia);
        return ResponseEntity.ok(null);
    }

}


