package com.GA7220501096AA3EV01.sena.models;

import jakarta.persistence.*;
import org.apache.catalina.User;

import java.security.PrivateKey;

@Entity
@Table(name = "Acudiente")
public class UserModel {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int Codigo;
    private int ID;
    private String NOMBRE;
    private String APELLIDO;
    private String N_CELULAR;
    private String DIRECCION;
    private String PASSWORD;

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public int getCodigo() {
        return Codigo;
    }

    public void setCodigo(int codigo) {
        Codigo = codigo;
    }

    public String getNOMBRE() {
        return NOMBRE;
    }

    public void setNOMBRE(String NOMBRE) {
        this.NOMBRE = NOMBRE;
    }

    public String getAPELLIDO() {
        return APELLIDO;
    }

    public void setAPELLIDO(String APELLIDO) {
        this.APELLIDO = APELLIDO;
    }

    public String getN_CELULAR() {
        return N_CELULAR;
    }

    public void setN_CELULAR(String n_CELULAR) {
        N_CELULAR = n_CELULAR;
    }

    public String getDIRECCION() {
        return DIRECCION;
    }

    public void setDIRECCION(String DIRECCION) {
        this.DIRECCION = DIRECCION;
    }

    public String getPASSWORD() {
        return PASSWORD;
    }

    public void setPASSWORD(String PASSWORD) {
        this.PASSWORD = PASSWORD;
    }
}



