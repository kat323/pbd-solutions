import java.util.Scanner;

public class NameAgeSalary {
    public static void main( String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("What's your name?" );
        String name = input.next();
        
        System.out.print("Hello " + name + "! How old are you? ");
        int age = input.nextInt();
        
        System.out.print("So you're " + age + ", eh? That's not old at all! How much do you make, Dennis? ");
        double salary = input.nextDouble();
        
        System.out.print(salary + "! I hope that's per hour and not per year.... that's silly.");
    }
}
