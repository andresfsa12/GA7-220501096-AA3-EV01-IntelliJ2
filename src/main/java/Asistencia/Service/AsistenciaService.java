package Asistencia.Service;

import Asistencia.model.Asistencia;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

import java.util.List;

public interface AsistenciaService {

    List<Asistencia> listAll();
    Asistencia listById(int CodigoAsistencia);
    Asistencia create(Asistencia asistencia);
    Asistencia update(Asistencia asistencia);
    void deleteById(int CodigoAsistencia);
}
