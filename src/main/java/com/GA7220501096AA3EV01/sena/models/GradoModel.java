package com.GA7220501096AA3EV01.sena.models;

import jakarta.persistence.*;

@Entity
@Table(name = "Grado")
public class GradoModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int Codigo;
    private int Codigo_Jornada;
    private String Nombre;
    private int Codigo_Grupo;

    public int getCodigo() {
        return Codigo;
    }

    public void setCodigo(int codigo) {
        Codigo = codigo;
    }

    public int getCodigo_Jornada() {
        return Codigo_Jornada;
    }

    public void setCodigo_Jornada(int codigo_Jornada) {
        Codigo_Jornada = codigo_Jornada;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public int getCodigo_Grupo() {
        return Codigo_Grupo;
    }

    public void setCodigo_Grupo(int codigo_Grupo) {
        Codigo_Grupo = codigo_Grupo;
    }
}