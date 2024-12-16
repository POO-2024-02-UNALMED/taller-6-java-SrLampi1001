package vehiculos;

public class Automovil extends Vehiculo{
    private int puestos;
    private static int cantidad =0;

    public Automovil(String placa, int puertas, int velocidadMaxima, String nombre, int precio, int peso, String traccion, Fabricante fabricante, int puestos){
        super(placa, puertas, velocidadMaxima, nombre, precio, peso, traccion, fabricante);
        this.puestos = puestos;
        cantidad++;
    }
    public Automovil(String placa, String nombre, int velocidadMaxima, int peso, Fabricante fabricante, int puertas){
        super(placa, puertas, velocidadMaxima, nombre, 0, peso, "FWD", fabricante);
        this.puestos=0;
    }
    public Automovil(){
        super("", 0, 0, "", 0,0, "FWD", null);
        this.puestos = 0;
    }
    public int getPuestos(){
        return puestos;
    }
    protected void setPuestos(int puestos){
        this.puestos = puestos;
    }
    public static int getCantidad(){
        return cantidad;
    }
}