package javabook.ch9;

import java.util.*;

public class Ch9Ex1 {

	public static void main(String[] args) {
		ArrayList al1 = new ArrayList();
		ArrayList<String> al2 = new ArrayList<String>();
		
		al1.add("홍길동");
		al1.add("몰라요");
		al1.add(10);
		
		al2.add("현대");
		al2.add("기아");
		//al2.add(100);
		
		al2.addAll(al1);
		
		for(int i=0;i<al1.size();i++) {
			System.out.println(al1.get(i));
		}
		System.out.println("--------------");
		for(String s : al2) {
			System.out.println(s);
		}
	}

}
