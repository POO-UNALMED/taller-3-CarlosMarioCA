package taller3.televisores;

public class TV {

    Marca marca;
    int canal;
    private int precio;
    boolean estado;
    int volumen;
    private Control control;
    private static int numTV;

    public TV(Marca marca, boolean estado) {

        this.marca = marca;
        this.estado = estado;
        this.canal = 1;
        this.volumen = 1;
        this.precio = 500;
        this.numTV ++;
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
        if ((volumen >= 0) && (volumen <= 7)&&(getEstado())) {
            this.volumen = volumen;
        }
    }
    public int getVolumen() {
        return this.volumen;
    }

    //Get y set de canal
    public void setCanal(int canal) {
        if ((canal >= 1) && (canal <= 120)&&(getEstado())) {
            this.canal = canal;
        }
    }
    public int getCanal() {
        return this.canal;
    }

    //Setear numero de televisores
    public static void setNumTV(int aumento) {
        numTV = aumento;
    }

    //Get numTV(Numero de televisores creados)
    public static int getNumTV() {
        return numTV;
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
        int actual = this.canal;
        if ((actual >= 1) && (actual < 120)&&(getEstado())) {
            setCanal(actual+1);
        }

    }

    //Recorrer canales hacia abajo.
    public void canalDown() {
        int actual = this.canal;
        if ((actual > 1) && (actual <= 120)&&(getEstado())) {
            setCanal(actual-1);
        }
    }

    //Subir volumen
    public void volumenUp() {
        int actual = this.volumen;
        if ((actual >= 0) && (actual < 7)&&(getEstado())) {
            setVolumen(actual+1);
        }
    }

    //Bajar volumen
    public void volumenDown() {
        int actual = this.volumen;
        if ((actual > 0) && (actual <= 7)&&(getEstado())) {
            setVolumen(actual-1);
        }
    }
}
