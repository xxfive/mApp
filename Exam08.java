package day01;
import java.util.Scanner;
//����,����,������ ������ ���,������ ���϶� 90�̻� a,80�̻� b,70�̻� c

public class Exam08 {
	public static void main(String[] args) {
		Scanner a=new Scanner(System.in);
		System.out.println("�̸��Է�>>");
		String name=a.next();
		System.out.println("�������� �Է�>>");
		int kor=a.nextInt();
		System.out.println("�������� �Է�>>");
		int math=a.nextInt();
		System.out.println("�������� �Է�>>");
		int eng=a.nextInt();
		int total=kor+math+eng;
		int avg=total/3;
		System.out.println("����:"+total);
		System.out.println("���:"+avg);
		String grade="";
		 if(avg>=90) {
			grade="A����";
		}else if(avg>=80) {
			grade="B����";
		}else if(avg>=70) {
	    	grade="C����";
	    }else {
	    	grade="F����";
	    }
		System.out.println(grade);
	}
}