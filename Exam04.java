package day01;

public class Exam04 {
	public static void main(String[] args) {
		int r=5;
		final double PI=3.14; //final은 수정 못하도록 하는 명령어, final함수는 대문자로 하는게 낫다.
		System.out.println("r*r*PI="+(r*r*PI));
		float f=5.0f;//4바이트
		int num=10;//4바이트
		f=num;//float=int 형변환(캐스팅,자동형변환) float이 int보다 더 크기 때문에,반대로 num=f;는 안됨.
		System.out.println("f:"+f);
		
		num=(int)f; // int<-float 형변환(캐스팅,명시적현변환)
		System.out.println("f:"+f);
		
		long num1=100L;
		f=num1;//float=long (자바에서는 정수가 실수보다 크다. 그래서 long이 float에 들어갈 수 있다)
		
		double area=r*r*PI;
		System.out.println("원넓이:"+area);
	}
}
