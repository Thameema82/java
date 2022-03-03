class greatest_two
 {
 	int num1,num2;
 	void greatest(){
 		System.out.println("The greatest number");

 	}

class greatest_three extends greatest_two
{
	int n1,n2,n3;
	void greatest()
	{
		System.out.println("The  greatest Number is :");

	}
}
class test
 {
 	public static void main(String args[]){
 		greatest_two g1= new greatest_two();
 		g1.num1=9;
 		g1.num2 = 7;
 		if(g1.num1>g1.num2){
 	       greatest();
 	      greatest_three g2 = new greatest_three();
 	       g2.n1=25;
 	       g2.n2=50;
 	       g2.n3 = 90;
 	       if(g1.n1>g1.n2 && g1.n1>g1.n3){
 	       	 greatest();
 	        elseif(g1.n2>g1.n1 && g1.n2>g1.n3);
 	         {
 	         greatest();
 	               } }
 	       else { 
 	         greatest();
 	           }
 	       }}

 	}
 }