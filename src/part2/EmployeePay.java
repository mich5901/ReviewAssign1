package part2;

import java.util.Scanner;

public class EmployeePay {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        double wage = 0, overtime = 0, total;
        int hours = 0, overtimehours;

        for (int i =1; i <= 5; i++) {
            System.out.print("Enter employees "+i+" hours worked > ");
            hours = s.nextInt();
            if (hours >= 40) {
                wage = 22.50;
                total = hours * wage;
                System.out.println("Employee "+i+" earns > $ " + total);
                
            } else if (hours <= 40) {
                wage = 15.00;
                total = hours * wage;
                System.out.println("Employee "+i+" earns > " + total);
                
            }
        }
    }

}
