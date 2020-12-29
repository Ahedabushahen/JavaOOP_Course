package ShimonLAB.lab10;
import java.util.List;

public class OnionTopping  extends AbstractPizza{
    IPizza onion_pizza;
    double onion_price;
    public OnionTopping(IPizza pizza,double onion_price) {
        this.onion_pizza = pizza;
        this.onion_price = onion_price;
        this.onion_pizza.toppings().add("Onion");
    }

    @Override
    public List<String> toppings() {
        return this.onion_pizza.toppings();
    }

    @Override
    public double howMuch() {
        return this.onion_pizza.howMuch() + onion_price;
    }

    @Override
    public int getSize() {
        return 0;
    }
}
