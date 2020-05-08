/* Una Veterinaria encargada del cuidado de mascotas ha solicitado la realización de un software para
obtener resultados sobre sus clientes y sus respectivas mascotas. (Suponer que cada cliente posee una sola mascota)
Se sabe que cada Cliente de esta veterinaria tienen: un numero de cliente, un nombre,
una antigüedad (hace cuánto que son clientes de la veterinaria) y una Mascota.
De la Mascota se dispone los siguientes datos: el nombre y la edad.
El software requiere cargar un número n de Clientes (este valor deberá ser cargado por teclado).
Almacenar la información de los clientes en un arreglo.
Se pide:
-Mostrar la cantidad de clientes.
-Mostrar el promedio de edad de las mascotas.
-Informar cuántos clientes tienen una antigüedad mayor igual a 5 años.
*/

import java.util.Scanner;

public class Principal{

    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese la cantidad de clientes a cargar");
        int cantidadClientes = sc.nextInt();

        Cliente [] clientes = new Cliente[cantidadClientes];

        for(int i = 0; i<clientes.length;i++){
            System.out.println("Ingrese el numero del cliente " + (i+1));
            int numeroCLiente = sc.nextInt();
            sc.nextLine();
            System.out.println("Ingrese el nombre del cliente " + (i+1));
            String nombre = sc.nextLine();
            System.out.println("Ingrese la antiguedad");
            int antiguedad = sc.nextInt();
            sc.nextLine();
            System.out.println("Ingrese el nombre de la mascota");
            String nombreMascota = sc.nextLine();
            System.out.println("Ingrese edad de la mascota");
            int edadMascota = sc.nextInt();

            clientes[i] = new Cliente(numeroCLiente,nombre,antiguedad,nombreMascota,edadMascota);

        }

        //
        int contadorClientes = 0;
        int acumuladorEdadMascotas = 0;
        int masDeCinco = 0;
        for(int i = 0; i < clientes.length;i++){
            contadorClientes ++;

            acumuladorEdadMascotas += clientes[i].getEdadMascota();

            if(clientes[i].getAntiguedad() > 5){
                masDeCinco ++;
            }
        }
        float promedio = (float)acumuladorEdadMascotas / contadorClientes;
        System.out.println("hay " + contadorClientes + " clientes.");
        System.out.println("Promedio de edad de las mascota es de: " + promedio);
        System.out.println("hay " + masDeCinco + " clientes con mas de 5 años de antigudad.");
    }
}