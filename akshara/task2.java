package akshara;

import java.util.*;
public class task2
{
    public static void main(String args[])
    {
        Random x=new Random();
        int x1=x.nextInt(100);
        int score=100,chance=10;
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<chance;i++)
        {
            System.out.println("Please Enter Your Number ");
            int num=sc.nextInt();
            if(x1==num)
            {
                System.out.println("congo! Your number is Matched with Generated number ");
                System.out.print("Your guessing score is "+score+"%");
                break;
            }
            else if(num<x1)
            {
                score=score-10;
                System.out.println("oops! Your number is less than Generated Number TRY AGAIN");
            }
            else if(num>x1)
            {
                score=score-10;
                System.out.println("oh oh Your number is More than Generated Number! TRY AGAIN");
            }
        }
    }
}

