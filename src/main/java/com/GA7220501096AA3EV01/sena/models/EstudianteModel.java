package com.GA7220501096AA3EV01.sena.models;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "Estudiante")
public class EstudianteModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int Codigo;
    private int Id_Estudiante;
    private String Nombre;
    private String Apellido;
    private Date Fecha_Nacimiento;
    private String Genero;
    private String Direccion;
    private int Codigo_Grado;
    private int Codigo_Acudiente;

    public int getCodigo() {
        return Codigo;
    }

    public void setCodigo(int codigo) {
        Codigo = codigo;
    }

    public int getId_Estudiante() {
        return Id_Estudiante;
    }

    public void setId_Estudiante(int id_Estudiante) {
        Id_Estudiante = id_Estudiante;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String apellido) {
        Apellido = apellido;
    }

    public String getGenero() {
        return Genero;
    }

    public void setGenero(String genero) {
        Genero = genero;
    }

    public Date getFecha_Nacimiento() {
        return Fecha_Nacimiento;
    }

    public void setFecha_Nacimiento(Date fecha_Nacimiento) {
        Fecha_Nacimiento = fecha_Nacimiento;
    }

    public String getDireccion() {
        return Direccion;
    }

    public void setDireccion(String direccion) {
        Direccion = direccion;
    }

    public int getCodigo_Grado() {
        return Codigo_Grado;
    }

    public void setCodigo_Grado(int codigo_Grado) {
        Codigo_Grado = codigo_Grado;
    }

    public int getCodigo_Acudiente() {
        return Codigo_Acudiente;
    }

    public void setCodigo_Acudiente(int codigo_Acudiente) {
        Codigo_Acudiente = codigo_Acudiente;
    }
}