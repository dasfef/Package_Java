package javabook.ch11;

public class Ch11Ex8 {
	public static void main(String[] args) {
		new Thread(()->{
			System.out.println("Hello World!!");
		}).start();
	}
}
