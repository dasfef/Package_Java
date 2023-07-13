package javabook.ch6;

public class Ch6Ex1 {

	public static void main(String[] args) {
		String str1 = "hello";
		String str2 = "hello";
		String str3 = new String("hello");
		
		//String str4 = new String(30);
		String str4 = String.valueOf(30);
		
		String num1 = "20";
		
		if(str1 == str2)
			System.out.println("str1과 str2는 같습니다!!");
		else
			System.out.println("str1과 str2는 같지 않습니다!!");
		
		if(str1 == str3)
			System.out.println("str1과 str3는 같습니다!!");
		else
			System.out.println("str1과 str3는 같지 않습니다!!");
		
		if(str1.equals(str3)) 
			System.out.println("str1과 str3는 같습니다!!");
		else
			System.out.println("str1과 str3는 같지 않습니다!!");

		System.out.println("num1+30 = "+num1+30);
		System.out.println("str1의 길이: "+str1.length());
		System.out.println("str1의 4번째 문자: "+str1.charAt(3));
		System.out.println("str1의 2~4 위치에 있는 문자열: "+str1.substring(1, 4));
		System.out.println("str1의 l을 k 로 치환: "+str1.replace('l', 'k'));
	}
}