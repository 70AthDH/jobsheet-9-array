import java.util.Scanner;;
public class scorearray02 {
    public static void main(String[] args) {
        int[] fscore = new int[10];
        Scanner sc = new Scanner(System.in);

        for(int i = 0; i < fscore.length; i++){
            System.out.println("enter the score for student #" + ( i + 1 ) + ": ");
            fscore[i]=sc.nextInt();

            
        }
        for (int i = 0; i < fscore.length; i++){
            if (fscore[i] > 70){
                System.out.println("Student #" +(i+1)+": "+fscore[i]+" pass");
            }
            
        }
    }
}
