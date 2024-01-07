package uperater_output_Q;

public class Q22 {
	public static void main(String args[]){
		int a=10;
		int b=6;
		int c=30;
		System.out.println(a > b || a < c);
		System.out.println(a > b | a < c);
		System.out.println(a > b || a++ < c);
		System.out.println(a);
		System.out.println(a > b | a ++ < c);
		System.out.println(a);
		}
}

//true
//true
//true
//11 wrong 10
//true
//12  wrong 11