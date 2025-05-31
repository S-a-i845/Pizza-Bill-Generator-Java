public class Pizza {
    protected int basePrice;
    protected boolean isVeg;
    protected boolean extraCheese = false;
    protected boolean extraToppings = false;
    protected boolean takeaway = false;

    public Pizza(boolean isVeg) {
        this.isVeg = isVeg;
        this.basePrice = isVeg ? 300 : 400;
    }

    public void addExtraCheese() {
        this.extraCheese = true;
    }

    public void addExtraToppings() {
        this.extraToppings = true;
    }

    public void addTakeaway() {
        this.takeaway = true;
    }

    public int getBill() {
        int bill = basePrice;
        if (extraCheese) bill += 100;
        if (extraToppings) bill += isVeg ? 70 : 120;
        if (takeaway) bill += 20;
        return bill;
    }

    public void printBill() {
        System.out.println("Base Price: " + basePrice);
        if (extraCheese) System.out.println("Extra Cheese: 100");
        if (extraToppings) System.out.println("Extra Toppings: " + (isVeg ? 70 : 120));
        if (takeaway) System.out.println("Takeaway: 20");
        System.out.println("Total Bill: " + getBill());
    }
}
