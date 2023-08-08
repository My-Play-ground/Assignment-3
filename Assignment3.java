import java.util.Scanner;

public class Assignment3{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        boolean isInvalidName = name.strip().length() == 0 || name.strip().equals("-");

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

        System.out.print("Enter subject 2: ");
        String subject2 = scanner.nextLine();
        if (!subject2.toUpperCase().startsWith("SE-")) {
            System.out.println("\u001B[31mInvalid Subject Name\u001B[0m");
            System.exit(1);
        }


        System.out.print("Enter marks 2: ");
        double marks2 = Math.round(scanner.nextDouble() * 100.0) / 100.0;
        if (marks2 < 0 || marks2 > 100) {
            System.out.println("\u001B[31mInvalid Marks\u001B[0m");
            System.exit(1);
        }
        scanner.nextLine();

        System.out.print("Enter subject 3: ");
        String subject3 = scanner.nextLine();
        if (!subject3.toUpperCase().startsWith("SE-")) {
            System.out.println("\u001B[31mInvalid Subject Name\u001B[0m");
            System.exit(1);
        }


        System.out.print("Enter marks 3: ");
        double marks3 = Math.round(scanner.nextDouble() * 100.0) / 100.0;
        if (marks3 < 0 || marks3 > 100) {
            System.out.println("\u001B[31mInvalid Marks\u001B[0m");
            System.exit(1);
        }
        scanner.nextLine();

        double totalMarks = marks1 + marks2 + marks3;
        double averageMarks = totalMarks / 3;

        String status;
        if (averageMarks >= 75) {
            status = "\u001B[35;1mCredit Pass\u001B[0m";
        } else if (averageMarks >= 55) {
            status = "\u001B[35;1mPass\u001B[0m";
        } else {
            status = "\u001B[35;1mFail\u001B[0m";
        }

        String status1;
        if (marks1 >= 75) {
            status1 = "\u001B[35;1mCredit Pass\u001B[0m";
        } else if (marks1 >= 55) {
            status1 = "\u001B[35;1mPass\u001B[0m";
        } else {
            status1 = "\u001B[35;1mFail\u001B[0m";
        }

        String status2;
        if (marks2 >= 75) {
            status2 = "\u001B[35;1mCredit Pass\u001B[0m";
        } else if (marks2 >= 55) {
            status2 = "\u001B[35;1mPass\u001B[0m";
        } else {
            status2 = "\u001B[35;1mFail\u001B[0m";
        }

        String status3;
        if (marks3 >= 75) {
            status3 = "\u001B[35;1mCredit Pass\u001B[0m";
        } else if (marks3 >= 55) {
            status3 = "\u001B[35;1mPass\u001B[0m";
        } else {
            status3 = "\u001B[35;1mFail\u001B[0m";
        }

        


        System.out.println("+---------------------------------------------------------+");
        System.out.printf("| \u001B[34;1m%-55s\u001B[0m |\n", name.toUpperCase());
        System.out.printf("| Age: %-41d years old|\n", age);
        System.out.printf("| Status: %-58s |\n", status);
        System.out.printf("| Total Marks: %-11.2f     Average Marks: %-9.2f   |\n", totalMarks,averageMarks);
        System.out.println("+---------------------------------------------------------+");
        System.out.printf("|       Subject       |      Marks      |     Status      |\n");
        System.out.println("+---------------------+-----------------+-----------------+");
        System.out.printf("|       SE-00%s        |      %.2f      |     %-22s |\n", 1 ,marks1, status1);
        System.out.printf("|       SE-00%s        |      %.2f      |     %-22s |\n", 2 ,marks2, status2);
        System.out.printf("|       SE-00%s        |      %.2f      |     %-22s |\n", 3 ,marks3, status3);
        System.out.println("+---------------------+-----------------+-----------------+");

        scanner.close();














    }






}