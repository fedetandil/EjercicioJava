public class Auto extends Vehiculo implements Comparable<Vehiculo>{

        private int puertas;

    public Auto(String patente, String marca, String modelo, double precio, int puertas) {
        super(patente, marca, modelo, precio);
        this.puertas = puertas;
    }

    @Override
        public String getDetalle() {
            return "// Puertas= " + this.getPuertas()+" " ;
        }

    public int getPuertas() {
        return puertas;
    }

    public void setPuertas(int puertas) {
        this.puertas = puertas;
    }

    @Override
    public boolean equals(Object obj){
        try{
            Auto auto= (Auto)  obj;
            return auto.getPatente().equals(this.getPatente());
        }catch (Exception e){
            return false;
        }
    }


    public int compareTo(Vehiculo o) {
        int resultado = (int) (this.getPrecio()-(o.getPrecio()));
        return resultado;
    }

}

