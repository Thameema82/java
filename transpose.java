import java.util.*;
 public class transpose
{
 public static void main(String[] args)
 { 
 System.out.println("Enter total row and column :");
 Scanner s= new Scanner(System.in);
  int row=s.nextInt(); 
  int column =s.nextInt();
  int array[][]=new int[row][column];

 System.out.println("Enter the matrix ");
 for(int i=0;i<row;i++)
 {
  for(int j=0;j<column;j++)
   { 
     array[i][j]=s.nextInt();
      }
   }
 System.out.println("Original matrix:");
 for(int i=0;i<row;i++)
  { 
    for(int j=0;j<column;j++)
     { 
      System.out.print(array[i][j]+ " ");
      }
  System.out.println(" ");
 }

System.out.println("Transporse of the matrix: ");
 for(int i=0;i<column;i++)
{
  for(int j=0;j<row;j++){
 System.out.print(array[j][i]+" ");
 }
System.out.println(" ");
}
}
}

