import java.util.Scanner;

class PrimeNumber
{
  public static void main(String[] args) 
  {
	 
	 Scanner scan = new Scanner(System.in);
	// int a = scan.nextInt();
	 //int b = scan.nextInt();
	 int n = scan.nextInt();
	int flag=0,i,m=0;
	m=n/2;
	 if(n==0 || n==1)
	 {
		 System.out.println("Not prime Number");
	 }
	 else
	 {
		 for(i=2;i<m;i++)
		 {
			  if(n%i==0)
			  {
				  System.out.println("not prime number");
				  flag=1;
				  break;
			  }
		 }
		 if(flag==0)
		 {
			 System.out.println("Prime number");
		 }
	 }
  }

	 
  
}
