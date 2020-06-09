
import java.util.*;
        
public class Principal {

    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int opcion = -1;
        
        while(opcion != 0){
            
            System.out.println("Ingrese 1 si quiere cargar un cliente \n"
                  + "2 para cargar un cliente preferencial \n"
                  + "0 si quiere salir");
            
            opcion = sc.nextInt();
            
            if(opcion == 1){
                System.out.println("Ingrese nº de cliente: ");
                int numero = sc.nextInt();
        
                sc.nextLine();
                System.out.println("Ingrese el nombre: ");
                String nombre = sc.nextLine();
        
                System.out.println("Ingrese el telefono: ");
                int telefono = sc.nextInt();
                
                Cliente cliente = new Cliente(numero, nombre, telefono);                
                System.out.println(cliente.toString());
                System.out.println("");
            }
            
            if(opcion == 2){
                
                System.out.println("Ingrese nº de cliente: ");
                int numero = sc.nextInt();
        
                sc.nextLine();
                System.out.println("Ingrese el nombre: ");
                String nombre = sc.nextLine();
        
                System.out.println("Ingrese el telefono: ");
                int telefono = sc.nextInt();
        
                System.out.println("Ingrese el saldo: ");
                float saldo = sc.nextFloat();
        
                System.out.println("Ingrese el limite: ");
                float limite = sc.nextFloat();
        
                sc.nextLine();
                System.out.println("Ingrese el domicilio: ");
                String domicilio = sc.nextLine();
        
                ClientePreferencial clienteP = new ClientePreferencial(saldo, limite, domicilio, numero, nombre, telefono);                
                System.out.println(clienteP.toString());
                System.out.println("");
            }
            
            if(opcion == 0){
                break;
            }
            
        }
        
    }
    
}
