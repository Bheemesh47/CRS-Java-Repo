import java.util.ArrayList;

public class Question5{

	public static void main(String args[]) {
		ArrayList<Integer> a = new ArrayList<Integer>();
		a.add(1);
		a.add(2);
		a.add(3);
		a.add(4);
		a.add(null);
		System.out.println(a);
		a.remove(1);//index value
		a.remove(null);//value
		System.out.println(a);
	}
}
//1 3 4
