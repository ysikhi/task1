package task_12;
import java.util.Scanner;

import task_12.Choclates;
import task_12.Sweets;
public class gift {
     public static void main(String args[])
     {
    	 Scanner si=new Scanner(System.in);
    	 
    	 System.out.println("Enter the number of gift choclates t");
    	 int n=si.nextInt();
    	 int y=n,y1=n;
    	 System.out.println("Enter the range of the candies weight in Gift");
    	 int low=si.nextInt();
    	 int high=si.nextInt();
    	 
    	 Choclates s=new Choclates();
    	 int i=0;
    	 int a[]=new int[n];
    	 System.out.println("enter the choclate weight ");
    	 while(y!=0)
    	 {
    		 a[i]=si.nextInt();
    		 i++;
    		 
    		 
    		 y=y-1;
    	 }
    	
    	 
    	 
    	 
    	 Sweets e=new Sweets();
    	 int ii=0;
    	 int bb[]=new int[n];
    	 System.out.println("enter the sweets weight ");
    	 while(y1!=0)
    	 {
    		 bb[ii]=si.nextInt();
    		 ii++;
    		 
    		 y1--;
    	 }
    	 
    	 System.out.println("the toatal weight is "+(e.w(bb)+s.w(a)));
    	 System.out.println("the canies count   is "+(e.w1(a, low, high)+s.w1(bb,low,high)));
    	 
    	 
    	 
    	 
    	 
    	 
    	 
    	 
     }
}
