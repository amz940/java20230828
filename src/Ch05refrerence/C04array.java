package Ch05refrerence;

public class C04array {
	
	public static void main(String[] args) {
		int a = 5;
		int b = a;
		
		System.out.println(a);
		System.out.println(b);
		
		int[] c = { 3, 4 ,5};	// c의 주소값  = 5432;
		int[] d = c;			// d = c 이기 때문에 d의 주소값도 = 5432;
		
		System.out.println(c[1]);
		System.out.println(d[1]);
		
		c[2] = 55;
		System.out.println(c[2]);
		System.out.println(d[2]);
		
	}

}
