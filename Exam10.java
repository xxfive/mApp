package day01;
import java.util.Scanner;

public class Exam10 {
	public static void main(String[] args) {
		/*1~99 사이 정수 하나를 입력
		 * 십단위 3,6,9 검사
		 * 일단위 3,6,9 검사
		 * 3,6,9가 2개면 박수짝짝
		 * 3,6,9가 1개면 박수짝
		 * 없으면 박수없음 출력
		 */
		Scanner sc=new Scanner(System.in);
		System.out.println("1~99사이 정수를 입력하세요");
		int num=sc.nextInt();
		int a=num/10; //십단위
		int b=num%10; //일단위
		int cnt=0;
		if(a!=0 && a%3==0) {
			cnt=cnt+1; // cnt+=1; //cnt++ 셋다 같은 표현
		}if(b!=0 && b%3==0) {
			cnt=cnt+1; // cnt+=1; //cnt++
		}if(cnt==2) {
			System.out.println("박수짝짝");
		}else if(cnt==1) {
			System.out.println("박수짝");
		}else {
			System.out.println("박수없음");
		}
}
}