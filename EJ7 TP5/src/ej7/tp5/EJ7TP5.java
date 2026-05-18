package ej7.tp5;
import java.util.Scanner;
public class EJ7TP5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Cuantas filas desea?");
        int filas = scanner.nextInt();
        System.out.println("Cuantas columnas desea?");
        int columnas = scanner.nextInt();
        int [][]p1= new int[filas][columnas];
        int x=0;
        int p=0;
        for (int i=0;i<filas;i++) {
            for (int j=0;j<columnas;j++) {
                System.out.print("Ingrese un numero, posicion actual [" + i + "][" + j + "]: ");
                    p1[i][j] = scanner.nextInt();
                if (j % 2 != 0) {
                    x = x + p1[i][j];
                    p++;
                }
            }
        }
        for (int i=0;i<filas;i++) {
            for (int j=0;j<columnas;j++) {
                System.out.print("[" + p1[i][j] + "]");
            }
            System.out.println();
        }
        if (p==0){
            p++;
        }
        System.out.println("Promedio :  " + x/p);
    }
}


