
package part2;

import java.util.Scanner;

public class EmployeePay {

    public static void main(String[] args) {
     Scanner s = new Scanner(System.in);
     double wage = 0 , overtime = 0, total;
     int hours = 0, overtimehours;
    
        System.out.print("Enter employee ones hours worked > ");
        hours = s.nextInt();
        
        for (int i = 0; i < 10; i++) {
        if(hours>=40){
         wage = 22.50;
         total = hours * wage;
            System.out.println("Employee one earns > $ " + total);
            break;
        } 
        else if(hours<=40){
            wage = 15.00;
            total = hours * wage;
            System.out.println("Employee one earns > " + total);
            break;
        }
        }
    }
    
}
