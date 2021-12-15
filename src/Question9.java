class Caller{
	private void data() {
		System.out.println("Data");
	}
	private void info() {
		data();
		System.out.println("Info");
	}
}
public class Question9 {
	public static void main(String[] args) {
		Caller c= new Caller();
		//c.info();
		//c.data();
	}
}
// answer is compilation failure in line 13