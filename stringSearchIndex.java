import java.util.*;
class stringSearchIndex{
    public static void main(String args[]){
      Scanner s = new Scanner(System.in);
      int n =s.nextInt();
      String a[]= new String[n]   ;
      for(int i=0;i<n;i++){
        a[i]=s.next();
      }
      String y=s.next();
      for(int i=0;i<n;i++){
    if( a[i].equals(y)){
System.out.println(i);
    }
      }
    }
    
}