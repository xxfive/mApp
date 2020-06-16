package day02;
import java.util.Scanner;
//금액을 입력하세요
public class Exam02 {
	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("금액을 입력하세요>>");
		int money=sc.nextInt(); //52850
		int result=money/10000; //5
		System.out.println("만원:"+result);
		money=money%10000; //2850
		result=money/1000;
		System.out.println("천원:"+result);
		money=money%1000;
		result=money/100;
		System.out.println("백원:"+result);
	}
}
