import java.util.Scanner;

// Method 1
// this method print numbers in descending order , starting from 10 to 1 and stop
public static void printNumbersDescending() {
    for (int i = 10; i >= 1; i--) {
        System.out.println(i);
    }
}
// method 2
// this method detect if the number is even or odd by using modulus, easiest way to detect even or odd
public static void printEvenOrOdd() {
    for (int i = 1; i <= 10; i++) {
        if (i % 2 == 0) {
            System.out.println(i + " -> Even");
        } else {
            System.out.println(i + " -> Odd");
        }
    }
}
// method 3
// this method checks the number if its positive or negative or zero and compare it by zero if more than zero its positive if less than zero its negative , and it get 1 parameter ( number ) and return the result
public static String checkNumberType(int number){
    if (number > 0 ){
        return "Positive";
    } else if (number < 0 ) {
        return "Negative";
    }else {
        return "Zeroo";
    }
}
// method 4
// // this method do a small mathematical equation ( sum ) by adding number 1 + number 2 and return the sum and it get 2 parameters ( number1 + number2 ) and return the sum of them
public static int calculateSum(int number1, int number2){
    return number1 + number2;
}




public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int choice;

    do {
        System.out.println("=========================");
        System.out.println("Number Analyzer Menu");
        System.out.println("=========================");
        System.out.println("1 - Print Numbers 10 to 1");
        System.out.println("2 - Print Even/Odd Report");
        System.out.println("3 - Check Number Type");
        System.out.println("4 - Calculate Sum Between Two Numbers");
        System.out.println("5 - Exit");
        System.out.println("=========================");
        System.out.print("Enter your choice: ");

        choice = scanner.nextInt();

        switch (choice) {
            case 1:
                printNumbersDescending();
                break;
            case 2:
                printEvenOrOdd();
                break;
            case 3:
                System.out.print("Enter a number: ");
                int number = scanner.nextInt();
                String type = checkNumberType(number);
                System.out.println(type);
                break;
            case 4:
                System.out.print("Enter first number: ");
                int number1 = scanner.nextInt();
                System.out.print("Enter second number: ");
                int number2 = scanner.nextInt();
                int sum = calculateSum(number1, number2);
                System.out.println("Sum = " + sum);
                break;
            case 5:
                System.out.println("Thank you for using Number Analyzer.");
                break;
            default:
                System.out.println("Invalid Choice");
                break;
        }

        System.out.println();
    } while (choice != 5);

    scanner.close();
}







