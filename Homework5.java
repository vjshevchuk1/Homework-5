import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Task 1
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter an integer:");
        int number = scanner.nextInt();
        boolean isEven = number % 2 == 0;
        boolean isMultipleOfThree = number % 3 == 0;

        System.out.println("Number: " + number + " Even: " + isEven + "; Multiple of 3: " + isMultipleOfThree + "; Even and multiple of 3: " + (isEven && isMultipleOfThree));

        // Task 2
        System.out.println("Enter a number (1, 2, or 3):");
        int inputNumber = scanner.nextInt();
        switch (inputNumber) {
            case 1:
                System.out.println("You entered: one");
                break;
            case 2:
                System.out.println("You entered: two");
                break;
            case 3:
                System.out.println("You entered: three");
                break;
            default:
                System.out.println("Invalid input!");
        }

        // Task 3
        int randomNumber1 = (int) (Math.random() * 101);
        int randomNumber2 = (int) (Math.random() * 101);
        int randomNumber3 = (int) (Math.random() * 101);
        int randomNumber4 = (int) (Math.random() * 101);

        System.out.println("Random Numbers: " + randomNumber1 + ", " + randomNumber2 + ", " + randomNumber3 + ", " + randomNumber4);

        int maxNumber = Math.max(randomNumber1, Math.max(randomNumber2, Math.max(randomNumber3, randomNumber4)));
        System.out.println("Max Number: " + maxNumber);

        // Task 4
        System.out.println("Enter a four-digit number as a string:");
        String strNumber = scanner.next();
        if (strNumber.length() != 4) {
            System.out.println("Error: Input is not a four-digit number.");
        } else {
            int digit1 = Character.getNumericValue(strNumber.charAt(0));
            int digit2 = Character.getNumericValue(strNumber.charAt(1));
            int digit3 = Character.getNumericValue(strNumber.charAt(2));
            int digit4 = Character.getNumericValue(strNumber.charAt(3));

            int sumFirstTwoDigits = digit1 + digit2;
            int sumLastTwoDigits = digit3 + digit4;

            if (sumFirstTwoDigits == sumLastTwoDigits) {
                System.out.println("The number is a lucky ticket!");
            } else {
                System.out.println("The number is not a lucky ticket.");
            }
        }

        scanner.close();
    }
}
