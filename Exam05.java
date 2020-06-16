package day01;

public class Exam05 {
	public static void main(String[] args) {
		int a=49;
		if(a>50) {
		 System.out.println("50보다 크다");
		}
		else {
		 System.out.println("50보다 작다");
		}
		 if(a%2==0) {
			System.out.println("a는 짝수다");
		 }
			else {
				System.out.println("a는 홀수다");
			}
		int b=252;//0미만,0~99,100~199,200~299,300이상수
		if(b<0) {
			System.out.println("0미만");
		}	else if(b<100) {
			System.out.println("0에서 99사이 수");
		}	else if(b<200) {
			System.out.println("100에서 199사이 수");
		}
			else if(b<300) {
				System.out.println("200에서 299사이 수");
			}else {
				System.out.println("300이상 수"); //else 뒤에는 조건문 x
			}
		int c=-100;
		if(c<0){
			System.out.println("0미만");
		}
		if(c>=0 && c<100) {
			System.out.println("0에서 99사이 수");
		}
	int d=150;
	if(d<0) {
		System.out.println("0미만");
	}if(d>=100 && d<200) {
		System.out.println("100에서 200사이 수");
	}if(d>=200 && d<300) {
		System.out.println("200에서 300사이 수");
	}if(d>=300) {
		System.out.println("300이상 수");
	}
	/*
	 * 51(su)은 0보다 크고 짝수
	 * 51(su)은 0이다
	 * 51(su)은 0보다 크고 홀수
	 */
	int su=51;
	if(su>0 && su%2==0) {
		System.out.println("0보다 크고 짝수");
	}if(su==0) {
		System.out.println("0이다");
	}if(su>0 && su%2==1) {
		System.out.println("0보다 크고 홀수");
		}
	}
}