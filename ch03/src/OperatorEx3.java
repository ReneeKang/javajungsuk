
public class OperatorEx3 {
	public static void main(String[] args) {
		int i=5,j=5;
		System.out.println(i++);
		System.out.println(++j);
		System.out.println("i = " + i + ", j = "+j);
	
		int x=5;
		
		//
		
		System.out.println("x++ = " + x++);
		System.out.println("++x = " + ++x);
		
		x = x++ - ++x;
		
		System.out.println("x = " +x);
	}
}
