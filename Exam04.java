package day02;
//for�� 1~10������ ��
public class Exam04 {
	public static void main(String[]args) {
		int sum=0;
		for(int i=1; i<=10; i++) {
			sum=sum+i; //sum += i;
		}System.out.println("�հ�:"+sum);
		
	/*1���� 10������ �� 55
	 *1���� 20������ �� ?
	 *....
	 *1���� 100������ ��? �� 10���� ������
	 */
		int hap=0;
		for(int i=1; i<=100; i++) {
			hap=hap+i;
			if(i%10==0) {
			System.out.println("1���� "+i+"������ ��:"+hap);
			}
	}
		//1���� 10������ �� 1+2+3+...+9=55�� ������ ���
		//ù��°
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
		//�ι�°
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


