
public class Biblioteca {
    
    private Libro[] libro;
    
    
    public void agregarLibro(Libro l){
        
        for (int i = 0; i < libro.length; i++) {
            if(libro[i] == null){
                libro[i] = l;
                break;
            }
            
        }
    }
    
    public int cantidadLibros(int estado){
        int contador = 0;
        
        for (int i = 0; i < libro.length; i++) {
            if(libro[i]!= null && libro[i].getEstado() == estado){
                contador ++;
            }
            
        }
        return contador;
    }
    
    public int [] cantidadLibrosPorEstado(){
        
        int [] resultado = new int[3];
        
        resultado[0] = 0;
        resultado[1] = 0;
        resultado[2] = 0;
        
        for (Libro l : libro) {
            if(l != null){
                if(l.getEstado() == 1){
                    resultado[0] ++;
                }
                if(l.getEstado() == 2){
                    resultado[1] ++;
                }
                if(l.getEstado() == 3){
                    resultado[2] ++;
                }
            }
            
        }
        return resultado;
        
    }
    
    public String listadoSolicitantes(String titulo){
        return "";
    }
    
    public float promedioPrestamos(){
        
        int contador = 0;
        int acumulador = 0;
        
        for (int i = 0; i < libro.length; i++) {
            if(libro[i] != null){
                contador ++;
                acumulador += libro[i].cantidadPrestamos();
            }
            
        }
        
        float promedio = 0;
        if(contador != 0){
            promedio = (float)acumulador / contador;
        }
        
        return promedio;
        
    }
    
    public float sumaPrecioExtraviado(){
        float sumaPrecio = 0;
        
        for (int i = 0; i < libro.length; i++) {
            if(libro[i] != null){
                if(libro[i].getEstado() == 3){
                    sumaPrecio += libro[i].getPrecio();
                }
            }
            
        }
        return sumaPrecio;
    }
    
    public Biblioteca(int cantidadLibros){
        
       libro = new Libro[cantidadLibros];
    }
    
    
    
}
