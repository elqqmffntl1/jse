package matrix;

/**
 * @date : 2016. 6. 22.
 * @author : 한상호
 * @file : Gugudan.java
 * @story :
 */
public class Gugudan {
	public static void main(String[] args) {
		int i = 0,j = 0;
		for (i = 1; i < 10; i++) {
			for (j = 2; j < 6; j++) {
				System.out.print(j+"*"+i+"="+(i*j)+"\t");
			}
			System.out.println();
			
		}
		System.out.println();
		for (i = 1; i < 10; i++) {
			for (j = 6; j < 10; j++) {
				System.out.print(j+"*"+i+"="+(i*j)+"\t");
			}
			System.out.println();
			
		}
	}
	
}
	
