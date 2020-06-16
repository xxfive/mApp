package day02;

public class Exam10 {
//가로배치
	public static void main(String[] args) {
		for(int k=2; k<=4; k++) { //이중 for문
			for(int i=1; i<=3; i++) {
				System.out.println(k+"*"+i+"="+k*i);
				}
			System.out.println();
		}
		System.out.println("========");
		//세로배치
		for(int b=1; b<=9; b++) {
			for(int a=4; a<=6; a++)
				System.out.print(a+"*"+b+"="+a*b+"\t");
				System.out.println();
			}
		/*123456789
		 * 1234567
		 * 12345
		 * 123
		 * 1
		 */
		System.out.println("========");
		for(int i=9; i>0; i-=2) {
			for(int j=1; j<=i; j++) { 
			System.out.print(j);
			}
			System.out.println();
}  
			/*1
			123
			12345
			1234567
			123456789*/
		System.out.println("=====");
		for(int i=1; i<10; i+=2) {
			for(int j=1; j<=i; j++) { 
			System.out.print(j);
			}
			System.out.println();
	}
		//3,5,7단을 구하고 각각 단 앞에 몇단인지 써라
		for(int a=3; a<=7; a+=2){
			System.out.println("["+a+"단]");
			for(int b=1; b<=9; b++)
			System.out.println(a+"*"+b+"="+(a*b)+"\t");
			System.out.println();
		}
	}
}


  

