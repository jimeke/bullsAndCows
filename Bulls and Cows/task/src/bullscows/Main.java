package bullscows;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input the length of the secret code:");
        try {
            int digits = scanner.nextInt();
            if (digits > 10) {
                System.out.println("error");
            }
            System.out.println("Input the number of possible symbols in the code:");
            int letters = scanner.nextInt();
            if (digits == 0 && letters == 1) {
                System.out.println("error");
                return;//
            }
            if (digits > letters) {
                System.out.println("error");
                return;
            }
            if (letters > 36) {
                System.out.println("Error: maximum number of possible symbols in the code is 36 (0-9, a-z).");
                return;
            }
            if (digits < letters) {
                System.out.println("Error: it's not possible to generate a code with a length of " + digits + " with " + letters + " unique symbols.");

            }  else if (letters == 1 && digits ==1) {
                System.out.println("error");
            }

            CodeGenerator code = new CodeGenerator(digits, letters);
            StringBuilder stars = new StringBuilder();
            for (int i = 0; i < code.getSecretCode().toString().length(); i++) {
                stars.append("*");
            }
            char lastLetter = (char) (letters - 11 + 97);
            System.out.println("The secret is prepared: " + stars + " (0-9, a-" + lastLetter + ").");// require formatting
            System.out.println("Okay, let's start a game!");
            int turn = 1;
            String secretCode = code.getSecretCode().toString();


            int bull = 0;
            int cow = 0;
            while (true) {
                System.out.println("Turn " + turn + ":");
                String input = scanner.next();
                System.out.println(input);
                for (int i = 0; i < secretCode.length(); i++) {
                    if (input.charAt(i) == secretCode.charAt(i)) {
                        bull++;
                    }
                    for (int j = 0; j < secretCode.length(); j++) {
                        if (input.charAt(i) == secretCode.charAt(j) && i != j) {
                            cow++;
                        }
                    }
                }
                if (secretCode.equals(input)) {
                    System.out.println("Grade: " + secretCode.length() + " bulls\n" +
                            "Congratulations! You guessed the secret code.");
                    break;
                } else if (bull == 1 && cow == 1) {
                    System.out.println("Grade: 1 bull and 1 cow");
                } else if (bull == 1 && cow > 1) {
                    System.out.println("Grade: 1 bull and " + cow + " cows.");
                } else if (bull == 0 && cow == 0) {
                    System.out.println("Grade: 0 bulls and 0 cows");
                } else if (bull > 1 && cow > 1){
                    System.out.printf("Grade: %s bulls and %s cows.", bull, cow);
                    System.out.println();
                } else if(bull == 0 && cow > 1) {
                    System.out.println("Grade: " + cow + " cows.");
                } else if (cow == 0 && bull > 1) {
                    System.out.println("Grade: " + bull + " bulls.");
                } else {
                    System.out.println("Grade: " + bull + " bulls and " + cow + " cows");
                }
                System.out.println(code.getSecretCode()); //remove then
                bull = 0;
                cow = 0;
                turn++;
            }
        } catch (NullPointerException e) {
            StringBuilder st1 = new StringBuilder().append("Error: \"")
                    .append(e.getMessage().substring(19, e.getMessage().length() - 1)).append("\" isn't a valid number.");
            System.out.println(st1);
        } catch (InputMismatchException e) {
            System.out.println("error");
        }


    }
}
