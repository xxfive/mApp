package day01;
import java.util.Scanner;

public class Exam07 {
	public static void main(String[] args) {
		/*������ �Է��ϰ�
		 *ĿƮ������ �Է��Ͽ�
		 *�հ����� ���հ����� �˾ƺ���
		 */
		Scanner s=new Scanner(System.in);
		System.out.println("������ �Է��ϼ���>>");
		int score=s.nextInt();
		System.out.println("ĿƮ������ �Է��ϼ���>>");
		int cut=s.nextInt();
		if(score>=cut) {
			System.out.println("�հ�");
		}else { 
			System.out.println("���հ�");
		}
		//������ 3�� ������� �ƴ���
		if(score%3==0) {
			System.out.println(score+":3�� ���");
		}else {
			System.out.println(score+":3�� ���x");
		}
	}
}
