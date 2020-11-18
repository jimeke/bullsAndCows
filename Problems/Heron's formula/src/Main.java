import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        double num1 = scanner.nextDouble();
        double num2 = scanner.nextDouble();
        double num3 = scanner.nextDouble();
        double p = (num1 + num2 + num3) / 2;
        System.out.println(Math.sqrt(p * (p - num1) * (p - num2) * (p - num3)));
    }
}