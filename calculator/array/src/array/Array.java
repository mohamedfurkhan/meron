package array;
import java.util.Scanner;

public class Array {


    public static void main(String[] args) {
        // TODO code application logic here
        int a[]=new int[20];
        int i,n;int pos;
        System.out.println("Enter total elements: ");
        Scanner in=new Scanner(System.in);
        n=in.nextInt();
        for(i=0;i<n;i++)
        {
            a[i]=in.nextInt();
            
        }
            for(i=0;i<n;i++)
            {
                System.out.println("a["+i+"] is "+a[i]);
            }
            System.out.println("enter the position to insert and key");
            pos=in.nextInt();//key=in.nextInt();
            for(i=pos-1;i<n-1;i++)
            {
                a[i]=a[i+1];
            }//a[pos-1]=key;
            for(i=0;i<n-1;i++)
            {
                System.out.println("a["+i+"] is "+a[i]);
            }
            
    }
    
}
