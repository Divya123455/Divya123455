//  Write a program to create a two dimensional array with duplicate elements and print only the duplicate elements.
class Exercise2 {

	public static void main(String args[]) {

		    int arry[][]={{1,1,1},{2,2,2},{3,3,3}};
		    for (int i=0;i<arry.length;i++)
		    {
		    for (int j=0;arry.length<i;j++)
		    {
		        System.out.println(arry[i][j]+ " ");
		    }
		    System.out.println();
   }
}
}