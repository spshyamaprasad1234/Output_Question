package uperater_output_Q;

public class Q25 {
	public static void main(String args[]){
		long l = 55;
		int i = 44;
		short s = 33;
		byte b = 22;
		i = (int) l;
		s = (short) i;
		b = (byte) s;
		System.out.println("l = " + l);
		System.out.println("i = " + i);
		System.out.println("s = " + s);
		System.out.println("b = " + b);
		}
}


//l = 55
//i = (int) l = 55
//s = (short)i = 55
//b = (byte) s = 55