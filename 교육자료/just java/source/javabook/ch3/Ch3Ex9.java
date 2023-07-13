package javabook.ch3;

import java.util.Scanner;

public class Ch3Ex9 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("## 아이디를 입력하세요: ");
		
		String uname = scan.next();
		
		if(uname.equals("hong")) {
			System.out.print("# 비밀번호를 입력하세요: ");
			
			String pwd = scan.next();
			if(pwd.equals("1234")) {
				System.out.println("비밀번호 인증 확인!! -> 로그인 성공");
			}
			else
				System.out.println("비밀번호가 틀렸습니다.!!");
		}
		else
			System.out.println("아이디가 틀렸습니다.!!");
	}
}