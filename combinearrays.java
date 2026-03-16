import java.util.*;
public class combinearrays {
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        int m=s.nextInt();
        int n=s.nextInt();
        int a[]=new int[m];
        int b[] = new int[n];
        int c[]= new int[a.length+b.length];
        for(int i=0;i<=a.length-1;i++){
            c[i]=a[i];
        }
        for(int i=0;i<=b.length;i++){
            c[i+a.length-1]=b[i];
        }
        System.out.println(Arrays.toString(c));    }
    
}
