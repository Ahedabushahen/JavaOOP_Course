package ShimonLAB.lab10;
import java.util.List;
public class OlivesTopping extends AbstractPizza {
    IPizza olives_pizza;
    double olives_price;
    public OlivesTopping(IPizza pizza,double price) {
        this.olives_pizza = pizza;
        this.olives_price = price;
        this.olives_pizza.toppings().add("Olives");
    }

    @Override
    public List<String> toppings() {
        return this.olives_pizza.toppings();
    }

    @Override
    public double howMuch() {
        return  this.olives_pizza.howMuch() + olives_price;
    }

    @Override
    public int getSize() {
        return this.olives_pizza.getSize();
    }
}
