public class Circulo {
    
    private double radio = 1.0;

    /* »»»» CONSTRUCTORES «««« */
    public Circulo() {
    }

    public Circulo(double radio) {
        this.radio = radio;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    public double getArea(){
        return Math.PI * (this.getRadio()*this.getRadio());
    }

    public double getCircunferencia(){ //  La CIRCUNFERENCIA de un circulo es su longitud.
        return 2*Math.PI*(this.getRadio());
    }

    @Override
    public String toString(){
        return "Circulo[radio: " + radio + "]";
    }
}
