public class Ques_five
{
    public static void main(String[] args)
    {
        //Define a class which has a main method 
        //it initializes two integers 
        //displays their values and swaps
        //them without using a third integer

        int num1 = 45 , num2 = 54;

        System.out.println("Before Swap " + num1 + ", "+ num2);

        num1 = num1 + num2;
        num2 = num1 - num2;
        num1 = num1 - num2;

        System.out.println("After Swap " + num1 + ", "+ num2);
    }
}