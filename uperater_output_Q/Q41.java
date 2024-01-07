package uperater_output_Q;

public class Q41 {
	public static void main(String[] args) 
	 {
	 int temp = 9; 
	 int data = 8; 
	 System.out.println(temp & data); 
	 System.out.println(temp | data); 
	 System.out.println(temp ^ data); 
	 }
}


/* 1st line  -----     8    4    2    1
                       9 =   1  0  0  1
                       8 =   1  0  0  0
                        _________________
                             1  0  0  0      = value = 8    */  

/* 2nd line  -----    9 = 1  0  0  1
                      8 = 1  0  0  0
                      _______________
                          1  0  0  1         = value = 8+1 = 9   */
 

/* 3rd line  -----   9 = 1  0  0  1
                     8 = 1  0  0  0
                     _______________
                         0  0  0  1         = value = 1  */
