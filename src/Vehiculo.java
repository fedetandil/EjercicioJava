
import java.text.DecimalFormat;

public abstract class Vehiculo implements Comparable<Vehiculo>{

    private static DecimalFormat formatoDecimal = new DecimalFormat("###,###.00");
    private String patente;
    private String marca;
    private String modelo;
    private double precio;

    public Vehiculo(String patente, String marca, String modelo, double precio) {
        this.patente = patente;
        this.marca = marca;
        this.modelo = modelo;
        this.precio = precio;
    }

    public String getPatente() {
        return patente;
    }

    /* NO HAY SETTER DE PATENTE,
     LA PATENTE ES UNICA
     ( UTILIZADA PARA LA COMPARACION DEL EQUALS)*/

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public abstract String getDetalle();

    @Override
    public abstract int compareTo(Vehiculo o);

    @Override
    public String toString() {
        return "Marca= " + marca +" "+
                "// Modelo= " + modelo +" "+
                this.getDetalle() +
                "// Precio= " + formatoDecimal.format(this.getPrecio()) ;
    }




}
