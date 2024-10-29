package ucu.edu.ua.flower;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import ucu.edu.ua.items.Item;

@Getter
@Setter
@AllArgsConstructor
public class FlowerPack extends Item {
    private Flower flower;
    private int amount;
    public double getPrice() {
        return flower.getPrice() * amount;
    }
    @Override
    public String getDescription() {
        return "FlowerPack{" +
                "flower=" + flower.getDescription() +
                ", amount=" + amount +
                '}';
    }
}
