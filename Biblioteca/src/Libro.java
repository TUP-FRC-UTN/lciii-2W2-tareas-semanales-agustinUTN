
public class Libro {
    private String titulo;
    private int precio;
    private int estado;
    private Prestamo [] prestamo;
    
    
    public int getPrecio(){
        return precio;
    }
    public int getEstado(){
        return estado;
    }
    
    
    
    public int cantidadPrestamos(){
        
        int contadorPrestamos = 0;
        for (int i = 0; i < prestamo.length; i++) {
            if(prestamo[i] != null){
                contadorPrestamos ++;
            }
            
        }
        return contadorPrestamos;
        
    }
    
    public void agregarPrestamo(Prestamo nuevo){
        
        for (int i = 0; i < prestamo.length; i++) {
            if(prestamo[i] == null){
                prestamo[i] = nuevo;
                break;
            }
            
        }
    }
    
    public String listadoSolicitantes(){
        return "";
    }
    
    public Libro(int cantidadPrestamo){
        prestamo = new Prestamo[cantidadPrestamo];
        
    }
    public Libro(String titulo, int precio, int estado, int cantidadPrestamo){
        this.titulo = titulo;
        this.precio = precio;
        this.estado = estado;
        this.prestamo = new Prestamo[cantidadPrestamo];
        
    }
    
}
