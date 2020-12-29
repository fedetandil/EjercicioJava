public class Moto extends Vehiculo implements Comparable<Vehiculo>{

    public static final String UNIDAD= "cc";
    private int cilindrada;


    public Moto(String patente, String marca, String modelo, double precio, int cilindrada) {
        super(patente, marca, modelo, precio);
        this.cilindrada = cilindrada;
    }

    @Override
    public String getDetalle() {
        return "// Cilindrada= " + this.getCilindrada() + UNIDAD+" ";
    }

    public int getCilindrada() {
        return cilindrada;
    }

    public void setCilindrada(int cilindrada) {
        this.cilindrada = cilindrada;
    }

    @Override
    public boolean equals(Object obj){
        try{
            Moto moto= (Moto)  obj;
            return moto.getPatente().equals(this.getPatente());
        }catch (Exception e){
            return false;
        }
    }


    @Override
    public int compareTo(Vehiculo o) {
        int resultado = (int) (this.getPrecio()-(o.getPrecio()));
        return resultado;
    }



}
