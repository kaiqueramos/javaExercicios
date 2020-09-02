package profNelioAlves.exercicios.aula99.ex1;

import java.util.Scanner;

public class Matriz {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int l = sc.nextInt();

        int c = sc.nextInt();


        int[][] mat = new int[l][c];

        for(int i = 0; i < mat.length; i++){
            for(int j = 0; j < mat[i].length; j++){
                mat[i][j] = sc.nextInt();
            }
        }
        System.out.print("Qual numero pesquisar? ");
        int pesq = sc.nextInt();

        for(int i = 0; i < mat.length; i++){
            for(int j = 0; j < mat[i].length; j++){
                if(mat[i][j] == pesq){
                    System.out.println("Posição: " + i + ", " + j);
                    if (j > 0){
                        System.out.println("Numero a esquerda: " + mat[i][j - 1]);
                    }
                    if(i > 0){
                        System.out.println("Numero acima: " + mat[i - 1][j]);
                    }
                    if(j < mat[i].length-1){
                        System.out.println("Numero a direita: " + mat[i][j + 1]);
                    }
                    if(i < mat.length - 1){
                        System.out.println("Numero abaixo: " + mat[i + 1][j]);
                    }
                }
            }
        }


        sc.close();
    }
}
