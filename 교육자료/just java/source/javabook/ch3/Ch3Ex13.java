package javabook.ch3;

public class Ch3Ex13 {
	public static void main(String[] args) {
		String[][] members = {{"101","홍길동"},{"102","김사랑"},{"103","이신용"}};
		
		for(int i=0; i< members.length; i++) {
			System.out.println(members[i][0]+":"+members[i][1]);
		}
	}
}