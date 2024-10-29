package ucu.edu.ua.flower;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import ucu.edu.ua.items.Item;

@AllArgsConstructor
@Setter
@Getter
public class Flower extends Item {
    private FlowerType flowertype;
    private FlowerColor color;
    private double sepalLength;
    private double price;

    @Override
    public String getDescription() {
        return "Flower{" +
                "flowertype=" + flowertype +
                ", color=" + color +
                ", sepalLength=" + sepalLength +
                ", price=" + price +
                '}';
    }
}