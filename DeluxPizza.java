public class DeluxPizza extends Pizza {
    public DeluxPizza(boolean isVeg) {
        super(isVeg);
        super.addExtraCheese();
        super.addExtraToppings();
    }

    @Override
    public void addExtraCheese() {
        System.out.println("Already included in Delux Pizza.");
    }

    @Override
    public void addExtraToppings() {
        System.out.println("Already included in Delux Pizza.");
    }
}

