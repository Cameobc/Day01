import java.util.Scanner;

public class Day01_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		int n1 = 10;
		int n2 = 3;
		int r1 = n1/n2;
		int r2 = n1%n2;
		System.out.println(r1);
		System.out.println(r2);
		*/
		//편의점 알바 내보내기
		//물건의 합계 금액 입력받기 "25640
		//손님이 낸 돈 입력받기 :50000
		//거스름돈 계:24360
		//만원 2장
		//천원 4개
		//백원 3
		//십원 6
		Scanner sc = new Scanner(System.in);
		System.out.println("물건의 합계를 입력하세요");
		int avr = sc.nextInt();
		System.out.println(avr);
		System.out.println("낸 돈을 입력하세요");
		int mon = sc.nextInt();
		System.out.println(mon);
		int m1 = mon-avr;
		System.out.println("거스름돈은 "+m1+" 원");
		int m2 = 10000;
		int m3 = 1000;
		int m4 = 100;
		int m5 = 10;
		int m6 = 5000;
		int m7 = 500;
		int r1 = m1/m2;
		int r2 = (m1%m2)/m3;
		int r3 = (m1%m3)/m4;
		int r4 = (m1%m4)/m5;
		int r5 = (m1%m2)/m6;
		int r6 = (m1%m3)/m7;
		
		//int man = avr/10000;
		//int chon = avr/1000-man*10;
		//int chon = (man*10000-avr)/1000;
		
		System.out.println("만원짜리는 " + r1+" 장");
		System.out.println("오천원짜리는 " + r5+" 장");
		System.out.println("천원짜리는 " + (r2-r5*5)+" 장");
		System.out.println("오백원짜리는 " + r6+" 개");
		System.out.println("백원짜리는 " + (r3-r6*5)+" 개");
		System.out.println("십원짜리는 " + r4+" 개");
		
		////////////
		//951224-1234567
		//숫자를 넣으면 다른 숫자가 나오는 식
		//0->0
		//1 -> 1 /1
		//3->3
		//4->10 /
		//5->11 /
		//8->20 /
		//9->21 /
		//10->22/
		//11->23
		//num/4*10+num%4
		//int n =;
		//int result = ;
		
		
	}

}
