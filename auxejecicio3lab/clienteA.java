package auxejecicio3lab;

public class clienteA extends cliente {
    
     private double montomensual;

    public clienteA(String nombre, int tiempoContrato,double montomensual) {
        super(nombre, tiempoContrato);
        this.montomensual = montomensual;
    }

    public double getMontomensual() {
        return montomensual;
    }

    public void setMontomensual(double montomensual) {
        this.montomensual = montomensual;
    }
}
