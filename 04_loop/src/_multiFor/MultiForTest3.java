package _multiFor;

public class MultiForTest3 {
	int dan, i;
	
	public static void main(String[] args) {
		//2단~9단
		int dan, i;
		
		
		for(i=1; i<=9; i++) {
			for(dan=2; dan<=9; dan++) {
				System.out.printf("%d*%d=%d\t",dan,i,dan*i);
			}
			System.out.println();
		}
}
	
	
	
//	  public static void main(String[] args) {
//	         
//	         int dan, i;
//	         for ( i=1; i<=9; i++) {
//	            
//	            for(dan=2; dan<=9; dan++) {
//	            System.out.print(dan + "*" + i + "=" + dan*i + "\t");
//	         
//	            }
//	         System.out.println();
//	         }
//	   }
}