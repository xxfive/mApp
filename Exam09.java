package day01;
import java.util.Scanner;

public class Exam09 {
	public static void main(String[] args) {
		/*�� ���� �Է��Ͽ�
		 * ū��:
		 * ������:
		 �� ���� ��*/
		Scanner sc=new Scanner(System.in);
		//ù��° ���
		/*System.out.println("ù��° ���� �Է�>>");
		int a=sc.nextInt();
		System.out.println("�ι�° ���� �Է�>>");
		int b=sc.nextInt();
		if(a>b) {
			System.out.println("ū ��: "+a);
			System.out.println("���� ��: "+b);
			System.out.println("�� �� ��: "+(a-b));
		}else if(a<b){
			System.out.println("ū ��: "+a);
			System.out.println("���� ��: "+b);
			System.out.println("�� �� ��:"+(a-b));
		}else {
			System.out.println("�� �� ����");
		}*/
		
		//�ι��� ���
		System.out.println("ù��° �� �Է�>>");
		int max=sc.nextInt();
		System.out.println("�ι�° �� �Է�>>");
		int min=sc.nextInt();
		if(min>max) {
			int tmp=max; //int tmp=min       tmp:�ӽú���
			max=min;	//min=max
			min=tmp;	//max=tmp
		}
		System.out.println("ū ��: "+max);
		System.out.println("���� ��: "+min);
		System.out.println("�� �� ��: "+(max-min));
	}
}
