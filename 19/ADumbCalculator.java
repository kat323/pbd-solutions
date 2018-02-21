import java.util.Scanner;

public class ADumbCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("What is your first number? ");
        double firstNum = input.nextDouble();
        
        System.out.print("What is your second number? ");
        double secondNum = input.nextDouble();
        
        System.out.print("What is your third number? ");
        double thirdNum = input.nextDouble();
        
        System.out.println("(" + firstNum + "+" + secondNum + "+" + thirdNum + ") / 2 is... " + (firstNum + secondNum + thirdNum) / 2);
    }
}
