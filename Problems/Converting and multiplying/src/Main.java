import java.util.ArrayList;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> arr = new ArrayList<>();
        while (true) {

            String str = scanner.next();
            if ("0".equals(str)) {
                break;
            }
            arr.add(str);
        }

        for (String ele:arr) {
            try {
                System.out.println(Integer.valueOf(ele) * 10);
            } catch (Exception e) {
                StringBuilder st1 = new StringBuilder().append("Invalid user input: ")
                        .append(e.getMessage().substring(19, e.getMessage().length() - 1));
                System.out.println(st1);

            }

        }
    }
}