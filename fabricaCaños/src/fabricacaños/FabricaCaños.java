
package fabricacaños;

import java.util.Scanner;
public class FabricaCaños {


    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        
        System.out.println("Ingrese la descripcion del producto");
        String descripcionProducto = sc.nextLine();
        
        System.out.println("Ingrese la cantidad de materiales que va a cargar");
        int cantidad = sc.nextInt();
        
        Producto producto = new Producto(descripcionProducto, cantidad);
        
        int codigo = 0;
        for (int i = 0; i < cantidad; i++) {
            
            codigo += 1;
            
            sc.nextLine();
            System.out.println("Ingrese la descripcion del material " + codigo );
            String descripcionMaterial = sc.nextLine();
            
            System.out.println("Ingrese el valor unitario");
            float valorUnitario = sc.nextFloat();
            
            Material material = new Material(codigo, descripcionMaterial, valorUnitario);
            
            producto.agregarMateriales(material);
        }
        int opcion = -1;

        while(opcion != 0){
            System.out.println("Menu");
            System.out.println("========================================");
            System.out.println("1 - Ver el costo total");
            System.out.println("2 - Ver si el material existe");
            System.out.println("0 - Salir");
            System.out.println("========================================");

            opcion = sc.nextInt();

            if(opcion == 1){
                System.out.println(producto.calculoTotal());
            }

            if(opcion == 2){
                System.out.println("ingrese el codigo del material");
                int codProducto = sc.nextInt();
                if(producto.existeMaterial(codProducto)){
                    System.out.println("El codigo existe");
                }
                else
                    System.out.println("No existe");
            }
        }
            
             
    }
    
}
