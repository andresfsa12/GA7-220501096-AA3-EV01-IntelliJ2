package com.GA7220501096AA3EV01.sena.services;

import com.GA7220501096AA3EV01.sena.models.GradoModel;
import com.GA7220501096AA3EV01.sena.models.NotasModel;

import java.util.List;

public interface NotasService {

    List<NotasModel> All();
    NotasModel listById (int codigo);
    NotasModel create(NotasModel notasModel);
    NotasModel update(NotasModel notasModel);
    void deleteById(int codigo);
}
