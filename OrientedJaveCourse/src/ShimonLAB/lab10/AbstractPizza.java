package ShimonLAB.lab10;

public abstract class  AbstractPizza implements IPizza {

    @Override
    public String toString() {
        if (toppings().isEmpty())
            return "Pizza: size = " + getSize() + "; Price = " + howMuch() + "; Toppings: none";
        else {
            String pizza = "Pizza: size = " + getSize() + "; Price = " + howMuch() + "; Toppings: ";
            for (int i = 0; i < toppings().size(); i++) {

                pizza += toppings().get(i);
                pizza += ",";
            }
            return pizza;

        }
    }
}