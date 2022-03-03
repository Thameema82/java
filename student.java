import java.util.*;
public class student
{
	public static void main(String args[])
	{
		String name;
		int roll,math,eng,phy;
		Scanner s=new Scanner(System.in);
		System.out.print("Enter the name :");
		name=s.nextLine();
		System.out.print("Enter Roll Number :");
		roll = s.nextInt();
		System.out.print("Enter the marks in Maths,English,physics :");
		  math=s.nextInt();
		  eng=s.nextInt();
		  phy = s.nextInt();

		  int tot = math+eng+phy;
		  float avg = (float)tot/300*100;
		  System.out.println("Name : "+name);
		   System.out.println("\tRoll number :"+roll);
          System.out.println("Marks of Maths,English,Physics :" +math+", "+eng +" ,"+phy);
          System.out.println("Total marks :"+tot);
          System.out.println("Average  :"+avg);
      }
}