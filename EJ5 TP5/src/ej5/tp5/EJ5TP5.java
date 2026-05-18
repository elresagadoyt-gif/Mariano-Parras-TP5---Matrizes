package ej5.tp5;
import java.util.Scanner;
public class EJ5TP5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[][]p1= new String[3][3];
        for (int i=0;i<3;i++) {
            for (int j=0;j<3;j++) {
                if (j % 2 == 0) {
                    System.out.print("Ingrese un nombre, posicion actual [" + i + "][" + j + "]: ");
                    p1[i][j] = scanner.nextLine();
                }
                else {
                    System.out.print("Ingrese un numero, posicion actual [" + i + "][" + j + "]: ");
                    p1[i][j] = scanner.nextLine();
                }
            }
        }
        for (int i=0;i<3;i++) {
            for (int j=0;j<3;j++) {
                System.out.print("[" + p1[i][j] + "]");
            }
            System.out.println();
        }
    }
}


