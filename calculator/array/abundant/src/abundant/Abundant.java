/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abundant;
import java.util.Scanner;
class abu
{
public void put()
{

int n,i,s=0;
System.out.println("Enter n: ");
Scanner in=new Scanner(System.in);
n=in.nextInt();
for(i=1;i<n;i++)
{
    if(n%i==0)
    {
        s=s+n;
    }
}
if(s>n)
   System.out.println("abundant number");
else if(s<n)
    System.out.println("Deficient number");
else
    System.out.println("perfect number");

}
}
public class Abundant {

    public static void main(String[] args) 
    {
       abu ob=new abu();
       ob.put();
    }
    
}
