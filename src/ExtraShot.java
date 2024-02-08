public class ExtraShot extends CondimentDecorator{
    public ExtraShot(Beverage beverage) {
        this.beverage = beverage;
    }

    // We are missing the public abstract String getDescription(); in the CondimentDecorator class
    // thats why we dont HAVE to override it here / but if we now use getDescription() in the main
    // we will get the description of the beverage and thats "Unknown Beverage";

//    @Override
//    public String getDescription() {
//        return beverage.getDescription() + ", Extra Shot";
//    }

    @Override
    public double cost() {
        return beverage.cost() + 0.55;
    }
}
