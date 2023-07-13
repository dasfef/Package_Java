package javabook.ch3;

public class Ch3Ex7 {
	public static void main(String[] args) {
		int num1 = 50;
		System.out.printf("정수값 num1 : %d, %s\n", num1, Long.toBinaryString(num1));		

		int result1 = num1 >> 1;
		System.out.printf("num1 >> 1 : %d, %s\n", result1, Long.toBinaryString(result1));
		
		int result2 = num1 << 1;
		System.out.printf("num1 << 1 : %d, %s", result2, Long.toBinaryString(result2));
	}
}