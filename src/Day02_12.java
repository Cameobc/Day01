import java.util.Scanner;

public class Day02_12 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("몇 번 출력 할까요?");
		int count = sc.nextInt(); //10
		int i =0;
		for(i=0;i<count;i++) {   //변수선언 후 최초로 값을 넣는 것이 초기화
			System.out.println(i);
			System.out.println("iu"); //카운트를 세보기 ex 12345 , 54321
		}
		
		//단수를 입력 받아서 구구단 출력
		//단수*숫자=결과
		Scanner se = new Scanner(System.in);
		System.out.println("몇 단을 출력 할까요?");
		int gugu = sc.nextInt();
		for(i=1;i<10;i++) {
			System.out.println(gugu+"*"+i+"="+gugu*i);
		}

	}

}

//구구단 찍기
//단수를 입력
//3*1=3
//3*2=6
//3*9=27