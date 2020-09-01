package taller3.televisores;

public class Control {

    TV tv;

    public Control() {

    }

    public void turnOn() {
        tv.turnOn();
    }
    
    public void turnOff(){
        tv.turnOff();
    }

    public void canalUP() {
        tv.canalUp();
    }

    public void canalDown() {
        tv.canalDown();
    }

    public void volumenUp() {
        tv.volumenUp();
    }

    public void volumenDown() {
        tv.volumenDown();
    }

    public void setCanal(int canal) {
        tv.setCanal(canal);
    }
    
    public void enlazar (TV tv){
        setTV(tv);
        tv.setControl(this);
    }
    
    public void setTV(TV tv){
        this.tv = tv;
    }
    
    public TV getTV(){
        return this.tv;
    }
}
