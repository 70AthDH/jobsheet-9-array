# jobsheet: Array

* name: Athaaullah Dhiyaaul Haq
* nim: 264107020187
* class/no: 1I/02

---

## Objective

* Students are able to understand the concept of one-dimensional arrays and how to declare, initialize,
and access their elements in the Java programming language.
* Students are able to write programs that use one-dimensional arrays to store and process data,
including the use of for and foreach loops.
* Students are able to apply arithmetic operations to array elements, such as calculating the total,
average, highest value, and lowest value.
* Students are able to apply simple searching and sorting algorithms to one-dimensional arrays.
* Students are able to apply one-dimensional arrays to solve case studies that are relevant to campus
life and everyday situations.

## Practicum

### Experiment 1

#### The code:

```  java
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
```

#### question

1. If the elements of the numbers array are changed to 5.0, 12867, 7.5, 2000000, what happens? Why
does this happen?
2. Modify the program above by initializing the array elements at the same time the array is declared
(without new int[4] and without filling the elements one by one).
3. Change the display statement in step 4 to the following: System.out.println("numbers[" + i + "] = " +
numbers[i] + ", doubled = " + (numbers[i] * 2)); What is the output of the program? Explain the
meaning of the statement.
4. If the condition in the for loop above is changed to i <= 4, what is the output of the program? Why?
5. What is the difference between displaying an array using a for loop, a foreach loop, and
Arrays.toString() in step 5? When should each one be used?

#### Answer

1. An error occurs
2. snip

```java
 double[] num = {5.0, 12867, 7.5, 2000000}; 
 ```

3. snip

```java
numbers[0] = 5, doubled = 10 numbers[1] = 12867, doubled = 25734
```

4. compile normla buut throw runtime exception. when loop is i<=4, the loop try to execute i =4 to acces num[4] wich does not exist
5. for loop provide explicit acce sto the index var i. foreach loop Iterates directly over values without index variables. array2string make then num into string

### Experiment 2

#### The code

```java
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
            String stats = (fscore[i] > 70) ? "pass" : "fail";
            System.out.println("Student #" +(i+1)+": "+fscore[i]+" ("+stats+")");
        }
    }
}
```

#### Q

1. What does the condition i < finalScores.length in the loop above mean?
2. Modify the program so that it displays only the scores of students who passed (score > 70), without
displaying those who failed. Explain the flow of the program!
3. Change the loops in steps 4 and 5 from for loops to foreach loops. Can all parts of the program be
converted to foreach? Explain which parts can and cannot be converted, along with the reasons.
4. Modify the program so that it also calculates and displays the number of students who passed and
the number of students who failed at the end of the program.

#### A

1. check if i is less than 10
2. mod

```java
 if (fscore[i] > 70){System.out.println("Student #" +(i+1)+": "+fscore[i]+" pass");}
 ```

3. 
4. 
