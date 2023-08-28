package Refrerence;

public class C06matrix {

	public static void main(String[] args) {
		//이차원 배열 = 배열이 2개 들어간다 = []를 2번 쓰고 { {},{} }로 생각하면 편하다 
		int[][]	a = { {1,2,3}, {10,20,30} , {100, 200, 300} };
		int[][] b = a;
		
		System.out.println(a[0][2]);
		System.out.println(b[0][2]);
		System.out.println(a[2][0]);
		
		a[1][1] = 2000;
		System.out.println(b[1][1]);
		
		b[2][2]= 7000;
		System.out.println(b[2][2]);
		System.out.println(a[2][2]);
		
		b[2] = new int[] {111,222,333};
		System.out.println(b[2][2]);
		System.out.println(a[2][2]);
		// b에 새로운 인스턴스 값을 부여함 = 새로운 주소값이 생성
		b = new int[][]	{ {33, 44}	, {22, 11}};
		System.out.println(b[0][0]);
		System.out.println(a[0][0]);
		
		
	}
}
