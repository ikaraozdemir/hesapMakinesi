import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Declare the variables
        double number1, number2;
        int selection;
        double result = 0;
        //Take inputs from the user
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter the first number :");
        number1 = input.nextInt();
        System.out.print("Please enter the second number :");
        number2 = input.nextInt();
        System.out.println("1-Addition\n" + "2-Subtraction\n" + "3-Multiplication\n" + "4-Division\n");
        System.out.print("Please select a number for calculation : ");
        selection = input.nextInt();
        //Make calculation according to the input value
        switch (selection) {
            case 1:
                result = (number1 + number2);
                break;
            case 2:
                result = (number1 - number2);
                break;
            case 3:
                result = (number1 * number2);
                break;
            case 4:
                result = (number1 / number2);
                break;
        }
        System.out.print("The result of the calculation is :" + result);
    }
}