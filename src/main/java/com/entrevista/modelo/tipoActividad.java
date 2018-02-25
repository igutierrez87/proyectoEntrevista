package com.entrevista.modelo;

import javax.persistence.Entity;

@Entity
public class tipoActividad {
    private int id;
    private String nombre;
    private String observacion;

    public tipoActividad(String nombre, String observacion) {
        this.nombre = nombre;
        this.observacion = observacion;
    }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getObservacion() {
        return observacion;
    }

    public void setObservacion(String observacion) {
        this.observacion = observacion;
    }

}
