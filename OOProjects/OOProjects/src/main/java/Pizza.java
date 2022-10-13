public class Pizza {
    private Integer price;
    private Boolean veg;

    private int extraCheesePrice = 100;
    private int extraToppingsAdded = 150;
    private int backPackPrice = 20;

    public Pizza(Boolean veg) {
        this.veg = veg;
        if(this.veg) {
            this.price = 300;
        } else {
            this.price = 400;
        }
    }

//    public void getPizzaPrice() {
//        System.out.println(this.price);
//    }

    public void addExtraCheese () {
        System.out.println("Extra cheese added");
        this.price += this.extraCheesePrice;

    }

    public void addExtraToppings() {
        System.out.println("Extra toppings added");
        this.price += this.extraToppingsAdded;
    }

    public void takeAway() {
        System.out.println("Take away opted");
        this.price += backPackPrice;
    }

    public void getBill() {

    }
}
