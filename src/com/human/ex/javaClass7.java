package com.human.ex;

public class javaClass7 {

	public static void main(String[] args) {
		
		java.util.Scanner sc=new java.util.Scanner(System.in);
		String cm; double i1;
		System.out.println("키를 입력 하세요(CM)");
		cm=sc.nextLine();
		i1 = Double.parseDouble(cm);
		i1 = i1/100;
		System.out.println("m로 변경된 결과는" +i1 +" 입니다.");
		
		
		String a , b , c ; double a1 , b1 , c1 ;
		System.out.println("상자의 가로");
	    a=sc.nextLine();
	    System.out.println("상자의 세로");
	    b=sc.nextLine();
	    System.out.println("상자의 높이");
	    c=sc.nextLine();
	    
	    a1 = Double.parseDouble(a);
	    b1 = Double.parseDouble(b);
	    c1 = Double.parseDouble(c);
	    
	    System.out.println("상자의 부피는" +(a1*b1*c1)+ " 입니다.");
	    
	    String land ;
	    double land2;
	    System.out.println("평을 입력하세요");
	    land=sc.nextLine();
	    land2= Double.parseDouble(land);
	    System.out.println((land2*3.3)+"평방미터입니다.");

	     

        String mass , speed ;
        double MASS,SPEED ;
        System.out.println("질량을 입력해주세요");
        mass=sc.nextLine();
        System.out.println("속도를 입력");
        speed=sc.nextLine();
        MASS=Double.parseDouble(mass);
        SPEED=Double.parseDouble(speed);
        // (MASS*SPEED*SPEED*0.5)
        System.out.println("질량:"+ MASS);
        System.out.println("속도:"+ SPEED);
        System.out.println("운동에너지:"+(MASS*SPEED*SPEED*0.5));

        sc.close();
        
           	System.out.println("당신의 이름은 무엇입니까?");
        	String d12 ;
        	d12=sc.nextLine();
        	System.out.println("당신의 몸무게는"+ d12 +"입니다.");


        	String a12 ;
        	System.out.println("당신의 나이는 몇살입니까?");
        	a=sc.nextLine();
        	System.out.println("당신의 나이는"+ a +"입니다.");


        	System.out.println("당신의 키는 얼마입니까?");
        	String b12 ;
        	b=sc.nextLine();
        	System.out.println("당신의 키는 "+b+"입니다.");


        	System.out.println("당신의 몸무게는 얼마입니까?");
        	String c12 ;
        	c=sc.nextLine();
        	System.out.println("당신의 몸무게는"+ c +"입니다.");

        	System.out.println("당신의 이름은"+d12+"이고"+", 나이는"+ a +"키는 "+ b + "몸무게는"+ c +"입니다.");



        	sc.close();

	    
	    
	}

}
