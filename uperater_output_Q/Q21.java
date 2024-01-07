//doubt 

package uperater_output_Q;

public class Q21 {
	public static void main(String args[]){
		int a=10;
		int b=5;
		int c=20;
		System.out.println(a < b&&a++ < c);
		System.out.println(a);
		System.out.println(a < b&a++ < c);
		System.out.println(a);
		}

}


//a < b = (false) && a++ = 10+1 = 11 but we use [ 10 ] so (true) == false
//11 -- wrong
//false 
//12  -wrong