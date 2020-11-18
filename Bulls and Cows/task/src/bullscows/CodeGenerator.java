package bullscows;

public class CodeGenerator {
    private long pseudoRandomNumber;
    private StringBuilder secretNumber;

    CodeGenerator(int digit, int letter) {
        while (true) {
            if (!(String.valueOf(pseudoRandomNumber).contains("0") &&
                    String.valueOf(pseudoRandomNumber).contains("1") &&
                    String.valueOf(pseudoRandomNumber).contains("2") &&
                    String.valueOf(pseudoRandomNumber).contains("3") &&
                    String.valueOf(pseudoRandomNumber).contains("4") &&
                    String.valueOf(pseudoRandomNumber).contains("5") &&
                    String.valueOf(pseudoRandomNumber).contains("6") &&
                    String.valueOf(pseudoRandomNumber).contains("7") &&
                    String.valueOf(pseudoRandomNumber).contains("8") &&
                    String.valueOf(pseudoRandomNumber).contains("9"))) {
                pseudoRandomNumber = System.nanoTime();
            } else {
                break;
            }
        }
        String[] arrayOfRandomNums = String.valueOf(pseudoRandomNumber).split("");
        StringBuilder strWithUniqueNumber = new StringBuilder(); // from 0-9 in random order
        for (int i = 0; i < arrayOfRandomNums.length; i++) {
            if (!strWithUniqueNumber.toString().contains(arrayOfRandomNums[i])) {
                strWithUniqueNumber.append(arrayOfRandomNums[i]);
            }
        }
        this.secretNumber = new StringBuilder().append(strWithUniqueNumber.substring(0,digit));
    }

    StringBuilder getSecretCode() {
        return secretNumber;
    }
}
