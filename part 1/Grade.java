import java.util.Scanner;

public class Grade {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of students: ");
        int numStudents = scanner.nextInt();

        // Assuming passing grade is 50
        int passingGrade = 50;

        for (int i = 1; i <= numStudents; i++) {
            System.out.print("Enter grade for student " + i + ": ");
            int studentGrade = scanner.nextInt();

            if (studentGrade >= passingGrade) {
                System.out.println("Student " + i + ": Passed");
            } else {
                System.out.println("Student " + i + ": Failed");
            }
        }
        
    }
}
