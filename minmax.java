import java.util.*;
class minmax{
    public static void main(String args[])
    {
        Scanner s = new Scanner(System.in);
        int n=s.nextInt();
        int a[]=new int[n];
      
        for(int i=0;i<n;i++)
        {
            a[i]=s.nextInt();
        }
        int min=a[0];
        int max=a[0];
        for(int i=1;i<n;i++)
        {
            if(a[i]<min)
            {
                min=a[i];
            }
            if(a[i]>max)
            {
                max=a[i];
            }

        }
        System.out.println(min);
        System.out.println((max));

    }

}