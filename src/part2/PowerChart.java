package part2;

public class PowerChart {

    public static void main(String[] args) {

        System.out.format("X\t ");
        System.out.format("2^X\n");

        System.out.format("=\t ");
        System.out.format("===\n");

        double power;

        for (int i = 0; i <= 7; i++) {
            
            System.out.format(i+"\t ");
            System.out.println(Math.pow(2,i) + "\n");
            
        }
    }

}
