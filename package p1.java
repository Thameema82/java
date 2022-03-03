package p1;
public class primecheck{
   int i;
    public int check(int i){
     for(int j=2;j<=i/2;j++){
      if(i%j==0)
      return 0;
       }
       return 1;
}
}