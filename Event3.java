import java.util.Scanner;
public class Even3
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter n value");
        int n=sc.nextInt();
          int i=0;
        while(i<=n)
        {
            if(i%2==0)
            {
                System.out.println(i+" is even number ");
                   i++;
            }
        }
    }
}
