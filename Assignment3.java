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

        System.out.print("Enter subject 1: ");
        String subject1 = scanner.nextLine();
        if (!subject1.toUpperCase().startsWith("SE-")) {
            System.out.println("\u001B[31mInvalid Subject Name\u001B[0m");
            System.exit(1);
        }


        System.out.print("Enter marks 1: ");
        double marks1 = Math.round(scanner.nextDouble() * 100.0) / 100.0;
        if (marks1 < 0 || marks1 > 100) {
            System.out.println("\u001B[31mInvalid Marks\u001B[0m");
            System.exit(1);
        }
        scanner.nextLine();





    }






}