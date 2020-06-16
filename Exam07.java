package day02;

public class Exam07 {
	public static void main(String[]args) {
		//1부터 5까지 출력
		for(int i=1; i<6; i++) {
			System.out.print(i+"\t");
		}
		System.out.println();
		System.out.println("----");
		//1부터 5까지 출력 while (while은 조건문만 씀)
		int n=1;
		while(n<6) { //while은 조건이 안맞으면 실행x
			System.out.print(n+"\t");
			n++;
		}
		System.out.println("\n----");
		//1부터 5까지 출력 do~while
		int m=1;
		do { //do~while은 조건이 안맞아도 무조건 한번은 실행
			System.out.print(m+"\t");
			m++;
		}while(m<6);
	}
}
