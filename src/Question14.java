import java.util.ArrayList;
import java.util.List;

public class Question14 {
	static interface sample{
		
	}
	public static void main(String[] args) {
		List l = new ArrayList();
		l.add("a");
		l.add("b");
		l.add("c");
		l.add("d");
		l.remove(2);
		l.add(3,"f");
		System.out.println(l);
		}
}
