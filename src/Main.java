import java.text.DecimalFormat;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        Concesionaria concesionaria= new Concesionaria("Concesionaria");

        cargarVehiculos(concesionaria);
        ArrayList<Vehiculo> listaVehiculos= concesionaria.getVehiculos();
        mostrarListaDeVehiculos(listaVehiculos);
        System.out.println("=============================");
        Vehiculo masCaro= concesionaria.getVehiculoMasCaro();
        System.out.println("Vehículo más caro: " + masCaro.getMarca() +" "+ masCaro.getModelo());
        Vehiculo masBarato = concesionaria.getVehiculoMasBarato();
        System.out.println("Vehículo más barato: " + masBarato.getMarca() +" "+ masBarato.getModelo());
        Vehiculo porLetra = concesionaria.getVehiculoPorLetra("Y");
        System.out.println("Vehículo que contiene en el modelo la letra ‘Y’: " + porLetra.getMarca()+" "+porLetra.getModelo()+" "+formatoDecimal.format(porLetra.getPrecio()));
        System.out.println("=============================");
        ArrayList<Vehiculo> listaOrdenada= concesionaria.getVehiculosOrdenadosDescendentePorPrecio();
        System.out.println("Vehículos ordenados por precio de mayor a menor:");
        mostrarListaOrdenada(listaOrdenada);

    }

    static void cargarVehiculos(Concesionaria concesionaria){
        Moto moto1= new Moto("AAA000","Honda","Titan",60000.00,125);
        Moto moto2= new Moto("AAA001","Yamaha","YBR",80500.50,160);
        Auto auto1= new Auto("AAA002","Peugeot","206",200000.00,4);
        Auto auto2= new Auto("AAA003","Peugeot","208",250000.00,5);
        concesionaria.addVehiculo(auto1);
        concesionaria.addVehiculo(moto1);
        concesionaria.addVehiculo(auto2);
        concesionaria.addVehiculo(moto2);
    }

    static void mostrarListaDeVehiculos(ArrayList<Vehiculo> lista){
        for (Vehiculo v: lista
             ) {
            System.out.println(v);
        }
    }

    static void mostrarListaOrdenada(ArrayList<Vehiculo>lista){
        for (Vehiculo v: lista
             ) {
            System.out.println(v.getMarca() +" "+ v.getModelo());
        }
    }
    private static DecimalFormat formatoDecimal = new DecimalFormat("###,###.00");
}
