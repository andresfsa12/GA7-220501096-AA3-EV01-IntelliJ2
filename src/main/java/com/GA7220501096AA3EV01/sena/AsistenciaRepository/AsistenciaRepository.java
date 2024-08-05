package com.GA7220501096AA3EV01.sena.AsistenciaRepository;

import com.GA7220501096AA3EV01.sena.AsistenciaModel.AsistenciaModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AsistenciaRepository extends JpaRepository<AsistenciaModel, Integer> {
}
