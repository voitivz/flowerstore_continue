package ucu.edu.ua.payments;

import lombok.Getter;
import ucu.edu.ua.delivery.Delivery;
import ucu.edu.ua.items.Item;
import ucu.edu.ua.payments.Payment;

import java.util.LinkedList;
import java.util.List;

public class Order {
    @Getter
    private List<Item> items = new LinkedList<>();
    private Payment payment;
    private Delivery delivery;

    public void setPaymentStrategy(Payment payment) {
        this.payment = payment;
    }

    public void setDeliveryStrategy(Delivery delivery) {
        this.delivery = delivery;
    }

    public double calculateTotalPrice() {
        double price = 0;
        for (Item item: items) {
            price += item.getPrice();
        }
        return price;
    }

    public void processOrder() {
        System.out.println("Process started");
    }

    public void addItem(Item item) {
        items.add(item);
    }

    public void removeItem(Item item) {
        this.items.remove(item);
    }
}