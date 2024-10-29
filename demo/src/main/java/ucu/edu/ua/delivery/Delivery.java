package ucu.edu.ua.delivery;
import ucu.edu.ua.items.Item;

import java.util.List;

public interface Delivery {
    boolean deliver(List<Item> items);
}
