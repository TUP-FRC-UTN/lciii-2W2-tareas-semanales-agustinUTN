public class Cliente {
    
    private int numeroCliente;
    private String nombre;
    private int antiguedad;
    private String nombreMascota;
    private int edadMascota;

    public void setNumeroCliente(int numeroCliente){
        this.numeroCliente = numeroCliente;
    }
    public int getNumeroCliente(){
        return numeroCliente;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public String getNombre(){
        return nombre;
    }

    public void setAntiguedad(int antiguedad){
        this.antiguedad = antiguedad;
    }
    public int getAntiguedad(){
        return antiguedad;
    }

    public void setNombreMascota(Strig nombreMascota){
        this.nombreMascota = nombreMascota;
    }
    public String getNombreMascota(){
        return nombreMascota;
    }

    public void setEdadMascota(int edadMascota){
        this.edadMascota = edadMascota;
    }
    public int getEdadMascota(){
        return edadMascota;
    }

    public Cliente(int numeroCLiente, String nombre, int antiguedad, String nombreMascota, int edadMascota){

        this.numeroCliente = numeroCLiente;
        this.nombre = nombre;
        this.antiguedad = antiguedad;
        this.nombreMascota = nombreMascota;
        this.edadMascota = edadMascota;
    }


}