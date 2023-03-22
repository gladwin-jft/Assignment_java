import java.util.*;

public class Ques_three //Question Three
{
    public static void main(String [] args)
    {
        //Define a class which has a main method
        //it takes an integer and displays whether it is palindrom or not
        
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if (num == reverse_num(num))
            System.out.println("Is Palindrome");
        else
            System.out.println("Not a palindrome");
    }
    public static int reverse_num(int n)
    {
        int r , s = 0;
        while(n > 0)
        {
            r = n % 10;
            s = (s * 10) + r;
            n = n / 10;
        }
        return s;
    }
}
