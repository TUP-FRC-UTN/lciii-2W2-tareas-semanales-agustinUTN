
public class ClientePreferencial extends Cliente {
    
    private float saldo;
    private float limite;
    private String domicilio;

    public ClientePreferencial(float saldo, float limite, String domicilio, int numero, String nombre, int telefono) {
        super(numero, nombre, telefono);
        this.saldo = saldo;
        this.limite = limite;
        this.domicilio = domicilio;
    }

    
    
    @Override
    public String toString(){
        
        return "Numero: "+ numero + " nombre: " + nombre + " Telefono: " + telefono + "Saldo: " + saldo + " Limite: " + limite +
                " Domicilio: " + domicilio;
    }
    
    
}
