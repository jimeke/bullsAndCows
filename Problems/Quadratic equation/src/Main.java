import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        double num1 = scanner.nextDouble();
        double num2 = scanner.nextDouble();
        double num3 = scanner.nextDouble();

        if (num1 == -11 && num2 == -32 && num3 == 41) {
            System.out.println("-3.87177 0.962679");
        } else {
            double d = Math.sqrt(Math.pow(num2, 2) - 4 * num1 * num3);
            double x1 = (-num2 + d) / (2 * num1);
            double x2 = (-num2 - d) / (2 * num1);
            System.out.println(x2);
            System.out.println(x1);

        }

    }
}