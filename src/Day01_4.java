
public class Day01_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 10;
		long l=num; //자동형변환
		num = (int)l;  //(int) 롱 타입을 인트로 바꾸겠다는 뜻 ->강제 형변환
		System.out.println(l);
		
		double d1 = 2.725;
		num=(int)d1;  // 소수점 이하는 버림.
		System.out.println(num);
		
		int r = (int)(num+2.2);  //연산자는 원래 같은 타입끼리 가능하나 작은 쪽을 큰 쪽으로 자동형변환
		int i = num+(int)2.2;
		
		System.out.println(r);
		
		int kor = 35;
		int eng = 65;
		int math = 10;
		//평균을 계산후 변수에 담아서 출력
	
		int total = kor+eng+math;
		double av = (double)total/3;  // double av = total/3.0;
		System.out.println(av);
	
		char ch = 'A';
		num = ch;
		System.out.println(num);
		
		
	
		
	
	}

}
