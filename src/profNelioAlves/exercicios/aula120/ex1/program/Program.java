package profNelioAlves.exercicios.aula120.ex1.program;

import profNelioAlves.exercicios.aula120.ex1.entities.Client;
import profNelioAlves.exercicios.aula120.ex1.entities.Order;
import profNelioAlves.exercicios.aula120.ex1.entities.OrderItem;
import profNelioAlves.exercicios.aula120.ex1.entities.Product;
import profNelioAlves.exercicios.aula120.ex1.enums.OrderStatus;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        Scanner sc = new Scanner(System.in);
        System.out.println("Insira os dados do cliente");
        System.out.print("Nome: ");
        String name = sc.nextLine();

        System.out.print("Email: ");
        String email = sc.nextLine();

        System.out.print("Data de Nascimento (DD/MM/YYYY): ");
        String birthDate = sc.nextLine();

        Client client = new Client(name, email, sdf.parse(birthDate));

        System.out.println("Dados da ordem de compra:");
        System.out.print("Status: ");
        String status = sc.nextLine();
        OrderStatus os = OrderStatus.valueOf(status);

        System.out.print("Quantos itens serão incluídos na compra? ");
        Integer itemQuant = sc.nextInt();
        sc.nextLine();

        Order order = new Order(new Date(), os,client);

        for (int i = 0; i < itemQuant; i++){
            System.out.println("Dados do item #" + i+1 + ":");
            System.out.print("Nome: ");
            String itemName = sc.nextLine();
            System.out.print("Preço: ");
            Double itemPrice = sc.nextDouble();
            sc.nextLine();
            System.out.print("Quantidade: ");
            Integer itemQuantity = sc.nextInt();
            sc.nextLine();

            Product p = new Product(itemName, itemPrice);
            OrderItem orderItem = new OrderItem(itemQuantity, itemPrice, p);
            order.addOrderItem(orderItem);
        }

        System.out.println(order);



    }

}
