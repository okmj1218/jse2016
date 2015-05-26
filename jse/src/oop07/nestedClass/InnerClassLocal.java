package oop07.nestedClass;
/*
����Ŭ���� �� ����° ����.
- Local ���� Ŭ���������� �ܺ� Ŭ������ ����� �����ϴµ� �־
- ������ ������. �켱 �ܺ� Ŭ������ ��������� ������ �� �� �ִ�.
- ������ �޼ҵ� ���� �ִ� ���������� ������ �� ����.
*/
public class InnerClassLocal {
	int a = 100;

	public void innerTest(int k) {
		int b = 200;
		final int c = k;
		class Inner {
			public void getData() {
				System.out.println("������� a :" + a);
				System.out.println("��� c :" + c);
				/*
				 *System.out.println("�������� b" + b);
				 *�̷��� �ڵ��ϸ� b ���� ������ �� ���ٴ�
				 *�����޽����� ���.
				 * */
				
			}
		}
		Inner inn = new Inner();
		inn.getData();
	}

}
