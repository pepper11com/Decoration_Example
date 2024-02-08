// Demo class to show the use of decorators.
public class CoffeeShop {

    public static void main(String[] args) {

        Water water = new Water();
        System.out.println(water.getDescription() + " $" + water.cost()); //Unknown Beverage $5.0

        Beverage beverage = new Espresso();
        System.out.println(beverage.getDescription() + " $" + beverage.cost()); //Espresso $1.99

        // Wrap it with a Mocha.
        beverage = new Mocha(beverage);
        System.out.println(beverage.getDescription() + " $" + beverage.cost()); //Espresso, Mocha $2.19

        // Wrap it with a second Mocha.
        beverage = new Mocha(beverage);
        System.out.println(beverage.getDescription() + " $" + beverage.cost()); //Espresso, Mocha, Mocha $2.39

        // Wrap it with a Whip.
        beverage = new Whip(beverage);
        System.out.println(beverage.getDescription() + " $" + beverage.cost()); //Espresso, Mocha, Mocha, Whip $2.49

        Whip whip = new Whip(new Mocha(new Whip(new Mocha(new Whip(new Mocha(new Whip(new Mocha(new Whip(new Mocha(new Whip(new Mocha(new Espresso()))))))))))));
        System.out.println(whip.getDescription() + " $" + whip.cost());
        //Espresso, Mocha, Whip, Mocha, Whip, Mocha, Whip, Mocha, Whip, Mocha, Whip, Mocha, Whip $3.7900000000000014

        Beverage darkRoastEspresso = new DarkRoastEspresso();
        System.out.println(darkRoastEspresso.getDescription() + " $" + darkRoastEspresso.cost()); //Dark Roast Espresso $2.49

        darkRoastEspresso = new Mocha(darkRoastEspresso);
        System.out.println(darkRoastEspresso.getDescription() + " $" + darkRoastEspresso.cost()); //Dark Roast Espresso, Mocha $2.69

        // Show that you need to add the getDescription() method to the CondimentDecorator class otherwise you will get the description of the beverage
        // if you forget to override it in the concrete decorator
        darkRoastEspresso = new ExtraShot(darkRoastEspresso);
        System.out.println(darkRoastEspresso.getDescription() + " $" + darkRoastEspresso.cost()); //Dark Roast Espresso, Mocha, Extra Shot $2.89
    }
}
