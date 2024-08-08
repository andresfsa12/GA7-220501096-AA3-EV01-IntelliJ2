package com.GA7220501096AA3EV01.sena.AsistenciaModel;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "Asistencia")
public class AsistenciaModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int Codigo;
    private Date Fecha;
    private int Codigo_Estudiante;
    private int Codigo_docente;
    private int Codigo_Materia;

    public int getCodigo() {
        return Codigo;
    }

    public void setCodigo(int codigo) {
        Codigo = codigo;
    }

    public Date getFecha() {
        return Fecha;
    }

    public void setFecha(Date fecha) {
        this.Fecha = fecha;
    }

    public int getCodigo_Estudiante() {
        return Codigo_Estudiante;
    }

    public void setCodigo_Estudiante(int codigo_Estudiante) {
        Codigo_Estudiante = codigo_Estudiante;
    }

    public int getCodigo_docente() {
        return Codigo_docente;
    }

    public void setCodigo_docente(int codigo_docente) {
        Codigo_docente = codigo_docente;
    }

    public int getCodigo_Materia() {
        return Codigo_Materia;
    }

    public void setCodigo_Materia(int codigo_Materia) {
        Codigo_Materia = codigo_Materia;
    }
}