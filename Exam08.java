package day02;

public class Exam08 {
	public static void main(String[]args) {
		//1부터 10까지 홀수의 합
	int num=0;
	for(int i=1; i<=10; i++) {
		if(i%2==1) {
			num +=i;
		}
	}
	System.out.println("결과:"+num);
	System.out.println("=====");
	int sum=0;
	for(int i=1; i<=10; i++) {
		if(i%2 !=1)continue; //continue:수행조건이 안맞으면 코드수행 안하고 다시 for로 돌아가라
			sum +=i;
}
	System.out.println("continue결과:"+sum);
	System.out.println("=====");
	int h=0;
	for(int i=1; i<=10; i++) {
		if(i%2 !=1)break; //break:수행조건이 맞으면 반복물을 벗어나라
			h +=i;
}	System.out.println("break결과:"+h);
	System.out.println("=====");
	
}
}