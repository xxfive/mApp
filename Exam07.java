package day01;
import java.util.Scanner;

public class Exam07 {
	public static void main(String[] args) {
		/*점수를 입력하고
		 *커트라인을 입력하여
		 *합격인지 불합격인지 알아보자
		 */
		Scanner s=new Scanner(System.in);
		System.out.println("점수를 입력하세요>>");
		int score=s.nextInt();
		System.out.println("커트라인을 입력하세요>>");
		int cut=s.nextInt();
		if(score>=cut) {
			System.out.println("합격");
		}else { 
			System.out.println("불합격");
		}
		//점수가 3의 배수인지 아닌지
		if(score%3==0) {
			System.out.println(score+":3의 배수");
		}else {
			System.out.println(score+":3의 배수x");
		}
	}
}
