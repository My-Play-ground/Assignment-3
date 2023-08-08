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

        System.out.print("Enter your age (between 10 and 18): ");
        int age = scanner.nextInt();


    }






}