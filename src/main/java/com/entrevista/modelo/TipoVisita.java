package com.entrevista.modelo;

public class TipoVisita {
    private int id;
    private String nombre;
    private String observacion;

    public TipoVisita(){
    }

    public TipoVisita(String nombre, String observacion) {
        this.nombre = nombre;
        this.observacion = observacion;
    }

    public String getNombre() {
        return nombre;
    }

    public String getObservacion() {
        return observacion;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setObservacion(String observacion){
        this.observacion = observacion;
    }

}
