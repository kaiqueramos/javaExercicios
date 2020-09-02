package profNelioAlves.exercicios.aula89.ex1;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos produtos serão cadastrados? ");
        int n = sc.nextInt();

        Product[] p = new Product[n];

        double totPreco = 0;

        for(int i = 0; i < n; i++){
            System.out.print("Nome do produto: ");
            String nome = sc.next();

            System.out.print("Preço do produto: R$");
            double preco = sc.nextDouble();

            p[i] = new Product(nome, preco);

            totPreco += preco;
        }

        double precoMedia = totPreco / n;

        System.out.printf("A media dos preços é %.2f", precoMedia);

        sc.close();
    }

}
