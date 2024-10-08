package com.GA7220501096AA3EV01.sena.Asistencia.Service.Implement;


import com.GA7220501096AA3EV01.sena.Asistencia.Service.AsistenciaService;
import com.GA7220501096AA3EV01.sena.AsistenciaModel.AsistenciaModel;
import com.GA7220501096AA3EV01.sena.AsistenciaRepository.AsistenciaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AsistenciaServiceImplement implements AsistenciaService {

    @Autowired
    private AsistenciaRepository asistenciaRepository;

    @Override
    public List<AsistenciaModel> All() {
        return asistenciaRepository.findAll();
    }

    @Override
    public AsistenciaModel listById(int codigo) {
        return asistenciaRepository.findById(codigo).get();
    }

    @Override
    public AsistenciaModel create(AsistenciaModel asistenciaModel) {
        return asistenciaRepository.save(asistenciaModel);
    }

    @Override
    public AsistenciaModel update(AsistenciaModel asistenciaModel) {
        return asistenciaRepository.save(asistenciaModel);
    }

    @Override
    public void deleteById(int codigo) {
    asistenciaRepository.deleteById(codigo);
    }
}
