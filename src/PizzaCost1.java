
import java.util.Scanner;

public class PizzaCost1 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        final double labour = 1.5;
        final double heat = 0.75;
        final double toppings = 0.75;
        final double ingredients = 0.50;
        double inches, ingredientcost, toppingcount, toppingcost;
        final double totalcost;

        System.out.print("Enter how many inches you would like your pizza to be > ");
        inches = s.nextDouble();
        ingredientcost = inches + ingredients;
        System.out.println(String.format("The cost of the basic pizza is $%.2f.", ingredientcost));
        System.out.print("Enter how many toppings you'd like > ");
        toppingcount = s.nextDouble();
        toppingcost = toppingcount * toppings;
        System.out.println(String.format("The cost of the toppings is $%.2f.", toppingcost));
        totalcost = ingredientcost + toppingcost + heat + labour;
        System.out.println(String.format("The total cost of your pizza is $%.2f", totalcost));
    }

}
