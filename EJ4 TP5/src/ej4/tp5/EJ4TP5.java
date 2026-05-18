package ej4.tp5;
import java.util.Scanner;
public class EJ4TP5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Cuantas filas desea?");
        int filas = scanner.nextInt();
        System.out.println("Cuantas columnas desea?");
        int columnas = scanner.nextInt();
        scanner.nextLine();
        String [][]p1= new String[filas][columnas];
       
             for(int i=0;i<filas;i++){
                 for(int j=0;j<columnas;j++){
                 System.out.print("Rellene la matriz, pocision actual: [" + i + j + "], ( la fila 1 es decir [0 x] esta reservada para nombres");
                 p1[i][j]=scanner.nextLine();
             }
             }
        for (int i=0;i<filas;i++){
             for(int j=0;j<columnas;j++){
                 System.out.print("[" + p1[i][j] + "]");
             }
             System.out.println();
         }
    }
    
}
