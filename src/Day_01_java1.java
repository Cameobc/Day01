
public class Day_01_java1 {
	public static void main(String[]args) {
//		int year =0;
//		int score = 100;
//		score = 200;
//		
//		System.out.println(score);

		int x, y, z;
		int absX, absY, absZ;
		char signX, signY, signZ;
		
		x=10;
		y=-5;
		z=0;
		
		absX = x >= 0 ? x : -x;
		absY = y >= 0 ? y : -y;
		absZ = z >= 0 ? z : -z;
		
		signX = x>0 ? '+' : ( x==0 ? ' ' : '-');
		signY = y>0 ? '+' : ( y==0 ? ' ' : '-');
		signZ = z>0 ? '+' : ( z==0 ? ' ' : '=');
		
		System.out.printf("x==%c%d%n", signX, absX);
		System.out.printf("y==%c%d%n", signY, absY);
		System.out.printf("z==%c%d%n", signZ, absZ);
	}
}
