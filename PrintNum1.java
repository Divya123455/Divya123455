import java.util.Scanner;
class LoopExample{
    
    public static void main(String args[]){
        
        Scanner s=new Scanner(System.in);
        
        System.out.println("Enter n value");   
        int n=s.nextInt();  
        
          int i=0;
          
          for(i=n;i>=1;i--){    
              System.out.print(i+" ");
          }                                         
        
       
    }
}