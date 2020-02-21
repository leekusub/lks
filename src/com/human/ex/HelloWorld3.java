package com.human.ex;
public class HelloWorld3 {
	public static void main(String[] args) {
		System.out.println("hello");
		System.out.println("World");
		System.out.println("hello\tWorld");
		System.out.println("hello\nWorld");

		System.out.print("hello");
		System.out.print("World");
		System.out.print("\n");

		System.out.println("hello\"World\"");
		
		//이스케이프 시퀀스(escape sequence)
		//문법에 문제가 되는 문자나 특수기호를 문자열로 출력하고 싶을때 사용한다.
		//사용방법은 /(이거 아님. 반대로 그어야함. 역슬래시다음에 문자 형태로 사용) 예시- \n, \t, \"
		// ln 은 "다음줄" 일는 뜻임
	}

}
