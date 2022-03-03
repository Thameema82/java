import java.util.Scanner;
import p1.*;
public class packages{
		public static void main(String args[]){
			Scanner s=new Scanner(System.in);
			System.out.print("enter no:");
			int a=s.nextInt();
			primecheck p=new primecheck();
                        int b=p.check(a);
                        if(b==1)
                        System.out.println(a+" is a prime number");
                        else
                         System.out.println(a+" is not a prime number");
		
		}
	}
