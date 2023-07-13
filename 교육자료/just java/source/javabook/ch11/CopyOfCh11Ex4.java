package javabook.ch11;

public class CopyOfCh11Ex4 extends Thread{
	public int total=100;
	//static Integer total=100;
	private SellManager sm;
	
	public void run() {
		for(int i=0;i<3;i++) {
			sm.sell();					
		}
		System.out.println(this.getName()+" 종료");
	}		
	
	public CopyOfCh11Ex4() {
		sm = new SellManager(); 
	}
	
	public static void main(String[] args) {
		System.out.println("## 티켓 예매 프로그램 ##");
		CopyOfCh11Ex4 app = new CopyOfCh11Ex4();
		for(int i=0;i<10;i++) {
			Thread mt = new Thread(app);
			mt.start();
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}	
		System.out.println("main 종료!!");
	}
	
	class SellManager{
		synchronized void sell() {
			total--;
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("-판매:"+total);
		}
	}
}
