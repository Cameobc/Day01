import java.util.Scanner;

public class Day_01_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		/*
		System.out.println("이름을 입력하세요");
		String name = sc.next();
		System.out.println("나이를 입력하세요");
		int age = sc.nextInt();
		System.out.println("Your Name : "+name);
		System.out.println("Your Age : "+age);
		*/
		//////
		// 희망월급 받기
		// 국민연금 : 0.3%
		// 고용보험 : 0.5%
		// 의료보험 : 2%
		// 산재보험 : 1.2%
		// 각 세금의 금액
		// 총 세금의 합계액
		// 실 수령액
		System.out.println("희망 월급을 입력하세요");
		int sal = sc.nextInt();
		System.out.println(sal);
		double k = sal*0.003;
		double o = sal*0.005;
		double r = sal*0.02;
		double e = sal*0.012;
		double avr = k+o+r+e;
		double total = sal-avr;
		System.out.println("국민연금 " + k+"원");
		System.out.println("고용보험 " + o);
		System.out.println("의료보험 " + r);
		System.out.println("산재보험 " + e);
		System.out.println("총 세금액 " + avr);
		System.out.println("실 수령액 " + total);
		
	}

}
