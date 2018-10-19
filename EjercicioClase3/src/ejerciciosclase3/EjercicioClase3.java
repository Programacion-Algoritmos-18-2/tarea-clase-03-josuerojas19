package ejerciciosclase3;

import java.util.Scanner;

public class EjercicioClase3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Trabajador t = new Trabajador();
        int opc=0;
        double sueldom[]=new double[4];
        System.out.println("*****MENU*****");
        System.out.println("1. Ingresar Sueldo Mensual");
        System.out.println("2. Ingresar Sueldo Semanal");
        opc=scanner.nextInt();
        switch (opc){
            case 1:
                System.out.println("Número de nombres del trabajador 1 o 2");
                int numero_nombres = scanner.nextInt();
                scanner.nextLine();
        
                if(numero_nombres==1){
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
                System.out.println("Ingrese el sueldo del trabajador");
                double sueldo = scanner.nextDouble();
                t.agregar_sueldo(sueldo);
                System.out.printf("Los datos del trabajador son: %s\n", t.presentar_datos());
            case 2:
                System.out.println("Número de nombres del trabajador 1 o 2");
                int numero_nombre = scanner.nextInt();
                scanner.nextLine();
        
                if(numero_nombre==1){
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
                String apellidosm = scanner.nextLine();
                t.agregar_apellidos(apellidosm);
                System.out.println("Ingrese el sueldo del trabajador");
                for (int i = 0; i < 4; i++) {
                    System.out.println("Ingrese sueldo semana "+(i+1));
                    sueldom[i]=scanner.nextDouble();
                }
                t.agregar_sueldo(sueldom);
                System.out.printf("Los datos del trabajador son: %s\n", t.presentar_datos());
        }
        
    }
    
}
