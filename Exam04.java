package day02;
//for문 1~10까지의 합
public class Exam04 {
	public static void main(String[]args) {
		int sum=0;
		for(int i=1; i<=10; i++) {
			sum=sum+i; //sum += i;
		}System.out.println("합계:"+sum);
		
	/*1부터 10까지의 합 55
	 *1부터 20까지의 합 ?
	 *....
	 *1부터 100까지의 합? 총 10개만 나오게
	 */
		int hap=0;
		for(int i=1; i<=100; i++) {
			hap=hap+i;
			if(i%10==0) {
			System.out.println("1부터 "+i+"까지의 합:"+hap);
			}
	}
		//1부터 10까지의 합 1+2+3+...+9=55로 나오게 출력
		//첫번째
		int a=0;
		for(int i=1; i<=10; i++) {
			a+=i;
		if(i!=10) {
			System.out.print(i+"+");
		}else {
			System.out.print(i+"="+a);
		}
		}
		  	System.out.println("=======");
		//두번째
		int h=0;
		for(int i=1; i<=10; i++) {
			h+=i;
			if(i==1) {
				System.out.print(i);
			}else {
				System.out.print("+"+i);
			}
		}
			System.out.print("="+h);
			
	}
}


