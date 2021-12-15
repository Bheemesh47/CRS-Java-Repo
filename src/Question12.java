import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Base{
	
	public void test() {
		System.out.println("Base");
	}
}
class A extends Base{
	public void test() {
		System.out.println("A");
	}
}
public class Question12 extends A {
	public void test() {
		System.out.println("B");
	}
	public static void main(String[] args) {
		Base a1 = new Question12();
		Base a2 = new A();
		Base a3 = new Question12();
		
		a1 = (Base)a3;
		Base a4 = (A)a3;
		
		a1.test();
		a3.test();
	}
}
//answer is  B B