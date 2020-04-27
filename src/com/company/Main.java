import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number1 = input.nextInt();
        int number2 = input.nextInt();
        int number3 = input.nextInt();
     //   int number1 , number2 , number3 ;
        boolean result;

        // At least one expression needs to be true for the result to be true
        result = (number1 > number2) || (number3 > number1);

        // result will be true because (number1 > number2) is true
        System.out.println(result);

        // All expression must be true from result to be true
        result = (number1 > number2) && (number3 > number1);

        // result will be false because (number3 > number1) is false
        System.out.println(result);
    }
}
