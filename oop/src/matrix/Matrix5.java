package matrix;

/**
 * @date : 2016. 6. 22.
 * @author : 한상호
 * @file : Matrix5.java
 * @story :
 */
public class Matrix5 {
	public static void main(String[] args) {
		int a = 1;
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				System.out.print(a+"\t");
				a++;
			}
			System.out.println();
		}
	}
}
