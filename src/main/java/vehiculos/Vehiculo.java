package vehiculos;

public class Vehiculo{
    private String placa;
    private int puertas;
    private int velocidadMaxima;
    private String nombre;
    private  int precio;
    private int peso;
    private String traccion;
    private Fabricante fabricante;
    private static int cantidadVehiculos=0;
    
    public Vehiculo(String placa, int puertas, int velocidadMaxima, String nombre, int precio, int peso, String traccion, Fabricante fabricante){
        this.placa = placa;
        this.puertas = puertas;
        this.velocidadMaxima = velocidadMaxima;
        this.nombre = nombre;
        this.precio=precio;
        this.peso=peso;
        this.traccion = traccion;
        this.fabricante = fabricante;
        cantidadVehiculos++;
        paisOrigen();
    }
    public Vehiculo(String placa, String nombre, int velocidadMaxima, int peso, Fabricante fabricante, int puertas){
        this(placa, puertas, velocidadMaxima, nombre, 0, peso, "", fabricante);
    }
    public Vehiculo(){
        this("", 0, 0, "", 0,0, "", null);
    }
    public String getPlaca(){
        return placa;
    }
    protected void setPlaca(String placa){
        this.placa = placa;
    }
    public int getPuertas(){
        return puertas;
    }
    protected void setPuertas(int puertas){
        this.puertas = puertas;
    }
    public int getVelocidadMaxima(){
        return velocidadMaxima;
    }
    protected void setVelocidadMaxima(int velocidadMaxima){
        this.velocidadMaxima = velocidadMaxima;
    }
    public String getNombre(){
        return nombre;
    }
    protected void setNombre(String nombre){
        this.nombre = nombre;
    }
    public int getPrecio(){
        return precio;
    }
    protected void setPrecio(int precio){
        this.precio = precio;
    }
    public int getPeso(){
        return peso;
    }
    protected void setPeso(int peso){
        this.peso = peso;
    }
    public String getTraccion(){
        return traccion;
    }
    protected void setTraccion(String traccion){
        this.traccion = traccion;
    }
    public Fabricante getFabricante(){
        return fabricante;
    }
    protected void setFabricante(Fabricante fabricante){
        this.fabricante = fabricante;
    }
    private void paisOrigen(){
        if (this.fabricante!=null) {
            this.fabricante.getPais().anadirVendido();
            this.fabricante.anadirVendido();
        }
    }
    public static int getCantidadVehiculos(){
        return cantidadVehiculos;
    }
    public static void setCantidadVehiculos(int cantidad){
        cantidadVehiculos = cantidad;
    }
    public static String vehiculosPorTipo(){
        return "Automoviles: "+Automovil.getCantidad()+"\nCamionetas: "+Camioneta.getCantidad()+"\nCamiones: "+Camion.getCantidad();
    }
    
}