import java.util.Arrays;

public class numArray02 {
    public static void main(String[] args) {
        int[] num = new int[4];
        num[0]=5;
        num[1]=13;
        num[2]=-7;
        num[3]=17;

        for (int i = 0; i < num.length; i++){
            System.out.println("num["+i+"] = "+ num[i]); // s.out the inside of the array one by one with how the containg work
        }
        for (int nums : num){
            System.out.println(nums);   // s.out individual inside of the array
        }
        System.out.println(Arrays.toString(num));   // turn the arry into a string
    }
}