public class Ques_four
{

       
    public static void main(String args[])
    {
	//Define a class which has a main method and initializes an integer array
	//Finds the 3rd largest element in an array

	int [] nums = {6, 3, 0, -3, 5, -9};//6 5 3 0 -3 -9

	int first = nums[0], second = Integer.MIN_VALUE,third = Integer.MIN_VALUE;

	for (int i = 1; i < nums.length; i++)
	{
	    if (nums[i] > first)
	     {
		 third = second;
		 second = first;
		 first = nums[i];
	     }
	     else if (nums[i] > second)
	     {
	       third = second;
	       second = nums[i];
	     }
	     else if (nums[i] > third)
	     {
		 third = nums[i];
	     }
    
	}
	System.out.println("Third largest element is " + third);
	
    }
}
