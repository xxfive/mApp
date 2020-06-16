package day01;
import java.util.Scanner;

public class Exam13 {
	public static void main(String[]args) {
		/*switch문 사용
		 * 첫번째 수 입력
		 * 두번째 수 입력
		 * 연산자 입력
		 */
		Scanner sc=new Scanner(System.in);
		System.out.println("첫번째 수>>");
		int a=sc.nextInt();
		System.out.println("두번째 수>>");
		int b=sc.nextInt();
		System.out.println("연산자>>");
		String op=sc.next();
		switch(op) {
		case "+":System.out.println("덧셈결과"+(a+b));break;
		case "-":System.out.println("뺄셈결과"+(a-b));break;
		case "*":System.out.println("곱셈결과"+(a*b));break;
		case "/":System.out.println("나눗셈결과"+(a/b));break;
		case "%":System.out.println("나머지결과"+(a%b));break;
		default :System.out.println("연산자 오류");
		}
		
		//if문
		if(op.equals("+")) { //문자열 값이 같아 = equals()사용
			System.out.println("덧셈결과"+(a+b));
		}else if(op.equals("-")) {
			System.out.println("뺄셈결과"+(a-b));
		}else if(op.equals("*")) {
			System.out.println("곱셈결과"+(a*b));
		}else if(op.equals("/")) {
			System.out.println("나눗셈결과"+(a/b));
		}else if(op.equals("&")) {
			System.out.println("나머지결과"+(a%b));
		}else {
			System.out.println("연산자오류");
		}
	}
}
