import java.util.Random;
public class Ques_five {
    public static void main(String args[])
    {
        // Define a class which has a main method
        //it creates an integer array of 10 elements
        // it initializes its values from 1 to 10
        int [] nums = new int [10];

        for(int i = 1 ; i <= 10 ; i++)
            nums[i-1] = i;

        Random random = new Random();
        int rand_num = random.nextInt(10);

        nums[rand_num] = 0;

        find_missing_element(nums);
        
        
    }
    public static void find_missing_element(int [] nums)
    {
        //Your method should identify and display the missing value
    

        for(int i = 0 ; i < nums.length ; i++)
        {
            if(nums[i] == 0)
                System.out.println("The missing element is " + (i + 1));
        }
        display(nums);

    }
    public static void display(int [] arr)
    {
        for(int i = 0 ; i < arr.length ; i++)
        {
            System.out.print(arr[i] + " ,");
        }
        System.out.println("");
    }
    
    
}
