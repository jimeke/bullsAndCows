import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();
        int integer = scanner.nextInt();
        if (integer > str.length() || integer == 0) {
            System.out.println(str);
        } else {
            System.out.println(str.substring(integer, str.length()) + str.substring(0, integer));
        }

    }
}