package com.GA7220501096AA3EV01.sena.DocenteRepository;

import com.GA7220501096AA3EV01.sena.DocenteModel.DocenteModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DocenteRepository extends JpaRepository<DocenteModel, Integer> {

}
