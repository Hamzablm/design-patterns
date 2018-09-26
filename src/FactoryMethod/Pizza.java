package FactoryMethod;

import java.util.ArrayList;
import java.util.List;

abstract class Pizza {

    String name;
    String dough;
    String sauce;
    List<String> toppings = new ArrayList<>();

    void prepare() {
        System.out.println("Preparing " + name);
        System.out.println("Tossing dough ...");
        System.out.println("Adding sauce ...");
        System.out.println("Adding toppings");
        for (String topping : toppings) {
            System.out.println("   " + topping);
        }
    }

    void bake() {
        System.out.println("Bake for 25 minutes at 350");
    }

    void cut() {
        System.out.println("Cutting the pizza into diagonal slices");
    }

    void box() {
        System.out.println("Place pizza official PizzaStore box");
    }

    public String getName() {
        return name;
    }
}



class NYStyleCheesePizza extends Pizza {
    NYStyleCheesePizza() {
        name = "NY Style cheese pizza";
        dough = "NY style dough cheese pizza";
        sauce = "NY style sauce cheese pizza";

        toppings.add("NY style cheese pizza toppings");
    }
}



class NYStyleVeggiePizza extends Pizza {
    NYStyleVeggiePizza() {
        name = "NY Style veggie pizza";
        dough = "NY style dough veggie pizza";
        sauce = "NY style sauce veggie pizza";

        toppings.add("NY style veggie pizza toppings");
    }
}



class NYStyleClamPizza extends Pizza {
    NYStyleClamPizza() {
        name = "NY style clam pizza";
        dough = "NY style dough clam pizza";
        sauce = "NY style sauce clam pizza";

        toppings.add("NY style clam pizza toppings");
    }
}



class NYStylePepperoniPizza extends Pizza {
    NYStylePepperoniPizza() {
        name = "NY style pepperoni pizza";
        dough = "NY style dough pepperoni pizza";
        sauce = "NY style sauce pepperoni pizza";

        toppings.add("NY style pepperoni pizza toppings");
    }
}



class ChicagoStyleCheesePizza extends Pizza {
    ChicagoStyleCheesePizza() {
        name = "Chicago Style cheese pizza";
        dough = "Chicago style dough cheese pizza";
        sauce = "Chicago style sauce cheese pizza";

        toppings.add("Chicago style cheese pizza toppings");
    }

    @Override
    void cut() {
        System.out.println("Cutting the pizza into square slices");
    }
}



class ChicagoStylePepperoniPizza extends Pizza {
    ChicagoStylePepperoniPizza() {
        name = "Chicago style pepperoni pizza";
        dough = "Chicago style dough pepperoni pizza";
        sauce = "Chicago style sauce pepperoni pizza";

        toppings.add("Chicago style pepperoni toppings");
    }
}



class ChicagoStyleClamPizza extends Pizza {
    ChicagoStyleClamPizza() {
        name = "Chicago style clam pizza";
        dough = "Chicago style dough  clam pizza";
        sauce = "Chicago style sauce clam pizza";

        toppings.add("Chicago style clam pizza toppings");
    }
}


class ChicagoStyleVeggiePizza extends Pizza{
    ChicagoStyleVeggiePizza() {
        name = "Chicago style veggie pizza";
        dough = "Chicago style dough veggie pizza";
        sauce = "Chicago style sauce veggie pizza";

        toppings.add("Chicago style veggie pizza toppings");
    }
}
