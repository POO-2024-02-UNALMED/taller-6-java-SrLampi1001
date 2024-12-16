package vehiculos;
public class Camioneta extends Vehiculo{
    private boolean volco;
    private static int cantidad;
    public Camioneta(String placa, int puertas, int velocidadMaxima, String nombre, int precio, int peso, String traccion, Fabricante fabricante, boolean volco){
        super(placa, puertas, velocidadMaxima, nombre, precio, peso, traccion, fabricante);
        this.volco = volco;
    }
    public Camioneta(String placa, String nombre, int velocidadMaxima, int peso, Fabricante fabricante, int puertas){
        this(placa, puertas, velocidadMaxima, nombre, 0, peso, "4X4", fabricante, false);
    }
    public Camioneta(String placa, int puertas, String nombre, int precio, int peso, Fabricante fabricante, boolean volco){
        this(placa, puertas, 90, nombre, precio, peso, "4X4", fabricante, volco);
    }
    public Camioneta(){
        this("", 0, 90, "", 0,0, "4X4", null, false);
    }
    public boolean isVolco(){
        return volco;
    }
    protected void setVolco(boolean volco){
        this.volco = volco;
    }
    public static int getCantidad(){
        return cantidad;
    }

}