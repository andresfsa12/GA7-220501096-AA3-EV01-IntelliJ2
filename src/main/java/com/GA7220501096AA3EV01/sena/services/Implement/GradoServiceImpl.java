package com.GA7220501096AA3EV01.sena.services.Implement;

import com.GA7220501096AA3EV01.sena.models.EstudianteModel;
import com.GA7220501096AA3EV01.sena.models.GradoModel;
import com.GA7220501096AA3EV01.sena.repositories.GradoRepository;
import com.GA7220501096AA3EV01.sena.services.GradoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GradoServiceImpl implements GradoService {

    @Autowired
    private GradoRepository gradoRepository;

    @Override
    public List<GradoModel> All () {
        return gradoRepository.findAll();
    }

    @Override
    public GradoModel listById(int codigo) {
        return gradoRepository.findById(codigo).get();
    }

    @Override
    public GradoModel create(GradoModel gradoModel) {
        return gradoRepository.save(gradoModel);
    }

    @Override
    public GradoModel update(GradoModel gradoModel) {
        return gradoRepository.save(gradoModel);
    }

    @Override
    public void deleteById(int codigo) {
        gradoRepository.deleteById(codigo);
    }
}
