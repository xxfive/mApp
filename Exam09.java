package day02;

import java.util.Scanner;

public class Exam09 {

	public static void main(String[] args) {
		/*수를 입력하는데 마지막은 -1
		 * 입력한 수의 합계와 평균을 구하시오
		 */
		Scanner sc=new Scanner(System.in);
		System.out.println("수를 입력하세요>>");
		int sum=0;
		int cnt=0;
		while(true) {//break가 없으면 무한루프에 빠짐
			int num=sc.nextInt();
			if(num==-1)break;
			sum +=num; //총합
			cnt++; //평균
		}
		System.out.println("합계:"+sum);
		System.out.println("평균:"+sum/cnt);
		sc.close(); //스캐너 종료
	}

}
