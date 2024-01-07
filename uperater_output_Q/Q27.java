package uperater_output_Q;

public class Q27 {
	public static void main(String args[]){
		long l = 30;
		int i = 50;
		short s = 60;
		byte b = 70;
		byte sum = (byte)(l + i + s + b);
		System.out.println("Sum = " + sum);
		}

}

/* l + i + s + b == 210
then byte 210 - 127 = 83
so sum = -128+82 = -46 */