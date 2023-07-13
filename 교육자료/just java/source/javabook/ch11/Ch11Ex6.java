package javabook.ch11;

public class Ch11Ex6 extends Thread{
	static int ref;
	
	public void run() {
		String tname = Thread.currentThread().getName();
		
		System.out.println(tname+" 시작");
		for(int i=0;i<10;i++) {
			System.out.println(tname+"-"+i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println(tname+" 종료");
	}
	
	public static void main(String[] args) {
		Ch11Ex6 app = new Ch11Ex6();
		for(int i=0;i<2;i++) {
			Thread t = new Thread(app);
			t.start();
		}
		System.out.println("main 종료!!");
	}
}
