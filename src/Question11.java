
public class Question11 {
	int a1;
	public static void mul(int a) {
		a=a*a;
	}
	public static void doString(String s) {
		s.concat(" "+s);
	}
	public static void main(String[] args) {
		Question11 q = new Question11();
		q.a1=10;
		String s ="Helo";
		Integer i=5;
		mul(i);
		doString(s);
		mul(q.a1);
		System.out.println(i);//5
		System.out.println(s);//helo
		System.out.println(q.a1);//10
		
	}
	
}
