package ch05refrerence.lecture;

public class C10method {
	public static void main(String[] args) {
		int[]a = {3, 4, 5};
		//주소값을 알고 싶다
		System.out.println(System.identityHashCode(a));
		
		System.out.println(a[0]);
		System.out.println("메소드 호출");
		method1(a);
		
		System.out.println("메소드 호출 후");
		System.out.println(a[0]); // 33;
	}
	static void method1(int[]p) {
		System.out.println("method1 메소드");
		System.out.println(System.identityHashCode(p));
		System.out.println(p[0]);
		
		p[0]= 33;
	}
}
