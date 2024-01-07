package uperater_output_Q;

public class Q15 {
	public static void main(String[] args) {
		int x=5;
		int y=x++ + ++x + ++x;
		int z=--y + x++ + y++;
		int p=  z++ - (z%10) + (p=z);
		System.out.println(x+" "+y+" "+z+" "+p);
	}
}

/*     y = 5 + 7 + 8 = 20
       z = 19 + 8 + 19  =  46                        now y = 20 , x = 9
      p = 46 -7 + 47 =   86                 9now z = 47 , 

      print - 9  20  47  86     */