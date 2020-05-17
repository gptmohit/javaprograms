import java.util.Scanner;

class Fibonacci
{
  public static void main(String[] args) 
  {
	 Scanner scan = new Scanner(System.in);
	 int a = scan.nextInt();
	 int b = scan.nextInt();
	 int n = scan.nextInt();
	 scan.close();
	 System.out.print(a+" "+b);
	 for (int i = 1; i <=n; i++) 
	 {
	     int c=a+b;
	     a=b;
	     b=c;
	     System.out.print(" "+c);
	     
	 }
	 
	 
  }	
}
