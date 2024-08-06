package com.GA7220501096AA3EV01.sena.DocenteService;

import com.GA7220501096AA3EV01.sena.DocenteModel.DocenteModel;

import java.util.List;

public interface DocenteService {

    List<DocenteModel> listAll();
    DocenteModel listById (int id);
    DocenteModel create(DocenteModel docenteModel);
    DocenteModel update(DocenteModel docenteModel);
    void deleteById(int id);
}
