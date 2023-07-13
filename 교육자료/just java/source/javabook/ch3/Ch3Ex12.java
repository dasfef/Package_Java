package javabook.ch3;

public class Ch3Ex12 {
	public static void main(String[] args) {
		int num = 20;
		while(num > 10) {
			System.out.println(num--);
		}
		
		boolean flag = true;
		while(flag) {
			num--;
			if(num == 3) {
				flag = false;
				System.out.println("num=3 종료!!");
			}
		}
	}
}