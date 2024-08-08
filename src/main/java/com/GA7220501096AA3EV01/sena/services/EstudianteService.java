package com.GA7220501096AA3EV01.sena.services;

import com.GA7220501096AA3EV01.sena.models.EstudianteModel;

import java.util.List;

public interface EstudianteService {

    List<EstudianteModel> All();
    EstudianteModel listById (int codigo);
    EstudianteModel create(EstudianteModel estudianteModel);
    EstudianteModel update(EstudianteModel estudianteModel);
    void deleteById(int codigo);
}
