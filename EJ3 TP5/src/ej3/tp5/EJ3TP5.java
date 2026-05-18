package ej3.tp5;
import java.util.Scanner;
public class EJ3TP5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Cuantas filas desea?");
        int filas = scanner.nextInt();
        System.out.println("Cuantas columnas desea?");
        int columnas = scanner.nextInt();
        int [][]p1= new int[filas][columnas];
        for (int i=0;i<filas;i++){
             for(int j=0;j<columnas;j++){
                 System.out.print("Rellene la matriz, pocision actual: [" + i + j + "]");
                 p1[i][j]=scanner.nextInt();
             }
          System.out.println();
         }
        for (int i=0;i<filas;i++){
             for(int j=0;j<columnas;j++){
                 System.out.print("[" + p1[i][j] + "]");
             }
             System.out.println();
         }
    }
    
}
