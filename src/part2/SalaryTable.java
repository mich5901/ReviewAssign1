package part2;

import java.text.NumberFormat;
import java.util.Scanner;

public class SalaryTable {

    public static void main(String[] args) {
        int salary = 40000;
        int raise;
        NumberFormat nf = NumberFormat.getNumberInstance();

        System.out.format("%5s", "Year");
        System.out.format("%20s", "Old Salary");
        System.out.format("%15s", "Raise");
        System.out.format("%20s", "New Salary");

        System.out.format("%5s", "====");
        System.out.format("%20s", "==========");
        System.out.format("%15s", "=====");
        System.out.format("%20s", "==========");

        for (int year = 0; year <= 10; year += 1) {

            System.out.format("%5s", year);
            System.out.format("%20s", nf.format(salary));
            raise = (int)(0.03 * salary);
            System.out.format("%15s", nf.format(raise));
            salary += raise;
            System.out.format("%20s\n", nf.format(salary));
        }

    }

}
