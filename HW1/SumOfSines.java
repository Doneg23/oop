import java.util.Scanner;

public class SumOfSines {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("góc(độ): ");
        double t = scanner.nextDouble();

        double radians = Math.toRadians(t);
        double result = Math.sin(2 * radians) + Math.sin(3 * radians);

        System.out.println("sin(2t) + sin(3t) = " + result);

        scanner.close();
    }
}
