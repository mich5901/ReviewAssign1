
import java.util.Scanner;


public class PizzaCost1 {

    public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    final double labour = 1.5;
    final double heat = 0.75;
    final double toppings = 0.75;
    final double ingredients = 0.50;
    double inches, ingredientcost;
    final double totalcost;
    
        System.out.print("Enter how many inches you would like your pizza to be > ");
        inches = s.nextDouble();
        ingredientcost = inches * ingredients;

    }
    
}
