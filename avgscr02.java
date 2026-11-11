import java.util.Scanner;
public class avgscr02{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] studentScores = new int[10];
        int total = 0;
        double average;

        for (int i = 0; i < studentScores.length; i++) {
            System.out.print("Enter the score for student #" + (i + 1) + ": ");
            studentScores[i] = input.nextInt();
            total += studentScores[i];
            }
        average = (double) total / studentScores.length;
        System.out.println("Total score: " + total);
        System.out.println("Average: " + average);

        int highest = studentScores[0];
        int lowest = studentScores[0];
        for (int i = 1; i < studentScores.length; i++) {
            if (studentScores[i] > highest) highest = studentScores[i];
            if (studentScores[i] < lowest) lowest = studentScores[i];
        }
        System.out.println("Highest score: " + highest);
        System.out.println("Lowest score: " + lowest);
        String grade;
        if(average>=85){
            grade = "Exelent";
        } else if(average>=70){
            grade="Good";
        } else {
            grade="need improvement";
        }
        System.out.println("Class grade: " + grade);

    }
}