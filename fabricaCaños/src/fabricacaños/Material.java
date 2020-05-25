
package fabricacaños;


public class Material {
    private int codigo;
    private String descripcion;
    private float valorUnitario;
    
    
    public float getValorUnitario(){
        return valorUnitario;
    }
    
    public int getCodigo(){
        return codigo;
    }
    
    public Material(){
        
    }
       
    public Material(int codigo, String descripcion, float valorUnitario){
        this.codigo = codigo;
        this.descripcion = descripcion;
        this.valorUnitario = valorUnitario;
    }
    
    @Override
    public String toString() {
        return "Codigo: " + codigo + " Descripcion: " + descripcion + " Valor Unitario: " + valorUnitario; 
    }
}
