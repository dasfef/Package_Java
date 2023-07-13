package javabook.ch3;

public class Ch3Ex5 {
	public static void main(String[] args) {
		int num1 = 313;
		long num2 = 15L;
		
		long result1 = num1 * num2;
		System.out.println("== 자동 형변환 ==");
		System.out.printf("result1 : %d \n",result1);

		long result2 = num1 / num2;
		double result3 = num1 / num2;
		double result4 = num1 / 15.0;
		
		System.out.println("== 정수/실수 결과 ==");
		System.out.printf("result2-정수 : %d \n",result2);
		System.out.printf("result3-실수 : %f \n",result3);		
		System.out.printf("result4-실수 : %.3f \n",result4);		

		int result5 = 1000000 * 1000000;
		
		System.out.println("== 오버 플로우 ==");
		System.out.println(result5);
	}
}