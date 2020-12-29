import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Concesionaria {
    private String nombre;
    private List<Vehiculo> vehiculos;

    public Concesionaria(String nombre) {
        this.nombre = nombre;
        this.vehiculos= new ArrayList<>();
    }

    public void addVehiculo(Vehiculo vehiculo){
        //SI EL VEHICULO NO ESTA EN LA LISTA DE LA CONCESIONARIA, LO AGREGA
        if(!vehiculos.contains(vehiculo)){
            vehiculos.add(vehiculo);
        }
    }

    public Vehiculo getVehiculoMasCaro(){
        //SI HAY AL MENOS UN VEHICULO LO BUSCA
        if(this.getCantidadVehiculosEnConcesionaria()>0){
            ArrayList<Vehiculo> aux= new ArrayList<>(vehiculos);
            Collections.sort(aux);
            return aux.get(aux.size()-1);
        }else{
            //CASO CONTRARIO DEVUELVE NULL
            return null;
        }

    }

    public Vehiculo getVehiculoMasBarato(){
        //SI HAY AL MENOS UN VEHICULO LO BUSCA
        if(this.getCantidadVehiculosEnConcesionaria()>0) {
            ArrayList<Vehiculo> aux = new ArrayList<>(vehiculos);
            Collections.sort(aux);
            return aux.get(0);
        }else{
            //CASO CONTRARIO DEVUELVE NULL
            return null;
        }
    }

    public ArrayList<Vehiculo> getVehiculosOrdenadosDescendentePorPrecio(){
        ArrayList<Vehiculo> aux= new ArrayList<>(vehiculos);
        Collections.sort(aux,Collections.reverseOrder());
        return aux;
    }

    public Vehiculo getVehiculoPorLetra(String letra){
        for (Vehiculo v: vehiculos
             ) {
            if(v.getModelo().contains(letra)){
                //DEVUELVE EL PRIMER VEHICULO QUE CONTENGA LA LETRA DESEADA EN EL MODELO
                //(en caso de querer todos los vehiculos podria devolver una lista de Vehiculos)
                return v;
            }
        }
        //CASO CONTRARIO DEVUELVE NULL
        return null;
    }

    public int getCantidadVehiculosEnConcesionaria(){
        return this.vehiculos.size();
    }

    public ArrayList<Vehiculo> getVehiculos(){
        //DEVUELVO UNA COPIA DEL ORIGINAL
        return new ArrayList<>(vehiculos);
    }
}
