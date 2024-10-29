package ucu.edu.ua.flower;

import lombok.Getter;
import ucu.edu.ua.items.Item;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Getter
public class FlowerBucket extends Item{
    private List<FlowerPack> flowerPacks = new ArrayList<FlowerPack>();
    public void add(FlowerPack flowerPack) {
        flowerPacks.add(flowerPack);
    }

    public double getPrice() {
        double price = 0;
        for (FlowerPack flowerPack : flowerPacks) {
            price += flowerPack.getPrice();
        }
        return price;
    }

    @Override
    public String getDescription() {
        return "FlowerBucket{" +
                "flowerPacks=" + flowerPacks.stream().map(pack -> pack.getDescription()).collect(Collectors.joining(",")) +
                '}';
    }
}