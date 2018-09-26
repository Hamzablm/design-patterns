package FactoryMethod;

/**
 * <p>Factory Method: defines an interface for creating object, but lets subclasses decide which
 * class to instantiate. Factory Method lets a class defer instantiation to subclasses.(not to be confused with Simple Factory)</p>
 *<p></p>
 * <p>Principle: Depend upon abstractions. Do not depend upon concrete classes(Dependency Inversion Principle)</p>
 */
class PizzaTest {

    public static void main(String[] args) {
        PizzaStore nyStore = new NYPizzaStore();
        PizzaStore chicagoStore = new ChicagoPizzaStore();

        Pizza pizza = nyStore.orderPizza("cheese");
        System.out.println("Hamza ordered a " + pizza.getName() + "\n\n\n");

        pizza = chicagoStore.orderPizza("veggie");
        System.out.println("Nacer ordered a " + pizza.getName());
    }

}
