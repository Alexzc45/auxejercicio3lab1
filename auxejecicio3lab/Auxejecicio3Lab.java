package auxejecicio3lab;

public class Auxejecicio3Lab {

    public static void main(String[] args) {
        
        clienteA c1 = new clienteA("LUIS", 18, 150);
        clienteB c2 = new clienteB("MARCO",12,5);
        
        System.out.println("Nombre de c1: "+c1.getNombre());
        System.out.println("Tiempo de contrato de c1: "+c1.getTiempoContrato());
        System.out.println("Monto mensual de c1: "+c1.getMontomensual());
        System.out.println("----------------");
        System.out.println("Nombre de c2: "+c2.getNombre());
        System.out.println("Tiempo de contrato de c2: "+c2.getTiempoContrato());
        System.out.println("tiempo del uso por hora de c2: "+c2.getPreciodeusoporhoradeconsumo());

        c2.setTiempoContrato(24);
        c1.setMontomensual(300);
        
        System.out.println("-----------------");
        System.out.println("tiempo de contrato de c2: "+c2.getTiempoContrato());       
        System.out.println("monto mensual a pagar de c1: "+c1.getMontomensual());
        System.out.println("Nombre del cliente c2: " + c2.getNombre());       
    } 
}
