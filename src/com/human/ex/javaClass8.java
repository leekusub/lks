package com.human.ex;

public class javaClass8 {
	
    	public static void main(String[] args) {
		//String.format()새로운 문자열을 만드는 함수
		String str1=String.format("안녕내이름은%s", "홍길동");
	    System.out.println(str1);
	    //여러게 문자열 처리
	    str1=String.format("안녕내이름은%s이고 사는곳은%s", "홍길동","대전");
	    System.out.println(str1);
	    str1=String.format("안녕내이름은%s이고 사는곳은%s 다니는"+"학교는%s 입니다.", 
	    		"홍길동","대전","휴먼");
	    System.out.println(str1);
	     
	    str1=String.format("나이는%d", 20);
	    System.out.println(str1);
	    //%s는 문자열
	    //%d는 정수
	    //%f는 실수 
	    str1=String.format("나이는 %d, 키는 %f" , 20,170.3);
	    System.out.println(str1);
	    
	    int i1=30;
	    double d1=3.141592;
	    String str2="안녕 하세요";
	    //String.format를 사용해서 3개를 출력해 보자.
	    str1=String.format("%d %f %s", i1,d1,str2);
	    System.out.println(str1);
	    System.out.println(String.format("%d %f %s", i1,d1,str2));
	    
	    str1=String.format(":%d:%-10d:%10d:", i1,i1,i1);
	    System.out.println(str1);
	    
	    str1=String.format(":%f:%.3f:", d1,d1);
	    System.out.println(str1);
	    
	    str1=String.format("%%\"");
	    System.out.println(str1);
	    
	    
	    
	   	}

}
