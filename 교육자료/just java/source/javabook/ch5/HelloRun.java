package javabook.ch5;

public class HelloRun {

	public void go() {
		HelloWorld hello1 = new HelloWorld();
		hello1.print();

		/*
		HelloWorld hello2 = new HelloWorld("My Hello World!!");
		hello2.print();

		HelloWorld hello3 = new HelloWorld("Hello",2);
		hello3.print();

		hello2.setMsg("반갑습니다!!");
		System.out.println(hello2.getMsg());

		HelloWorld.prefix = "Greetings: ";
		hello2.print();
		hello3.print();
		HelloWorld.prefix = "인사말: ";
		hello2.print();
		hello3.print();	
		*/
	}
	
	public static void main(String[] args) {
		HelloRun hr = new HelloRun();
		hr.go();
	}

}
