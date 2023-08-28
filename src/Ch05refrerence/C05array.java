package Ch05refrerence;

public class C05array {

	public static void main(String[] args) {
		int[]a = {3,4,5};
		int[]b = a;
		
		System.out.println(b[2]);
		
		a[2]= 7;
		System.out.println(b[2]);
		
		// c와 d의 값이 같을때 과연 진짜 같은가?
		// c 와 d의 주소값은 서로 다르다
		int[]c = {10, 20 , 30};	// 7654;
		int[]d = {10, 20 , 30}; // 6543;
		
		c[2] = 90;	//7654의 주소값 30이 90으로 바뀐것
		System.out.println(c[2]);
		System.out.println(d[2]);
		
		
		
		
	}
	
}
