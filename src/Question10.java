class Check{
	public int amt;
	public Check() {
		amt = 100;
	}
	
}
abstract class Demo1{
	abstract void add();
}
public class Question10 {
	public static void main(String[] args) {
		Check c = new Check();
		c.amt=100;
		System.out.println(c.amt);
		
		Demo1 d1 = new Demo1() {
			
			@Override
			void add() {
				// TODO Auto-generated method stub
				
			}
		};
		d1.add();
	}
}
