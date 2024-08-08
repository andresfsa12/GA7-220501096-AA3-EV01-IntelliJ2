package com.GA7220501096AA3EV01.sena.DocenteService.Implement;


import com.GA7220501096AA3EV01.sena.DocenteModel.DocenteModel;
import com.GA7220501096AA3EV01.sena.DocenteRepository.DocenteRepository;
import com.GA7220501096AA3EV01.sena.DocenteService.DocenteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DocenteServiceImplement implements DocenteService{

    @Autowired
    private DocenteRepository docenteRepository;

    @Override
    public List<DocenteModel> All() {
        return docenteRepository.findAll();
    }

    @Override
    public DocenteModel listById(int codigo) {
        return docenteRepository.findById(codigo).get();
    }

    @Override
    public DocenteModel create(DocenteModel docenteModel) {
        return docenteRepository.save(docenteModel);
    }

    @Override
    public DocenteModel update(DocenteModel docenteModel) {
        return docenteRepository.save(docenteModel);
    }

    @Override
    public void deleteById(int codigo) {
        docenteRepository.deleteById(codigo);
    }
}
