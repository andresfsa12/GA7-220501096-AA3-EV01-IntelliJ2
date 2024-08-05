package com.GA7220501096AA3EV01.sena.Asistencia.Service;

import com.GA7220501096AA3EV01.sena.AsistenciaModel.AsistenciaModel;

import java.util.List;

public interface AsistenciaService {

    List<AsistenciaModel> listAll();
    AsistenciaModel listById(int codigo);
    AsistenciaModel create(AsistenciaModel asistenciaModel);
    AsistenciaModel update(AsistenciaModel asistenciaModel);
    void deleteById(int codigo);
}
