package Asistencia.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.util.Date;

@Entity
public class Asistencia {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int CodigoAsistencia;

    private Date Fecha;
    private int CodigoEstudiante;
    private int IdDocente;
    private int CodigoMateria;

    public int getCodigoAsistencia() {
        return CodigoAsistencia;
    }

    public void setCodigoAsistencia(int codigoAsistencia) {
        CodigoAsistencia = codigoAsistencia;
    }

    public Date getFecha() {
        return Fecha;
    }

    public void setFecha(Date fecha) {
        Fecha = fecha;
    }

    public int getCodigoEstudiante() {
        return CodigoEstudiante;
    }

    public void setCodigoEstudiante(int codigoEstudiante) {
        CodigoEstudiante = codigoEstudiante;
    }

    public int getIdDocente() {
        return IdDocente;
    }

    public void setIdDocente(int idDocente) {
        IdDocente = idDocente;
    }

    public int getCodigoMateria() {
        return CodigoMateria;
    }

    public void setCodigoMateria(int codigoMateria) {
        CodigoMateria = codigoMateria;
    }
}