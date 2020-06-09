
public class Cliente {
    
    protected int numero;
    protected String nombre;
    protected int telefono;
    
   
    public Cliente(int numero, String nombre, int telefono) {
        this.numero = numero;
        this.nombre = nombre;
        this.telefono = telefono;
    }
    
    @Override
    public String toString(){
        return "Numero: " + numero + " Nombre: " + nombre + " Telefono: " + telefono;
    }
}
 