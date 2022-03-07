// Complete and execute java Program for transpose of a matrix/two dimensional array
class Sample2 {

	public static void main(String args[]) {

		//creating a matrix  
		int original[][]={{1,3,4},{2,4,3},{3,4,5}};    
    
		//creating another matrix to store transpose of a matrix  
		int transpose[][]=new int[3][3]; 
		for (int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				transpose[i][j]=original[j][i];
				
			}
		}
		System.out.println();
		}
		System.out.println("Print transpose of Matrix");
    
		/*Write code to transpose a matrix
		
		Print matrix after transpose:
		1 2 3 
		3 4 4 
		4 3 5 
		
		*/
		    
   }

