package com.human.ex;

public class javaClass6 {

	public static void main(String[] args) {
		// 2���� �Է¹޾Ƽ� ���ϴ� ���α׷�
		//��ĳ�� ����
		java.util.Scanner sc=new java.util.Scanner(System.in);
		//ù��° ���� �Է� �ޱ�
		System.out.println("ù��°���� �Է��ϼ���");
		String str=sc.nextLine();
		int i1=Integer.parseInt(str);
		//����ڰ� �Է��� ���ڰ� ��Ʈ�� ���� i1�� �� �ִ�.
		//�ι�° ���� �Է� �ޱ�
		System.out.println("�ι�° ���ڸ� �Է��ϼ���");
		//String str=sc.nextLine();
		str=sc.nextLine();
		int i2=Integer.parseInt(str);
        
		System.out.println("�Է��� �μ��� ����"+(i1+i2)+"�Դϴ�.");
	
	}

}
