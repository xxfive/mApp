package day01;

public class Exam05 {
	public static void main(String[] args) {
		int a=49;
		if(a>50) {
		 System.out.println("50���� ũ��");
		}
		else {
		 System.out.println("50���� �۴�");
		}
		 if(a%2==0) {
			System.out.println("a�� ¦����");
		 }
			else {
				System.out.println("a�� Ȧ����");
			}
		int b=252;//0�̸�,0~99,100~199,200~299,300�̻��
		if(b<0) {
			System.out.println("0�̸�");
		}	else if(b<100) {
			System.out.println("0���� 99���� ��");
		}	else if(b<200) {
			System.out.println("100���� 199���� ��");
		}
			else if(b<300) {
				System.out.println("200���� 299���� ��");
			}else {
				System.out.println("300�̻� ��"); //else �ڿ��� ���ǹ� x
			}
		int c=-100;
		if(c<0){
			System.out.println("0�̸�");
		}
		if(c>=0 && c<100) {
			System.out.println("0���� 99���� ��");
		}
	int d=150;
	if(d<0) {
		System.out.println("0�̸�");
	}if(d>=100 && d<200) {
		System.out.println("100���� 200���� ��");
	}if(d>=200 && d<300) {
		System.out.println("200���� 300���� ��");
	}if(d>=300) {
		System.out.println("300�̻� ��");
	}
	/*
	 * 51(su)�� 0���� ũ�� ¦��
	 * 51(su)�� 0�̴�
	 * 51(su)�� 0���� ũ�� Ȧ��
	 */
	int su=51;
	if(su>0 && su%2==0) {
		System.out.println("0���� ũ�� ¦��");
	}if(su==0) {
		System.out.println("0�̴�");
	}if(su>0 && su%2==1) {
		System.out.println("0���� ũ�� Ȧ��");
		}
	}
}