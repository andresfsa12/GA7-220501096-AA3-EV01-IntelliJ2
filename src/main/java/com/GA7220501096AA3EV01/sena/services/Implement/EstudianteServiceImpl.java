package com.GA7220501096AA3EV01.sena.services.Implement;

import com.GA7220501096AA3EV01.sena.models.EstudianteModel;
import com.GA7220501096AA3EV01.sena.repositories.EstudianteRepository;
import com.GA7220501096AA3EV01.sena.services.EstudianteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EstudianteServiceImpl implements EstudianteService {

    @Autowired
    private EstudianteRepository estudianteRepository;

    @Override
    public List<EstudianteModel> All () {
        return estudianteRepository.findAll();
    }

    @Override
    public EstudianteModel listById(int codigo) {
        return estudianteRepository.findById(codigo).get();
    }

    @Override
    public EstudianteModel create(EstudianteModel estudianteModel) {
        return estudianteRepository.save(estudianteModel);
    }

    @Override
    public EstudianteModel update(EstudianteModel estudianteModel) {
        return estudianteRepository.save(estudianteModel);
    }

    @Override
    public void deleteById(int codigo) {
        estudianteRepository.deleteById(codigo);
    }
}
