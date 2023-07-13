package javabook.ch5;

public class HelloWorldV1 {
	String msg;

	public HelloWorldV1() {
		msg = "Hello World !!";
	}

	public void print() {
		System.out.println(msg);
	}
	
	public static void main(String[] args) {
		HelloWorldV1 hello = new HelloWorldV1();
		hello.print();
	}
}
