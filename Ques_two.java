import java.util.Arrays;
public class Ques_two 
{
    public static void main(String[] args)//Question 2
    {
        //Define a class which has a main method, it initializes 
        // an integer array , display its element and it sum

        int [] arr = {34, 2, 1, -8, 48, -12, 7};

        System.out.print("Element in an array: ");
        for(int n : arr) System.out.print(n+ " ");

        int sum = Arrays.stream(arr).sum();

        /*for(int i = 0 ; i < arr.length ; i++)
        {   
            sum += arr[i]
        }
        System.out.println("\nsum of array is " + sum);*/

        
        System.out.println("\nsum of array is " + sum);
    


    }
}
