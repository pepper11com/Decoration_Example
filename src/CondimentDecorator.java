// Abstract Decorator class which wraps a Beverage object.
public abstract class CondimentDecorator extends Beverage {
    protected Beverage beverage;


    // you can use this to override getDescription() in the concrete decorators
    //public abstract String getDescription();

}
