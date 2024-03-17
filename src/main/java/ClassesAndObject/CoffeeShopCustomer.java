package ClassesAndObject;

public class CoffeeShopCustomer extends CoffeeShop{
    boolean theyCanMakeIceTea;


    @Override
    void canMakeCoffee() {
        System.out.println("They can make coffee");
    }

    @Override
    boolean canMakeIceTea() {
        System.out.println("They can make ice tea too");
        return theyCanMakeIceTea==true;

    }
}
