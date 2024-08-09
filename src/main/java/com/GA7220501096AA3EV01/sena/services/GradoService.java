package com.GA7220501096AA3EV01.sena.services;

import com.GA7220501096AA3EV01.sena.models.EstudianteModel;
import com.GA7220501096AA3EV01.sena.models.GradoModel;

import java.util.List;

public interface GradoService {

    List<GradoModel> All();
    GradoModel listById (int codigo);
    GradoModel create(GradoModel gradoModel);
    GradoModel update(GradoModel gradoModel);
    void deleteById(int codigo);
}
