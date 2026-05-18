package ej9.tp5;
import java.util.Scanner;
public class EJ9TP5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Cuantas filas desea?: ");
        int filas=scanner.nextInt();
        int[][]p1 = new int[filas][3];
        for (int i=0;i<filas;i++){
            System.out.print("Ingrese primer numero fila " + i + ": ");
            p1[i][0] = scanner.nextInt();
            System.out.print("Ingrese segundo numero fila " + i + ": ");
            p1[i][1] = scanner.nextInt();
            p1[i][2] = p1[i][0] + p1[i][1];
        }
        System.out.println("Resultados:");
        for (int i=0;i<filas;i++) {
            for (int j=0;j<3;j++) {
                System.out.print("[" + p1[i][j] + "]");
            }
            System.out.println();
        }
    }
}