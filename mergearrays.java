import java.util.*;
public class mergearrays {
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        int m =s.nextInt();
        int a[] = new int[m];
        for(int i=0;i<m;i++){
            a[i]=s.nextInt();
        }
        int n=s.nextInt();
        int b[] = new int[n];
        for(int i=0;i<n;i++){
            b[i]=s.nextInt();
        }
        int c[]= new int[a.length+b.length];
        for(int i=0;i<a.length;i++){
            c[i]=a[i];
        }
      for(int i=0;i<b.length;i++){
        c[i+a.length]=b[i];
      }
      System.out.println(Arrays.toString(c));



    }
    
}
