package profNelioAlves.exercicios.aula90.ex1;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Client[] c = new Client[10];


        System.out.print("Quantos quartos serão alugados? ");
        int rents = sc.nextInt();
        sc.nextLine();

        for(int i = 0; i < rents; i++){
            System.out.print("Nome: ");
            String nome = sc.nextLine();

            System.out.print("Email: ");
            String email = sc.nextLine();

            System.out.print("Qual quarto vai ser alugado? (0 ao 9): ");
            int quarto = sc.nextInt();
            sc.nextLine();

            c[quarto] = new Client(nome, email, quarto);
        }

        for (Client client : c) {
            if (client != null) {
                System.out.print("Quarto " + client.getRoom());
                System.out.print(" - Nome: " + client.getName());
                System.out.println(" - Email:" + client.getEmail() + "\n");
            }
        }
    }
}
