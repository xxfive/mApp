package day02;
import java.util.Scanner;

public class Exam01 {
/*
 * 국어,영어,수학 점수를 입력
 * 총점,평균,학점 출력
 * 평균 90 a,80 b,70 c,나머지 f
 * switch문 사용
 */
	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("국어점수 입력>>");
		int kor=sc.nextInt();
		System.out.println("수학점수 입력>>");
		int math=sc.nextInt();
		System.out.println("영어점수 입력>>");
		int eng=sc.nextInt();
		int total=kor+math+eng;
		int avg=total/3;
		System.out.println("총점:"+total);
		System.out.println("평균:"+avg);
		switch(total) {
		case 1:System.out.println("총점:"+total);break;
		case 2:System.out.println("평균:"+avg);break;
		}
		//틀린거
		switch(avg) {
		case 1:System.out.println("a학점"+(avg>=90));break;
		case 2:System.out.println("b학점"+(avg>=80));break;
		case 3:System.out.println("c학점"+(avg>=70));break;
		default :System.out.println("f학점");
		}
		
		//정답
		/*String grade="";
		 * switch(avg/10){
		 * case 10:  //조건이 아래와 같으면 뒷문장 생략가능
		 * case 9:grade="a";break; 
		 * case 8:grade="b";break;
		 * case 7:grade="c";break;
		 * defalut:greade="f";
		 */
		
	}
}
