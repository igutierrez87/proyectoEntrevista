package com.entrevista.modelo;

public class Visita {
    private String nombre;
    private String cargo;
    private String empresa;
    private String email;
    private String telefono;
    private String observaciones;
    private int idUsuario;

    public Visita(){

    }
    public Visita(String nombre, String cargo, String empresa, String email, String telefono, String observaciones, int idUsuario) {
        this.nombre = nombre;
        this.cargo = cargo;
        this.empresa = empresa;
        this.email = email;
        this.telefono = telefono;
        this.observaciones = observaciones;
        this.idUsuario = idUsuario;
    }

    public String getNombre() {
        return nombre;
    }

    public String getCargo() {
        return cargo;
    }

    public String getEmpresa() {
        return empresa;
    }

    public String getEmail() {
        return email;
    }

    public String getTelefono() {
        return telefono;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public int getUsuario() {
        return idUsuario;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public void setObservaciones(String observaciones){
        this.observaciones = observaciones;
    }

    public void setIdUsuario(int IdUsuario){
        this.idUsuario = idUsuario;
    }
}
