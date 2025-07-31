import java.util.Scanner;

public class array_Sum {
    public static void main(String[] args) {
        Scanner Lector = new Scanner(System.in);

        int vector[] = new int[10];

        int valor;
        for (int i = 0; i < 10; i++) {
            System.out.println("Ingrese el valor número " + i + " en el arreglo.");
            valor = Lector.nextInt();
            vector[i] = valor;
        }

        int suma = 0;
        for (int i = 0; i < 10; i++) {
            suma = suma + i;
        }

        System.out.println("La suma del arreglo es igual a: " + suma);

    } 
}