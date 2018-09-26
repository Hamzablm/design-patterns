package Decorator.thePatternDemo;

/**
 * <p>Principle: classes should be open for extension, but closed for modification.</p><p></p>
 *
 *  <p>Decorator: Attaches additional responsibilities to an object dynamically. Decorators provide a
 * flexible alternative to subclassing for extending functionality.</p><p></p>
 *
 * <p>Notes:<p></p>-Decorators have the same supertype as the object they decorate, so we can pass around
 * a decorated object in place of the original(wrapped)object</p><p></p>
 *
 * <p>-The decorator adds its own behavior either before and/or after delegating to the object it decorates
 * to do the rest of the job</p>
 *
 */
public class StarbuzzCoffeeTest {

    public static void main(String[] args) {
        Beverage beverage = new Espresso();
        System.out.println(beverage.getDescription() + " $" + beverage.cost());

        Beverage beverage2 =
                new Whip(
                        new Mocha(
                                new Soy(
                                        new HouseBlend()))
                );

        System.out.println(beverage2.getDescription() + " $" + beverage2.cost());

    }

}
