package oop07.nestedClass;

public class InnerClassAnonyServiceImpl {
	String data = "Hello Anonymous World !!";
	public void print(){
		new InnerClassAnonyService(){

			@Override
			public void printData() {
				System.out.println("�͸� ���� Ŭ���� ��� :" + data);
				
			}
			
		}.printData();
	}
}
