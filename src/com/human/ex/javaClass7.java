package com.human.ex;

public class javaClass7 {

	public static void main(String[] args) {
		
		java.util.Scanner sc=new java.util.Scanner(System.in);
		String cm; double i1;
		System.out.println("Ű�� �Է� �ϼ���(CM)");
		cm=sc.nextLine();
		i1 = Double.parseDouble(cm);
		i1 = i1/100;
		System.out.println("m�� ����� �����" +i1 +" �Դϴ�.");
		
		
		String a , b , c ; double a1 , b1 , c1 ;
		System.out.println("������ ����");
	    a=sc.nextLine();
	    System.out.println("������ ����");
	    b=sc.nextLine();
	    System.out.println("������ ����");
	    c=sc.nextLine();
	    
	    a1 = Double.parseDouble(a);
	    b1 = Double.parseDouble(b);
	    c1 = Double.parseDouble(c);
	    
	    System.out.println("������ ���Ǵ�" +(a1*b1*c1)+ " �Դϴ�.");
	    
	    String land ;
	    double land2;
	    System.out.println("���� �Է��ϼ���");
	    land=sc.nextLine();
	    land2= Double.parseDouble(land);
	    System.out.println((land2*3.3)+"�������Դϴ�.");

	     

        String mass , speed ;
        double MASS,SPEED ;
        System.out.println("������ �Է����ּ���");
        mass=sc.nextLine();
        System.out.println("�ӵ��� �Է�");
        speed=sc.nextLine();
        MASS=Double.parseDouble(mass);
        SPEED=Double.parseDouble(speed);
        // (MASS*SPEED*SPEED*0.5)
        System.out.println("����:"+ MASS);
        System.out.println("�ӵ�:"+ SPEED);
        System.out.println("�������:"+(MASS*SPEED*SPEED*0.5));

        sc.close();
        
           	System.out.println("����� �̸��� �����Դϱ�?");
        	String d12 ;
        	d12=sc.nextLine();
        	System.out.println("����� �����Դ�"+ d12 +"�Դϴ�.");


        	String a12 ;
        	System.out.println("����� ���̴� ����Դϱ�?");
        	a=sc.nextLine();
        	System.out.println("����� ���̴�"+ a +"�Դϴ�.");


        	System.out.println("����� Ű�� ���Դϱ�?");
        	String b12 ;
        	b=sc.nextLine();
        	System.out.println("����� Ű�� "+b+"�Դϴ�.");


        	System.out.println("����� �����Դ� ���Դϱ�?");
        	String c12 ;
        	c=sc.nextLine();
        	System.out.println("����� �����Դ�"+ c +"�Դϴ�.");

        	System.out.println("����� �̸���"+d12+"�̰�"+", ���̴�"+ a +"Ű�� "+ b + "�����Դ�"+ c +"�Դϴ�.");



        	sc.close();

	    
	    
	}

}
