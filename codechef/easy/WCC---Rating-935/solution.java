/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{ Scanner sc =new Scanner(System.in);
	  int t =sc.nextInt();
	  while(t-->0){
	     int x = sc.nextInt();
	     int totalprize = 100*x;
	     
	     String s = sc.next();
	     int c=0,n=0,d=0;
	     for(int i=0;i<s.length();i++){
	         if(s.charAt(i)=='C'){
	             c++;
	         }
	         else if(s.charAt(i)=='N'){
	             n++;
	         }
	         else{
	             d++;
	         }
	         
	     }
	       if(c>n){
	           System.out.println(60*x);
	       }
	       else if(c==n){
	           System.out.println(55*x);
	       }
	       else{
	           System.out.println(40*x);
	       }
	     
	          
	       
	    
	      
	  }
		
	}
}