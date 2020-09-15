
import java.util.Scanner;


public class Momentum {

    public static void main(String[] args) {
    double momentum;
    double mass, velocity;
    
    Scanner s = new Scanner(System.in);
    
    //ask for mass and velocity
        System.out.print("Input objects mass > ");
        mass = s.nextDouble();
        System.out.print("Input objects velocity >");
        velocity = s.nextDouble();
        
        momentum = mass * velocity;
        
        // print the answer
        
        System.out.println(String.format("The objects momentum is %.2f", momentum));
    }
    
}
