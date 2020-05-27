
class Prestamo {
    private String solicitante;
    private int cantidadDias;
    private boolean devuelto;
    
    
    public String getSolicitante(){
        return solicitante;
    }
    
    public Prestamo(String solicitante, int cantidadDias, boolean devuelto){
        this.solicitante = solicitante;
        this.cantidadDias = cantidadDias;
        this.devuelto = devuelto;
    }
    
    @Override
    public String toString(){
        return "Solcitante: " + solicitante;
    }
}
