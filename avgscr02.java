import java.util.Scanner;
public class avgscr02{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] studentScores = new int[10];
        int total = 0;
        double average;

        for (int i = 0; i < studentScores.length; i++) {        // to input student score
            System.out.print("Enter the score for student #" + (i + 1) + ": ");
            studentScores[i] = input.nextInt();
            total += studentScores[i];
            }
        System.out.println("-------------------------------------------------");//to check who pass on score above 70
        for (int i = 0; i < studentScores.length; i++){
            if(studentScores[i] > 70){
                System.out.println("student #" + (i+1) + ": " + " pass");
            }
        }
        System.out.println("-------------------------------------------------");
        average = (double) total / studentScores.length; // to calculate the avg score
        System.out.println("Total score: " + total);
        System.out.println("Average: " + average);

        int highest = studentScores[0]; 
        int lowest = studentScores[0]; 
        for (int i = 1; i < studentScores.length; i++) {
            if (studentScores[i] > highest) highest = studentScores[i]; // to make a new highest
            if (studentScores[i] < lowest) lowest = studentScores[i]; // to make new lowest
        }
        System.out.println("Highest score: " + highest); // output
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