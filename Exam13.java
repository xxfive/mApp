package day01;
import java.util.Scanner;

public class Exam13 {
	public static void main(String[]args) {
		/*switch�� ���
		 * ù��° �� �Է�
		 * �ι�° �� �Է�
		 * ������ �Է�
		 */
		Scanner sc=new Scanner(System.in);
		System.out.println("ù��° ��>>");
		int a=sc.nextInt();
		System.out.println("�ι�° ��>>");
		int b=sc.nextInt();
		System.out.println("������>>");
		String op=sc.next();
		switch(op) {
		case "+":System.out.println("�������"+(a+b));break;
		case "-":System.out.println("�������"+(a-b));break;
		case "*":System.out.println("�������"+(a*b));break;
		case "/":System.out.println("���������"+(a/b));break;
		case "%":System.out.println("���������"+(a%b));break;
		default :System.out.println("������ ����");
		}
		
		//if��
		if(op.equals("+")) { //���ڿ� ���� ���� = equals()���
			System.out.println("�������"+(a+b));
		}else if(op.equals("-")) {
			System.out.println("�������"+(a-b));
		}else if(op.equals("*")) {
			System.out.println("�������"+(a*b));
		}else if(op.equals("/")) {
			System.out.println("���������"+(a/b));
		}else if(op.equals("&")) {
			System.out.println("���������"+(a%b));
		}else {
			System.out.println("�����ڿ���");
		}
	}
}
