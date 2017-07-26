package javaOperator;
/**
 * 位移运算符
 * @author Lucia
 *
 */
public class TestShiftOperators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//0000 0000 0000 0000 0000 0000 0000 0101  (5的二进制)
		
		//0000 0000 0000 0000 0000 0000 0001 0100
		System.out.println("(5 << 2)二进制:"+Integer.toBinaryString(5 << 2));
		System.out.println("(5 << 2)十进制:"+(5 << 2));
		//1111 1111 1111 1111 1111 1111 1110 1100
		System.out.println("(-5 << 2)二进制:"+Integer.toBinaryString(-5 << 2));
		System.out.println("(-5 << 2)十进制:"+(-5 << 2));
		// 0000 0000 0000 0000 0000 0000 0000 0001  (有符号，为正数，在高位补0)
		System.out.println("(5 >> 2)二进制:"+Integer.toBinaryString(5 >> 2));
		System.out.println("(5 >> 2)十进制:"+(5 >> 2));
		 // 1111 1111 1111 1111 1111 1111 1111 1110 (有符号，为负数，在高位补1)
		System.out.println("(-5 >> 2)二进制:"+Integer.toBinaryString(-5 >> 2));
		System.out.println("(-5 >> 2)十进制:"+(-5 >> 2));
		// 0000 0000 0000 0000 0000 0000 0000 0001  (无符号，为正数，无论正负，在高位补0)
		System.out.println("(5 >>> 2)二进制:"+Integer.toBinaryString(5 >>> 2));
		System.out.println("(5 >>> 2)十进制:"+(5 >>> 2));
		// 0011 1111 1111 1111 1111 1111 1111 1110 (无符号，为负数，无论正负，在高位补0)
		System.out.println("(-5 >>> 2)二进制:"+Integer.toBinaryString(-5 >>> 2));
		System.out.println("(-5 >>> 2)十进制:"+(-5 >>> 2));
				
	}     

}
