package javabook.ch6;

import java.text.MessageFormat;
import java.util.Date;

public class Ch6Ex11 {

	public static void main(String[] args) {
		String msg = "{0,date}일 {0,time}에 {1}에서 {2}과 만나기로 했다";
		Object[] objs = {new Date(), "종로", "홍길동"};
		MessageFormat mf = new MessageFormat(msg);
		
		System.out.println(mf.format(objs));
		
		String from = "홍길동";
		String to = "김기동";
		final int CHAT_SEND = 1;
		String location = "HOME";
		
		String chatMsg = "{0}|{1}|{2}-{3}|{4}";
		System.out.println(MessageFormat.format(chatMsg, CHAT_SEND, new Date(), from, to,location));
	}

}
