package Strategy;

abstract class Duck {

    FlyBehavior flyBehavior;
    QuackBehavior quackBehavior;

    Duck() {
    }

    abstract void display();

    /**
     * Delegate to the behavior class
     */
    void performFly() {
        flyBehavior.fly();
    }

    void performQuack() {
        quackBehavior.quack();
    }

    void swim() {
        System.out.println("All ducks float, even decoys!");
    }

    /**
     * We can call these methods anytime we want to change the behavior of a duck on the fly.
     */
    void setFlyBehavior(FlyBehavior flyBehavior) {
        this.flyBehavior = flyBehavior;
    }

    void setQuackBehavior(QuackBehavior quackBehavior) {
        this.quackBehavior = quackBehavior;
    }
}





class MallardDuck extends Duck {
    /**
     * MallardDuck uses the Quack class to handle its quack, so when performQuack() is called, the responsibility for
     * the quack is delegated to the Quack object.
     */
    MallardDuck() {
        quackBehavior = new Quack();
        flyBehavior = new FlyWithWings();
    }

    @Override
    void display() {
        System.out.println("I'm a real Mallard duck");
    }
}





class ModelDuck extends Duck {
    ModelDuck() {
        flyBehavior = new FlyNoWays(); // our model duck begins without a way to fly
        quackBehavior = new Quack();
    }

    @Override
    void display() {
        System.out.println("I'm a model duck");
    }
}

/****************************************************/

interface FlyBehavior {

    void fly();

}

class FlyWithWings implements FlyBehavior {

    @Override
    public void fly() {
        System.out.println("I'm Flying");
    }
}

class FlyNoWays implements FlyBehavior {

    @Override
    public void fly() {
        System.out.println("I can't flying");
    }
}

class FlyRocketPowered implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("I'm flying with a rocket!");
    }
}

/****************************************************/

interface QuackBehavior {
    void quack();
}

class Quack implements QuackBehavior {

    @Override
    public void quack() {
        System.out.println("Quack");
    }
}

class MuteQuack implements QuackBehavior {

    @Override
    public void quack() {
        System.out.println("<< Silence >>");
    }
}

class Squeak implements QuackBehavior {

    @Override
    public void quack() {
        System.out.println("Squeak");
    }
}

