import java.util.Iterator;

public class Question6 {
	public static void main(String[] args) {
		int n [] [] = {{1,3},{2,4}};
		for (int i = n.length-1; i >= 0 ; i--) {
			for(int y : n[i]) {
				System.out.print(y);
			}
		}
	}
}
// options are wrong 
// ans is 2413 as the loop traverses from last index to first