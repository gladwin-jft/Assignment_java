
import java.util.*;
public class Ques_one
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        // Reverse String Using Built-in Function
        StringBuilder sb=new StringBuilder(str);  
        sb.reverse();  
        System.out.println(sb);

        // Reverse String Using Logic
        String rev_str = "";

        for(int i = str.length()-1 ; i >= 0; i--)
        {
            rev_str = rev_str + str.charAt(i);
        }

        System.out.println(rev_str);

    }
    
}