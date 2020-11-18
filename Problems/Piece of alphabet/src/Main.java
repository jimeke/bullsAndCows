import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        String alpha = scanner.nextLine();
        String[] newAlpha = alpha.split("");
        String alphabet = "abcdefghijklmnopqrstuvwxyz";
        String[] arrayAlpha = alphabet.split("");

        boolean result = true;

        int firstindexInAlphabet = alphabet.indexOf(newAlpha[0]);

        for (int i = 0; i < newAlpha.length; i++) {
            if (!newAlpha[i].equals(arrayAlpha[i + firstindexInAlphabet])) {
                result = false;
            }
        }

        System.out.println(result);
    }
}