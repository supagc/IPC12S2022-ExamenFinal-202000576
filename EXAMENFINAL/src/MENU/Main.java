package MENU;
import java.util.Scanner;

public class Main {
    static Scanner sn = new Scanner(System.in);
    public static void main(String[] args) {
        int opcion;
        do {
            System.out.println("----MENU----");
            System.out.println("1. Primer problema");
            System.out.println("2. Segundo problema");
            System.out.println("3. Tercer problema");
            System.out.println("4. SALIR");

            System.out.print("Ingrese un numero: ");
            opcion = sn.nextInt();

            switch (opcion) {
                case 1:
                    Primer();
                    break;

                case 2:
                    Segundo();
                    break;

                case 3:
                    Tercero();
                    break;

                case 4:
                    break;
                default:
                    System.out.println("Las opciones son de 1 a 4");
            }
        }
        while (opcion != 4);
        System.out.println("El programa a terminado");
    }

    public static void Primer(){
        System.out.println("Apartado para comparar y saber cual es el valor mayor ingresado");
        System.out.println("Escriba el primer valor: ");
        float numero1 = sn.nextFloat();
        System.out.println("Escriba el segundo valor: ");
        float numero2 = sn.nextFloat();
        if (numero1>numero2)
            System.out.println(numero1 + " es mayor que " + numero2);
        else
            System.out.println(numero2 + " es mayor que " + numero1);
    }
    public static void Segundo(){
        Scanner piramide=new Scanner(System.in);
        System.out.println("Apartado para realizar una piramide de valores impares");
        System.out.println("Escribir altura de la piramide");
        int alturadada = piramide.nextInt();
        if (alturadada % 2 == 0){
            System.out.println("El valor es par");
        } else
        {
            System.out.println("El valor es impar");
        }
        int altura = 1;
        int i = 0;
        int espacios = alturadada - 1;

        while (altura <= alturadada) {
            for (i = 1; i <= espacios; i++) {
                System.out.print(" ");
            }

            // pinta la línea de números
            for (i = 1; i < altura; i++) {
                System.out.print("*");
            }

            for (i = altura; i > 0; i--) {
                System.out.print("*");
            }

            System.out.println();

            altura++;
            espacios--;
        }
    }
    public static void Tercero(){
        System.out.println("No me sale :')");
    }


}
