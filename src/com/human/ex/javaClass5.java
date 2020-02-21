package com.human.ex;

public class javaClass5 {

	public static void main(String[] args) {
		//사용자 입력을 받아 보자.
		//사용자가 키보드로 입혁한 데이터를 프로그램에서 받아서 처리하는것
		//int a
		java.util.Scanner scanner
		     =new java.util.Scanner(System.in);
		System.out.println("문자열을 입력해주세요 >>");
		String str1=scanner.nextLine(); //사용자 입력을 받아 문자열로 리턴해주는 함수
		System.out.println(str1+"을 입력하셧습니다.");
        
        //사용자 입력은 모두 문자열이다.
        //숫자를 사용자로 부터 받으려면 문자열을 숫자로 변경하는 함수를 사용하자.
        System.out.println("정수을 입력해 주세요>>");
        str1=scanner.nextLine();
        int i1=Integer.parseInt(str1);
        System.out.println("입력한 정수는:"+i1);
        //사용자에게 2수를 입력받아 더해서 출력해보자.
        
        System.out.println("프로그램 종료");
        scanner.close();  
        
	}
	

}
