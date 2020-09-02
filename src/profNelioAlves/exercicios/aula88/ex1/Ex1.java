package profNelioAlves.exercicios.aula88.ex1;

import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Quantas alturas receber? ");
        int altQuant = sc.nextInt();
        double altSum = 0;

        double[] alt = new double[altQuant];

        for (int i = 0; i < altQuant; i++){
            System.out.print("Digite a altura: ");
            alt[i] = sc.nextDouble();
            altSum += alt[i];
        }

        double altMed = altSum / altQuant;
        System.out.printf("A altura média é %.2f ", altMed);

        sc.close();
    }
}
