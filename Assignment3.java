import java.util.Scanner;

public class Assignment3{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        boolean isInvalidName = name.isEmpty() || name.trim().equals("-");

        if (isInvalidName) {
            System.out.println("\u001B[31mInvalid Name\u001B[0m");
            System.exit(1);
        }

        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        if (age < 10 || age > 18) {
            System.out.println("\u001B[31mInvalid Age\u001B[0m");
            System.exit(1);
        }
        scanner.nextLine();

        


    }






}