package auxejecicio3lab;

public class cliente {
    
    private String nombre;
    private int tiempoContrato;

    public cliente(String nombre, int tiempoContrato) {
        this.nombre = nombre;
        this.tiempoContrato = tiempoContrato;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getTiempoContrato() {
        return tiempoContrato;
    }

    public void setTiempoContrato(int tiempoContrato) {
        this.tiempoContrato = tiempoContrato;
    }
   
}
