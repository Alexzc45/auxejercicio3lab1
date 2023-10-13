package auxejecicio3lab;

public class clienteB extends cliente{
    
    private double preciodeusoporhoradeconsumo;

    public clienteB(String nombre, int tiempoContrato,double preciodeusoporhoradeconsumo) {
        super(nombre, tiempoContrato);
        this.preciodeusoporhoradeconsumo = preciodeusoporhoradeconsumo;
    }

    public double getPreciodeusoporhoradeconsumo() {
        return preciodeusoporhoradeconsumo;
    }

    public void setPreciodeusoporhoradeconsumo(double preciodeusoporhoradeconsumo) {
        this.preciodeusoporhoradeconsumo = preciodeusoporhoradeconsumo;
    }
   
}
