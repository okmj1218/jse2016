package oop07.nestedClass;

public class InnerClassMain {
	public static void main(String[] args) {
		InnerClassMain inn = new InnerClassMain();
	//	inn.getInnerClassInstance(); �ν��Ͻ� ����Ŭ���� ȣ���
		inn. getInnerClassLocal();
	}
	/*
	 * ����Ŭ���� ���� ��...ù��°�� �ν��Ͻ� ����Ŭ���� ȣ�� ���
	 * */
	public void getInnerClassInstance(){
		InnerClassInstance.Inner inner = new InnerClassInstance().new Inner();
		inner.printData();
	}
	
	 public void getInnerClassStatic(){
	 	// ����ƽ Ŭ������ ��ü�� �������� �ʰ�.. Ŭ�������� ���� �����Ѵ�.
	 	// ���� InnerClassStatic.Inner() ���� �����ϴ� ���¿� ���� !!
	 	InnerClassStatic.Inner inner = new InnerClassStatic.Inner();
	 	inner.printData();
	 }
	public void getInnerClassLocal(){
		InnerClassLocal outer = new InnerClassLocal();
		outer.innerTest(1000);
	}
}
