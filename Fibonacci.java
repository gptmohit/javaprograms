  
import java.util.Scanner;

class SOL
{
  public static void main(String[] args) 
  {
	 Scanner scan = new Scanner(System.in);
	 int n = scan.nextInt();
	 int a = 0;
	 int b = 1;
	 scan.close();
	 int c=0;
	 System.out.print(a+" "+b);
	 for (int i = 1; i <=n; i++) 
	 {
	      c=a+b;
	     a=b;
	     b=c;
	     System.out.print(" "+c);
	     
	 }
	 
	 
  }	
