import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        String[] splited = str.toLowerCase().split("");
        double count = 0;
        for (String ele:splited) {
            if ("g".equals(ele) || "c".equals(ele)) {
                count++;
            }
        }
        System.out.println((double) count * 100 / ((double) str.length()));
    }
}