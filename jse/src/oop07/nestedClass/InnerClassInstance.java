package oop07.nestedClass;
/*
 ����Ŭ���� ù��° ����
 - �ν��Ͻ� ����Ŭ����
 - ����޼ҵ� ���ο� Ŭ������ ������ ���
  */
public class InnerClassInstance {
	int a = 10;
	private int b = 100;
	static int c = 200;
	public class Inner{
		public void printData(){
			System.out.println("a�� :" + a);
			System.out.println("b�� :" + b);
			System.out.println("c�� :" + c);
		}
	}
}
