//wap on factorial of a number
import java.util.Scanner;

public class Factorial
{
    public static void main(String args[])
    {
    int number=5;
    int factorial=1;
   
    for(int i=1;i<=number;i++)
    {
        factorial=factorial*i;
    }
    System.out.print("factorial is: "+factorial);
}
}