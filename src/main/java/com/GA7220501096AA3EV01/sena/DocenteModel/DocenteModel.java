package com.GA7220501096AA3EV01.sena.DocenteModel;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "Docente")
public class DocenteModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int Codigo;
    private int Id_Docente;
    private String Nombres;
    private String Apellidos;
    private Date Fecha_Nacimiento;
    private String Genero;
    private String Nivel_Academico;
    private String Direccion;
    private String Ciudad;
    private String Celular;

    public int getCodigo() {
        return Codigo;
    }

    public void setCodigo(int codigo) {
        Codigo = codigo;
    }

    public int getId_Docente() {
        return Id_Docente;
    }

    public void setId_Docente(int id_Docente) {
        Id_Docente = id_Docente;
    }

    public String getNombres() {
        return Nombres;
    }

    public void setNombres(String nombres) {
        Nombres = nombres;
    }

    public String getApellidos() {
        return Apellidos;
    }

    public void setApellidos(String apellidos) {
        Apellidos = apellidos;
    }

    public Date getFecha_Nacimiento() {
        return Fecha_Nacimiento;
    }

    public void setFecha_Nacimiento(Date fecha_Nacimiento) {
        Fecha_Nacimiento = fecha_Nacimiento;
    }

    public String getGenero() {
        return Genero;
    }

    public void setGenero(String genero) {
        Genero = genero;
    }

    public String getNivel_Academico() {
        return Nivel_Academico;
    }

    public void setNivel_Academico(String nivel_Academico) {
        Nivel_Academico = nivel_Academico;
    }

    public String getCiudad() {
        return Ciudad;
    }

    public void setCiudad(String ciudad) {
        Ciudad = ciudad;
    }

    public String getDireccion() {
        return Direccion;
    }

    public void setDireccion(String direccion) {
        Direccion = direccion;
    }

    public String getCelular() {
        return Celular;
    }

    public void setCelular(String celular) {
        Celular = celular;
    }
}