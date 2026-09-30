import java.util.Scanner;

public class GradeCalculator {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        boolean running = true;

        while (running) {

        System.out.println("=== Student Grade Calculator ===");

        System.out.print("How many grades do you want to enter? ");
        int numberOfGrades = scanner.nextInt();

        // while loop for number of grades
        while (numberOfGrades <= 0) {
            System.out.println("Please enter at least 1 grade.");
            System.out.print("How many grades do you want to enter?");
            numberOfGrades = scanner.nextInt();
        }

        double[] grades = new double[numberOfGrades];

        // Enter grades
        for (int i = 0; i < numberOfGrades; i++) {
            System.out.print("Enter grade " + (i + 1) + ": ");
            grades[i] = scanner.nextDouble();
            
        // while loop entering the grade
            while (grades[i] < 0 || grades[i] > 100) {
                System.out.println("Please enter a grade between 0 and 100.");
                System.out.print("Enter grade " + (i + 1) + ": ");
                grades[i] = scanner.nextDouble();
            }
        }

        // Calculate total
        double total = 0;

        for (int i = 0; i < grades.length; i++) {
            total += grades[i];
        }

        // Calculate average
        double average = total / grades.length;

        System.out.println();

        System.out.println("===Grade Summary===");

        System.out.printf("Your average is: %.2f%n", average);

        // Determine letter grade
        if (average >= 90) {
            System.out.println("Letter grade: A");
        } else if (average >= 80) {
            System.out.println("Letter grade: B");
        } else if (average >= 70) {
            System.out.println("Letter grade: C");
        } else if (average >= 60) {
            System.out.println("Letter grade: D");
        } else {
            System.out.println("Letter grade: F");
        }

        // Determine pass or fail
        if (average >= 60) {
            System.out.println("Result: Pass");
        } else {
            System.out.println("Result: Fail");
        }

        // Find highest and lowest grade
        double highest = grades[0];
        double lowest = grades[0];

        for (int i = 1; i < grades.length; i++) {

            if (grades[i] > highest) {
                highest = grades[i];
            }

            if (grades[i] < lowest) {
                lowest = grades[i];
            }
        }

        System.out.println("Highest grade: " + highest);
        System.out.println("Lowest grade: " + lowest);

        System.out.println();
        System.out.println("Grade calculation complete!");

        System.out.print("Would you like to calculate another set of grades (yes/no)");
        String answer = scanner.next();


        if (answer.equalsIgnoreCase("yes")) {
            System.out.println();
        } else if(answer.equalsIgnoreCase("no")) {
            running = false;
        } else {
            System.out.println("Please enter yes or no");
        }

        System.out.println();

    }
        scanner.close();
    }
}