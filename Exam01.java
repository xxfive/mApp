package day02;
import java.util.Scanner;

public class Exam01 {
/*
 * ����,����,���� ������ �Է�
 * ����,���,���� ���
 * ��� 90 a,80 b,70 c,������ f
 * switch�� ���
 */
	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("�������� �Է�>>");
		int kor=sc.nextInt();
		System.out.println("�������� �Է�>>");
		int math=sc.nextInt();
		System.out.println("�������� �Է�>>");
		int eng=sc.nextInt();
		int total=kor+math+eng;
		int avg=total/3;
		System.out.println("����:"+total);
		System.out.println("���:"+avg);
		switch(total) {
		case 1:System.out.println("����:"+total);break;
		case 2:System.out.println("���:"+avg);break;
		}
		//Ʋ����
		switch(avg) {
		case 1:System.out.println("a����"+(avg>=90));break;
		case 2:System.out.println("b����"+(avg>=80));break;
		case 3:System.out.println("c����"+(avg>=70));break;
		default :System.out.println("f����");
		}
		
		//����
		/*String grade="";
		 * switch(avg/10){
		 * case 10:  //������ �Ʒ��� ������ �޹��� ��������
		 * case 9:grade="a";break; 
		 * case 8:grade="b";break;
		 * case 7:grade="c";break;
		 * defalut:greade="f";
		 */
		
	}
}
