package org.example;
import java.util.Scanner;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {


        // Method to calculate total marks
        public static int calculateTotal(int[] marks) {

            int total = 0;

            for (int i = 0; i < marks.length; i++) {
                total = total + marks[i];
            }

            return total;
        }

        // Method to calculate percentage
        public static double calculatePercentage(int total, int subjects) {

            int maxMarks = subjects * 100;

            return (double) total / maxMarks * 100;
        }

        // Method to calculate grade
        public static String calculateGrade(double percentage) {

            if (percentage >= 90) {
                return "A+";
            } else if (percentage >= 80) {
                return "A";
            } else if (percentage >= 70) {
                return "B";
            } else if (percentage >= 60) {
                return "C";
            } else if (percentage >= 40) {
                return "D";
            } else {
                return "Fail";
            }
        }

        public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);

            System.out.println("===== STUDENT GRADE CALCULATOR =====");

            System.out.print("Enter number of subjects: ");
            int subjects = sc.nextInt();

            // Validate number of subjects
            if (subjects <= 0) {
                System.out.println("Invalid number of subjects!");
                sc.close();
                return;
            }

            int[] marks = new int[subjects];

            // Input marks
            for (int i = 0; i < subjects; i++) {

                System.out.print("Enter marks for subject " + (i + 1) + ": ");

                marks[i] = sc.nextInt();

                // Validate marks
                if (marks[i] < 0 || marks[i] > 100) {

                    System.out.println("Invalid marks! Enter marks between 0 and 100.");

                    sc.close();
                    return;
                }
            }

            // Display marks
            System.out.println("\n===== RESULT =====");

            for (int i = 0; i < subjects; i++) {
                System.out.println("Subject " + (i + 1) + ": " + marks[i]);
            }

            // Calculate total
            int total = calculateTotal(marks);

            // Calculate maximum marks
            int maxMarks = subjects * 100;

            // Calculate percentage
            double percentage = calculatePercentage(total, subjects);

            // Calculate grade
            String grade = calculateGrade(percentage);

            // Display result
            System.out.println("\nTotal Marks: " + total + "/" + maxMarks);

            System.out.printf("Percentage: %.2f%%\n", percentage);

            System.out.println("Grade: " + grade);

            sc.close();
        }
    }
