package taller3.televisores;

public class TV {

    Marca marca;
    int canal;
    int precio;
    boolean estado;
    int volumen;
    Control control;
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
        if(canal>0 && canal<120){
            this.canal = canal;
        }
        
    }

    public int getCanal() {
        return this.canal;
    }

    //Get numTV(N�mero de televisores creados.
    public int getNumTV() {
        return this.numTV;
    }

    //Encender TV
    public void turnOn() {
        this.estado = true;
    }

    //Apagar TV
    public void turnOff() {
        this.estado = false;
    }

    //Get estado
    public boolean getEstado() {
        return this.estado;
    }

    //Recorrer canales hacia arriba
    public void canalUp() {
        this.canal = this.canal + 1;
    }

    //Recorrer canales hacia abajo.
    public void canalDown() {
        this.canal = this.canal - 1;
    }

    //Subir volumen
    public void volumenUp() {
        int actual = this.volumen;
        if (actual > 0 && actual < 7) {
            actual = actual + 1;
        }
    }

    //Bajar volumen
    public void volumenDown() {
        int actual = this.volumen;
        if (actual > 0 && actual < 7) {
            actual = actual - 1;
        }
    }
}