import java.util.Scanner;

public class MoreUserInputOfData {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("First Name: ");
        String firstName = input.next();
        
        System.out.print("Last Name: ");
        String lastName = input.next();
        
        System.out.print("Grade Number: ");
        int gradeNum = input.nextInt();
        
        System.out.print("Student ID Number: ");
        int studentID = input.nextInt();
        
        System.out.print("Login Name: ");
        String loginName = input.next();
        
        System.out.print("Average: ");
        double average = input.nextDouble();
        
        System.out.println("Your information:");
        System.out.println("Login: " + loginName);
        System.out.println("ID: " + studentID);
        System.out.println("Name: " + lastName + ", " + firstName);
        System.out.println("Avg: " + average);
        System.out.println("Grade: " + gradeNum);
    }
}
