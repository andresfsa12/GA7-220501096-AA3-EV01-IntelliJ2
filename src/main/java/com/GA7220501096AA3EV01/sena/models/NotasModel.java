package com.GA7220501096AA3EV01.sena.models;

import jakarta.persistence.*;

@Entity
@Table(name = "Notas")
public class NotasModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int Codigo;
    private int Codigo_Estudiante;
    private int Codigo_Materia;
    private int Nota;
    private int Codigo_Periodos;
    private int Codigo_Docente;

    public int getCodigo() {
        return Codigo;
    }

    public void setCodigo(int codigo) {
        Codigo = codigo;
    }

    public int getCodigo_Estudiante() {
        return Codigo_Estudiante;
    }

    public void setCodigo_Estudiante(int codigo_Estudiante) {
        Codigo_Estudiante = codigo_Estudiante;
    }

    public int getCodigo_Materia() {
        return Codigo_Materia;
    }

    public void setCodigo_Materia(int codigo_Materia) {
        Codigo_Materia = codigo_Materia;
    }

    public int getNota() {
        return Nota;
    }

    public void setNota(int nota) {
        Nota = nota;
    }

    public int getCodigo_Periodos() {
        return Codigo_Periodos;
    }

    public void setCodigo_Periodos(int codigo_Periodos) {
        Codigo_Periodos = codigo_Periodos;
    }

    public int getCodigo_Docente() {
        return Codigo_Docente;
    }

    public void setCodigo_Docente(int codigo_Docente) {
        Codigo_Docente = codigo_Docente;
    }
}