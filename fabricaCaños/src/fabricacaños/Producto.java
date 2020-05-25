
package fabricacaños;


public class Producto {
    private String descripcion;
    private Material[] materiales;
    
    
    public Producto(String descripcion,int cantidadElementos){
        this.descripcion = descripcion;
        materiales = new Material[cantidadElementos];
    }
    
    public void agregarMateriales(Material material){
        for (int i = 0; i < materiales.length; i++) {
            if(materiales[i] == null){
                materiales[i] = material;
                break;
            }
            
        }
    }
    
    public float calculoTotal(){
        float totalCostos = 0;
        
        for (int i = 0; i < materiales.length; i++) {
            if(materiales[i] != null){
                totalCostos += materiales[i].getValorUnitario();
            }
        }
        return totalCostos;
    }
    
    public boolean existeMaterial(int codigo){
        for (int i = 0; i < materiales.length; i++) {
            if(materiales[i] != null){
                if(materiales[i].getCodigo() == codigo){
                    return true;
                }
                break;
            }

        }
        return false;
    }
    
    
    
}
