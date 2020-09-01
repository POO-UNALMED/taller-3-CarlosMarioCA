package taller3.televisores;

public class TV {

    Marca marca;
    int canal;
    int precio;
    boolean estado;
    int volumen;
    //Control control;
    static int numTV;

    public TV(Marca marca, boolean estado) {
        this.marca = marca;
        this.estado = estado;
        this.canal = 1;
        this.volumen = 1;
        this.precio = 500;
    }

    //Get y set de Marca
    public void setMarca(Marca marca) {
        this.marca = marca;
    }

    public Marca getMarca() {
        return this.marca;
    }

    //Get y set de Control
    public void setControl(Control control) {
        this.control = control;
    }

    public Control getControl() {
        return this.control;
    }

    //Get y set de precio
    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public int getPrecio() {
        return this.precio;
    }

    //Get y set de volumen
    public void setVolumen(int volumen) {
        this.volumen = volumen;
    }

    public int getVolumen() {
        return this.volumen;
    }

    //Get y set de canal
    public void setCanal(int canal) {
        this.canal = canal;
    }

    public int getCanal() {
        return this.canal;
    }

    //Get y set de numTV(Número de televisores creados)
    public void setCanal(int canal) {
        this.canal = canal;
    }

    public int getCanal() {
        return this.canal;
    }
}
