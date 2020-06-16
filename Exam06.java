package day01;
import java.util.Scanner;

public class Exam06 {
	public static void main(String[] args) {
		System.out.println("수를 입력하세요 >>");
		Scanner sc=new Scanner(System.in);
		int su=sc.nextInt();
		System.out.println(su);
		if(su%2==0) {
			System.out.println("짝수");
		}else if(su%2==1) {
			System.out.println("홀수");
		}
		System.out.println("나이를 입력하세요>>");
		int age=sc.nextInt();
		if(age>=20) {
			System.out.println("입장가능");
		}else if(age>=15) { //age>=15 && age<20 으로 할 필요가 없다
			System.out.println("부모님과 동반입장");
		}else if(age<15) {
			System.out.println("입장 불가능");
		}
	}
}
