import java.net.*;
import java.io.*;
public class client{
	public static void main(String args[]) throws Exception{
 
		Socket cs=new Socket("127.0.0.1",8013);
		OutputStream out=cs.getOutputStream();
		PrintWriter p=new PrintWriter(out,true);
		System.out.println("networking");
		p.write("hello");
		System.out.println("message send");
	}
}



