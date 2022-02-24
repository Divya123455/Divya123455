
    // WAP to print even numbers and odd numbers from 1-N using while loop.

Scanner sc = new Scanner(System.in);
System.out.println("Enter the size of the array : ");
int end = sc.nextInt();

//end = 10
int i = 2;
while(i<=end) {​​​
if(i%2 == 0){​​​
System.out.print(i+" ");
}​​​
i = i + 2;
}​​​
System.out.println();
i = 1;
while(i<=end) {​​​
if(i%2 != 0){​​​
System.out.print(i+" ");
}​​​
i = i + 2;
}​​​
}​​​
}​​​
