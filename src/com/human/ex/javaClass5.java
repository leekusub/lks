package com.human.ex;

public class javaClass5 {

	public static void main(String[] args) {
		//����� �Է��� �޾� ����.
		//����ڰ� Ű����� ������ �����͸� ���α׷����� �޾Ƽ� ó���ϴ°�
		//int a
		java.util.Scanner scanner
		     =new java.util.Scanner(System.in);
		System.out.println("���ڿ��� �Է����ּ��� >>");
		String str1=scanner.nextLine(); //����� �Է��� �޾� ���ڿ��� �������ִ� �Լ�
		System.out.println(str1+"�� �Է��ϼ˽��ϴ�.");
        
        //����� �Է��� ��� ���ڿ��̴�.
        //���ڸ� ����ڷ� ���� �������� ���ڿ��� ���ڷ� �����ϴ� �Լ��� �������.
        System.out.println("������ �Է��� �ּ���>>");
        str1=scanner.nextLine();
        int i1=Integer.parseInt(str1);
        System.out.println("�Է��� ������:"+i1);
        //����ڿ��� 2���� �Է¹޾� ���ؼ� ����غ���.
        
        System.out.println("���α׷� ����");
        scanner.close();  
        
	}
	

}
