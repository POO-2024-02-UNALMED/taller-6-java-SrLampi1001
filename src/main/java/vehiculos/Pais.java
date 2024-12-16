package vehiculos;
import java.util.ArrayList;

public class Pais{
    private String nombre;
    private int numVendidos = 0;

    private static ArrayList<Pais> listado = new ArrayList<>();
    
    public Pais(String nombre){
        this.nombre=nombre;
        anadirListado();
    }
    public String getNombre(){
        return nombre;
    }
    protected void setNombre(String nombre){
        this.nombre = nombre;
    }
    private void anadirListado(){
        listado.add(this);
    }
    public ArrayList<Pais> getListado(){
        return listado;
    }
    public static void setListado(ArrayList<Pais> listado){
        Pais.listado = listado; 
    }
    public void anadirVendido(){
        this.numVendidos++;
    }
    public int getNumVendidos(){
        return numVendidos;
    }
    public static Pais paisMasVendedor(){
        int i = 0;
        Pais may = null;
        for (Pais pais : Pais.listado) {
            if (pais.getNumVendidos()>i) {
                i = pais.getNumVendidos();
                may = pais; 
            }
        }
        return may;
    }

}