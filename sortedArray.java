import java.util.*;
public class sortedArray {
    public static void main(String args []){
        Scanner s = new Scanner(System.in);
        System.out.println("enter no of elements :");
        int m=s.nextInt();
        System.out.println("enter elements :");
        int a[] = new int[m];
        for(int i=0;i<m;i++){
            a[i]=s.nextInt();
        }
        
        for(int i=0;i<m;i++){
            for(int j=i+1;j<m;j++){
                if(a[i]>a[j]){
                int temp = a[i];
                a[i]=a[j];
                a[j]=temp;
            }
        }

    }
    System.out.println("sorted array");
    for( int i=0;i<m;i++){
        System.out.print(a[i]+" ");
    }

    }
    
}
