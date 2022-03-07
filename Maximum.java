//wap to find max number among three
import java.util.*;
public  class Maximum
{
    Public static void main(String args[])
    {
    Scanner=new Scanner (System.in)
    System.out.println("Enter three numbers");
    int num1=new sc.nextInt();
    int num2=new sc.nextInt();
    int num3=new sc.nextint();

    if (num1>num2 && num1>num3)
    {
    System.out.println(" The largest number is:" +num1);
}
else if (num2>num1 && num2>num3)
{
System.out.println("The largest number is:" +num2);

}
else if (num3>num1 && num3>num2)
{
    System.out.println("The largest numer is:" +num3);
    
}
else 
{
    System.out.println("The numbers are same.");
}
}
}