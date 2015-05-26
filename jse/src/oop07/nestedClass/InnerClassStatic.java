package oop07.nestedClass;

public class InnerClassStatic {
	int a = 10;
	private int b = 100;
	static int c = 200;
	
	public static class Inner{
		static int d = 1000;
		public void printData(){
			System.out.println("����ƽ ������� �� c :" +c);
			System.out.println("����ƽ ������� �� d :" +d);
			/*
			System.out.println("����ƽ ������� �� c :" +c);
			System.out.println("����ƽ ������� �� c :" +c);
			 	static ���� Ŭ������ ��� �� �̻� ���� Ŭ������ �ƴϴ�.
			 	���� �ܺ� Ŭ������ ��ġ�� �ʰ� ������ �� �ִ�.
			 	���� top level class ��� �Ͽ� �ֻ��� Ŭ������ �Ѵ�.
			 	��¿������ ���� Ŭ������ static ���� �����ؾ� ��
			 	��찡 �ִ�. �װ� �ٷ� ����Ŭ���� ����� �� �ϳ��� 
			 	static ����� ���� ����.
			 
			*/
			
			
		}
	}
}
