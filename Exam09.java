package day01;
import java.util.Scanner;

public class Exam09 {
	public static void main(String[] args) {
		/*두 수를 입력하여
		 * 큰수:
		 * 작은수:
		 두 수의 차*/
		Scanner sc=new Scanner(System.in);
		//첫번째 방법
		/*System.out.println("첫번째 수를 입력>>");
		int a=sc.nextInt();
		System.out.println("두번째 수를 입력>>");
		int b=sc.nextInt();
		if(a>b) {
			System.out.println("큰 수: "+a);
			System.out.println("작은 수: "+b);
			System.out.println("두 수 차: "+(a-b));
		}else if(a<b){
			System.out.println("큰 수: "+a);
			System.out.println("작은 수: "+b);
			System.out.println("두 수 차:"+(a-b));
		}else {
			System.out.println("두 수 같다");
		}*/
		
		//두번쨰 방법
		System.out.println("첫번째 수 입력>>");
		int max=sc.nextInt();
		System.out.println("두번째 수 입력>>");
		int min=sc.nextInt();
		if(min>max) {
			int tmp=max; //int tmp=min       tmp:임시보관
			max=min;	//min=max
			min=tmp;	//max=tmp
		}
		System.out.println("큰 수: "+max);
		System.out.println("작은 수: "+min);
		System.out.println("두 수 차: "+(max-min));
	}
}
