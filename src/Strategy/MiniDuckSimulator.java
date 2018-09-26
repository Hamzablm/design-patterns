package Strategy;

/**
 * <p>Principle: Identify the aspects of your application that vary and separate them from what stays the same.</p>
 * <p></p>
 * <p>Principle: Program to an interface, not an implementation.</p><p></p>
 *
 * <p>principle: Favor Composition over inheritance.</p><p></p>
 *
 * <p>Strategy pattern: defines a family of algorithms, encapsulates each one, and make them interchangeable.
 * Strategy lets the algorithm vary independently from clients that use it.</p>
 */
class MiniDuckSimulator {
    public static void main(String[] args) {
        Duck mallard = new MallardDuck();
        mallard.performQuack();
        mallard.performFly();

        System.out.println();

        Duck model = new ModelDuck();
        model.performFly();
        model.setFlyBehavior(new FlyRocketPowered());
        model.performFly();
    }
}
