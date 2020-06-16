package day01;
import java.util.Scanner;
//국어,영어,수학의 총점과 평균,학점을 구하라 90이상 a,80이상 b,70이상 c

public class Exam08 {
	public static void main(String[] args) {
		Scanner a=new Scanner(System.in);
		System.out.println("이름입력>>");
		String name=a.next();
		System.out.println("국어점수 입력>>");
		int kor=a.nextInt();
		System.out.println("수학점수 입력>>");
		int math=a.nextInt();
		System.out.println("영어점수 입력>>");
		int eng=a.nextInt();
		int total=kor+math+eng;
		int avg=total/3;
		System.out.println("총점:"+total);
		System.out.println("평균:"+avg);
		String grade="";
		 if(avg>=90) {
			grade="A학점";
		}else if(avg>=80) {
			grade="B학점";
		}else if(avg>=70) {
	    	grade="C학점";
	    }else {
	    	grade="F학점";
	    }
		System.out.println(grade);
	}
}