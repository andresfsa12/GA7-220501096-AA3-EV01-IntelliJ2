package com.GA7220501096AA3EV01.sena.services.Implement;

import com.GA7220501096AA3EV01.sena.models.NotasModel;
import com.GA7220501096AA3EV01.sena.repositories.NotasRepository;
import com.GA7220501096AA3EV01.sena.services.NotasService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NotasServiceImpl implements NotasService {

    @Autowired
    private NotasRepository notasRepository;

    @Override
    public List<NotasModel> All () {
        return notasRepository.findAll();
    }

    @Override
    public NotasModel listById(int codigo) {
        return notasRepository.findById(codigo).get();
    }

    @Override
    public NotasModel create(NotasModel notasModel) {
        return notasRepository.save(notasModel);
    }

    @Override
    public NotasModel update(NotasModel notasModel) {
        return notasRepository.save(notasModel);
    }

    @Override
    public void deleteById(int codigo) {
        notasRepository.deleteById(codigo);
    }
}
