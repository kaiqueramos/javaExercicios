package profNelioAlves.exercicios.aula97.ex1;

import java.util.Scanner;

public class Matriz {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        sc.nextLine();

        int[][] mat = new int[n][n];

        for(int i = 0; i < n; i++){
            for(int z = 0; z < n; z++){
                mat[i][z] = sc.nextInt();
            }
        }
        System.out.println("Diagonal: ");
        for (int i = 0; i < n; i++){
            System.out.print(mat[i][i] + " ");
        }

        System.out.println("\n");
        int count = 0;
        for(int i = 0; i < n; i++){
            for(int z = 0; z < n; z++){
                if(mat[i][z] < 0){
                    count++;
                }
            }
        }

        System.out.println("Numeros negativos: " + count);

        sc.close();
    }
}
