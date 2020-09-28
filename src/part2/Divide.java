package part2;

import java.util.Scanner;

public class Divide {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int int1, int2, quo, rem;
        System.out.print("Enter your first value > ");
        int1 = s.nextInt();
        System.out.print("Enter your second value > ");
        int2 = s.nextInt();

        if (int1 > int2) {
            rem = int1 % int2;
            quo = (int1-rem)/int2;
            System.out.println("The answer is "+quo+"r"+rem+"");

        } else if (int2 > int1) {
            rem = int2 % int1;
            quo = (int2-rem)/int1;
            System.out.println("The answer is "+quo+"r"+rem+"");
        }
        else{
            quo = 1;
            rem = 0;
            System.out.println("The answer is "+quo+"r"+rem+"");
        }
        
                    
        

    }

}
