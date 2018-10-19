
package clase3;

import java.util.Scanner;

public class Principal {
 public static void main(String[] args) {
        //Declaramos las variables que usará nuestro main
        double sueldo,sueldo1,sueldo2,sueldo3,opcion;
        double sueldos[] = new double [4];
        Scanner scanner = new Scanner(System.in);
        Trabajador t = new Trabajador(); //Creamos el objeto Trabajador
        //Damos la opción 1 o 2 para que el programa ejecute el método correcto
        System.out.println("Número de nombres del trabajador 1 o 2");
        int numero_nombres = scanner.nextInt();
        scanner.nextLine();
        if (numero_nombres == 1) {
            System.out.println("Ingrese el nombre del trabajador");
            String nombre = scanner.nextLine();
            t.agregar_nombres(nombre);
        }else{ 
            System.out.println("Ingrese el nombre uno del trabajador");
            String nombre1 = scanner.nextLine();
            System.out.println("Ingrese el nombre dos del trabajador");
            String nombre2 = scanner.nextLine();
            t.agregar_nombres(nombre1, nombre2);
        }
        System.out.println("Ingrese el apellido del trabajador");
        String apellidos = scanner.nextLine();
        t.agregar_apellidos(apellidos);
        //Damos la opción de como queremos ingresar el sueldo Mensual,Semanal(2 opciones)
        System.out.println("1. Sueldo mensual \n 2.Sueldo semanal \n3.Sueldo semanal forma 2");
        opcion = scanner.nextDouble();
        // La opcion 1 ingresa el sueldo mensual directamente
        if (opcion==1){          
        System.out.println("Ingrese el sueldo del trabajador");
        sueldo = scanner.nextDouble();
        t.agregar_sueldo(sueldo);
        //La opcion 2 ingresa el sueldo de cuatro semanas usando 4 variables y metodo sobrecargado
        }if (opcion==2){
            System.out.println("Ingrese semana 1");
            sueldo=scanner.nextDouble();//
            System.out.println("Ingrese semana 2");
            sueldo1 = scanner.nextDouble();
            System.out.println("Ingrese semana 3");
            sueldo2 = scanner.nextDouble();
            System.out.println("Ingrese semana 4");
            sueldo3 = scanner.nextDouble();           
            t.agregar_sueldo(sueldo,sueldo1,sueldo2,sueldo3);
         //La opcion 3 ingresa el sueldo de cuatro semanas usando un arreglo
        }if (opcion==3){
            for (int i = 1; i <=sueldos.length; i++) {
                System.out.println("Ingrese el valor semana "+i);
                sueldos[i]=scanner.nextDouble();
        }
            t.agregar_sueldo(sueldos);
        }        
        System.out.printf("Los datos del trabajador son: %s\n", t);

    }
}
