package practice1;

public class Demo2 {

	public static void main(String[] args) {
		/*
		 * 정수 2개를 입력받아 각각의 변수에 저장하고, 각 변수에 저장된 값을 서로 교환해서 출력하시오.
		 */
		
		int a = 10;
		int b = 20;
		int c;
		
		c = a;
		a = b;
		b = c;
		
		System.out.println("a: " + a);
		System.out.println("b: " + b);

	}

}
