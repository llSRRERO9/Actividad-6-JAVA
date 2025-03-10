import java.util.HashSet;
import java.util.Scanner;

public class App{
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in); 
        int opcion;
        int numEmpleado;
        HashSet<Integer> empleados = new HashSet<>();


        do{
        System.out.println("--MENU--");
        System.out.println("Opcion 1: Registrar ingreso: ");
        System.out.println("Opcion 2: Registar salida: ");
        System.out.println("Opcion 3: Finalizar: ");
        opcion = scanner.nextInt();
        

                switch (opcion) {
                    case 1:
                    System.out.println("Ingresa el numero de empleado.");
                    numEmpleado = scanner.nextInt();
            empleados.add(numEmpleado);
                
                break;
                    case 2: 
                    System.out.println("Ingresa el numero de empleado:");
                    numEmpleado=scanner.nextInt();
                    empleados.add(numEmpleado);
                break;

        
            default:
            System.out.println("Opcion invalida");
                break;
        
        }
    } while(opcion!=3);

    System.out.println(empleados);
    System.out.println("Empleados unicos/diferentes: " + empleados.size());
    try {
        
    } catch (Exception e) {
        
    }
    
}
}