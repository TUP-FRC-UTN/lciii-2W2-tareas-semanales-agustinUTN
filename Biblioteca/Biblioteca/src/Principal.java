
import java.util.Scanner;

public class Principal {
    
    
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Ingrese la cantidad de libros");
        int cantidadLibros = sc.nextInt();
        
        Biblioteca biblioteca = new Biblioteca(cantidadLibros);
        
        for (int i = 0; i < cantidadLibros; i++) {
            
            sc.nextLine();
            System.out.println("Ingrese el titulo del libro " + i);
            String titulo = sc.nextLine();
            
            System.out.println("Ingrese el precio");
            int precio = sc.nextInt();
            
            System.out.println("Ingrese el estado (1: Disponible, 2:Prestado, 3:Extraviado)");
            int estado = sc.nextInt();
            
            System.out.println("Ingrese cantidad de prestamos");
            int cantidadPrestamos = sc.nextInt();
            
            Libro libro = new Libro(titulo, precio, estado, cantidadPrestamos);
            
            for (int j = 0; j < cantidadPrestamos; j++) {
                sc.nextLine();
                System.out.println("Ingrese el nombre del solicitante " + j);
                String solicitante = sc.nextLine();
                
                System.out.println("Ingrese la cantidad de dias de prestamos");
                int cantidadDias = sc.nextInt();
                
                System.out.println("Ingrese 1 si el libro fue devuelto o 0 si no fue devuelto");
                int devu = sc.nextInt();
                
                boolean devuelto = false;
                if(devu == 1){
                    devuelto = true;
                }
            
                Prestamo prestamo = new Prestamo(solicitante, cantidadDias, devuelto);
                
                libro.agregarPrestamo(prestamo);
            }
            biblioteca.agregarLibro(libro);
        }
        
        System.out.println("Cantidad de libros disponibles " + biblioteca.cantidadLibros(1));
        System.out.println("Cantidad de libros prestados " + biblioteca.cantidadLibros(2));
        System.out.println("Cantidad de libros extraviados " + biblioteca.cantidadLibros(3));
        
        System.out.println("Suma de los precio de todos los libros extraviados " + biblioteca.sumaPrecioExtraviado());
        System.out.println("Promedio de la cantidad de libros prestados " + biblioteca.promedioPrestamos());
        
            
            
    }
    
        
        
}

