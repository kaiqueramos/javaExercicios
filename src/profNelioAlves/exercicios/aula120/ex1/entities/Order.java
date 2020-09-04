package profNelioAlves.exercicios.aula120.ex1.entities;

import profNelioAlves.exercicios.aula120.ex1.enums.OrderStatus;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Order {
    private Date moment;
    private OrderStatus status;

    private List<OrderItem> orderItem = new ArrayList<>();
    private Client client;

    public static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
    public static SimpleDateFormat sdfHour = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");


    public Order(Date moment, OrderStatus status, Client client) {
        this.moment = moment;
        this.status = status;
        this.client = client;
    }

    public String getMoment() {
        return sdfHour.format(moment);
    }

    public void setMoment(Date moment) {
        this.moment = moment;
    }

    public OrderStatus getStatus() {
        return status;
    }

    public void setStatus(OrderStatus status) {
        this.status = status;
    }

    public List<OrderItem> getOrderItem() {
        return orderItem;
    }

    public void addOrderItem(OrderItem orderItem) {
        this.orderItem.add(orderItem);
    }
    public void removeOrderItem(OrderItem orderItem) {
        this.orderItem.remove(orderItem);
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }
    public Double total(){
        Double tot = 0.0;
        for(OrderItem oi : orderItem){
            tot += oi.subTotal();
        }
        return tot;
    }

    @Override
    public String toString() {

        double finalPrice = 0.0;

        StringBuilder sc = new StringBuilder();
        sc.append("Resumo da compra: \n");
        sc.append("Momento da compra: " + this.getMoment() + "\n");
        sc.append("Status: " + this.getStatus() + "\n");
        sc.append("Cliente: " + this.getClient().getName() +
                " (" + sdf.format(this.getClient().getBirthDate()) + ") - " +
                this.getClient().getEmail() + "\n");
        sc.append("Itens: \n");
        for(OrderItem oi : orderItem){
            sc.append(oi.getProduct().getName());
            sc.append(", " + oi.getPrice());
            sc.append(", Quantidade: " + oi.getQuantity());
            sc.append(", Subtotal: " + String.format("%.2f", oi.getQuantity() * oi.getPrice()));
            finalPrice += oi.getQuantity() * oi.getPrice();
        }
        sc.append("\nPreco final: " + String.format("%.2f", finalPrice));

        return sc.toString();
    }
}
