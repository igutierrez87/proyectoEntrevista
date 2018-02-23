package modelo;

public class Usuario {

    private int id;
    private String nombreUsuario;
    private String contraseña;
    private Boolean habilitado;

    public Usuario() {
    }
    public Usuario(String nombreUsuario, String contraseña, boolean estahabilitado) {
        this.id = id;
        this.nombreUsuario = nombreUsuario;
        this.contraseña = contraseña;
        this.habilitado = estahabilitado;
    }

    public int getId() {
        return id;
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public String getContraseña() {
        return contraseña;
    }

    public Boolean ishabilitado() {
        return habilitado;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public void setEstahabilitado(Boolean estahabilitado) {
        this.habilitado = estahabilitado;
    }

    private boolean validarUsuario() {
        return true;
    }

    private void habilitar(){
        this.setEstahabilitado(Boolean.TRUE);
    }
    private void inhabilitar(){
        this.setEstahabilitado(Boolean.FALSE);
    }
    private void cambiarContraseña(String nuevaContraseña){
        this.setContraseña(nuevaContraseña);
    }
    private String obtenerPersonaLogueada(){
        return nombreUsuario;
    }
    private Boolean existe() {
        return this.ishabilitado();
    }

}
