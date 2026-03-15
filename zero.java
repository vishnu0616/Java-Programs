import java.util.*;

class Zero{
    public static void main(String args[]){
        Scanner s =new Scanner(System.in);
        System.out.println("enter no.of elements");
         int n=s.nextInt();
        System.out.println("Enter the array");
        int[] a = new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=s.nextInt();
        
        }
        
        int x=0;
        for(int i=0;i<n;i++){
            if(a[i]!=0){
            int temp = a[x];
            a[x]=a[i];
            a[i]=temp;
            x++;
            }
        }
      System.out.println("The array is");
      for(int i=0;i<n;i++){
        System.out.println(a[i]+" ");
      }
        }
}