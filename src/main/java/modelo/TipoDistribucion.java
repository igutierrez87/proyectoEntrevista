package modelo;

public class TipoDistribucion {
    private int id;
    private String nombre;

    public TipoDistribucion(){

    }
    public TipoDistribucion(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

}
