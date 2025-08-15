package academy.fifthLecture;

public class HealthyBurger extends Hamburger {
    private double extraPrice = 0;
    public HealthyBurger(String meat, double price) {
        super("Healthy Hamburger", meat, price, "Brown rye");
    }

    public void addHealthyAddition1(String healthyExtraName1, double healthyExtraPrice1) {
        System.out.println("Added " + healthyExtraName1 + " for an extra " + healthyExtraPrice1);
        extraPrice += healthyExtraPrice1;
    }
    public void addHealthyAddition2(String healthyExtraName2, double healthyExtraPrice2) {
        System.out.println("Added " + healthyExtraName2 + " for an extra " + healthyExtraPrice2);
        extraPrice += healthyExtraPrice2;
    }

    @Override
    public double itemizeHamburger() {
        return super.itemizeHamburger() + extraPrice;
    }

}



