package Asistencia.Service.Implement;


import Asistencia.Service.AsistenciaService;
import Asistencia.model.Asistencia;
import Asistencia.repository.AsistenciaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AsistenciaServiceImplement implements AsistenciaService {

    @Autowired
    private AsistenciaRepository asistenciaRepository;
    @Override
    public List<Asistencia> listAll() {
        return asistenciaRepository.findAll();
    }

    @Override
    public Asistencia listById(int CodigoAsistencia) {
        return asistenciaRepository.findById(CodigoAsistencia).get();
    }

    @Override
    public Asistencia create(Asistencia asistencia) {
        return asistenciaRepository.save(asistencia);
    }

    @Override
    public Asistencia update(Asistencia asistencia) {
        return asistenciaRepository.save(asistencia);
    }

    @Override
    public void deleteById(int CodigoAsistencia) {
    asistenciaRepository.deleteById(CodigoAsistencia);
    }
}
