package javabook.ch4;

public class Ch4Ex6 {

	public int sum(int num1, int num2) {
		return num1+num2;
	}
	
	public int sum(int num1, int num2, int num3) {
		return num1+num2+num3;
	}
	
	public static void main(String[] args) {
		Ch4Ex6 exam = new Ch4Ex6();
		System.out.println(exam.sum(3, 5));
		System.out.println(exam.sum(3, 5, 8));
	}

}
