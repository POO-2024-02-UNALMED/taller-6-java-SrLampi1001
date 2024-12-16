package vehiculos;
public class Camion extends Vehiculo{
    private int ejes;
    private static int cantidad = 0;
    public Camion(String placa, int puertas, int velocidadMaxima, String nombre, int precio, int peso, String traccion, Fabricante fabricante, int ejes){
        super(placa, puertas, velocidadMaxima, nombre, precio, peso, traccion, fabricante);
        this.ejes = ejes;
    }
    public Camion(String placa, String nombre, int precio, int peso, Fabricante fabricante, int ejes){
        this(placa, 2, 80, nombre, precio, peso, "4X2", fabricante, ejes);
    }
    public Camion(){
        this("", 2, 80, "", 0,0, "4X2", null, 0);
    }
    public int getEjes(){
        return ejes;
    }
    protected void setEjes(int ejes){
        this.ejes = ejes;
    }
    public static int getCantidad(){
        return cantidad;
    }
}