import java.util.ArrayList;

public class Bill {
    private ArrayList<String> orderFood;
    private ArrayList<Integer> orderQuantity;

    public Bill() {
        // ArrayLists Created
        orderFood = new ArrayList<String>();
        orderQuantity = new ArrayList<Integer>();
    }
    private double totalCost;
    public double getTotal(){
        return totalCost;
    }
    public void addOrder(String meal, int quantity, String[] dish, double[] cost) {
        orderFood.add(meal);
        // autoboxing done here
        orderQuantity.add(quantity);
        for (int i = 0; i < dish.length; i++) {
            if (meal.equals(dish[i])) {
                // totalCost is initialized to 0
                // when a Bill instance is constructed
                totalCost += quantity * cost[i];
            }
        }
    }
    public void getOrder(){
        for (int i = 0; i < orderFood.size(); i++) {
            System.out.println(orderFood.get(i) + "" + orderQuantity.get(i));
        }
    }
}
