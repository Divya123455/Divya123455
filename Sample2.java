// Complete and execute java Program for making a simple calculator using switch case
class Sample2 {

	public static void main(String args[]) {

    		//Intialize the char variable below with operators (+, -, *, /) one by one and check the output
    		char operator = '+';
    		
		int first=10,second=5,result;

    		switch (operator) {
      		case '+':
      			result=first+second;
        
        	System.out.println(first+ "+" +second+ "=" +result);
        	break;//Write code to perform addition of first and second

      		case '-':
      			result=first-second;
        	System.out.println(first+ "-" +second+ "=" +result);
        	
        	break;
        	//Write code to perform subtraction 

      		case '*':
      			result=first*second;	
        	System.out.println(first+ "*" +second+ "=" +result);
        	break;
        	
        	//Write code to perform multiplication

      		case '/':
      				result=first/second;
        	System.out.println(first+ "/" + second+ "=" +result);
        	break;
        	//Write code to perform division

      		//If operator doesn't match any case constant (+, -, *, /)
      		default:
        	System.out.println("invalid")
        	break;
        	// Print Error stating operator is not correct
       
    		}

    		System.out.println(first + "10 " + operator + "+ " + second + " 5 " + result);
  	}
}
