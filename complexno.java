import java.util.*;
class complex
{
	int real,img;
	complex(){
		real=0;
		img=0;


	}complex(int x,int y)
	{
		real=x;
		img=y;

	}
	complex add(complex ob){
		complex temp= new complex();
		temp.real=this.real+ob.real;
		temp img= this.img +ob.img;
		return temp;

	}
	void display(){
		System.out.println("d="+this.real+"+" +this.img+"i");

	}
}
class complexno{
	public static void main(string args[]);
	Scanner s= new Scanner(System.in);
	System.Out.print("enter  the real and imaginary part of first complex number");
	int r1 = s.nextInt();
	int i1 = s.nextInt();
	complex c1= new complex(r1,i1);
	System.out.println(" enter real and img part of second comlex no ");
	int r2= s.nextInt();
	int i2= s.nextInt();
	complex c2= new complex(r2,i2);
	complex d= new complex();
	d= c1.add(c2);
	System.out.println(" result ");
	d.display();


}