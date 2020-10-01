public class test{
	public static void main(String[] args) {
		lab obj1=new lab();
		obj1.push(2);
		obj1.push(7);
		obj1.push(2);
		
		System.out.println(obj1.isEmpty());
		System.out.println(obj1.size());
		System.out.println(obj1.top());
		System.out.println(obj1.pop());
	}
}