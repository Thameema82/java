import java.util.*;
import java.net.*;
import java.io.*;
public class server{
	public static void main(String args[]) throws Exception{
                System.out.println("Server started ");
		ServerSocket s=new ServerSocket(8013);
                System.out.println("server waiting for client request ");
		Socket cs=null;
		while(true){
			cs=s.accept();
			System.out.println("client connected");
			InputStream in=cs.getInputStream();
			BufferedReader br=new BufferedReader(new InputStreamReader(in));
			String str=br.readLine();
			System.out.print("client data received:"+str);
		}
	}
}
			