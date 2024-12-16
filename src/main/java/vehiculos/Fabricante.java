package vehiculos;
import java.util.ArrayList;

public class Fabricante{
    public String nombre;
    private Pais pais;
    private int numVendidos = 0;
    private static ArrayList<Fabricante> listado = new ArrayList<>();

    public Fabricante(String nombre, Pais pais){
        this.nombre = nombre;
        this.pais = pais;
        anadirListado();
    }
    public String getNombre(){
        return nombre;
    }
    protected void setNombre(String nombre){
        this.nombre=nombre;
    }
    public Pais getPais(){
        return pais;
    }
    protected void setPais(Pais pais){
        this.pais = pais;
    }
    private void anadirListado(){
        listado.add(this);
    }
    public void anadirVendido(){
        numVendidos++;
    }
    public int getNumVendidos(){
        return numVendidos;
    }
    public static Fabricante fabricaMayorVentas(){
        int i=0;
        Fabricante may = null;
        for (Fabricante fab : Fabricante.listado) {
            if (fab.getNumVendidos()>i) {
             i = fab.getNumVendidos();
                may = fab;
            }
        }
        return may;
    }
    protected static void setListado(ArrayList<Fabricante> listado){
        Fabricante.listado = listado;
    }
    public static ArrayList<Fabricante> getListado(){
        return listado;
    }
    
    @Override
    public String toString(){
        return nombre;
    }
}