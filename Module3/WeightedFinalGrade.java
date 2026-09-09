import java.util.Scanner;

public class WeightedFinalGrade {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter quiz grade: ");
        double quizGrade = input.nextDouble();

        System.out.print("Enter project grade: ");
        double projectGrade = input.nextDouble();

        System.out.print("Enter examination grade: ");
        double examGrade = input.nextDouble();

        double finalGrade = (quizGrade * 0.30)
                          + (projectGrade * 0.30)
                          + (examGrade * 0.40);

        System.out.println("Final Grade: " + finalGrade);

        input.close();
    }
}
