import java .util.*;
public class sort 
{
 public static void main(String[]args)
{
 int n,i,temp;
 Scanner s= new Scanner(System.in);
 System.out.println("Enter no.of elements you want in an array:");
 n= s.nextInt();
 int a[]= new int[n];
 System.out.println("Enter all the elements :");
 for(i=0;i<n;i++)
 {
  a[i]=s.nextInt();
  }
 for( i=0;i<n;i++)
  {
   for(int j=i+1;j<n;j++)
    {
     if(a[i]>a[j])
      {
       temp=a[i];
       a[i]=a[j];
       a[j]= temp;
        }
      }
  }
System.out.println("sorted array :");
for(i=0;i<n;i++)
 {
  System.out.println(a[i] + " ");
 }
 System.out.println("");
}}